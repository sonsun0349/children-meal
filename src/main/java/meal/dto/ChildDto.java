package meal.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ChildDto {

    @ApiModelProperty(value = "주민번호")
    private String idNum;

    @ApiModelProperty(value = "이름")
    private String name;
}

