package com.voya.food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	@Autowired
	private IFoodMenu chinese;
	@Autowired
	private IFoodMenu indian;
	@Autowired
	private IFoodMenu italian;
	public IFoodMenu getChinese() {
		return chinese;
	}
	public void setChinese(IFoodMenu chinese) {
		this.chinese = chinese;
	}
	public IFoodMenu getIndian() {
		return indian;
	}
	public void setIndian(IFoodMenu indian) {
		this.indian = indian;
	}
	public IFoodMenu getItalian() {
		return italian;
	}
	public void setItalian(IFoodMenu italian) {
		this.italian = italian;
	}
	@Override
	public String toString() {
		return "Waiter [chinese=" + chinese + ", indian=" + indian + ", italian=" + italian + "]";
	}
	
	List<String> viewMenuCard(String choice){
		List<String> menuList=new ArrayList<>();
		if(choice.equals("chinese"))
			menuList=chinese.ShowMenu();
		if(choice.equals("indian"))
			menuList=indian.ShowMenu();
		if(choice.equals("italian"))
			menuList=italian.ShowMenu();
		
		return menuList;
		
	}
}
