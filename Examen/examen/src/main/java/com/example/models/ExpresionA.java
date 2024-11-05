package com.example.models;

public class ExpresionA {
    private Integer id;
    private String expresion1;
    private String expresion2;

    public ExpresionA(){

    }

    public ExpresionA(Integer id, String expresion1, String expresion2) {
        this.id = id;
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpresion1() {
        return expresion1;
    }

    public void setExpresion1(String expresion1) {
        this.expresion1 = expresion1;
    }

    public String getExpresion2() {
        return expresion2;
    }

    public void setExpresion2(String expresion2) {
        this.expresion2 = expresion2;
    }

    public String mostrarOperacion() {
        return "Expresion1: "+ expresion1 +"/n"+
                "Expresion2: "+ expresion2;        
    }

}
