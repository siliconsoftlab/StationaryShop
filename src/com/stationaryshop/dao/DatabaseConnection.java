package com.stationaryshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.stationaryshop.dto.Item;

public class DatabaseConnection {
	  List items=new ArrayList<Item>();
public List showItems() {
	return items;
}

public void addItems(Item item) {
		items.add(item);
		
}
public void addbulkItems() {
		items.add(new Item(1, "Pen",12.5f, 12));
		items.add(new Item(2, "Pencil",5.5f, 12));
		items.add(new Item(3, "Eraser",2.5f, 12));
		items.add(new Item(4, "Calculator",200.5f, 12));
}
}
