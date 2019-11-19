package meal.service;

import meal.dto.ChildDetailInfoDto;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public interface ChildService {

    boolean loginSuccess(String id, String pw);
    ChildDetailInfoDto loginInfo(String id, String pw);
    ModelAndView loginProcess(String id, String pw);
}
