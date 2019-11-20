package meal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ChildDetailInfoDto {

    @ApiModelProperty("이름")
    private String name;

    @ApiModelProperty("나이")
    private int age;

    @ApiModelProperty("지역코드")
    private long regionCode;

    @ApiModelProperty("지역이름")
    private String regionName;

    @ApiModelProperty("위도")
    private Double regionLat;

    @ApiModelProperty("경도")
    private Double regionLng;
}
