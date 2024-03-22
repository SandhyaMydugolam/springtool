package com.example.javabase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;
	
	@Autowired
	IFoodMenu menus;
	
	IFoodMenu menuItems;
	public void setMenu(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	
}
	public List<String> viewMenuCard(String choice){
		List<String> menuList=new ArrayList<>();
		if(choice.equals("chinese"))
			menuList=iFoodMenu.ShowMenu();
		if(choice.equals("indian"))
			menuList=menus.ShowMenu();
		if(choice.equals("italian"))
			menuList=menuItems.ShowMenu();
		
		return menuList;
		
	}
	
//	private IFoodMenu chinese;
//	@Autowired
//	private IFoodMenu indian;
//	@Autowired
//	private IFoodMenu italian;
//	
//	public IFoodMenu getChinese() {
//		return chinese;
//	}
//	public void setChinese(IFoodMenu chinese) {
//		this.chinese = chinese;
//	}
//	public IFoodMenu getIndian() {
//		return indian;
//	}
//	public void setIndian(IFoodMenu indian) {
//		this.indian = indian;
//	}
//	public IFoodMenu getItalian() {
//		return italian;
//	}
//	public void setItalian(IFoodMenu italian) {
//		this.italian = italian;
//	}
//	@Override
//	public String toString() {
//		return "Waiter [chinese=" + chinese + ", indian=" + indian + ", italian=" + italian + "]";
//	}
	
	
	
}
