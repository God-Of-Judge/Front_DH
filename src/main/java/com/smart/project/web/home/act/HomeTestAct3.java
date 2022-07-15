package com.smart.project.web.home.act;

import com.smart.project.component.CommonCodeComponent;
import com.smart.project.component.data.CodeObject;
import com.smart.project.proc.Test;
import com.smart.project.util.CookieUtil;
import com.smart.project.web.home.vo.JoinVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeTestAct3 {

    @RequestMapping("/main")
    public void main(){
    }

    @RequestMapping("/index")
    public void index(){
    }

    @RequestMapping("/service")
    public void service(){
    }

    @RequestMapping("/login")
    public void login(){
    }

    @RequestMapping("/upload")
    public void upload(){
    }

    @RequestMapping("/join")
    public void join(){
    }


    @RequestMapping("/buttons")
    public void buttons(){
    }





    @RequestMapping("/head")
    public String head(){
        return "fragment/head";

    }

    // 관리자

    @RequestMapping("/admin_head")
    public String adminHead(){
        return "fragment/admin_head";
    }

    @RequestMapping("admin/admin_main")
    public String adminMain(){
        return "admin/admin_main";
    }

    // 회원관리
    @RequestMapping("admin/member_tables")
    public String member_tables(){
        return "admin/member_tables";
    }

    // 동영상관리
    @RequestMapping("admin/video_tables")
    public String video_tables(){
        return "admin/video_tables";
    }
    
    

}
