
package com.sam.image.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sam.image.entity.ImageEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageMapper extends BaseMapper<ImageEntity> {

    List<ImageEntity> selectUserPage(IPage<ImageEntity> page, @Param("ew") QueryWrapper<ImageEntity> wrapper);
}
