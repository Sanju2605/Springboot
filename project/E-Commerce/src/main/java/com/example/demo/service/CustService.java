package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.ApiModel;
import com.example.demo.model.CustModel;
import com.example.demo.repository.CustRepo;

@Service
public class CustService {
	
     @Autowired
     CustRepo ar;
     
     public CustModel saveinfo(CustModel am) {
 		return ar.save(am);
 	}
 	
     public List<CustModel> saveinfo(List<CustModel> s) {
 		return (List<CustModel>)ar.saveAll(s);
 	}
     
 	public List<CustModel> showinfo(){
 		return ar.findAll();
 	}
 	public CustModel changeinfo(CustModel s) {
		return ar.saveAndFlush(s);
	}
	
	public void deleteinfo(CustModel s) {
		ar.delete(s);
	}
	
	public void deleteparamid(int id) {
		ar.deleteById(id);
	}
	public String updateinfobyid(int id,CustModel s)

	{

		ar.saveAndFlush(s);

		if(ar.existsById(id))

		{

			return "Updated";

		}

		else

		{

			return "Enter valid id";

		}
	}
     
	public List<CustModel> sortinfo(String s){
	    return ar.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
    
   public List<CustModel> getbypage(int pgno,int pgsize)
    {
  	    Page<CustModel> p = ar.findAll(PageRequest.of(pgno, pgsize));
    	return p.getContent();
    }
   public List<ApiModel> get(int i,String s)
	{
		return ar.getInfo(i, s);
	}
	
	public int del(int id)
	{
		return ar.deleteInfo(id);
	}
	public int update(int id,int id1)
	{
		return ar.updateInfo(id,id1);
	}
}

