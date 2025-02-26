package javajo.ponsyukey.database.dao;

import javajo.ponsyukey.database.entity.SakeEntity;
import javajo.ponsyukey.database.entity.SaketomoEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface SaketomoDao {

    @Select
    SaketomoEntity selectById(String id);
}
