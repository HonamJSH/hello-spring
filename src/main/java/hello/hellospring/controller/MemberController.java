package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    // private final MemberService memberService = new MemberService();
    // 여러개 생성할 필요 없이 스프링 컨테이너에 하나만 생성하면 됨

    private final MemberService memberService;

    //생성자로 연결
    @Autowired      // 스프링 컨테이너에 있는 memberService를 가져와 연결 (주입)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원 가입
    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }
}
