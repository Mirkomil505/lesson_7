package uz.pdp.homework.task_20;

import java.io.IOException;
import java.lang.reflect.Type;
import com.google.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import java.net.*;
import java.net.http.*;
import java.util.List;

;

public class task_20 {
    static void main() throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()

                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .GET()
                .build();


        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());


        System.out.println(httpResponse);


        Gson gson = new Gson();
        Type listType = new TypeToken<List<User_20>>(){}.getType();
        List<User_20> users = gson.fromJson(httpResponse.body(), listType);

        for (User_20 user : users) {
            System.out.println(user);
        }


    }
}



@Data
class User_20 {
    Integer id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
}

@Data
class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;
}

@Data
class Geo {
    String lat;
    String lng;
}