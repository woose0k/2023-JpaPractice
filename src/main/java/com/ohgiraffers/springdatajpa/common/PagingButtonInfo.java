package com.ohgiraffers.springdatajpa.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class PagingButtonInfo {

    private int currentPage;
    private int startPage;
    private int endPage;

}
