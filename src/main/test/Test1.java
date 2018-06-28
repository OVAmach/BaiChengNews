import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iteamcn.baichengnews.dao.GroupMapper;
import com.iteamcn.baichengnews.dao.GroupPrivilegeMapper;
import com.iteamcn.baichengnews.dao.UserMapper;
import com.iteamcn.baichengnews.entity.Group;
import com.iteamcn.baichengnews.entity.Privilege;
import com.iteamcn.baichengnews.entity.User;
import com.iteamcn.baichengnews.util.Hash;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring_mybatis.xml"})
public class Test1 {
	@Resource
	private GroupPrivilegeMapper gpdao;
	@Resource
	private GroupMapper gdao;
	@Resource
	private UserMapper udao;
	@Test
	public void test1() {
//		ApplicationContext a=new ClassPathXmlApplicationContext("spring_mybatis.xml");
//		GroupPrivilegeMapper dao = a.getBean(GroupPrivilegeMapper.class);
//		User u=udao.selectByName("百城新闻网");
//		Group g=u.getU_groupObject();
//		System.out.println(g.getG_name());
//		for(Privilege p:g.getG_privilege()) {
//			System.out.println(p.getP_name());
//		}
		System.out.println(Hash.MD5("123456adminBCNEWS"));
		//�Ѿ��ܸ���groupname�鵽���ж�ӦȨ�޶���
		//����ȥ��Ҫ��Ȩ�޶���Ƕ��group�����Լ�����Ƕ��user����
	}
}
