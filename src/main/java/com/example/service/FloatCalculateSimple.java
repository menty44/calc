//package com.example.service;
//
//import com.example.model.FloatOperationModel;
//import org.springframework.stereotype.Service;
//
//@Service
//public class FloatCalculateSimple {
//
//    public float fadd(FloatOperationModel model){
//        return model.getA() + model.getB();
//    }
//
//    public float fsubtract(FloatOperationModel model){
//        return model.getA() - model.getB();
//    }
//
//    public float fmultiply(FloatOperationModel model){
//        return model.getA() * model.getB();
//    }
//
//    public double fdivide(FloatOperationModel model){
//        if(model.getA() == 0) return 0;
//        if(model.getB() == 0) return 0;
//        return (double) model.getA() / model.getB();
//    }
//
//    public FloatOperationModel clearSimple(FloatOperationModel model){
//        model.setA(0);
//        model.setB(0);
//        return model;
//    }
//
//}
