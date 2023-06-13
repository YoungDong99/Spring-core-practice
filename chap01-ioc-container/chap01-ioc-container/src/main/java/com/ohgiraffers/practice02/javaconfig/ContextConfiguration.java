package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("practice02")
public class ContextConfiguration {

    @Bean(name="board")
    public BoardDTO getBoard() {

        return new BoardDTO(12333, "hiEveryone", "good morning", "강동영");
    }
}
