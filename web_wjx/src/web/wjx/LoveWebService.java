package web.wjx;

import java.time.LocalDate;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LoveWebService {

    @WebMethod
    public String getCurrentDate() {
        // 获取当天日期
        LocalDate currentDate = LocalDate.now();

        // 将日期格式化为字符串
        String formattedDate = currentDate.toString();

        return "Today's date: " + formattedDate;
    }

  
}