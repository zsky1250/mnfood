package com.udf.mnfood.entity;

import sun.security.util.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ’≈Œ¥»ª on 2015/12/6.
 */

@Entity
public class FoodMenu{
    @Id
    @GeneratedValue
    private Long ID;

    @Column(length = 5)
    private String name;

    private String href;
    private boolean isMenu;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public boolean isMenu() {
        return isMenu;
    }

    public void setIsMenu(boolean isMenu) {
        this.isMenu = isMenu;
    }
}
