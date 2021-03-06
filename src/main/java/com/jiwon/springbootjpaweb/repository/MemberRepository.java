package com.jiwon.springbootjpaweb.repository;

import com.jiwon.springbootjpaweb.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByEmail(String userEmail);
}
