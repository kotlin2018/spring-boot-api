package com.mltt.controller;

import com.mltt.biz.bean.ServiceException;
import com.mltt.biz.dto.ApiDto;
import com.mltt.service.ApiService;
import com.mltt.utils.ApiResultUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Resource
    ApiService apiService;
    @Resource
    JdbcTemplate jdbcTemplate;

    @PostMapping("/hello")
    public String hello(HttpServletRequest request,@RequestBody ApiDto apiDto) {
        System.out.println("request.getRequestURI() = " + request.getRequestURI());
        System.out.println("apiDto.getPort() = " + apiDto.getPort());
        return apiService.hello();
    }


    @PostMapping("/port")
    public ApiResultUtils port(@RequestBody ApiDto apiDto) throws ServiceException {
        if (apiDto.getPort() != 100) {
            throw new ServiceException(400, "我屮艸芔茻");
        }
        return ApiResultUtils.success(apiDto);
    }

    @PostMapping("/queryJdbc")
    public ApiResultUtils query(@RequestBody ApiDto apiDto) throws ServiceException {
        return ApiResultUtils.success(jdbcTemplate.queryForList("select * from f_user limit 5"));
    }

    @PostMapping("/queryMybatis")
    public ApiResultUtils queryMybatis() throws ServiceException {
        return ApiResultUtils.success(apiService.getUser());
    }
}
