package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    // MemberService & MemoryRepository 다른 인스턴스 쓰고 있음
    // private final MemberRepository memberRepository = new MemoryMemoryRepository();
    // 같은 인스턴스 사용하도록 바꾸려면?
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {   // new에서 생성하는게 아니라 외부에서 넣어주도록 함 > DI
        this.memberRepository = memberRepository;
    }

    @Autowired


    // 회원 가입
    public Long join(Member member) {
        ValidataDuplicateMember(member);    // 중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void ValidataDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원 입니다.");
                });
    }

    // 회원 검색
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
