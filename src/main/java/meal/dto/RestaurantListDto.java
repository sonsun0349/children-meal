package meal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RestaurantListDto {

    @ApiModelProperty("지역코드")
    private long regionCode;


}
