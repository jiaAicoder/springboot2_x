package com.ims.springboot2_x.controller;

import com.ims.springboot2_x.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiyongjia
 * @create 2020/5/6 - 13:42
 * @descp:
 */
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {

        Article a1 = Article.builder().id(4).author("jiajia").build();
        log.info("测试");

        return "hello world, " +a1;
    }
}