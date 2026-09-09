package uz.pdp.homework.task_8;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task_8 {
    static void main() throws IOException, InterruptedException {



        getUser(HttpClient.newHttpClient());
        System.out.println("------");
        getUser(HttpClient.newHttpClient());
    }

    private static void getUser(HttpClient httpClient) throws IOException, InterruptedException {

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .GET()
                .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());
    }
}
