package com.neo.habidang.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class HobbyDto {
    // 취미 정보 담고있는 클래스
    @Getter
    @AllArgsConstructor
    public static class Info{
        private String name; // 취미 이름
        private String info; // 취미 정보
        private double price; // 가격
        private double difficulty; // 어려움
        private double accessibility; // 접근성
        private double activity; // 활동성
        private double personnel; // 인원
        private String status;
    }

    // Mbti별 취미 조회할 때 쓰는 클래스
    @Getter
    @AllArgsConstructor
    public static class MbtiRequestResponse{
        private String name; // 취미 이름
        private String info; // 취미 정보
    }
}
