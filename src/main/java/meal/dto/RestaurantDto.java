package meal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RestaurantDto {

    @ApiModelProperty("위도")
    private Double regionLat;

    @ApiModelProperty("경도")
    private Double regionLng;

    @ApiModelProperty("식당이름")
    private String resName;
}
