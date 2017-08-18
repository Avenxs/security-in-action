package com.waylau.spring.boot.blog.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 主页控制器.
 * @since 1.0.0 2017年5月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {
    @GetMapping
    public String listBlogs(@RequestParam(value="order",required=false,defaultValue="new")String order,
    		@RequestParam(value="keyword",required=false)String keyword) {
    	System.out.println(order+"..."+keyword);
        return "redirect:/index?order="+order+"&keyword="+keyword;
    }


}
