package manson112.github.chimhahademo.board.dto.create;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.board.entity.Board;

@Getter
@Setter
@Builder
public class BoardCreateVo {
    private String boardName;
    private Long   categoryId;
}
