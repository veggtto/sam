package com.sam.image.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ecl_image_")
public class ImageEntity {
    @TableId("id_")
    private String id;
    @TableField("name_")
    private String name;
    @TableField("desc_")
    private String desc;
}
