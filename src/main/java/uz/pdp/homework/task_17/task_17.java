package uz.pdp.homework.task_17;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task_17 {
    static void main() throws IOException, InterruptedException {


        HttpClient httpClient = HttpClient.newHttpClient();

        String patchBody = """
                {
                    "email": "mirkomilmakhmudov22@gamil.com"
                }
                """;

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .header("Content-Type","application/json")
                .method("PATCH", HttpRequest.BodyPublishers.ofString(patchBody))
                .build();

      //  Savol: Java HttpClient'da .PATCH() methodi bormi?  yoq
      //  Buning uchun generic .method(String, BodyPublisher) metodidan foydalanasiz — bu metod istalgan
        //  HTTP method nomini string sifatida qabul qiladi:
        HttpResponse<String>httpResponse= httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());



    }
}
