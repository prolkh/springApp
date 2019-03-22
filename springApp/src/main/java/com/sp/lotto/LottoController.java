package com.sp.lotto;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("lotto.lottoController")
public class LottoController {
	@Autowired
	private LottoService LottoService;
	
	@RequestMapping(value="/lotto/buy", method=RequestMethod.GET)
	public String form() {
		return "lotto/write";
	}
	
	@RequestMapping(value="/lotto/buy", method=RequestMethod.POST)
	public String submit(Lotto dto, Model model) {		
		Map<String, List<Integer>> map=LottoService.createLotto(dto);

		model.addAttribute("map", map);
		return "lotto/result";
	}
}
