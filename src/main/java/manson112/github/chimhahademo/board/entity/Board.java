package manson112.github.chimhahademo.board.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.category.entity.CategoryBoard;
import manson112.github.chimhahademo.common.entity.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@Table(name = "BOARD")
public class Board extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "BOARD_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "board")
    private List<CategoryBoard> categoryBoards = new ArrayList<>();

    public Board() {
    }

    public Board(Long id, String name, List<CategoryBoard> categoryBoards) {
        this.id = id;
        this.name = name;
        this.categoryBoards = categoryBoards;
    }
}