package com.Bamboo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Bamboo.service.PostService;
import com.Bamboo.service.SongService;
import com.Bamboo.vo.PostVo;
import com.Bamboo.vo.SongVo;

@Controller
public class BoardController {
	@Autowired
	private PostService postServiceImpl;
	@Autowired
	private SongService songServiceImpl;

	// MARK: write page get, post
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String writeGet() {

		return "write";
	}

	// TODO:
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String writePost(@ModelAttribute @Valid PostVo postVo) {

		postServiceImpl.writePost(postVo);

		return "view";
	}

	// MARK: view page get, post
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String viewGet(@RequestParam Long postNo, Model model) {

		PostVo postVo = postServiceImpl.getPostByPostNo(postNo);
		model.addAttribute("postVo", postVo);

		long songId = postVo.getSongId1();
		SongVo songVo1 = songServiceImpl.getSongBySongId(songId);
		model.addAttribute("songVo1", songVo1);

		songId = postVo.getSongId2();
		SongVo songVo2 = songServiceImpl.getSongBySongId(songId);
		model.addAttribute("songVo2", songVo2);
		
		songId = postVo.getSongId3();
		SongVo songVo3 = songServiceImpl.getSongBySongId(songId);
		model.addAttribute("songVo3", songVo3);
		return "view";
	}

	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public String viewPost() {
		// TODO: 유튜브 페이지 이동 - jsp 파일에서

		return "view";
	}

	// MARK: list page get, post
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listGet(Model model) {
//
		List<PostVo> postVoList = postServiceImpl.getAllPostList();

		System.out.println("hyewon:: " + postVoList.toString());

		model.addAttribute("postVoList", postVoList);

		return "list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String listPost() {

		return "list";
	}

	// MARK: index page
	@RequestMapping("/")
	public String index(Model model) {
		ModelAndView mav = new ModelAndView();

		return "index";
	}

}
