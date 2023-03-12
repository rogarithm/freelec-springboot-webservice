package com.rogarithm.book.springboot.web.dto;

import com.rogarithm.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntiry() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
