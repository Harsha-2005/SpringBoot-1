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

    @GetMapping("/Skills")
    public String Skills(){
        return """
                <h1>Skills</h1>
                <p>I am proficient in</p>
                <ul>
                    <li>Python</li>
                    <li>C++</li>
                    <li>C</li>
                    <li>HTML</li>
                    <li>Java</li>
                    <li>CSS</li>
                </ul>
                """;
    }

    @GetMapping("Education")
    public String Education(){
        return """
                <h1>Education</h1>
                <p>I am Currently Pursuing B-Tech at Lovely Professional University.</p>
                <div>
                    <h1>B-tech</h1>
                    <p>Lovely Professional University with a TGPA : 7.95</p>
                    <h1>Intermediate</h1>
                    <p>Narayana Junior College with a percentage of 96.2%</p>
                    <h1>Matriculation</h1>
                    <p>Narayana Junior School with a score of 100</p>
                </div>
        """;
    }

    @GetMapping("/Project")
    public String Project(){
        return """
                <h1>Project</h1>
                <p>I have done three major projects which will resembles my domain of work that is Machine Learning and Artificial Intelligence.</p>
                <div>
                    <h2>OpenEnv Data Pipeline Debugger</h2>
                    <p>A reinforcement learning agent which will monitor the data pipeline and debug that i there exists any issue and fix it and it will learn by itself through the mistakes.</p>
                    <h2>SMS Spam Detection System</h2>
                    <p>I have taken the baseline models and compare them with the LSTM,SVM,Logistic Regression</p>
                    <h2>AI Audio Book Generator</h2>
                    <p>This will parse the differnt types of documents and understand the text and repeat it back through audio</p>
                
                
                
                </div>
        """;
    }


}
