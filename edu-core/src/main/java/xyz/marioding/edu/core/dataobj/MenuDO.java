package xyz.marioding.edu.core.dataobj;

import lombok.Data;

@Data
public class MenuDO implements DO{

    private String id;

    private String name;

    private String linkPath;

    private String icon;

    private String parentLinkId;



}
