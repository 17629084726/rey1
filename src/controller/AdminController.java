package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Admin;
import service.AdminDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    HttpServletRequest request;
    @RequestMapping("/login.action")
    @ResponseBody
    public String login(@RequestBody Admin admin){
        HttpSession session = request.getSession();
        Admin loginAdmin = AdminDao.
    }
}
