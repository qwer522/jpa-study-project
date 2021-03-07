package springbootjpaweb.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import springbootjpaweb.domain.member.Member;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByEmail(String userEmail);
}
