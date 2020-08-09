package com.example.gym_frag_db.model;

public class DataBase {
    private  String DataBaseName;
    private int id;

    public DataBase(int id,String dataBaseName ) {
        DataBaseName = dataBaseName;
        this.id = id;
    }

    public String getDataBaseName() {
        return DataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        DataBaseName = dataBaseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
