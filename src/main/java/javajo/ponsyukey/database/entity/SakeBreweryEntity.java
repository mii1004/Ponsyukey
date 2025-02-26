package javajo.ponsyukey.database.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import java.util.Optional;

/**
 * 酒醸造所entity
 */
@Entity
public class SakeBreweryEntity {

    /** 醸造所ID */
    // TODO: idをUUIDに変更する
    @Id
    String id;

    /** 醸造所名 */
    String name;

    /** リージョンID (国×都道府県) */
    Integer regionId;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getRegionId() {
        return regionId;
    }
}
