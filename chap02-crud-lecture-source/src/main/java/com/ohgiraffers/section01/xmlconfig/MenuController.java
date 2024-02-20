package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;      // 결과 페이지에 해당하는(View 개념의) 클래스

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void findAllMenus() {
        List<MenuDTO> menuList = menuService.findAllMenus();

        if(!menuList.isEmpty()){
            printResult.printMenus(menuList);
        }else{
            printResult.printErrorMessage("조회할 메뉴가 없습니다.");
        }
    }
}
