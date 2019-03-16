package cn.itcast.springmvc.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.itcast.springmvc.domain.Person;
import cn.itcast.springmvc.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Resource
	private PersonService personService;
	
	
	@RequestMapping(value= {"/","/listAll"})
	public String listAll(Map<String,Object> model)
	{
		List<Person> personList=personService.listAll();
		model.put("personList", personList);
		System.out.println("way1");
		return "person/personList";
	}
	@RequestMapping("/listOtherAll")
	public String listOtherAll(Model model)
	{
		
		List<Person> personList=personService.listAll();
		model.addAttribute(personList);
		System.out.println("way2");
		return "person/personList";
	}
	//转向修改页面
	@RequestMapping(value={"/toupdate"},method=RequestMethod.GET)
	public String toupdate(Model model,int id)
	{
		System.out.println("id:"+id+" "+"model:"+model);
		model.addAttribute(personService.getPerson(id));
		
		return "person/personUpdate";
	}
	
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(HttpServletRequest request,@RequestParam("photoPath")MultipartFile file,Integer id,String name) throws IOException
	{
		System.out.println("file:"+file.getOriginalFilename());
		System.out.println("size:"+file.getSize());
		
		String dir ="C:\\Users\\恒信科技\\workspace\\.metadata\\springmvcnew\\WebContent\\upload";
		String fileName=file.getOriginalFilename();
		
		
	 
		FileUtils.writeByteArrayToFile(new File(dir,fileName), file.getBytes());
		System.out.println("成功上传");
		
		Person p=new Person();
		p.setPhotoPath("upload/"+fileName);
		p.setId(id);
        p.setName(name);
		personService.save(p);
		
		System.out.println("p:"+p.getId()+" "+"p.name:"+p.getName());
		
		
		
		return "redirect:/person/listAll";
	}
	@RequestMapping("/toAdd")
	public String toAddPerson()
	{
		
		return "person/personAdd";
	}
	@RequestMapping("/delete")
	public String delete(Integer id)
	{
		personService.deleteById(id);
		return "redirect:/person/listAll";
	}
	
	
	
}
