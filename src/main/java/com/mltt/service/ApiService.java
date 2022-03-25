package com.mltt.service;

import com.mltt.biz.vo.FUserVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApiService {
    String hello();

    List<FUserVo> getUser();
}
