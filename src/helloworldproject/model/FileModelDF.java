/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.model;

/**
 *
 * @author haize
 */
public class FileModelDF {
    private static InterfaceModel fModel;
    public static InterfaceModel getModel() {
        if (fModel == null) {
            fModel = new FileModelImp();
        }
        return fModel;
    }
}
