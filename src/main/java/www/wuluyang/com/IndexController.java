package www.wuluyang.com;
import java.util.ArrayList;
import java.util.List;

/*
 * jsp�ײ�ͨ��servletת��
 * ftl����ת����html
 * 
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(ModelMap map){
		map.addAttribute("name", "吴陆阳");
		map.put("sex", 1);
		List<String> userList=new ArrayList<String>();
		userList.add("张三");
		userList.add("李四");
		userList.add("王五");
		map.addAttribute("userList", userList);
		return "index" ;
		
	}
}
