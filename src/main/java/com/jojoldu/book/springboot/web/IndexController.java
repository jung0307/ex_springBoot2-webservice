package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.PostsService;
import com.jojoldu.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("posts" , postsService.findAllDesc());
        return "index";
    }

    @GetMapping(value = "/posts/save")
    public String postsSave() {

        System.out.println("????????????????????");
        return "posts-save";
    }

    @GetMapping(value = "/posts/update/{id}")
    public String postUpdate(@PathVariable("id") Long id , Model model) {
        PostsResponseDto responseDto = postsService.findById(id);
        model.addAttribute("post" , responseDto);
        System.out.println("어텐션~~~~~~~~~~~~~~~"+responseDto.getId());
        return "posts-update";
    }
}
