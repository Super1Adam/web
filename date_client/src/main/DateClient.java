package main;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DateClient {

    public static void main(String[] args) {
        String serviceEndpoint = "http://localhost:8080/date/current";

        // Test the date service
        String currentDate = sendGetRequest(serviceEndpoint);
        System.out.println("Current Date from Service: " + currentDate);
    }

    private static String sendGetRequest(String endpoint) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set up the connection
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "text/plain");

            // Get response
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


