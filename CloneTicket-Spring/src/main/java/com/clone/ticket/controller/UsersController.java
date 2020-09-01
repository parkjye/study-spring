package com.clone.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.clone.ticket.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;
}
