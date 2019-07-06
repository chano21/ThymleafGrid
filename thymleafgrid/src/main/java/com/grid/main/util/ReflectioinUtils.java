package com.grid.main.util;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import com.grid.main.entity.User;

public class ReflectioinUtils {
	
	/*
	 * private String media_name;
	 * 
	 * private String media_code;
	 * 
	 * private String pgCode;
	 * 
	 * private String pgName;
	 * 
	 * private String pgSubName;
	 * 
	 * private String casting;
	 * 
	 * private String guest;
	 * 
	 * private String director;
	 * 
	 * private String producer;
	 * 
	 * private String dramatist;
	 * 
	 * private String synopsys;
	 * 
	 * private String season;
	 * 
	 * private String episodes;
	 * 
	 * private String pgSdate;
	 * 
	 * private String pgEdate;
	 * 
	 * private String pgTime;
	 * 
	 * private String duration;
	 * 
	 * private String pgGenre;
	 * 
	 * private String air_dotw;
	 * 
	 * private String url;
	 * 
	 * private String title_img;
	 * 
	 * private String production;
	 * 
	 * private String orgContent;
	 * 
	 * private String hashtag;
	 * 
	 * private String is_onair;
	 * 
	 * private String is_age;
	 * 
	 * private String is_UHD;
	 * 
	 * private String cdate;
	 * 
	 * private String title_img_url;
	 */
	public static List<String> ClassProperties(Class<?> s) {
		List<String> privateFields = new ArrayList<>();
    	Field[] allFields = s.getDeclaredFields();
    	for (Field field : allFields) {
    	    if (Modifier.isPrivate(field.getModifiers())) {
    	        privateFields.add(field.getName());
    	    }
    	}
		return privateFields;
	}
    public static void main(String[] args) {
    	System.out.println(ReflectioinUtils.ClassProperties(User.class));
    }
}