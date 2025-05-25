package com.jekins.Spring_jenkin;

import org.apache.juli.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinApplicationTests {
	private static final Logger logger = (Logger) LogFactory.getLog(SpringJenkinApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true, true);
	}


}
