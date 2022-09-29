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
public class ModelFactory {

    private static Model model;

    public static Model getModel(String storage) {
        if (model == null) {
            if (storage.equalsIgnoreCase("File")) {
                model = new FileModelImplementation();
            } else {
                model = new DBModelImplementation();
            }
        }
        return model;
    }

}
