package com.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
//import java.net.URL;
import java.net.URL;

import org.json.JSONObject;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {
    private static final String API_KEY = "*************************"; 
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String city = request.getParameter("city");

        if (city != null && !city.isEmpty()) {
            String jsonResponse = getWeatherData(city);
            if (jsonResponse != null) {
                JSONObject jsonObject = new JSONObject(jsonResponse);
                JSONObject main = jsonObject.getJSONObject("main");
                String temperature = main.getDouble("temp") + "°C";
                String condition = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");

                request.setAttribute("city", city);
                request.setAttribute("temperature", temperature);
                request.setAttribute("condition", condition);
            } else {
                request.setAttribute("error", "Could not fetch weather data.");
            }
        } else {
            request.setAttribute("error", "City name is required.");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("weather.jsp");
        dispatcher.forward(request, response);
    }

    private String getWeatherData(String city) throws IOException {
        String urlString = String.format(API_URL, city, API_KEY);
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() == 200) {
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();
            return response.toString();
        }
        return null;
    }
}
