package uz.pdp.homework.task_5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task_5 {
    static void main() throws IOException, InterruptedException {


        String json = "{\"name\":\"Ali Valiyev\","
                + "\"username\":\"ali\","
                + "\"email\":\"ali@example.com\"}";

   HttpRequest httpRequest = HttpRequest.newBuilder()
           .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
           // Server body JSON ekanini bilishi uchun Content-Type kerak
           .header("Content-Type","application/json")
           .POST(HttpRequest.BodyPublishers.ofString(json))
           .build();

        System.out.println(httpRequest);
    }
}
