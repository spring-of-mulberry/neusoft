package com.mulberry.fastJson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
//@CrossOrigin
public class testController {
    @RequestMapping(value = "/queryall",method = RequestMethod.GET)
    @ResponseBody
    public List<testEntity> queryList(){
        List<testEntity> list= Arrays.asList(new testEntity(1,"张三",new Date()),
                new testEntity(1,"张三",new Date()),
                new testEntity(1,"张三",new Date()),
                new testEntity(1,"张三",new Date()),
                new testEntity(1,"张三",new Date()),
                new testEntity(1,"张三",new Date()));
        return list;
    }
}
