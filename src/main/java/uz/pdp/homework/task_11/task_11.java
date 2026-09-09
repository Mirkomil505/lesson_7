package uz.pdp.homework.task_11;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.pdp.homework.User;

public class task_11 {
    static void main() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        User user = new User(1, "Makhmudov Mirkomil", "ali", "ali@example.com");

        String json = gson.toJson(user);
        System.out.println(json);

    }
}
