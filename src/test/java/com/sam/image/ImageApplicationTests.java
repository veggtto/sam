package com.sam.image;

import com.sam.image.entity.ImageEntity;
import com.sam.image.mapper.ImageMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ImageApplicationTests {

	@Test
	void contextLoads() {
	}

	@Resource
	private ImageMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<ImageEntity> userList = userMapper.selectList(null);
		Assertions.assertEquals(5, userList.size());
	}

}
