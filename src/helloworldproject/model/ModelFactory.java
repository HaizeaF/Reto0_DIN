/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.model;

import helloworldproject.exception.ModelTypeException;

/**
 *
 * @author Julen
 */
public class ModelFactory {

    private static Model model;

    public static Model getModel(String storage) throws ModelTypeException {
        if (model == null) {
            if (storage.equalsIgnoreCase("File")) {
                model = new FileModelImplementation();
            } else if (storage.equalsIgnoreCase("Database") || storage.equalsIgnoreCase("DB")){
                model = new DBModelImplementation();
            } else {
                throw new ModelTypeException("Invalid model type. File/Database please.");
            }
        }
        return model;
    }

}
