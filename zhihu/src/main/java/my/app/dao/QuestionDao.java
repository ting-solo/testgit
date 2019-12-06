package my.app.dao;

import my.app.bean.Answer;
import my.app.bean.Question;
import my.sys.dao.BaseDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QuestionDao extends BaseDao<Question> {

    Question findOneById(String id);

    void addQuestion(Question question);

    List<Question> findUsersById(String id);


}
