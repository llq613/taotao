package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("page")
public class PagerController {
    //localhost:8081/rest/page/login
   @RequestMapping(value = "/{path}",method = RequestMethod.GET)
    public String toPage(@PathVariable("path") String path){
       return path;
   }

}
