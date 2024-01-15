package web.wjx;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDate;

@WebService
public class main {

	public static void main(String[] args) {
        // 在应用服务器上发布 Web 服务
        // 这里只是演示，实际部署可能需要使用应用服务器如 Tomcat、GlassFish 等
        LoveWebService loveWebService = new LoveWebService();
        String address = "http://localhost:8080/LoveWebService";
        javax.xml.ws.Endpoint.publish(address, loveWebService);

        System.out.println("LoveWebService is published at: " + address);
    }
}
