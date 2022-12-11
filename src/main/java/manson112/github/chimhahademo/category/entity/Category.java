package manson112.github.chimhahademo.category.entity;

import lombok.Getter;
import lombok.Setter;
import manson112.github.chimhahademo.common.entity.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Category extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;

    private String link;

    @OneToMany(mappedBy = "category")
    private List<CategoryBoard> categoryBoards = new ArrayList<>();

    public Category() {
    }
}
