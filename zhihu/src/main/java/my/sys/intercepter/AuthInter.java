package my.sys.intercepter;

import my.app.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AuthInter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user = (User) request.getSession().getAttribute("principal");

        if (user!=null){

            return true;

        }
//        response.sendRedirect(request.getContextPath()+"/login.jsp");
        response.setStatus(403);
//        response.getWriter().write("未登录");
        return false;
    }


}
