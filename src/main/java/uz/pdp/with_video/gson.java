package uz.pdp.with_video;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import lombok.Data;

public class gson {
    static void main() {




//        Gson gson = new Gson();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()// nullarniyam qoshib ber yani korsat
//                .setDateFormat(DateFormat.DATE_FIELD)
                .setVersion(1)
                // eng  1 gacha bogan versiyalarni ol divotti botta
                .create();

        String usergson = """
        {
          "uuid": 7,
          "name": "Mirkomil",
          "lastname": "Makhmudov",
        
          "city": "TASHKENT"
        }
        """;

// has two type of creating
        // json has two main methods from jeson and to jeson

        User user1 = gson.fromJson(usergson, User.class);
        //gson.toJson() objectga otadi
        System.out.println(user1);


        String json = gson.toJson(user1);
        System.out.println(json);


       /* String usergson1 = """
        [
          "id": 1,
          "name": "Mirkomil",
          "lastname": "Makhmudov",
          "phone": "949760595",
          "city": "TASHKENT"
        }

        {
          "id": 2,
          "name": "Mirkomil",
          "lastname": "Makhmudov",
          "phone": "949760595",
          "city": "TASHKENT"
        ]
        """;*/
    }
}

@Data

class  User{
   @SerializedName("uuid")
    private Integer id;
    private String name;
    private String lastname;
    private String phone;
    @Since(0.7)
    private String city;
   // private Date createdate = new Date();


}