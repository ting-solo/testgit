package my.app.dao;

import my.app.bean.User;
import my.sys.dao.BaseDao;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface UserDao extends BaseDao<User> {
}
