package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiModel;
import com.example.demo.model.CustModel;
import com.example.demo.service.CustService;

@CrossOrigin
@RestController
public class CustController {
	
	@Autowired
	CustService aser;
	
	@PostMapping("addBookcust")
	public CustModel add(@RequestBody CustModel am) {
		return aser.saveinfo(am);
	}
	
	@PostMapping("addcust")
	public List<CustModel> add(@RequestBody List<CustModel> s) {
		return aser.saveinfo(s);
	}
	
	@GetMapping("showBookcust")
	public List<CustModel> show(){
		return aser.showinfo();
	}
	
	@PutMapping("updatecust")
	public CustModel modify(@RequestBody CustModel s) {
		return aser.changeinfo(s);
	}
	
	@DeleteMapping("deletecust")
	public String del(@RequestBody CustModel s) {
		aser.deleteinfo(s);
		return "Deleted";
	}	
	
	@DeleteMapping("deletebyParamcust")
	public String deleteMyIdByParam(@RequestParam int id) {
		 aser.deleteparamid(id);
		 return "Deleted successfully";
    }
	@PutMapping("updateidcust/{id}")

	public String updatenid(@PathVariable int id,@RequestBody CustModel s)

	{

		return aser.updateinfobyid(id,s);

	}
	
	@GetMapping("sortcust/{name}")
	public List<CustModel> sortinfo(@PathVariable String name){
		return aser.sortinfo(name);
	}
	
	@GetMapping("pagingcust/{pageno}/{pagesize}")
	public List<CustModel> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return aser.getbypage(pageno,pagesize);
	}
	@GetMapping("showquerycust/{id}/{title}")
	public 	List<ApiModel> showBookdetails(@PathVariable int id,@PathVariable String title)
	{
		return aser.get(id, title);
	}
	@DeleteMapping("deletequerycust/{id}")
	public String deldetails(@PathVariable int id)
	{
		return aser.del(id)+"deleted";
	}
	@PutMapping("updatequerycust/{newid}/{oldid}")
	public String updatedetails(@PathVariable int newid,@PathVariable int oldid)
	{
		return aser.update(newid, oldid)+" updated";
	}

}		
