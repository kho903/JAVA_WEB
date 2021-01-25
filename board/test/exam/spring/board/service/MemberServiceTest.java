package exam.spring.board.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import exam.spring.board.config.ApplicationConfig;
import exam.spring.board.dao.MembersMapper;
import exam.spring.board.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class MemberServiceTest {
	@Autowired
	MemberService memberService;
	
	@Test
	public void memberJoin() throws Exception {
		Member testMember = new Member();
		testMember.setId("test444");
		testMember.setName("테스트444");
		testMember.setPassword("test444");
		testMember.setEmail("test@test.com");
		
		memberService.memberJoin(testMember);
	}
}
