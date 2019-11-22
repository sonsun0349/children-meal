package meal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

@Data
public class RestaurantDto {

    @ApiModelProperty("위도")
    private Double regionLat;

    @ApiModelProperty("경도")
    private Double regionLng;

    @ApiModelProperty("식당이름")
    private String resName;

    @ApiModelProperty("식당링크")
    private String resLink;

    @ApiModelProperty("식당주소")
    private String resAddress;
}
