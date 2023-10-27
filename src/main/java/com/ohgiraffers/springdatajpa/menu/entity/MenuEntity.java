package com.ohgiraffers.springdatajpa.menu.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_menu")
@Getter
@Setter
@ToString
@SequenceGenerator(
        name = "seq_menu_code_generator",
        sequenceName = "seq_menu_code",
        allocationSize = 1
)
public class MenuEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_menu_code_generator"
    )
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private String orderableStatus;
    @ManyToOne
    @JoinColumn(name = "categoryCode")
    private CategoryEntity category;
    public MenuEntity() {
    }
}
