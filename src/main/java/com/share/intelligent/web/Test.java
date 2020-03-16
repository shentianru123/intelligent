package com.share.intelligent.web;

import com.share.intelligent.service.StudentService;
import com.share.intelligent.utils.JsonResult;
import com.share.intelligent.utils.JsonResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    private StudentService service;

    @RequestMapping("/test")
    public JsonResult getTest(){
//        return new JsonResult(this.service.queryStudentBySno("003"));
        return JsonResultUtils.SUCCESS_DATA( this.service.queryStudentBySno("003"));
    }

}
