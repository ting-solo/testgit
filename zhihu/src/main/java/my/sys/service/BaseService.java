package my.sys.service;

import my.app.bean.Answer;
import my.app.bean.Question;
import my.app.bean.User;
import my.sys.bean.BaseBean;
import my.sys.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<D extends BaseDao<E>,E extends BaseBean> {

    //spring4的新特性 泛型注入 要不然这个抽象类不能通过反射创建对象

    @Autowired
    private D baseDao;

    public void insert(E e){

        baseDao.insert(e);
    }
    public E findById(E e){

      return baseDao.findById(e);
    }
    public List<Answer> findAllAnswer(E e){

        return baseDao.findAllAnswer(e);
    }

    public List<Question> findAllQuestion(){

        return baseDao.findAllQuestion();
    }
}
