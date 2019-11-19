package meal.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class RegionDto {

    @ApiModelProperty(value = "지역코드")
    private long regionCode;

    @ApiModelProperty(value = "지역이름")
    private String regionName;
}
