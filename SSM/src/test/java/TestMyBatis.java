import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.lvkun.ssm.pojo.User;
import com.lvkun.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //private ApplicationContext ac = null;
	@Resource
	private IUserService userServices = null;
	
/*	  @Before  
	  public void before() {  
	     ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
	     userService = (IUserService) ac.getBean("userService");  
	  } */
	@Test
	public void test1(){
		User user = userServices.getUserById(1);
		System.out.println(user.getUserName());  
        logger.info("值："+user.getUserName());  
		System.out.println("LKLKLKLKLK");
		logger.info(JSON.toJSONString(user));
	}
	@Test
	public void insert(){
		User user = new User();
		user.setId(Integer.valueOf(2));
		user.setAge(Integer.valueOf(10));
		user.setUserName("LK");
		user.setPassword("qqqq");
		int records = userServices.insert(user);
		if(records > 0 ){
			logger.info(JSON.toJSONString(user));
		}
	}
	
	@Test
	public void updateByPrimaryKey(){
		User user = new User();
		user.setId(Integer.valueOf(2));
		user.setAge(Integer.valueOf(23));
		user.setUserName("ssss");
		user.setPassword("rrrrr");
		int records = userServices.updateByPrimaryKey(user);
		if(records > 0){
			logger.info(JSON.toJSONString(user));
		}
	}
}
