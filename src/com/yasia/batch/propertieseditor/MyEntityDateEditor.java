package com.yasia.batch.propertieseditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.stereotype.Component;

@Component
public class MyEntityDateEditor extends PropertyEditorSupport implements PropertyEditorRegistrar{

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(MyEntityDateEditor.class, this);
		
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(null!=text) {
			if(text.split("-").length!=3) {
				throw new IllegalArgumentException("设置的字符串格式不正确");
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date value = null;
			try {
				value = sdf.parse(text);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			setValue(value);
		}else {
			super.setAsText(text);
		}
	}

}
