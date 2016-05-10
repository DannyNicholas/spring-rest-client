package com.scottlogic.spring_microservice;

import org.springframework.stereotype.Service;

@Service
public class InventoryServiceMocked implements InventoryService {

	@Override
	public boolean isValidInventory(String InventoryId) {
		return true;
	}

}
