package com.gientech.sys.bookState;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 图书状态实体类，和数据库完全对应【此类不可修改】
 */
@Data
@ApiModel(value = "图书状态--删除DTO")
public class SysBookStateDTO4Delete implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ids,逗号分隔", required = true, position = 1)
    @NotBlank(message = "[bookIds]主键ids，不能为空")
    @Size(max = 400, message = "主键ids，的长度必须小于等于400")
    private String bookIds; // 主键ids,逗号分隔

    // -----------------分割线---------------------------------------
}
