
package beans;

import javax.ejb.Stateless;



@Stateless
public class HolaMundoEJBImpl implements HolaMundoEJBRemote{
    
    
    @Override
    public int sumar(int a, int b){
        System.out.println("Ejecutando método suma desde el servidor");
        return a+b;
    }
    
    
}
