package test;

import beans.HolaMundoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestHolaMundo {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente \n");

        try {
            Context jndi = new InitialContext();
            //Importamos las clases y hacemos el casteo
            HolaMundoEJBRemote holaMundoEJB = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
            int resultado=holaMundoEJB.sumar(7, 12);
            System.out.println("Resultado: " + resultado);
        } catch (NamingException e) {
            e.printStackTrace();

        }
    }

}
