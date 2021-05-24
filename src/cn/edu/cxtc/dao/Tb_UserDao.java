package cn.edu.cxtc.dao;
//spring.jdbc.jar --> jdbcTemplate --> update,query

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cn.edu.cxtc.po.Tb_User;

public class Tb_UserDao {
	private JdbcTemplate jdbcTemplate;//依赖

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//add
	public int addOne(Tb_User u) {
		String sql = "insert into tb_user(username,address) values(?,?);";// ? -->占位符
		
		return jdbcTemplate.update(sql,u.getUsername(),u.getAddress());
	}
	
	//update
	public int updateOne(Tb_User u) {
		String sql = "update tb_user set username=?,address=? where id=?;";// ? -->占位符
		
		return jdbcTemplate.update(sql,u.getUsername(),u.getAddress(),u.getId());
	}
	//delete
	public int delOne(Tb_User u) {
		String sql = "delete from tb_user where id=?;";// ? -->占位符
		
		return jdbcTemplate.update(sql,u.getId());
	}
	//queryOne
	public Tb_User queryOne(int id) {
		String sql = "select * from tb_user where id=?;";// ? -->占位符
		RowMapper<Tb_User> rowMapper = new BeanPropertyRowMapper<Tb_User>(Tb_User.class);
		return jdbcTemplate.queryForObject(sql, rowMapper,id);
	}
	//queryAll
	public List<Tb_User> queryAll() {
		String sql = "select * from tb_user;";// ? -->占位符
		RowMapper<Tb_User> rowMapper = new BeanPropertyRowMapper<Tb_User>(Tb_User.class);
		return jdbcTemplate.query(sql,rowMapper);
	}
	
	
}