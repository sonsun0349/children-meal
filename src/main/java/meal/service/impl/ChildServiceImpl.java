package meal.service.impl;

import meal.mapper.ChildrenMapper;
import meal.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildrenMapper childrenMapper;

    @Autowired
    public String getChild(){
        return childrenMapper.getChild_();
    }
}
