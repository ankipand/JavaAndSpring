package ImageNow;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFile {
public static void main(String[] args) throws IOException{
	 ArrayList arList=null;
     ArrayList al=null;
     String fName = "D://study//ImageNow//CSV FIle";
     System.out.println(fName);
     String thisLine;
     int count=0;
     FileInputStream fis = new FileInputStream("D:/study/ImageNow/CSV FIle/imagenowbe-20200602.csv");
     System.out.println(fis.toString());
     DataInputStream myInput = new DataInputStream(fis);
     System.out.println("myInput "+ myInput);
     int i=0;
     arList = new ArrayList();
     while((thisLine= myInput.readLine())!=null) {
    	 al = new ArrayList();
    	 System.out.println("al " + al);
    	 String strar[] = thisLine.split(";");
    	 for(int j=0;j<strar.length;j++)
         {
             al.add(strar[j]);
         }
    	 
    	 arList.add(al);
         System.out.println("arList.add(al) " + arList.add(al));
         i++;
     }
}
}
