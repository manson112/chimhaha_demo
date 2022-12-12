package manson112.github.chimhahademo.category.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.board.dto.create.BoardSelectResponseDto;
import manson112.github.chimhahademo.board.dto.create.BoardSelectResponseVo;
import manson112.github.chimhahademo.category.entity.Category;
import manson112.github.chimhahademo.category.entity.CategoryBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class CategorySelectResponseVo {

    private String name;
    private String link;
    private List<BoardSelectResponseVo> boards = new ArrayList<>();

    public CategorySelectResponseVo() {
    }

    @Builder
    public CategorySelectResponseVo(String name, String link, List<BoardSelectResponseVo> boards) {
        this.name = name;
        this.link = link;
        this.boards = boards;
    }

    public static CategorySelectResponseVo from(Category category) {
        return CategorySelectResponseVo.builder()
                .name(category.getName())
                .link(category.getLink())
                .boards(category.getCategoryBoards().stream()
                        .map(CategoryBoard::getBoard)
                        .map(BoardSelectResponseVo::from)
                        .collect(Collectors.toList()))
                .build();
    }
}
