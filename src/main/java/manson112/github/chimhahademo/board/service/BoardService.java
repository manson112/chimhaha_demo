package manson112.github.chimhahademo.board.service;

import lombok.RequiredArgsConstructor;
import manson112.github.chimhahademo.board.dto.create.BoardCreateVo;
import manson112.github.chimhahademo.board.dto.create.BoardSelectResponseVo;
import manson112.github.chimhahademo.board.entity.Board;
import manson112.github.chimhahademo.board.repository.BoardRepository;
import manson112.github.chimhahademo.category.dto.CategorySelectResponseDto;
import manson112.github.chimhahademo.category.entity.Category;
import manson112.github.chimhahademo.category.entity.CategoryBoard;
import manson112.github.chimhahademo.category.repository.CategoryBoardRepository;
import manson112.github.chimhahademo.category.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final CategoryRepository categoryRepository;
    private final CategoryBoardRepository categoryBoardRepository;

    public Long createBoard(BoardCreateVo boardCreateVo) {

        Board board = Board.builder()
                        .name(boardCreateVo.getBoardName())
                        .build();
        boardRepository.save(board);

        if (boardCreateVo.getCategoryId() != null) {
            CategoryBoard categoryBoard = CategoryBoard.builder()
                    .board(board)
                    .category(categoryRepository.findById(boardCreateVo.getCategoryId()).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 카테고리 입니다.")))
                    .build();

            categoryBoardRepository.save(categoryBoard);
        }

        return board.getId();
    }

    public List<BoardSelectResponseVo> retrieveAllBoard() {
        return boardRepository.findAll().stream().map(BoardSelectResponseVo::from).collect(Collectors.toList());
    }

    public List<CategorySelectResponseDto> retrieveAllCategories() {
        return categoryRepository.findAll().stream().map(CategorySelectResponseDto::from).collect(Collectors.toList());
    }

}
