package xyz.marioding.authority.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.marioding.authority.service.AuthorityService;
import xyz.marioding.edu.core.resp.Response;
import xyz.marioding.edu.core.vo.MenuVO;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthoriteController {

    private AuthorityService authorityService;


    @GetMapping("/authority/all")
    public Response getAllMenus(){

        List<MenuVO> list = new ArrayList<>();

        MenuVO menu1 = new MenuVO();
        menu1.setId("3");
        menu1.setName("资讯列表");
        menu1.setLinkPath("/article-list.html");
        menu1.setIcon("");
        menu1.setParentLinkId("2");

        MenuVO menu2 = new MenuVO();
        menu2.setId("2");
        menu2.setName("资讯管理");
        menu2.setLinkPath("#");
        menu2.setIcon("&#xe616;");
        menu2.setParentLinkId("0");

        List<MenuVO> subMenus = new ArrayList<>();
        subMenus.add(menu1);

        menu2.setSubMenus(subMenus);

        list.add(menu2);

        return Response.ok().data(list);


    }


    @Autowired
    public void setAuthorityService(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }
}
