package datadriven;

import Com.Excel.Utility.Xls_Reader;

public class PoiOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader reader=new Xls_Reader("E:\\ExampleAutomation\\AutomationTest\\HomePractice\\src\\testdata\\Halfebaytest.xlsx");
		if(!reader.isSheetExist("poioper"))
		{
			reader.addSheet("poioper");
		}
		
		
		
		

	}

}
