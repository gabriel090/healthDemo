package com.demo.example.demoTest.services;


import com.demo.example.demoTest.configs.Constant;
import com.demo.example.demoTest.payloads.DiagnosisResponse;
import com.demo.example.demoTest.payloads.SpecializationResponse;
import com.demo.example.demoTest.payloads.SysmptomsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class DiagService {
    //Service Class gets api call request
    @Autowired
    WebClient webClient;

    public DiagService(WebClient webClient){
        this.webClient = webClient;
    }


    public Flux<SysmptomsResponse> getSymptoms() {
            String symptoms = "symptoms?" +Constant.URL_STRING;

        Flux<SysmptomsResponse> response = webClient.get()
                .uri(symptoms)
                .retrieve()
                .bodyToFlux(SysmptomsResponse.class);
        return response;
    }

    public Flux<DiagnosisResponse> getDiagnosis(String symptoms,String gender, String age){
          Flux<DiagnosisResponse> response = webClient.get()
                .uri("diagnosis?symptoms=["+symptoms+"]&gender="+gender+"&year_of_birth="+age+Constant.URL_STRING)
                .retrieve()

                .bodyToFlux(DiagnosisResponse.class);
        return  response;
    }

//    public Flux<SpecializationResponse> getSpecialization(String symptoms, String gender, String age){
//          Flux<SpecializationResponse> response = webClient.get()
//                .uri("diagnosis/specialisations?symptoms=["+symptoms+"]&gender="+gender+"&year_of_birth="+age+ Constant.URL_STRING)
//                .retrieve()
//                .bodyToFlux(SpecializationResponse.class);
//        return  response;
//    }

}
