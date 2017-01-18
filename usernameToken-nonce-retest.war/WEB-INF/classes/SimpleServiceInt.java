package mil.navy.erm.nsips.mydeployment;
import javax.jws.WebParam;

@javax.ejb.Stateless
public interface SimpleServiceInt {
            
    public String sayHello(String name);                
}
