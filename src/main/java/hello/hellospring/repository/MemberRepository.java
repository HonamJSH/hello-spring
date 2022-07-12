package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public class MemberRepository {

    // 회원 생성
    public Member save(Member member) {
        return null;
    }

    // id로 회원 검색
    public Optional<Member> findById(Long id) {
        return null;
    }

    // name으로 회원 검색
    public Optional<Member> findByName(String name) {
        return null;
    }

    // 회원 모두 출력
    public List<Member> findAll() {
        return null;
    }
}
