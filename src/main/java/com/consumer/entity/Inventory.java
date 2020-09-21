package com.producer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Inventory.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory{

	private String productName;
	private String locationName;
	private int quantity;

}