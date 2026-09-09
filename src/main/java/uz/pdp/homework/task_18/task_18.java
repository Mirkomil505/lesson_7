package uz.pdp.homework.task_18;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

public class task_18 {
    static void main() throws IOException, InterruptedException {


        HttpClient httpClient = HttpClient.newHttpClient();

        String patchBody = """
                {
                    "email": "updated@example.com"
                }
                """;

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .header("Content-Type", "application/json")
                .method("PATCH", HttpRequest.BodyPublishers.ofString(patchBody))
                .build();

        HttpResponse<Path> httpResponse = httpClient.send(
                httpRequest,
                HttpResponse.BodyHandlers.ofFile(Path.of("patched_user.json"))
        );

        System.out.println("Status: " + httpResponse.statusCode());
        System.out.println("Saqlangan fayl manzili: " + httpResponse.body());

        //1. BodyHandlers.ofByteArray() — body'ni byte[] sifatida qaytaradi (rasm, fayl kabi binary data uchun).
        //2 2. BodyHandlers.ofFile(Path) — body'ni to'g'ridan-to'g'ri diskdagi faylga yozadi (katta response'larni saqlash uchun qulay).
    }
}
