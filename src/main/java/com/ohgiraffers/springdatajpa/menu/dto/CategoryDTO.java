package com.ohgiraffers.springdatajpa.menu.dto;

import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CategoryDTO {

    private int categoryCode;
    private String categoryName;
    private Integer refCategoryCode;


}
