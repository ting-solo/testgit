package my.app.controller;

import my.app.bean.Answer;
import my.app.bean.Question;
import my.app.bean.User;
import my.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Result;
import java.util.List;

@Controller
@RequestMapping("api/user")
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("register")
    @ResponseBody
    public User insert(@RequestBody User user){

        userService.insert(user);

        return user;

    }



    @RequestMapping("login")
    @ResponseBody
    public User login(@RequestBody User user, HttpSession session, HttpServletResponse response){

        User principal = userService.findById(user);

        if (principal!=null){
            session.setAttribute("principal",principal);
            return principal;
        }
        response.setStatus(403);
        return null;
    }




    @RequestMapping("findAnswer")
    @ResponseBody
    public List<Answer> findAnswer(User user){
        List<Answer> answers = userService.findAllAnswer(user);
        return answers;
    }

    @RequestMapping("findQuestion")
    @ResponseBody
    public List<Question> findQuestion(){
        return userService.findAllQuestion();

    }
}
