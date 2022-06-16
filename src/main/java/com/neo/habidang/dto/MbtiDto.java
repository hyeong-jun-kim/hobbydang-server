package com.neo.habidang.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

public class MbtiDto {
    @Getter
    @AllArgsConstructor
    public static class ResultRequestDto{
        private String type;
    }
    @Getter
    @AllArgsConstructor
    public static class ResultResponseDto{
        private int mbtiIdx;
        private List<String> type;
        private String status;
    }
}
