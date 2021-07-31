package com.example.demo.handler;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(content = Include.NON_NULL)
public class DemoProblem {
	
	private String title;
	private Integer status;
	private LocalDateTime dataTime;
	

}
