package com.andrzejn.HomeDevices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

	@RequestMapping("/")
	public String showMessage() {
		return "Some text.";
	}
}
