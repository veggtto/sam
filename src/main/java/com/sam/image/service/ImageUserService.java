package com.sam.image.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sam.image.entity.ImageEntity;
import com.sam.image.mapper.ImageMapper;
import org.springframework.stereotype.Service;

@Service
public class ImageUserService extends ServiceImpl<ImageMapper, ImageEntity> {
}
