package com.example.demo;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.WebVO;
import com.example.mapper.WebMapper;
 
@RestController
public class WebListController {
 
    @Autowired
    private WebMapper webMapper;
    
    @RequestMapping("/")
    public ModelAndView web() throws Exception{
        List<WebVO> web = webMapper.webList();
        return new ModelAndView("webList","list",web);
    }
}
