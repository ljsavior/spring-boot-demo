package com.eternal.web.controller;

import javax.annotation.Resource;

import com.eternal.entity.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yeyang.lj on 2017/10/19.
 */
@Controller
public class JdbcTestController {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/query/{id}")
    @ResponseBody
    public Demo queryById(@PathVariable("id") Integer id) {
        String sql = "select * from TEST_TABLE where id = ?";
        BeanPropertyRowMapper<Demo> rowMapper = new BeanPropertyRowMapper<>(Demo.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
}
