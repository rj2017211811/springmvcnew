package cn.itcast.springmvc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.itcast.springmvc.domain.Person;

@Service
public class PersonService {
	private static Map<Integer,Person> map=new HashMap<Integer,Person>();
	static
	{
		for(int i=0;i<10;i++)
		{
			Person p=new Person();
			p.setId(i);
			p.setName("jad"+i);
			map.put(i, p);
		}
	}
	public List<Person> listAll()
	{
		return new ArrayList(map.values());
		
	}
	//获取对象
	public Person getPerson(Integer id)
	{
		return map.get(id);
	}
	//保存对象
	public void save(Person p)
	{
		map.put(p.getId(),p);
		
	}
	public void deleteById(Integer id)
	{
		map.remove(id);
	}
}
