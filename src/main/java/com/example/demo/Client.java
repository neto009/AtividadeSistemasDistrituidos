package com.example.demo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        AreaObj areaObj;
        try {
            areaObj = (AreaObj) Naming.lookup("rmi://localhost:2335/area");
            String parametro = "0";
            double area = 0.0;
            int inputA, inputB, inputC;
            System.out.println("Informe qual figura você deseja calcular a area(Quadrado, triangulo, retangulo, circulo!");
            while(parametro != "") {
                Scanner in = new Scanner(System.in);
                parametro = in.nextLine();
                
                switch(parametro) {
                    case "Quadrado":
                        inputA = in.nextInt();
                        inputB = in.nextInt();
                        area = areaObj.getQuadrado(inputA, inputB);
                        System.out.println(" A area eh: " + area);
                        break;
                    case "Retangulo":
                        inputA = in.nextInt();
                        inputB = in.nextInt();
                        area = areaObj.getRetangulo(inputA, inputB);
                        System.out.println(" A area eh: " + area);
                        break;
                    case "Triangulo":
                        inputA = in.nextInt();
                        inputB = in.nextInt();
                        inputC = in.nextInt();
                        area = areaObj.getTriangulo(inputA, inputB, inputC);
                        System.out.println(" A area eh: " + area);
                        break;
                    case "Circulo":
                        inputA = in.nextInt();
                        area = areaObj.getCirculo(inputA);
                        System.out.println(" A area eh: " + area);
                        break;
                }
            }

        }
        catch(MalformedURLException e) {
            System.out.println( "nao eh um URL RMI valida");
        }
        catch(RemoteException re) {
            System.err.println("Objeto Remoto tratou a execucao " + re);
        }
        catch(NotBoundException e) {
            System.out.println( "Nao foi possivel achar o objeto remoto no servidor");
        }
    }
}
