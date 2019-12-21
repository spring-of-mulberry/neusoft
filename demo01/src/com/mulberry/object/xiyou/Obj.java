package com.mulberry.object.xiyou;

public class Obj {
    private String name;
    private String wuqi;
    private String zhandou;
    private String naili;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWuqi() {
        return wuqi;
    }

    public void setWuqi(String wuqi) {
        this.wuqi = wuqi;
    }

    public String getZhandou() {
        return zhandou;
    }

    public void setZhandou(String zhandou) {
        this.zhandou = zhandou;
    }

    public String getNaili() {
        return naili;
    }

    public void setNaili(String naili) {
        this.naili = naili;
    }

    public Obj(String name,String wuqi, String zhandou, String naili) {
        this.name = name;
        this.wuqi = wuqi;
        this.zhandou = zhandou;
        this.naili = naili;
    }

    @Override
    public String toString() {
        return "英雄："+name +
                "，武器为" + wuqi  +
                ", 战斗力" + zhandou  +
                ", 耐力" + naili  ;
    }
}
