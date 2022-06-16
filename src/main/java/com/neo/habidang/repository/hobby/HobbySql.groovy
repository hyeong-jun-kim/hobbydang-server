package com.neo.habidang.repository.hobby

class HobbySql {
    // mbti 정보 가져오기
    public static final FIND_MBTI_INFO =
    """
        SELECT mbtiIdx, info
        FROM hobby
        where mbtiIdx = ?
    """
}
