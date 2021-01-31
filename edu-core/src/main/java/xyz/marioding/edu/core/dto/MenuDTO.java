package xyz.marioding.edu.core.dto;

import lombok.Data;

import java.util.List;

@Data
public class MenuDTO implements DTO{


    private String id;

    private String name;

    private String linkPath;

    private String icon;

    private String parentLinkId;

    private List<MenuDTO> subMenus;

}
