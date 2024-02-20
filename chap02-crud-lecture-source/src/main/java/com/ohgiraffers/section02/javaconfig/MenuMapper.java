package com.ohgiraffers.section02.javaconfig;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper {

    @Results(id="menuResultMap", value = {
            @Result(id = true, property = "menuCode", column = "MENU_CODE"),
            @Result(property = "menuName", column = "MENU_NAME"),
            @Result(property = "menuPrice", column = "MENU_PRICE"),
            @Result(property = "categoryCode", column = "CATEGORY_CODE"),
            @Result(property = "orderableStatus", column = "ORDERABLE_STATUS"),
    })
    @Select("  SELECT\n" +
            "                MENU_CODE\n" +
            "              , MENU_NAME\n" +
            "              , MENU_PRICE\n" +
            "              , CATEGORY_CODE\n" +
            "              , ORDERABLE_STATUS\n" +
            "        FROM tbl_menu")
    List<MenuDTO> selectAllMenus();

}
