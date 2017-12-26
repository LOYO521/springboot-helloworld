package www.wuluyang.com;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ���������������쳣
 * @author Administrator
 *
 */
@ControllerAdvice  //��λ���棬��������
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody //���ط�����json���ؽ��
	public Map<String,Object> exceptionHandler(){
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("code", "500");
		result.put("msg", "我的滑板鞋");
		return result;
		
	}
}
