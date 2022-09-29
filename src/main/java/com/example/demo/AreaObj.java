package com.example.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AreaObj extends Remote {
        public double getQuadrado (int a, int b) throws RemoteException;
        public double getRetangulo (int a, int b) throws RemoteException;
        public double getTriangulo (int a, int b, int c) throws RemoteException;
        public double getCirculo (int a) throws RemoteException;
}
