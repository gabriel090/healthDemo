package com.demo.example.demoTest.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DiagnosisResponse {
    @JsonProperty("Issue")
    public Issue issue;
    @JsonProperty("Specialisation")
    public List<Specialisation> specialisation;
}

class Issue{
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Accuracy")
    public double accuracy;
    @JsonProperty("Icd")
    public String icd;
    @JsonProperty("IcdName")
    public String icdName;
    @JsonProperty("ProfName")
    public String profName;
    @JsonProperty("Ranking")
    public int ranking;
}

class Specialisation{
    @JsonProperty("ID")
    public int iD;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("SpecialistID")
    public int specialistID;
}




