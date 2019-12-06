package my.app.service;

import my.app.bean.User;
import my.sys.dao.BaseDao;
import my.sys.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<BaseDao<User>,User> {

}
