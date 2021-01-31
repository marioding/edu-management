package xyz.marioding.edu.core.vo;

import lombok.Data;

import java.util.List;

@Data
public class MenuVO implements VO{

    private String id;

    private String name;

    private String linkPath;

    private String icon;

    private String parentLinkId;

    private List<MenuVO> subMenus;
}
