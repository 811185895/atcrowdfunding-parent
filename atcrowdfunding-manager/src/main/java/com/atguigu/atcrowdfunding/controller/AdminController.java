package com.atguigu.atcrowdfunding.controller;
import com.atguigu.atcrowdfunding.bean.TAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * -
 *
 * @author 周沫
 * @Date 2020-09-25
 * @Time 12:10
 */
@Controller
public class AdminController {

//	@Autowired
//	private AdminService adminService;
//	@Autowired
//	private MenuService menuService;

	@RequestMapping("/main")
	public String main(TAdmin tAdmin) {
		System.out.println("tAdmin = " + tAdmin);

		return "main";
	}

	@RequestMapping("/login")
	public String login(TAdmin tAdmin) {
		System.out.println("tAdmin = " + tAdmin);

		return "main";
	}

}
