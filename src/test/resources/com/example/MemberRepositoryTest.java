package com.example;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@ExtendWith(SpringExtension.class)
@SpringBootTest

class MemberRepositoryTest {
	
	@Autowired
	private MemberRepository repository;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		List<MemberDomein> memberList = repository.findAll();
		MemberDomein m2 = memberList.get(1);
		MemberDomein m3 = memberList.get(2);
		
		int q1 = memberList.size();
		
		String q2 = m3.getName();
		
		int q3 = m2.getAge();
		
		
		assertAll("findall",
				()-> assertEquals(3,q1,"error"),
				()-> assertEquals("piyo",q2,"error"),
				()->assertEquals(20,q3,"error")
				);

	}
	

}
