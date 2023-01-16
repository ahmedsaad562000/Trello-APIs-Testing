package stepDefinitions;


import javax.swing.*;


import java.awt.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;


    public class FileOperations {


        //First Step in reading Header File and convert the data to array of strings (each line is a string)
        public static String open_file(String Filename) {
            //(default_or_new) a boolean that determine if we are booting for the first time using default path or we are loading a new file.
            FileInputStream FIS = null;
            String path = "";

            //Automatic path Generatin according to working directory
            String dir = System.getProperty("user.dir");
            path = dir.concat("\\Variables\\" + Filename);
            path = path.replace("\\", "/");

            String sb = "";

            try {
                FIS = new FileInputStream(path);
                int size;
                size = FIS.available();
                byte[] b = new byte[size];

                FIS.read(b);

                sb = new String(b);
                //Convert input stream into array of string where each line is a string

            } catch (FileNotFoundException e) {/*path not found error*/
                JOptionPane.showMessageDialog(null, "Org_Id file Path not Found", "Path not Found", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
            } finally {
                try {
                    FIS.close();
                    return sb;
                } catch (IOException e) {
                }

            }

            return sb;
        }


        //Saving Header file method
        public static void Save_file(String Filename, String value) {
            String path = "";

            //Automatic path Generatin according to working directory
            String dir = System.getProperty("user.dir");
            path = dir.concat("\\Variables\\" + Filename);
            path = path.replace("\\", "/");
            FileOutputStream FOS = null;
            try {
                FOS = new FileOutputStream(path);
                byte[] b = value.getBytes();
                FOS.write(b);
                FOS.close();
            } catch (FileNotFoundException e) {/*path not found error*/
                JOptionPane.showMessageDialog(null, "Org_Id file Path not Found", "Path not Found", JOptionPane.WARNING_MESSAGE);
            } catch (IOException r) {
            }

        }
    }

