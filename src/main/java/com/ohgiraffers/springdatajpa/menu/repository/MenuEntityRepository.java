package com.ohgiraffers.springdatajpa.menu.repository;

import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import com.ohgiraffers.springdatajpa.menu.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuEntityRepository extends JpaRepository<MenuEntity, Integer> {

    /* 조회 3 */
    @Query(value = "SELECT A.MENU_CODE, A.MENU_NAME, A.MENU_PRICE, A.CATEGORY_CODE, A.ORDERABLE_STATUS, B.CATEGORY_NAME " +
            "FROM TBL_MENU A " +
            "JOIN TBL_CATEGORY B ON (A.CATEGORY_CODE = B.CATEGORY_CODE) " +
            "WHERE B.CATEGORY_NAME = :categoryName " +
            "ORDER BY A.MENU_CODE",
            nativeQuery = true)
    List<MenuEntity> searchByCategoryName(@Param("categoryName") String categoryName);

}
