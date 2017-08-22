package com.example.demo;

import java.sql.Connection;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.domain.WebVO;
import com.example.mapper.WebMapper;



@RunWith(SpringRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@SpringBootTest(classes = Test02Application.class)
@SpringBootTest(classes = WebApplication.class)
@WebAppConfiguration
public class WebApplicationTests {

	 @Autowired
	    private WebMapper mapper;

	@Test
	public void contextLoads() {
	}
	
	@Test
    public void testSqlSession() throws Exception{//작성
        
		WebVO vo = new WebVO();
        
        vo.setSubject("제목입니다.");
        vo.setContent("내용입니다.");
        vo.setWriter("작성자입니다.");
        
        mapper.webInsert(vo);
        
        
    }

}
