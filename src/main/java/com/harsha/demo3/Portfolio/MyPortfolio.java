package com.harsha.demo3.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/Myself")
    public String Myself(){
        return """
                <h1>Myself...</h1>
                <p>I am a extrovert</p>
                <ul>
                    <li>GitHub Link : <a href="https://github.com/Harsha-2005">Link</a></li>
                    <li>LeetCode Link : <a href="https://leetcode.com/u/mhemanarasimhaharshapavan/">Link</a></li>
                </ul>
                """;
    }

}
