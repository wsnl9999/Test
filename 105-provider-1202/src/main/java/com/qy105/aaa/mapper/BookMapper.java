package com.qy105.aaa.mapper;

import com.qy105.aaa.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 小男神
 */
@Mapper
public interface BookMapper {
    @Select("select * from book_info")
    List<BookInfo> getAllBook();
}
