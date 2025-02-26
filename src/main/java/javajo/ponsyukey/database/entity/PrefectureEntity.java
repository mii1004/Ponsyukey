package javajo.ponsyukey.database.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class PrefectureEntity {
    /** 都道府県ID(海外の場合は「海外(48)」を選択 */
    @Id
    Integer id;

    /** 都道府県名 */
    String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
