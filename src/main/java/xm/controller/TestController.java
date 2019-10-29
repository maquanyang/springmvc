package xm.controller;

import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xm.model.Test;

/**
 * Created by MA on 2019/6/22.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("111111111111");
        return "index";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        Test t = new Test();
        return JSONObject.toJSONString(t);
    }
}