package com.tedu.provider.controller;

import com.tedu.provider.service.IUserService;
import com.tedu.provider.service.ex.*;
import com.tedu.provider.dto.PageCondition;
import com.tedu.provider.dto.PageResult;
import com.tedu.provider.dto.Result;
import com.tedu.provider.dto.UserCondition;
import com.tedu.provider.entity.User;
import com.tedu.provider.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController extends BaseController {
    public static final Integer OK = 2000;

    // http://localhost:9001/reg?username=occl&password=1234&gender=0&phone=13100131001&email=controller@qq.com
    @Autowired
    private IUserService userService;

    @RequestMapping("/reg")
    public JsonResult<Void> reg(@RequestBody User user) {
        userService.reg(user);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(OK);
        jsonResult.setMessage("注册成功！");
        return jsonResult;
    }

}