package com.jojoldu.book.springboot.web.dto;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class HelloResponseDtoTest {

    @Test
    @DisplayName("롬복 기능 테스트")
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name , amount);

        // then
        assertEquals(helloResponseDto.getName() , name);
        assertEquals(helloResponseDto.getAmount() , amount);


    }
}