package com.ohgiraffers.springdatajpa.menu.dto;

import com.ohgiraffers.springdatajpa.menu.entity.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MenuDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;
    private Category category;
}
