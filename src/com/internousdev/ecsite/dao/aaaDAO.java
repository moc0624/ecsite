//*package com.internousdev.ecsite.dao;

//*import java.sql.Connection;
//*import java.sql.PreparedStatement;
//*import java.sql.ResultSet;
//*import java.util.ArrayList;
//*import java.util.List;

//*import com.internousdev.ecsite.util.DBConnector;

//*public class aaaDAO {

	//*public String item_name;
	//*public String item_price;

	//*private DBConnector dbConnector = new DBConnector();
	//*private Connection connection = dbConnector.getConnection();



	//*public List<ItemListDTO> getBuyItemListInfo(){
	//*List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();

	//*	String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

		//*try{
	//*PreparedStatement preparedStatement = connection.prepareStatement(sql);
		//*ResultSet resultSet = preparedStatement.executeQuery();

		//*while(resuleSet.next()){
		//*	ItemListDTO itemListDTO = new ItemListDTO();
		//*	ItemListDTO.setId(resultSet.getInt("id"));
		//*	ItemListDTO.setItemName(resultSet.getString(columnIndex))
	//*}


	//*}

	//*}

	//*}
