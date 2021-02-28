package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.sql.DBConnectionManager;
import org.geektimes.web.mvc.controller.PageController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.sql.Connection;

/**
 * 输出 “Hello,World” Controller
 */
@Path("/user")
public class UserRegisterController implements PageController {


    private UserRepository userRegister;

    @POST
    @Path("/register")
    public String execute(HttpServletRequest request,HttpServletResponse response) throws Throwable{

        DBConnectionManager instance = DBConnectionManager.getInstance();
        Connection connection = instance.getConnection();


        Class.forName("org.geektimes.projects.user.repository.UserRepository");
        User user = new User();
        user.setName(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setEmail("2345624tg");
        user.setPhoneNumber("1927348745967");

        new DatabaseUserRepository(instance).save(user);

        return "index_success.jsp";
    }
}
