package com.app.babybaby.controller.alertController;

import com.app.babybaby.service.alert.alertFollow.AlertFollowService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/alert/follow/controller/*")
@RequiredArgsConstructor
@Slf4j
public class AlertFollowController {

    private AlertFollowService alertFollowService;

    @GetMapping
    public void getUnread(HttpServletRequest request) {
//        Long count = (Long)request.getSession().getAttribute("noReadAlarm");
        Long count = (Long)request.getAttribute("noReadAlarm");
        log.info("count : " + count);
    }

}
