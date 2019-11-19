package meal.mapper;

import meal.dto.ChildDetailInfoDto;
import meal.mybatis.MasterMapper;
import org.apache.ibatis.annotations.Param;

@MasterMapper
public interface ChildrenMapper {
    String getChildId(@Param("id") String id,@Param("pw") String pw);
    ChildDetailInfoDto getChildInfo(@Param("idNum") String id);
}
