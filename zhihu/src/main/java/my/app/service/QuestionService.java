package my.app.service;

import my.app.bean.Question;
import my.app.dao.QuestionDao;
import my.sys.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService extends BaseService<QuestionDao,Question> {

    @Autowired
    private QuestionDao questionDao;

    public Question findOneById(String id){

        return questionDao.findOneById(id);

    }
    public void addQuestion(Question question){

        questionDao.addQuestion(question);
    }
    public List<Question> findUsersById(String id){
        return questionDao.findUsersById(id);

    }
}
