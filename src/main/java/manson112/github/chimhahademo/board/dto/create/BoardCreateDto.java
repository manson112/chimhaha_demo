package manson112.github.chimhahademo.board.dto.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardCreateDto {
    private String boardName;
    private Long   categoryId;

    public BoardCreateVo toVo() {
        return BoardCreateVo.builder()
                .boardName(boardName)
                .categoryId(categoryId)
                .build();
    }

}
