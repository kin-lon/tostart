package com.tostart.bean;

public class Tags {
    private Integer itemId;

    private String itemTag;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemTag() {
        return itemTag;
    }

    public void setItemTag(String itemTag) {
        this.itemTag = itemTag == null ? null : itemTag.trim();
    }
}