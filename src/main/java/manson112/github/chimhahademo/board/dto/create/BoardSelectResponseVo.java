package manson112.github.chimhahademo.board.dto.create;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.board.entity.Board;

@Getter
@Setter
@Builder
public class BoardSelectResponseVo {
    private Long boardId;
    private String boardName;

    public BoardSelectResponseVo() {
    }

    public BoardSelectResponseVo(Long boardId, String boardName) {
        this.boardId = boardId;
        this.boardName = boardName;
    }

    public static BoardSelectResponseVo from(Board board) {
        return BoardSelectResponseVo.builder()
                .boardId(board.getId())
                .boardName(board.getName())
                .build();
    }
}
