package com.demo.example.demoTest.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class SysmptomsResponse {

    @JsonProperty("ID")
    public int iD;
    @JsonProperty("Name")
    public String name;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SysmptomsResponse{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                '}';
    }
}

