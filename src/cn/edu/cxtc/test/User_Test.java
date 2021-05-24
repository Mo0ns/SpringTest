package cn.edu.cxtc.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.cxtc.dao.Tb_UserDao;
import cn.edu.cxtc.po.Tb_User;

public class User_Test {
	//单元测试：必须public void 参数为空
	@Test
	public void findOneTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tb_UserDao userDao = applicationContext.getBean(Tb_UserDao.class);
		
		Tb_User tb_User = userDao.queryOne(3);
		System.out.println(tb_User);
	}
	
	@Test
	public void findAllTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tb_UserDao userDao = applicationContext.getBean(Tb_UserDao.class);
		
		List<Tb_User> lists = userDao.queryAll();
		
		for(Tb_User user : lists) {
			System.out.println(user);
		}
	}
	
	@Test
	public void InsertOne() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tb_UserDao userDao = applicationContext.getBean(Tb_UserDao.class);
		
		
		Tb_User tb_User = new Tb_User();
		tb_User.setUsername("sss");
		tb_User.setAddress("sss");
		int i = userDao.addOne(tb_User);
		if (i > 0) {
			System.out.println("insert success!");
		}else {
			System.out.println("insert fail!");
		}
		
	}
	
	@Test
	public void UpdateOne() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tb_UserDao userDao = applicationContext.getBean(Tb_UserDao.class);
		
		
		Tb_User tb_User = new Tb_User();
		tb_User.setId(16);
		tb_User.setUsername("asd");
		tb_User.setAddress("sd");
		int i = userDao.updateOne(tb_User);
		if (i > 0) {
			System.out.println("Update success!");
		}else {
			System.out.println("Update fail!");
		}
		
	}
	
	@Test
	public void DeleteOne() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tb_UserDao userDao = applicationContext.getBean(Tb_UserDao.class);
		
		
		Tb_User tb_User = new Tb_User();
		tb_User.setId(17);
		int i = userDao.delOne(tb_User);
		if (i > 0) {
			System.out.println("Delete success!");
		}else {
			System.out.println("Delete fail!");
		}
		
	}
}
