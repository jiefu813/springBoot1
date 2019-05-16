package com.jeff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeff.common.Grid;
import com.jeff.entity.User;
import com.jeff.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("manager")
	public String index() {

		return "user/userList";
	}

	@RequestMapping("datagrid")
	@ResponseBody
	public Object datagrid() {
		List<User> userList = userService.list();
		Grid grid = new Grid();
		grid.setRows(userList);
		grid.setTotal(userList.size());
		return grid;
	}

}
