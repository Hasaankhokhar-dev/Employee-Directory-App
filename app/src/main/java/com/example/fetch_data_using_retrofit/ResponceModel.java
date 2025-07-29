package com.example.fetch_data_using_retrofit;

public class ResponceModel {
    String id,name,desig;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public ResponceModel(String id, String name, String desig) {
        this.id = id;
        this.name = name;
        this.desig = desig;
    }
}
