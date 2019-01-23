package com.lee.swagger.controller;

import com.lee.swagger.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@Api("学生信息查询API接口" )
@RestController("测试Controller")
public class DemoSwaggerController {


    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个学生的信息")
    @ApiImplicitParam(name = "id", value = "学生id", paramType = "path", required = true, dataType = "Integer")
    //@RequestMapping(value = "{/id}", method = RequestMethod.GET)
    @GetMapping("{/id}")
    public Student getById(Integer id) {
        Student student = new Student();
        student.setId(1l);
        student.setName("zhangsan==============-------------");
        System.out.println(id+"===========");
        student.setAge(14);
        return student;
    }

}
