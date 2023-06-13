package com.ohgiraffers.practice03.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages="com.ohgiraffers.practice03.annotationconfig",
        useDefaultFilters=false,
                includeFilters= {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BoardDAO.class
            })
        })
public class ContextConfiguration {

}
