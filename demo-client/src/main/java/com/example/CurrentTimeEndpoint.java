package com.example;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;

public class CurrentTimeEndpoint extends AbstractEndpoint<Map<String, String>> {
	public CurrentTimeEndpoint() {
		super("currentTime");
	}

	@Override
	public Map<String, String> invoke() {
		return Collections.singletonMap("currentTime",
				ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
	}
}
