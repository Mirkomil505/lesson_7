package uz.pdp.homework.task_2;

import com.google.gson.Gson;
import uz.pdp.homework.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task_2 {
    static void main() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();


        HttpRequest httpRequest =HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/5"))
                .GET()
                .build();

        HttpResponse<String>httpResponse =httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());


        System.out.println("Status = "+httpResponse.statusCode());

    }

}
