package com.share.intelligent.web;

import com.share.intelligent.utils.JsonResult;
import com.share.intelligent.utils.JsonResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/isAlive")
    public JsonResult isAlive(){
        return JsonResultUtils.SUCCESS();
    }

}
