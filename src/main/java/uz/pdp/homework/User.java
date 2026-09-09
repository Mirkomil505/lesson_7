package uz.pdp.homework;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {


        private Integer id;
        @SerializedName("username")
        private String userName;
        private String lastname;
       private String email;
//        private Date createDate = new Date();

}
//User user = new User(1, "Ali Valiyev", "ali", "ali@example.com");
