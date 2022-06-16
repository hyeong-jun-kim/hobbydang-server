package com.neo.habidang.repository.mbti

class MbtiSql {
    // mbti로 추천 활동들 찾기
    public static final String FIND_HOBBY_BY_ACTIVITY = """
    SELECT name, info
    FROM hobby INNER JOIN mbti as m on hobby.mbtiIdx = m.mbtiIdx
    where m.type = ?;
    """
}
