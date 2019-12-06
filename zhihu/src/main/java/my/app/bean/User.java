package my.app.bean;

import lombok.*;
import my.sys.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseBean implements Serializable {


    private int userId;
    private String email;
    private String password;
    private Date createTime;


    private String username;
    private String gender;
    private String simpleDesc;
    private String avatarUrl;
    private String position;
    private int likeCount;
    private int collectCount;
    private int  followingCount;
    private int followedCount;
    private int scanCount;
    private Date birthday;


    private List<Answer> answerList;
//    private Answer answer;
    private Question question;

}
