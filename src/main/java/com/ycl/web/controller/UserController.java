package com.ycl.web.controller;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ycl.cache.UserCache;
import com.ycl.entity.User;
import com.ycl.service.UserService;
/**
 * 根据spring文档所写的测试类
 * 注解@SessionAttributes("session-user")，所有放入Model中的数据，如果key是session-user,则纳入session管理
 * @author yao
 *
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("session-user")
public class UserController {

	private Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	public UserController() {
		log.info("UserController construct...");
		UserCache.getInstance();		//加载缓存，默认添加10个普通用户用户和一个admin用户
	}

	/**
	 * 直接返回一个页面
	 */
	@RequestMapping(value="api",method=RequestMethod.GET)
	public String api(){
		return "user/api";
	}
	
	/**
	 * 直接跳转到一个页面
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(){
		log.info("enter method:user/list");
		return "user/list";
	}
	
	/**
	 * ajax请求
	 * @return
	 */
	@RequestMapping(value="/getUserlist",method=RequestMethod.POST)
	@ResponseBody
	public List<User> getUserlist(){
		List<User> result = userService.list();
		if(result!=null && result.size()>0)
			return result;
		return null;
	}
	
	/**
	 * 路径参数 URI Template Patterns 
	 * @param userId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{userId}",method=RequestMethod.GET)
	public String findUser(@PathVariable String userId,@RequestParam String random,Model model){
		/**
		 * 1.
		 * @PathVariable("userid") String useridentify
		 * 上面的写法则是前台传入userid,并把值放到useridentify中当做参数，
		 * 一般不推荐用这种做法
		 * 2.
		 * 可以有多个路径参数。如：@PathVariable String userId,@PathVariable String userName
		 * 对应的URI:"/{userId}/yourPathOrNot/{userName}"
		 * 3.
		 * 还可以匹配正则表达式:{varName:regex}
		 * 如想匹配：URL "/spring-web/spring-web-3.0.5.jar"
		 * 
		 * @RequestMapping("/spring-web/{symbolicName:[a-z-]}-{version:\\d\\.\\d\\.\\d}{extension:\\.[a-z]}")
    	 *	public void handle(@PathVariable String version, @PathVariable String extension) {}
    	 *
		 * 4.用分号分隔来传递参数，一般不用。默认不能使用，如果想使用，要将RequestMappingHandlerMapping的removeSemicolonContent设置为false
		 * // GET /pets/42;q=11;r=22
		 *	@RequestMapping(value = "/pets/{petId}", method = RequestMethod.GET)
		 *	public void findPet(@PathVariable String petId, @MatrixVariable int q) {petId=42,q=11}
		 * 
		 */
		User user  = userService.findById(userId);
		model.addAttribute(user);			//jsp页面中用jstl标签取值
		return "user/view";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(){
		return "user/add";
	}
	
	/**
	 * 如果用注解@ModelAttribute 可以接受对象的属性参数，但是属性名称一定要一样。如：前台只能传loginname，不能传user.loginname
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute User user){
		if(!"".equals(user.getLoginname()) && !"".equals(user.getPassword())){
			user.setId(UUID.randomUUID().toString());
			userService.add(user);
			return "user/success";
		}
		return "user/fail";
	}
	
	/**
	 * 每次执行UserController.method之前，都会先执行有@InitBinder注解的方法
	 * 这样绑定后，前台就能以 user.loginname来传递参数
	 * @param bind
	 */
	@InitBinder(value="user")
	public void initBind(WebDataBinder bind){
		bind.setFieldDefaultPrefix("user.");
	}

	@RequestMapping(value="/sessionAdd",method=RequestMethod.GET)
	public String sessionAdd(Model model){
		User admin = userService.findById("admin");
		model.addAttribute("session-user", admin);
		return "redirect:user/" + admin.getId(); 
	}
	
}
