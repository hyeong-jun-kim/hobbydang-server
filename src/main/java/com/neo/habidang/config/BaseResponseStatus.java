package com.neo.habidang.config;

import lombok.Getter;

/*
    Response Code

 */
@Getter
public enum BaseResponseStatus {
    /*
        1000 : Request Success
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다"),


    /*
        4000 : DataBase Error
     */
    DATA_BASE_ERROR(false, 4000, "데이터 베이스 오류가 발생했습니다.");

    private final boolean isSuccess;
    private final int code;
    private final String message;

    BaseResponseStatus(boolean isSuccess, int code, String message){
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
