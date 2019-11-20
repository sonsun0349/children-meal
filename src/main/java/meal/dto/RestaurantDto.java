package meal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RestaurantDto {

//    @ApiModelProperty("지역코드")
//    private long regionCode;

    @ApiModelProperty("위도")
    private Double regionLat;

    @ApiModelProperty("경도")
    private Double regionLng;
}
