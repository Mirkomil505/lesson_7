package uz.pdp.homework.task_15;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User_15 {


        private Integer id;
        @SerializedName("username")
        private String userName;
        private String lastname;
       private String email;
       @Since(2)
       private String phone;

//        private Date createDate = new Date();

}
//User user = new User(1, "Ali Valiyev", "ali", "ali@example.com");
