package com.example.mapper;
 
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.domain.WebVO;
 
public interface WebMapper {


	//글작성
    public void webInsert(WebVO vo)throws Exception;
    
    //글목록
    public List<WebVO>webList()throws Exception; //추가


}
