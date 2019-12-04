package com.qy105.aaa.controller;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 小男神
 */
@RestController

public class BookController {
    @Autowired
    private BookService bookService;
    private int i = 1;
    @RequestMapping("/getAllBook")
    public List<BookInfo> getAllBook() throws Exception {
        List<BookInfo> allBook = bookService.getAllBook();
        if (++i % 2 == 0) {
            System.out.println(i);
            System.out.println(1/0);
        }
        return allBook;
    }
}
