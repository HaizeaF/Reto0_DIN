/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.model;

/**
 *
 * @author Julen
 */
public class DBModelDF {

    private static InterfaceModel dbModel;

    public static InterfaceModel getModel() {
        if (dbModel == null) {
            dbModel = new DBModelImp();
        }
        return dbModel;
    }

}
