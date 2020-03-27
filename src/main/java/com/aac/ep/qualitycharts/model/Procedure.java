package com.aac.ep.qualitycharts.model;

import java.util.List;
import java.util.Set;

public class Procedure {
    String procedureName;
    Set<String> itemList;

    public Set<String> getItemList() {
        return itemList;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setItemList(Set<String> itemList) {
        this.itemList = itemList;
    }
}
