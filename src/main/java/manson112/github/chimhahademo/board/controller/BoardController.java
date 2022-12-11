package manson112.github.chimhahademo.board.controller;

import lombok.RequiredArgsConstructor;
import manson112.github.chimhahademo.board.dto.create.BoardCreateDto;
import manson112.github.chimhahademo.board.dto.create.BoardCreateVo;
import manson112.github.chimhahademo.board.dto.create.BoardSelectResponseDto;
import manson112.github.chimhahademo.board.dto.create.BoardSelectResponseVo;
import manson112.github.chimhahademo.board.service.BoardService;
import manson112.github.chimhahademo.category.dto.CategorySelectResponseDto;
import manson112.github.chimhahademo.category.entity.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/board/v1")
    public Long createBoard(@RequestBody BoardCreateDto boardCreateDto) {
        return boardService.createBoard(boardCreateDto.toVo());
    }

    @GetMapping("/board/v1")
    public ResponseEntity<List<BoardSelectResponseDto>> retrieveAllBoard() {
        return new ResponseEntity<>(boardService.retrieveAllBoard().stream().map(BoardSelectResponseDto::from).collect(Collectors.toList()), HttpStatus.OK);
    }

    @GetMapping("/category/v1")
    public ResponseEntity<List<CategorySelectResponseDto>> retrieveAllCategories() {
        return new ResponseEntity<>(boardService.retrieveAllCategories(), HttpStatus.OK);
    }


}
