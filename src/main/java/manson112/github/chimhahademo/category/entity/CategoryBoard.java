package manson112.github.chimhahademo.category.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.board.entity.Board;

import javax.persistence.*;


@Getter
@Setter
@Builder
@Entity
@Table(name = "CATEGORY_BOARD")
public class CategoryBoard {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_BOARD_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    public CategoryBoard() {
    }

    public CategoryBoard(Long id, Category category, Board board) {
        this.id = id;
        this.category = category;
        this.board = board;
    }
}
