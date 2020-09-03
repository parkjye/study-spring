package com.clone.ticket.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.clone.ticket.users.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;
}
