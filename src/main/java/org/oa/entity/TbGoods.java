package org.oa.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;


public class TbGoods {

    private long id;
    private String name;
    private long goodstypeId;
    private String description;
    private long number;
    private String state;
    private long delete;
    private TbGoodsType tbGoodsType;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGoodstypeId() {
        return goodstypeId;
    }

    public void setGoodstypeId(long goodstypeId) {
        this.goodstypeId = goodstypeId;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TbGoodsType getTbGoodsType() {
        return tbGoodsType;
    }

    public void setTbGoodsType(TbGoodsType tbGoodsType) {
        this.tbGoodsType = tbGoodsType;
    }

    @JsonIgnore
    public long getDelete() {
        return delete;
    }

    public void setDelete(long delete) {
        this.delete = delete;
    }
}
