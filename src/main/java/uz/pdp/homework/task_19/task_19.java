package uz.pdp.homework.task_19;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class task_19 {
    static void main() {




        User user = new User("Mirkomil","mirkomilmakhmudov22@gmail.com");
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();


        System.out.println(gson.toJson(user));


    }



}



@AllArgsConstructor
@NoArgsConstructor
@Data
class User {
@Expose
    private String name;
    private String email;

}