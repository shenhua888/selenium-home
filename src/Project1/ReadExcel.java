package Project1;

//读取Excel的类
import java.io.File;
import java.util.Arrays;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {
  public static void main(String args[]) {
      try {
          Workbook book = Workbook.getWorkbook(new File("test.xls"));
          // 获得第一个工作表对象
          Sheet sheet = book.getSheet(0);
          // 得到第一列第一行的单元格
//          Cell cell1 = sheet.getCell(0, 0);
//          String result = cell1.getContents();
//          System.out.println(result);
          int rows = sheet.getRows();
          int columns = sheet.getColumns();
          String[][] st = new String[columns][rows];
          for(int c=0; c<columns; c++) {
        	  for(int r=0; r<rows; r++) {
        		  st[c][r] = sheet.getCell(c, r).getContents();
        		  System.out.println(st[c][r]);
        	  }
          }
          
//          for(String[] s : st) {
//        	  for(String v : s) {       		  
//        		  System.out.println(v);  
//        	  }
//        	  
//          }
          
          String[] s = new String[columns];
          for(int m=1; m<rows; m++) {
        	 for(int i=0; i<columns; i++) {
        		 s[i] = st[i][m];
        	 }
        	 System.out.println(s[0] + "$" + s[1]+ "$"  + s[2]);
        	 
          }
          book.close();
      } catch (Exception e) {
          System.out.println(e);
      }
  }
}