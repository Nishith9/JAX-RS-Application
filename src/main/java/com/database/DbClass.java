package com.database;

import java.util.HashMap;
import java.util.Map;

import com.model.Message;
import com.model.Profile;

public class DbClass {

	private static Map<Long,Message> messages = new HashMap<>();
	private static Map<String,Profile> profiles = new HashMap<String,Profile>();
	
	public static Map<Long,Message> getMessages() {
		
		return messages;
	}
	
	public static Map<String,Profile> getProfiles() {
		return profiles;
	}
}
