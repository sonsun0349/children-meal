package meal.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ChildInfoDto {

    @ApiModelProperty(value = "주민번호")
    private String idNum;

    @ApiModelProperty(value = "나이")
    private int age;

    @ApiModelProperty(value = "지역코드")
    private long regionCode;

}
