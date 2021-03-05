package com.jiwon.springbootjpaweb.web;

import com.jiwon.springbootjpaweb.data.domain.PrincipalDetails;
import com.jiwon.springbootjpaweb.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.jiwon.springbootjpaweb.representative.CustomerRequest;

import java.net.URI;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CustomerApiController {

    private final CustomerService customerService;

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login/join")
    public String join() {
        return "login-join";
    }

    @PostMapping("/login/join")
    public String loginJoin(CustomerRequest customerRequest) {
        customerService.save(customerRequest);
        return "redirect:/login";
    }

    @GetMapping("/login/update/{id}")
    public String update(@PathVariable(name="id")Long id) {
        customerService.update(id);
        return "redirect:/";
    }

    @GetMapping("/login-user-info")
    public ResponseEntity getloginUserInfo() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = "";
        if(principal instanceof  UserDetails){
            name = ((PrincipalDetails)principal).getUsername();
        }else {
            name = principal.toString();
        }
        return ResponseEntity
                .created(URI.create("/login-user-info"))
                .body(name);
    }

}