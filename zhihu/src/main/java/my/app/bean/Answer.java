package my.app.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.sys.bean.BaseBean;
import my.sys.dao.BaseDao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer  extends BaseBean implements Serializable {
    private int answerId;
    private String content;
    private int likeCount;
    private Date createTime;
    private int questionId;
    private int userId;

    private Question question;

}
