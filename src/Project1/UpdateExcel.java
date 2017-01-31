package Project1;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class UpdateExcel {
    public static void main(String args[]) {
        try {
            // Excel����ļ�
            Workbook wb = Workbook.getWorkbook(new File("test.xls"));
            // ��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
            WritableWorkbook book = Workbook.createWorkbook(new File("test.xls"),
                    wb);
            // ���һ��������
            WritableSheet sheet = book.createSheet("�ڶ�ҳ", 1);
            sheet.addCell(new Label(0, 0, "�ڶ�ҳ�Ĳ�������"));
            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}