package cn.com.ziquan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("yanshuai")
public class ImageController {
	@RequestMapping("image")
	public String image() {
		return "image";
	}
}
