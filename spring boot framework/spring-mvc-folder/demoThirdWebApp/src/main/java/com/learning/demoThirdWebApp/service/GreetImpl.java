package com.learning.demoThirdWebApp.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class GreetImpl implements IGreetingService {

	@Override
	public String get()
	{
		LocalDateTime now = LocalDateTime.now();
		int hour = now.getHour();
		String msg="";
		if(hour<12)
		{
			msg="Good morning";
		}
		else if(hour>12)
		{
			msg= "good evening";
		}
		return msg;	
	}
}
