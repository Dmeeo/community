package com.example.community;

import com.example.community.entity.DiscussPost;
import com.example.community.entity.Page;
import com.example.community.service.DiscussPostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

	@Autowired
	private DiscussPostService discussPostService;
	@Test
	void contextLoads() {

	}

}
