package joe.levante.controller;
import java.io.IOException;
import net.sf.json.JSONArray;  
import net.sf.json.JSONObject;  
import java.util.ArrayList;   
import java.util.List;  

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MianController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        System.out.print("this is a test!");
        return "index";
    }
	
	/*@RequestMapping("/getTestJson")
	public void getTestJson(HttpServletRequest request,HttpServletResponse response) throws IOException {
		List m = (List) new  ArrayList();  
        JSONArray jsons = new JSONArray();  
//        for(int i=0;i<10;i++){  
//            User user = new User();  
//            user.setUserName("name_" + i);  
//            m.add(user);  
//        }  
          
        for(int j=0;j<m.size();j++){  
            JSONObject jsonObject = new JSONObject();  
            jsonObject.put("user", m.get(j));  
            jsons.add(jsonObject);  
        }  
        response.getWriter().print(jsons.toString()) ;   
	}*/
}
