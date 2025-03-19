package album.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import album.model.AlbumDao;
 
@Controller
public class AlbumDeleteController {

	private final String command = "delete.ab";
	private final String gotoPage = "redirect:/list.ab";
	
	@Autowired
	AlbumDao albumDao;
	//albumList.jsp에서 삭제
	// master가 수정함 한줄 더 추가함
	// kim이 kim kim 한줄 추가함
	// master가 한줄 수정함
	// kim가 한줄 수정함  kim가 한줄 수정함
	
	@RequestMapping(command)
	public String doAction(@RequestParam(value="num",required = true ) int num) {
		
		
		// kim이 한줄 추가함
		int cnt = albumDao.deleteAlbum(num);
		return gotoPage;
	}
} 
  