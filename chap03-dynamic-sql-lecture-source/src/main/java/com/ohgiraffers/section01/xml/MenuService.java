package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

public class MenuService {

    public void findMenuByprice(int maxPrice) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.selectMenuByPrice(maxPrice);
        System.out.println("service: " );
        menus.forEach(System.out::println);

    }

    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        System.out.println("service: ");
        menus.forEach(System.out::println);
    }

    public void searchMenuBySupCategory(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuBySupCategory(searchCriteria);

        if(menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else{
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }
    }
}
