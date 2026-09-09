package uz.pdp.homework.task_13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.pdp.homework.User;

public class task_13 {
    static void main() {


        Gson gson1 = new Gson();
        User user = new User(1, "Ali Valiyev", null, "ali@example.com");

        System.out.println(gson1.toJson(user));


        Gson gson2 = new GsonBuilder()
                .serializeNulls()
                .setPrettyPrinting()
                .create();

        System.out.println(gson2.toJson(user));
// showing the null for the fielt brother


    }
}
