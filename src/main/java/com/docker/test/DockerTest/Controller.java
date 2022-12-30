package com.docker.test.DockerTest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/")
    public Map<String, Object> getvalues(){
 Map<String, Object> data = new HashMap<>();
 data.put("massage", "This is Java API");
 data.put("listOFLanguages", Arrays.asList("Java","Python","Javascript"));
 data.put("code",2354);
 return data;

    }

}
