package meal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantInfoDto {

    @ApiModelProperty("식당번호")
    private int resCode;

    @ApiModelProperty("식당이름")
    private String resName;

    @ApiModelProperty("식당전화번호")
    private String resNum;

    @ApiModelProperty("식당링크주소")
    private String resLink;
}
