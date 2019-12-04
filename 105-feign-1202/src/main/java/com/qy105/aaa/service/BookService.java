package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.impl.BookServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 小男神
 */
@FeignClient(value = "provider-server",fallback = BookServiceHystrixImpl.class)
public interface BookService {
    /**
     * 查询所有图书
     * @return
     */

    @GetMapping(value = "/getAllBook")
    List<BookInfo> getAllBook();
}
