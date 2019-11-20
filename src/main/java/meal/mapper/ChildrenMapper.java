package meal.mapper;

import meal.dto.ChildDetailInfoDto;
import meal.dto.RestaurantDto;
import meal.mybatis.MasterMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MasterMapper
public interface ChildrenMapper {
    String getChildId(@Param("id") String id,@Param("pw") String pw);
    ChildDetailInfoDto getChildInfo(@Param("idNum") String id);
    List<RestaurantDto> getResList(@Param("regionCode") long code);
}
