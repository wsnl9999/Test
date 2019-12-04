package com.qy105.aaa.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qy105.aaa.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 小男神
 */
@RestController
public class RibbonConsumerBookController {
    @Autowired
    public RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("getAllBookRibbon")
    public List<BookInfo> getAllBook(){
        System.out.println("正常");
        LinkedList forObject = restTemplate.getForObject("http://provider-server/getAllBook",LinkedList.class);
        return forObject;
    }

    public List<BookInfo> error() {
        System.out.println("服务熔断");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("啦啦啦");
        List<BookInfo> objects = new ArrayList<>();
        objects.add(bookInfo);
        return objects;
    }
}
