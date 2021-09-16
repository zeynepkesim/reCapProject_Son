package com.example.ReCapProject.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDetailDto {

	private String modelName;
	private String brandName;
	private String colorName;
	private double dailyPrice;
	
}
