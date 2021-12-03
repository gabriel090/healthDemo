package com.demo.example.demoTest.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecializationResponse {
        @JsonProperty("ID")
        public int iD;
        @JsonProperty("Name")
        public String name;
        @JsonProperty("Accuracy")
        public double accuracy;
        @JsonProperty("Ranking")
        public int ranking;
}
