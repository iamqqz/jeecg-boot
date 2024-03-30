package org.jeecg.modules.demo.mohe.controller;

import org.jeecg.common.api.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("demo/mohe")
public class MoheController {
    private static final Logger log = LoggerFactory.getLogger(MoheController.class);
    public static final String CONST = "Hello ";

    @GetMapping(value = "/hello")
    public Result<String> hello(String userId) {
        String msg = CONST + LocalDateTime.now().toString();
        Result<String> result = new Result<String>();
        result.setResult(msg);
        result.setSuccess(true);
        log.debug(msg);
        return result;
    }
}
