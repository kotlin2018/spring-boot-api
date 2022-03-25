package com.mltt.service.impl;

import com.mltt.biz.vo.FUserVo;
import com.mltt.mapper.FUserMapper;
import com.mltt.service.ApiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    @Resource
    FUserMapper fUserMapper;

    @Override
    public String hello() {
        return "xxxix";
    }

    @Override
    public List<FUserVo> getUser() {
        return fUserMapper.getUser();
    }
}
