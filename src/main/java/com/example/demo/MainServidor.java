package com.example.demo;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MainServidor {
    public static void main(String[] args) {

        try {
            System.setSecurityManager (new RMISecurityManager() );
            LocateRegistry.createRegistry(2335);
            Server f = new Server();
            Naming.rebind("//localhost:2335/area", f);
            System.out.println("Servidor pronto.");
        }
        catch (RemoteException re) {
            System.out.println(" Exception in " + re);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
