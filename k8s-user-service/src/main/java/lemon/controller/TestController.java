package lemon.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @auther zzyy
 * @create 2020-02-18 10:43
 */
@RestController
@RequestMapping("test")
public class TestController
{


    @GetMapping(value = "/helloworld")
    public String create()
    {
     return "helloworld";
    }


}
