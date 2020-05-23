package org.seckill.web;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @Description
 * @Author Administrator
 * @Date 2020/5/22 11:41
 * @Version 1.0
 **/
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/ok")
    @ResponseBody
    public SeckillResult<Exposer> test(){
        SeckillResult<Exposer> seckillResult = new SeckillResult<Exposer>(true,"ok");
        return seckillResult;
    }
}
