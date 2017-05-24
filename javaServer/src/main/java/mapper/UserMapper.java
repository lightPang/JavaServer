package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("Select account from user where id = #{id}")
    String selectAccountById(@Param("id") int id);
}
