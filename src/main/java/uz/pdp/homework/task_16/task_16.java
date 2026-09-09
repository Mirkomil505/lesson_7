package uz.pdp.homework.task_16;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task_16 {
    static void main() throws IOException, InterruptedException {


        String newUser = """
        {
            "id": 1,
            "name": "Mirkomil",
            "username": "Makhmudov",
            "email": "new@example.com"
        }
        """;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(newUser))
                .build();


        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());
    }
}
