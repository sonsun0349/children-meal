package meal.controller;

import meal.mapper.ChildrenMapper;
import meal.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private ChildService childService;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/indexProcess",method = RequestMethod.GET)
    public ModelAndView info(){

        ModelAndView mav = new ModelAndView();

        String s = childService.getChild();
        mav.setViewName("index");
        mav.addObject("s",s);

        return mav;
    }
}
