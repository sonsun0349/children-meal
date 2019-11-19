package meal.mapper;

import meal.mybatis.MasterMapper;
import org.apache.ibatis.annotations.Mapper;

@MasterMapper
public interface ChildrenMapper {
    String getChild_();
}
