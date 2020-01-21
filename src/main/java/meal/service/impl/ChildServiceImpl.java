package meal.service.impl;

import meal.dto.ChildDetailInfoDto;
import meal.dto.ChildDto;
import meal.dto.RestaurantDto;
import meal.mapper.ChildrenMapper;
import meal.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildrenMapper childrenMapper;

    public boolean loginSuccess(String id, String pw){
        boolean bool = false;
        String childNum = childrenMapper.getChildId(id,pw);
        if(childNum!=null){
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
            ChildDetailInfoDto childDetailInfo = this.loginInfo(id,pw);
            List<RestaurantDto> list = childrenMapper.getResList(childDetailInfo.getRegionCode());
            mav.setViewName("index");
            mav.addObject("childDetailInfo",childDetailInfo);
            mav.addObject("restaurantData",list);
        }
        else{
            mav.setViewName("/login");
            mav.addObject("isLoginSuccess",isLoginSuccess);
        }

        System.out.println("test");
        return mav;
    }
}
