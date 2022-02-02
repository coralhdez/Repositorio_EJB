package beans;

import javax.ejb.Remote;

@Remote
public interface HolaMundoEJBRemote {

    int sumar(int a, int b);

}
