package com.neo.habidang.repository.mbti;

import com.neo.habidang.config.BaseException;
import com.neo.habidang.config.BaseResponseStatus;
import com.neo.habidang.dto.HobbyDto;
import com.neo.habidang.dto.MbtiDto;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.neo.habidang.config.BaseResponseStatus.DATA_BASE_ERROR;

@Repository
public class MbtiRepository {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MbtiRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    // MBTI로 취미 리스트 가져오기
    public MbtiDto.ResultResponseDto findResultHobbyByMbti(MbtiDto.ResultRequestDto requestDto) throws BaseException {
        SqlParameterSource parameterSource = new MapSqlParameterSource("mbti", requestDto.getType());
        try{
            List<HobbyDto.MbtiRequestResponse> mbtiRequestResponseList = namedParameterJdbcTemplate.query(MbtiSql.FIND_HOBBY_BY_ACTIVITY, parameterSource,
                    (rs, rowNum) -> new HobbyDto.MbtiRequestResponse(
                            rs.getString("name"),
                            rs.getString("info"))
            );
            MbtiDto.ResultResponseDto resultResponseDto = new MbtiDto.ResultResponseDto()
        }catch(Exception e){
            throw new BaseException(DATA_BASE_ERROR);
        }

    }
}
