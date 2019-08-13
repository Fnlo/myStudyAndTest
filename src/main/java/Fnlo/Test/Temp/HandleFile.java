package Fnlo.Test.Temp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.io.*;

/**
 * HandleFile
 */
public class HandleFile {

    public static void main(String[] args) {
        String inputFile = "D:/HighgoWork/190809 JDBC DML/trac sql/standby-sql.txt";
        String outFile = "D:/HighgoWork/190809 JDBC DML/trac sql/standby-sql-out.txt";
        handle(inputFile, outFile);
    }


    public static void handle(String input,String out) {
        writeFile(out, getSqlSet(input));
    }

    private static Set<String> getSqlSet(String filePath) {
        File file = new File(filePath);
        Set<String> retSet = new HashSet<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (null != line && !"".equals(line)) {
                line = line.toLowerCase();
                int index = -1;
                String sql = null;
                if ((index = line.indexOf(": insert")) > -1
                    || (index = line.indexOf(": update")) > -1
                    || (index = line.indexOf(": delete")) > -1
                    || (index = line.indexOf(": select")) > -1) {
                    sql = line.substring(index + 2);
                } 
                if(sql != null) {
                    int indexW = -1;
                    if((indexW = sql.indexOf("set")) > -1
                        || (indexW = sql.indexOf("where")) > -1
                        || (indexW = sql.indexOf("values")) > -1) {
                        sql = sql.substring(0, indexW);
                    } 
                    retSet.add(sql);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return retSet;
    }

    private static void writeFile(String outFile,Set<String> sqlSet) {
        File file = new File(outFile);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            Iterator<String> it = sqlSet.iterator();
            while(it.hasNext()) {
                fw.write(it.next());
                fw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}