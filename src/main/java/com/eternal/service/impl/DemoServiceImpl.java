package com.eternal.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.eternal.service.DemoService;
import com.eternal.entity.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by yeyang.lj on 2017/10/20.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Demo> findAll() {
        String sql = "select * from test_table";
        BeanPropertyRowMapper<Demo> rowMapper = new BeanPropertyRowMapper<>(Demo.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
}
