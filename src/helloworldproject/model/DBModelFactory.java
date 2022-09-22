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
public class DBModelFactory {

    private static Model dbModel;

    public static Model getModel() {
        if (dbModel == null) {
            dbModel = new DBModelImplentation();
        }
        return dbModel;
    }

}
