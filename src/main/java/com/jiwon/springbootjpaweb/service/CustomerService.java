package com.jiwon.springbootjpaweb.service;

import com.jiwon.springbootjpaweb.domain.Customer;
import com.jiwon.springbootjpaweb.data.domain.PrincipalDetails;
import com.jiwon.springbootjpaweb.domain.Role;
import com.jiwon.springbootjpaweb.repository.CustomerRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.jiwon.springbootjpaweb.representative.CustomerRequest;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;
import java.util.Optional;

// 시큐리티 설정에서 loginProcessingUrl("/login");
// /login 요청이 오면 자동으로 UserDetailsService 타입으로 ioc되어 있는 loadUserByUsername 함수가 실행

@Service
public class CustomerService implements UserDetailsService {

    private final CustomerRepository customerRepository;

    private final PasswordEncoder bCryptPasswordEncoder;

    public CustomerService(CustomerRepository customerRepository, @Lazy PasswordEncoder bCryptPasswordEncoder) {
        this.customerRepository = customerRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Transactional
    public void save(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .email(customerRequest.getEmail())
                .password(bCryptPasswordEncoder.encode(customerRequest.getPassword()))
                .name(customerRequest.getUsername())
                .role(Role.USER)
                .build();
        // 객체화를 위해 따로 갱신.
        customer.lastLoginDateNovation();
        customerRepository.save(customer);
    }

    // 시큐리티 session(내부 Authentication(내부 UserDetails))
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException((username)));
        customer.lastLoginDateNovation();
        if(!ObjectUtils.isEmpty(customer)){
            return new PrincipalDetails(customer);
        }
        return null;
    }

    @Transactional
    public void update(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        // 객체화를 위해 따로 갱신.
        customer.get().lastLoginDateNovation();

    }




}
