package manson112.github.chimhahademo.category.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.board.dto.create.BoardSelectResponseDto;
import manson112.github.chimhahademo.board.dto.create.BoardSelectResponseVo;
import manson112.github.chimhahademo.board.entity.Board;
import manson112.github.chimhahademo.category.entity.Category;
import manson112.github.chimhahademo.category.entity.CategoryBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
public class CategorySelectResponseDto {
    private String name;
    private String link;
    private List<BoardSelectResponseDto> boards = new ArrayList<>();

    public CategorySelectResponseDto() {
    }

    public CategorySelectResponseDto(String name, String link, List<BoardSelectResponseDto> boards) {
        this.name = name;
        this.link = link;
        this.boards = boards;
    }

    public static CategorySelectResponseDto from(CategorySelectResponseVo categorySelectResponseVo) {
        return CategorySelectResponseDto.builder()
                .name(categorySelectResponseVo.getName())
                .link(categorySelectResponseVo.getLink())
                .boards(categorySelectResponseVo.getBoards().stream()
                        .map(BoardSelectResponseDto::from)
                        .collect(Collectors.toList()))
                .build();
    }
}
