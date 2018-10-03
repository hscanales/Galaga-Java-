/*
 * 
 * 
 * 
 */
package DataBase.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public interface Metodos<Generic >{
    public boolean create(Generic g);

    public ArrayList<Generic> readAll();

}
