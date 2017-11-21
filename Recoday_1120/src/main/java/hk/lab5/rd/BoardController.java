package hk.lab5.rd;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hk.lab5.rd.dtos.PageDto;
import hk.lab5.rd.model.IService;

@Controller
public class BoardController {

	@Autowired
	private IService iservice;
	
	@RequestMapping(value="/hello.do")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value="/pagelist.do", method=RequestMethod.GET)
	public String selectPageList(Model model){
		List<PageDto> list = iservice.selectPageList();
		model.addAttribute("list", list);
		return "pageList";
	}
}
