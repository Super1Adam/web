package web.wjx;

import java.time.LocalDate;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LoveWebService {

    @WebMethod
    public String getCurrentDate() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date as a string
        String formattedDate = currentDate.toString();

        return "Today's date: " + formattedDate;
    }

  
}