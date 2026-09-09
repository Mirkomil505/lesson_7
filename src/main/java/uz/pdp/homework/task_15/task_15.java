package uz.pdp.homework.task_15;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class task_15 {
    static void main() {

        User_15 user15 = new User_15(7,"mirkomil","Makhmudov","99999","949760595");

        Gson v1 = new GsonBuilder()
                .setVersion(1.0).
                create();

        System.out.println(v1.toJson(user15));

      //  Savol: phone qaysi holatda JSON'ga qo'shiladi? Nima uchun?
        // versiya versiya nechi bolsa ushndan katta bolish kere

        Gson v3 = new GsonBuilder().setVersion(3.0).create();
        System.out.println(v3.toJson(user15));
    }
}
