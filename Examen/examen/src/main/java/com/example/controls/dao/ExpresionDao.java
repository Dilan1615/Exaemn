package com.example.controls.dao;
import com.example.models.ExpresionA;


public class ExpresionDao {
    private ExpresionA expresiones;

        public void evaluar( ){

        }

        

        public void agregarExpresion(ExpresionA expresion) {
            this.expresiones = expresion;
            System.out.println("Expresión agregada: " + expresion.getExpresion1() + ", " + expresion.getExpresion2());
        }

        public String agregarParentesisis(ExpresionA expresion) {
            if (expresion.getExpresion1().contains("(") && expresion.getExpresion1().contains(")")) {
                return "(" + expresion.getExpresion1() + ")";
            }
            return expresion.getExpresion1();
        }
}
