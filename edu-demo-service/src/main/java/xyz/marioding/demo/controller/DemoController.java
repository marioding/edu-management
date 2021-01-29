package xyz.marioding.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.marioding.edu.core.dto.User;
import xyz.marioding.edu.core.resp.Response;

@RestController
public class DemoController {


    @GetMapping("/aaa")
    @ResponseBody
    public Response sss(){

        User user = new User();
        user.setUserName("fa");
        user.setAge("14");

        return Response.ok().data(user);
    }

}
