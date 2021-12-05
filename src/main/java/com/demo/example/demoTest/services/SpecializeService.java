package com.demo.example.demoTest.services;

import com.demo.example.demoTest.configs.Constant;
import com.demo.example.demoTest.payloads.DiagnosisResponse;
import com.demo.example.demoTest.payloads.SpecializationResponse;
import com.demo.example.demoTest.payloads.SysmptomsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;


public class SpecializeService {
    @Autowired
    WebClient webClient;

    public SpecializeService(WebClient webClient){
        this.webClient = webClient;
    }

//    public Flux<SpecializationResponse> getSpecialization(String symptoms, String gender, String age){
//        Flux<SpecializationResponse> response = webClient.get()
//                .uri("diagnosis/specialisations?symptoms=["+symptoms+"]&gender="+gender+"&year_of_birth="+age+ Constant.URL_STRING)
//                .retrieve()
//                .bodyToFlux(SpecializationResponse.class);
//        return  response;
//    }

        public Flux<SpecializationResponse> getSpecialization(String symptoms, String gender, String age){
          Flux<SpecializationResponse> response = webClient.get()
               // .uri("diagnosis/specialisations?symptoms=["+symptoms+"]&gender="+gender+"&year_of_birth="+age+ Constant.SPECIAL)
                  .uri("diagnosis/specialisations?symptoms=["+symptoms+"]&gender="+gender+"&year_of_birth="+age+"&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImdhYnJpZWwubWJhdGhhQGdtYWlsLmNvbSIsInJvbGUiOiJVc2VyIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvc2lkIjoiOTk3OSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvdmVyc2lvbiI6IjIwMCIsImh0dHA6Ly9leGFtcGxlLm9yZy9jbGFpbXMvbGltaXQiOiI5OTk5OTk5OTkiLCJodHRwOi8vZXhhbXBsZS5vcmcvY2xhaW1zL21lbWJlcnNoaXAiOiJQcmVtaXVtIiwiaHR0cDovL2V4YW1wbGUub3JnL2NsYWltcy9sYW5ndWFnZSI6ImVuLWdiIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9leHBpcmF0aW9uIjoiMjA5OS0xMi0zMSIsImh0dHA6Ly9leGFtcGxlLm9yZy9jbGFpbXMvbWVtYmVyc2hpcHN0YXJ0IjoiMjAyMS0xMi0wMiIsImlzcyI6Imh0dHBzOi8vc2FuZGJveC1hdXRoc2VydmljZS5wcmlhaWQuY2giLCJhdWQiOiJodHRwczovL2hlYWx0aHNlcnZpY2UucHJpYWlkLmNoIiwiZXhwIjoxNjM4NzM2NDQ1LCJuYmYiOjE2Mzg3MjkyNDV9.KYkZoO-cRrkqKecKChPQGeGY1kUTvox2vFySn6dapU8&format=json&language=en-gb")
                  .retrieve()
                .bodyToFlux(SpecializationResponse.class);
        return  response;
    }
}
