package com.file;

import java.io.*;
import java.util.ArrayList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * @author issy.
 * class template .
 * class do read write file.
 * */

public class MyFile<T> {
    private final Logger logger = LogManager.getLogger(MyFile.class.getName());

    public ArrayList<T> myRead(String path) {
        ArrayList<T> arrayList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            try {
                arrayList = ((ArrayList<T>) ois.readObject());
            } catch (Exception e) {
                logger.log(Level.ERROR, "class MyFile<T> method myRead(String path) " + e);
            } finally {
                ois.close();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            logger.log(Level.ERROR, "class MyFile<T> method myRead(String path) " + fileNotFoundException.getMessage());
        } catch (IOException ioException) {
            logger.log(Level.ERROR, "class MyFile<T> method myRead(String path) " + ioException.getMessage());
        }
        return arrayList;
    }



    public boolean myWrite(T obj, String path){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            try {
             oos.writeObject(obj);
            } catch (Exception e) {
                logger.log(Level.ERROR, "class MyFile<T> method write" + e);
                return false;
            } finally {
                oos.flush();
                oos.close();
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "class MyFile<T> method write" + e.getMessage());
            return false;
        } catch (IOException ioException) {
            logger.log(Level.ERROR, "class MyFile<T> method write" + ioException.getMessage());
            return false;
        }
        return true;

    }


    /**
     * overloading method myWrite
     * */
    public boolean myWrite(ArrayList<T> tArrayList, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            try {
                oos.writeObject(tArrayList);
            } catch (Exception e) {
                logger.log(Level.ERROR, "class MyFile<T> method write" + e);
                return false;
            } finally {
                oos.flush();
                oos.close();
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "class MyFile<T> method write" + e.getMessage());
            return false;
        }catch (IOException ioException) {
            logger.log(Level.ERROR, "class MyFile<T> method write" + ioException.getMessage());
            return false;
        }
        return true;
    }
}
