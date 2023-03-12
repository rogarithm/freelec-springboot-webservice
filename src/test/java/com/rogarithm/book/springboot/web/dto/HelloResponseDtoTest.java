package com.rogarithm.book.springboot.web.dto;

import static org.assertj.core.api.Assertions.*;

import junit.framework.TestCase;
import org.junit.Test;

public class HelloResponseDtoTest extends TestCase {

    @Test
    public void testLombok() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}