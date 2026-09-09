package uz.pdp.homework.task_4;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task_4 {
    static void main() throws IOException, InterruptedException {


        String json = "{\"name\":\"Ali Valiyev\","
                + "\"username\":\"ali\","
                + "\"email\":\"ali@example.com\"}";


        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();


        HttpResponse<String>httpResponse=httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());


        System.out.println(httpResponse.body());
    }
}
