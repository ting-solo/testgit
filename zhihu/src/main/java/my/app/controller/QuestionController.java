package my.app.controller;

import my.app.bean.Question;
import my.app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/question")
@CrossOrigin
public class QuestionController {


    @Autowired
    private QuestionService questionService;
    /**
     * 查找所有的问题 返回list
     * @return
     */
    @RequestMapping("find")
    public List<Question> allQuestion(){

        return questionService.findAllQuestion();

    }

    @RequestMapping("show/{id}")
    public Question findOneById(@PathVariable("id") String id){

        return questionService.findOneById(id);
    }

    @RequestMapping("myque/{id}")
    public List<Question> findUsersById(@PathVariable("id") String id){
        return questionService.findUsersById(id);
    }

    @RequestMapping("insert")
    public void insert(@RequestBody Question question){

        questionService.addQuestion(question);

    }


}
