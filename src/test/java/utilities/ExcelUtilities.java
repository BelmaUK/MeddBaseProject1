package utilities;

import au.com.bytecode.opencsv.CSVReader;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExcelUtilities {

    private static FileInputStream inputStream;
    private static FileOutputStream fileOutputStream;
    //to create an object that will store excel file
   private static Workbook workbook;
    //to create an object that will store specific sheet
    private static XSSFSheet sheet;
     private static int count;
    public static void putDataIntoListOfMaps (String path,String pagename) throws IOException {
        inputStream=new FileInputStream(path);
        workbook= WorkbookFactory.create(inputStream);
        sheet= (XSSFSheet) workbook.getSheet(pagename);
        List<Map<String, String>> table = new ArrayList<>();
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        for (int row = 1; row <= rowCount; row++) {
            Map<String, String> map = new HashMap<>();
            for (int column = 0; column < colCount; column++) {
                String columnName = sheet.getRow(0).getCell(column).getStringCellValue();
                String columnValue = sheet.getRow(row).getCell(column).getStringCellValue();
                map.put(columnName, columnValue);

            }
            table.add(map);
        }
        System.out.println(table);
        for (Map<String, String> value : table) {
            System.out.println(value);
        }
    }


    public static List<String> putHeaderDataIntoList (String path,String pagename) throws IOException {
        inputStream=new FileInputStream(path);
        workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet(pagename);
        List<String> table = new ArrayList<>();
        int colCount = sheet.getRow(0).getLastCellNum();
        for (int row = 1; row <= colCount; row++) {
                String columnName = sheet.getRow(0).getCell(colCount).getStringCellValue();
                table.add(columnName);
            }
         return table;
        }

        public static int ReadCVSFile(String path) throws Exception {
            CSVReader reader = new CSVReader(new FileReader(path));

            //Read CSV line by line and use the string array as you want
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    //Verifying the read data here
                    System.out.println(Arrays.toString(nextLine));

                }
              count ++;
            }

            return count;

        }

    }

