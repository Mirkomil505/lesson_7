package uz.pdp.homework.task_9;

import com.google.gson.Gson;
import uz.pdp.homework.User;

public class task_9 {
    static void main() {

        String json = """
        {
          "id": 1,
          "name": "Leanne Graham",
          "username": "Bret",
          "email": "Sincere@april.biz"
        }
        """;

        Gson gson = new Gson();
        System.out.println(gson.fromJson(json, User.class));

    }
}
