package meal.service.impl;

import meal.dto.ChildDetailInfoDto;
import meal.dto.ChildDto;
import meal.mapper.ChildrenMapper;
import meal.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildrenMapper childrenMapper;

    public boolean loginSuccess(String id, String pw){
        boolean bool = false;
        String childNum = childrenMapper.getChildId(id,pw);
        if(!childNum.isEmpty()){
            bool = true;
        }
        return bool;
    }

    public ChildDetailInfoDto loginInfo(String id, String pw){
        String childNum = childrenMapper.getChildId(id,pw);
        return childrenMapper.getChildInfo(childNum);
    }

    public ModelAndView loginProcess(String id,String pw){
        ModelAndView mav = new ModelAndView();
        boolean isLoginSuccess = this.loginSuccess(id,pw);
        if(isLoginSuccess){
            ChildDetailInfoDto childInfo = this.loginInfo(id,pw);
            mav.setViewName("index");
            mav.addObject("childInfo",childInfo);
        }
        else{
            mav.setViewName("login");
            mav.addObject("isLoginSuccess",isLoginSuccess);
        }
        return mav;
    }
}
