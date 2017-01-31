package Project1;

import jxl.write.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;

public class TestExcelAll {

	public static void main(String[] args) {
		try {
			WritableWorkbook book = Workbook.createWorkbook(new File(
					"E://TEST.xls"));
			WritableSheet sheet = book.createSheet("Page one", 0);
//			WritableSheet sheet2 = book.createSheet("Page two", 1);
			Label lable = new Label(0, 0, "cccc");
			sheet.addCell(lable);
			Label lable2 = new Label(0, 1, "xxxx");
			sheet.addCell(lable2);
			book.write();
			book.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try {
			Workbook bk = Workbook.getWorkbook(new File("E://TEST.xls"));
			WritableWorkbook book = Workbook.createWorkbook(new File(
					"E://TEST.xls"), bk);
			WritableSheet sheet = book.createSheet("Page two", 1);
			Label lable1 = new Label(0, 0, "1111");
			Label lable2 = new Label(0, 1, "oooo");
			sheet.addCell(lable1);
			sheet.addCell(lable2);
			book.write();
			book.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			Workbook book = Workbook.getWorkbook(new File("E://TEST.xls"));
			Sheet[] sheets = book.getSheets();
			for (Sheet sheet : sheets) {
				System.out.println(sheet.getName());
			}
			Sheet sheet = book.getSheet(0);
			Cell cell = sheet.getCell(0, 0);
			String result = cell.getContents();
//			System.out.println(result);
			book.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
