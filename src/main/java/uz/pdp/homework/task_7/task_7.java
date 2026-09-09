package uz.pdp.homework.task_7;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task_7 {
    static void main() throws IOException, InterruptedException {


        HttpClient httpClient = HttpClient.newHttpClient();


        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .DELETE()
                .build();


        HttpResponse<String> httpResponse = httpClient.send(httpRequest,  HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());



    }
}
