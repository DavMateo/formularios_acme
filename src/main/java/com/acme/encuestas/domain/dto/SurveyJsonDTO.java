package com.acme.encuestas.domain.dto;

import java.time.LocalDateTime;

import com.acme.encuestas.domain.entities.Surveys;

public class SurveyJsonDTO {
    private Long idencuestajson;
    private LocalDateTime creadoen;
    private LocalDateTime actualizadoen;
    private Object payload;
    private Surveys surveys;
    public SurveyJsonDTO() {
    }
    public SurveyJsonDTO(Long idencuestajson, LocalDateTime creadoen, LocalDateTime actualizadoen, Object payload,
            Surveys surveys) {
        this.idencuestajson = idencuestajson;
        this.creadoen = creadoen;
        this.actualizadoen = actualizadoen;
        this.payload = payload;
        this.surveys = surveys;
    }
    public Long getIdencuestajson() {
        return idencuestajson;
    }
    public void setIdencuestajson(Long idencuestajson) {
        this.idencuestajson = idencuestajson;
    }
    public LocalDateTime getCreadoen() {
        return creadoen;
    }
    public void setCreadoen(LocalDateTime creadoen) {
        this.creadoen = creadoen;
    }
    public LocalDateTime getActualizadoen() {
        return actualizadoen;
    }
    public void setActualizadoen(LocalDateTime actualizadoen) {
        this.actualizadoen = actualizadoen;
    }
    public Object getPayload() {
        return payload;
    }
    public void setPayload(Object payload) {
        this.payload = payload;
    }
    public Surveys getSurveys() {
        return surveys;
    }
    public void setSurveys(Surveys surveys) {
        this.surveys = surveys;
    }
    
}
