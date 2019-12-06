package my.app.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.sys.bean.BaseBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question extends BaseBean implements Serializable{

    private String questionId;
    private String title;
    private String content;
    private int scanedCount;
    private int userId;
    private Date createTime;

    private List<Answer> answerList;

}
