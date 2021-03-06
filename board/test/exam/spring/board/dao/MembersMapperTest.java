package exam.spring.board.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import exam.spring.board.config.ApplicationConfig;
import exam.spring.board.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
@Transactional
public class MembersMapperTest {
	@Autowired
	MembersMapper membersMapper;

	@Test
	public void getUser() throws Exception {
		Member member = membersMapper.getMember("kho903");
		Assert.assertNotNull(member);
		System.out.println(member);
	}

	@Test
	public void addMember() throws Exception {
		Member testMember = new Member();
		testMember.setId("test333");
		testMember.setName("테스트333");
		testMember.setPassword("test333");
		testMember.setEmail("test@test.com");

		membersMapper.addMember(testMember);

		Assert.assertNotNull(membersMapper.getMember("test"));
	}

	@Test
	public void getMembers() throws Exception {
		List<Member> memberList = membersMapper.getMembers();
		Assert.assertEquals(15, memberList.size());
	}

	@Test
	public void updateMember() throws Exception {
		Member testMember = new Member();
		testMember.setId("kho9033");
		testMember.setName("테스트333");
		testMember.setPassword("test222");
		testMember.setEmail("test@test.com");
		membersMapper.updateMember(testMember);
		Member member = membersMapper.getMember(testMember.getId());
		assertEquals(member.getName(), testMember.getName());
	}

	@Test
	public void deleteMember() throws Exception {
		Assert.assertEquals(1, membersMapper.deleteMember("test"));
	}
}