package web.wjx;

public class LoveWebServiceClientTest {

    public static void main(String[] args) {
        // 创建 LoveWebService 的工厂
        LoveWebServiceService loveWebServiceFactory = new LoveWebServiceService();
        LoveWebService loveWebServicePort = loveWebServiceFactory.getLoveWebServicePort();

        // 调用 getCurrentDate 方法
        String currentDate = loveWebServicePort.getCurrentDate();
        System.out.println("Current Date: " + currentDate);
    }
}