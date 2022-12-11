package manson112.github.chimhahademo.board.repository;

import manson112.github.chimhahademo.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
