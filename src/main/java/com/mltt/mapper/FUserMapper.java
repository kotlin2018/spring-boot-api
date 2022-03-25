package com.mltt.mapper;

import com.mltt.biz.vo.FUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FUserMapper {
    List<FUserVo> getUser();
}
