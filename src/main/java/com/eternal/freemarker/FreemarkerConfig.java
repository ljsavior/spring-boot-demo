package com.eternal.freemarker;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import freemarker.template.Configuration;
import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yeyang.lj on 2017/10/23.
 */
@Component
public class FreemarkerConfig {
    @Autowired
    private Configuration configuration;
    @Resource
    private IncludeXMacro includeXMacro;

    @PostConstruct
    public void setSharedVariable() throws TemplateModelException {
        configuration.setSharedVariable("includeX", includeXMacro);
    }
}
