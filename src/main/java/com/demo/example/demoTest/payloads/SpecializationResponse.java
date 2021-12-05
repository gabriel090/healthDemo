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

        public double getAccuracy() {
                return accuracy;
        }

        public void setAccuracy(double accuracy) {
                this.accuracy = accuracy;
        }

        public int getRanking() {
                return ranking;
        }

        public void setRanking(int ranking) {
                this.ranking = ranking;
        }
}
