package com.qy105.aaa.service.impl;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小男神
 */
@Service
public class BookServiceHystrixImpl implements BookService {
    @Override
    public List<BookInfo> getAllBook() {
        System.out.println("服务降级中");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("zzzzz");
        List<BookInfo> list = new ArrayList<>();
        list.add(bookInfo);
        return list;
    }
}
