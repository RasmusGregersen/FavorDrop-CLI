package favorDrop;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface LogikI {
    @WebMethod String login(String bruger, String adgangskode) throws Exception;
    @WebMethod Object getClientsA(String token);
    @WebMethod Object getPartnersA(String token);
    @WebMethod Object getCompletedOrdersLength(String token);
    @WebMethod Object deleteOrderInService(String token, String OID);
    @WebMethod Object deleteOrderNew(String token, String OID);
    @WebMethod String getOrdersInService(String token);
    @WebMethod String getOrdersNew(String token);
}