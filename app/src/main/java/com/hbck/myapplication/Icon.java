package com.hbck.myapplication;

/**
 * @
 * @Date 2018-07-09.
 */
public class Icon {
    private String name;
    private int resId;

    public Icon() {
    }

    public Icon(String name, int resId) {
        this.name = name;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
