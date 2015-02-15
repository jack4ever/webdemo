package com.ycl.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ycl.entity.User;

/**
 * @RequestMapping 可以出现在类级别上，也可以出现在方法上。如果出现在类级别上，那请求的 url 为 类级别 上的 @RequestMapping
 *                 + 方法级别上的 @RequestMapping，否则直接取方法级上的 @RequestMapping。 类级别的 @RequestMapping
 *                 不是必需的。
 */
@Controller
@RequestMapping("/my")
public class MyController {

	/**
	 * 由于类级别上定义了 @RequestMapping，那么想匹配到这个方法来处理请求，url 必须为 /my/somelist。
	 * 如果没有定义类级别上的 @RequestMapping，url 为 /somelist 即可。同时，请求方法必须为 POST
	 */
	@RequestMapping(value = "/somelist", method = RequestMethod.POST)
	public String getSomeList() {
		// todo
		return "";
	}

	/**
	 * 在方法级别使用 @RequestMapping 来限定请求处理的时候，可以指定两个属性。除了我们在上面刚使用过的 method 属性，还有一个
	 * params 属性。使用 params 属性，可以达到与使用 ParameterMethodNameResolver 作为
	 * MethodResolver的 MultiActionController 类似的功能。
	 * 
	 * params 有两种表达形式，这里先说第一种："parameterName=parameterValue"
	 * 
	 * 请求方法为 GET 或 POST，且具有 hello 参数，且值为 world 的请求才能匹配到该方法，如： /my?hello=world
	 */
	@RequestMapping(params = "hello=world", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String helloworld() {
		// todo
		return "";
	}

	/**
	 * 请求方法为 GET 或 POST，且具有 hello 参数，且值为 java 的请求才能匹配到该方法，如： /my?hello=java
	 */
	@RequestMapping(params = "hello=java", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String hellojava() {
		return "";
	}

	/**
	 * params 属性的另外一种表达形式为："parameter"
	 * 
	 * 请求方法为 GET，且具有请求参数 java 即匹配此方法，而不管 java 参数的值是什么，如： /my?java=anything
	 */
	@RequestMapping(params = "java", method = { RequestMethod.GET })
	public String java() {
		return "";
	}

	/**
	 * 请求方法为 GET，且具有请求参数 cplusplus 即匹配此方法，而不管 cplusplus 参数的值是什么，如：
	 * /my?cplusplus=anything
	 */
	@RequestMapping(params = "cplusplus", method = { RequestMethod.GET })
	public String cplusplus() {
		return "";
	}

	/**
	 * @RequestMapping 还有一个参数化 headers，它和 params 非常相似，也有两种表达式，只不过它是对
	 *                 请求头做限制罢了。大家可以通过 telnet 或 http-client 来发类似的请求以检验。以 telnet
	 *                 为例：
	 * 
	 *                 telnet localhost 8080 POST /contextPath/my HTTP/1.1 Host:
	 *                 localhost hello: world # 这个就是自定义请求头，和标准的请求头的写法别无二致 
	 *                 
	 */
	@RequestMapping(headers = "hello=world", method = { RequestMethod.POST })
	public String cplusplus2() {
		return "";
	}
	
	/**
	 * jsp 里可以这样访问模型里的数据： 
     *   age: ${user.age} 
     *   name: ${user.name} 
     *   job: ${user.job} 
	 * @return
	 */
	@RequestMapping
	@ModelAttribute
	public User getUser(){
		User u = new User();
		u.setId("1");
		u.setLoginname("abc");
		u.setPassword("abc");
		return u;
	}
}