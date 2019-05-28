package com.Bamboo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Bamboo.service.UserService;
import com.Bamboo.vo.UserVo;



@Controller
public class UserController {

		@Autowired
		private UserService userServiceImpl;
	
		// MARK: 로그인
		@RequestMapping(value = "/user/login", method = RequestMethod.GET)
		public String loginGet() {
			return "login";
		}

		@RequestMapping(value = "/user/login", method = RequestMethod.POST)
		public String loginPost(@RequestParam(value = "id", required = false) String id,
				@RequestParam(value = "password", required = false) String password, HttpSession session) {
			if (id.length() == 0 || password.length() == 0) {
				System.err.println("email, password 없음");
				return "redirect:/user/login";
			}

			UserVo authUser = userServiceImpl.getUser(id, password);

			// authUser != null -> 사용자가 있다 -> Session에 authUser를 적재
			if (authUser != null) {
				session.setAttribute("authUser", authUser);
				// this.blogName1 = authUser.getUserName() + "의 블로그 입니다~~~~";

				// BlogVo blogVo = new BlogVo(authUser.getUserNo(), authUser.getUserName() + "의
				// 블로그 입니다~~~~" , "");
				// blogServiceImpl.writeBlog(blogVo);

				return "redirect:/";
			} else {
				return "redirect:/user/login";
			}
		}

		// MARK: 로그아웃
		@RequestMapping(value = "/logout", method = RequestMethod.GET)
		public String logout(HttpSession session) {
			// 로그인 정보 삭제
			session.removeAttribute("authUser");
			// 세션 무효화
			session.invalidate();

			return "redirect:/";
		}
		
		//TODO: 중복이메일체크
//		
//		// 중복 이메일 체크
//			@ResponseBody
//			@RequestMapping(value = "/user/join/check", method = RequestMethod.GET)
//			public Object exists(@RequestParam(value = "id", required = true, defaultValue = "") String userId) {
//				
//				System.out.println("hyewon :: aaa");
//				
//				UserVo vo = userServiceImpl.getUser(id,);
//				Map<String, Object> map = new HashMap<>();
//				map.put("result", "success");
//				map.put("data", vo != null ? "exists" : "not exists");
//				return map;
//			}
		
		// MARK: 회원가입
		@RequestMapping(value = "/user/join", method = RequestMethod.POST)
		public String joinAction(@ModelAttribute @Valid UserVo userVo, BindingResult result, Model model) { // @Valid: UserVo에
																										// 잇는 제약조건을 검사하게함
			// validation 체크
			// logger.debug("회원 가입 액션");
			// logger.debug("회원 가입 정보:" + vo);
			//
			// // 오류체크
			// if (result.hasErrors()) {
			// // 검증실패
			// List<ObjectError> errors = result.getAllErrors();
			// for (ObjectError e : errors) {
			// logger.error("ERROR: " + e);
			// }
			// model.addAllAttributes(result.getModel());
			// return "users/joinform";
			// }
			//
			// // TODO: 가입 처리
			// // 성공하면 : /users/joinsuccess로 리다이렉트
			// // 실패하면 : /users/join (GET)으로 리다이렉트
			//

			boolean success = false;
			try {
//				success = userServiceImpl.join(vo);
				success = userServiceImpl.writeUser(userVo);
				System.out.println("hyewon :: try" + userVo);
			} catch (Exception e) {
				System.out.println("hyewon :: catch");

				e.printStackTrace();
			}

			if (success) {
//				UserVo authUser = userServiceImpl.getUserByUserId(userVo.getUserId());
//				System.out.println("hyewon :: getUserNo" + authUser.getUserNo());
//
//				BlogVo blogVo = new BlogVo(authUser.getUserNo(), authUser.getUserName() + "의 블로그입니다", "");
//				System.err.println("blogVo:" + blogVo);
//				blogServiceImpl.writeBlog(blogVo);

				return "redirect:/user/joinsuccess";
			} else {
				System.out.println("hyewon :: join no Success");

				return "redirect:/user/join";
			}

		}

		@RequestMapping(value = "/user/joinsuccess")
		public String joinSuccess() {
			return "joinsuccess";
		}
}
