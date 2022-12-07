package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.PostsService;
import com.jojoldu.book.springboot.web.dto.PostsResponseDto;
import com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;
import com.jojoldu.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping(value = "/api/v1/posts/{id}")
    public Long update(@PathVariable("id") Long id , @RequestBody
    PostsUpdateRequestDto requestDto) {
        System.out.println("여기 오긴 할까?~~~~~~~~~~~~~~~~~~~");
        return postsService.update(id, requestDto);
    }

    @GetMapping(value = "/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable("id") Long id) {

        return postsService.findById(id);
    }

    @DeleteMapping(value = "/api/v1/posts/{id}")
    public Long delete(@PathVariable("id") Long id) {

         postsService.delete(id);

         return id;
    }
}
