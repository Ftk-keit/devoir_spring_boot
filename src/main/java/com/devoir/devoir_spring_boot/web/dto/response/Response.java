package com.devoir.devoir_spring_boot.web.dto.response;

public class Response {

    private String status;
    private String type;
    private Object result;


    public Response(String status, String type, Object result) {
        this.status = status;
        this.type = type;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getData() {
        return result;
    }

    public void setData(Object result) {
        this.result = result;
    }
}
