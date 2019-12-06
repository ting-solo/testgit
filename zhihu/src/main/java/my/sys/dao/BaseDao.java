package my.sys.dao;


import my.app.bean.Answer;
import my.app.bean.Question;
import my.sys.bean.BaseBean;

import java.util.List;

public interface BaseDao <E extends BaseBean>{

    void insert(E e);
    E findById(E e);//验证登录 登录成功 返回这个人的页面
    List<Answer> findAllAnswer(E e);//用来显示个人主页上的所有回答 入参就是这个人
    List<Question> findAllQuestion();//用来显示所有问题
    List<E> findAll(E e);//根据每个问题查找对应的回答

    void delete(E e);

    void update(E e);//修改内容


}
