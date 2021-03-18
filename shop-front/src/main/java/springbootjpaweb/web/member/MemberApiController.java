package springbootjpaweb.web.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import springbootjpaweb.representative.MemberRequest;
import springbootjpaweb.service.MemberService;
import springbootjpaweb.util.ApiResponse;

@Slf4j
@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("")
    @CrossOrigin(origins ="http://localhost:8081" )
    public ApiResponse<String> loginJoin(@RequestBody MemberRequest memberRequest) {
        memberService.save(memberRequest);
        return ApiResponse.ok();
    }

}