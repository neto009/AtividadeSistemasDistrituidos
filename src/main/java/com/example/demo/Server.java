package com.example.demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements AreaObj {

    public Server() throws RemoteException {
        super();
    }

    @Override
    public double getQuadrado(int a, int b) throws RemoteException {
        System.out.println(" Calculando a area do Quadrado");
        return a * b;
    }

    @Override
    public double getRetangulo(int a, int b) throws RemoteException {
        System.out.println(" Calculando a area do Retangulo");
        return a * b;
    }

    @Override
    public double getTriangulo(int a, int b, int c) throws RemoteException {
        System.out.println(" Calculando a area do Triângulo");
        double result = (double) (a + b + c) / 2;
        return Math.pow(result*(result-a)*(result-b)*(result-c), 0.5);
    }

    @Override
    public double getCirculo(int a) throws RemoteException {
        System.out.println(" Calculando a area do Circulo");
        return Math.PI * Math.pow(a, 2);
    }
}
