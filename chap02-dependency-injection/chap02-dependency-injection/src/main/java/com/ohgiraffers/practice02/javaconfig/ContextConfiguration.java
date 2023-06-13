package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO memberGenerator() {
        MemberDTO member = new MemberDTO();
        member.setId(1337L);
        member.setNickname("YoungDong");

        return member;
    }

    @Bean
    public BoardDTO boardGenerator() {
        BoardDTO board = new BoardDTO();
        board.setId(2222L);
        board.setTitle("오늘 스프링 프레임워크 수업");
        board.setContent("의존성 주입");
        board.setWriter(memberGenerator());

        return board;
    }
}
