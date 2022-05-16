package com.example.model;

public class FloatOperationModel {

    private String operation;
    private int a;
    private int b;
    private int c;

    public FloatOperationModel() {
    }

    public FloatOperationModel(int c) {
        this.c = c;
    }

    public FloatOperationModel(String operation) {
        this.operation = operation;
    }

    public FloatOperationModel(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
