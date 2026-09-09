package uz.pdp.homework.task_10;

import com.google.gson.Gson;
import uz.pdp.homework.User;

public class task_10 {static void main() {

    User user = new User(1, "Ali Valiyev", "ali", "ali@example.com");


    Gson gson = new Gson();
    System.out.println(gson.toJson(user));
}
}
