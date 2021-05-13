package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldRestController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World! Time on server is: " + LocalDateTime.now() + "\r\n Here is a list the list of available path" +
                "\r\nAbout us: http://localhost:8080/aboutus" +
                "\r\nContact us: http://localhost:8080/contactus" +
                "\r\nProducts: http://localhost:8080/products" +
                "\r\nConnect us: http://localhost:8080/connect" +
                "\r\nFeedback: http://localhost:8080/feedback" +
                "\r\nNews: http://localhost:8080/news";
    }
    @GetMapping("/aboutus")
    public String getAbout(){
        return "Company name... Welcome to Company name! we are happy to have you here";
    }
    @GetMapping("/contactus")
    public String getContact(){
        return "Contact:\nsomeone@gmai.com";
    }
    @GetMapping("/products")
    public String getProduct(){
        return "List of Products:\nBall Valve, Check Valve, Mixer";
    }
    @GetMapping("/connect")
    public String getConnect(){
        return "You can find us on LinkedIn";
    }
    @GetMapping("/feedback")
    public String getFeedback(){
        return "Here are the best feedbacks we got so far";
    }
    @GetMapping("/news")
    public String getNews(){
        return "Here you can read the latest news and updates about the company";
    }
}
