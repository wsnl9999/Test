package com.qy105.aaa.controller;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 小男神
 */
@RestController
public class FeignBookController {
    @Autowired
    private BookService bookService;
    @GetMapping("getAllBookFeign")
    public List<BookInfo> getAllBook() {
        List<BookInfo> allBook = bookService.getAllBook();
        System.out.println(allBook);
        return allBook;
    }
}
