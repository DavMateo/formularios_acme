package com.acme.encuestas.domain.dto;

import com.acme.encuestas.domain.entities.Response_options;
import com.acme.encuestas.domain.entities.Subresponse_options;

public class ResponseQuestionDTO {
    private Long idrespuestapregunta;
    private String respuestatexto;
    private Response_options response_options;
    private Subresponse_options subresponse_options;
    public ResponseQuestionDTO() {
    }
    public ResponseQuestionDTO(Long idrespuestapregunta, String respuestatexto, Response_options response_options,
            Subresponse_options subresponse_options) {
        this.idrespuestapregunta = idrespuestapregunta;
        this.respuestatexto = respuestatexto;
        this.response_options = response_options;
        this.subresponse_options = subresponse_options;
    }
    public Long getIdrespuestapregunta() {
        return idrespuestapregunta;
    }
    public void setIdrespuestapregunta(Long idrespuestapregunta) {
        this.idrespuestapregunta = idrespuestapregunta;
    }
    public String getRespuestatexto() {
        return respuestatexto;
    }
    public void setRespuestatexto(String respuestatexto) {
        this.respuestatexto = respuestatexto;
    }
    public Response_options getResponse_options() {
        return response_options;
    }
    public void setResponse_options(Response_options response_options) {
        this.response_options = response_options;
    }
    public Subresponse_options getSubresponse_options() {
        return subresponse_options;
    }
    public void setSubresponse_options(Subresponse_options subresponse_options) {
        this.subresponse_options = subresponse_options;
    }
    
}
