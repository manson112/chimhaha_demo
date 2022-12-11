package manson112.github.chimhahademo.board.dto.create;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.board.entity.Board;

@Getter
@Setter
@Builder
public class BoardSelectResponseDto {
    private Long boardId;
    private String boardName;

    public BoardSelectResponseDto() {
    }

    public BoardSelectResponseDto(Long boardId, String boardName) {
        this.boardId = boardId;
        this.boardName = boardName;
    }

    public static BoardSelectResponseDto from(BoardSelectResponseVo boardSelectResponseVo) {
        return BoardSelectResponseDto.builder()
                .boardId(boardSelectResponseVo.getBoardId())
                .boardName(boardSelectResponseVo.getBoardName())
                .build();
    }
}
