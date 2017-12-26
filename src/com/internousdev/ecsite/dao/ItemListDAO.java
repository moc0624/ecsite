package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	public String item_name;
	public String item_price;

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();



	public List<ItemListDTO> getBuyItemListInfo(){

		List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();

		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();

		while(resultSet.next()){
			ItemListDTO itemListDTO = new ItemListDTO();
			itemListDTO.setId(resultSet.getInt("id"));
			itemListDTO.setItemName(resultSet.getString("item_name"));
			itemListDTO.setItemPrice(resultSet.getString("item_price"));
			itemList.add(itemListDTO);
		}

	}catch(Exception e){
		e.printStackTrace();
	}
		return itemList;
	}
}