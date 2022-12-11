package manson112.github.chimhahademo.category.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
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
    private List<Board> boards = new ArrayList<>();

    public CategorySelectResponseDto() {
    }

    public CategorySelectResponseDto(String name, String link, List<Board> boards) {
        this.name = name;
        this.link = link;
        this.boards = boards;
    }

    public static CategorySelectResponseDto from(Category category) {
        return CategorySelectResponseDto.builder()
                .name(category.getName())
                .link(category.getLink())
                .boards(category.getCategoryBoards().stream().map(CategoryBoard::getBoard).collect(Collectors.toList()))
                .build();
    }
}
