package helloworldproject.model;

import helloworldproject.exception.ModelTypeException;

/**
 * This class is the Data Factory of the model. It creates the model implementation controlling which one is needed.
 * @author Julen and Haizea
 */
public class ModelFactory {

    private static Model model;
    
    /**
     * This is the method which controls and creates the models;
     * @param storage The model type specified in the configuration file.
     * @return The specific model implementation.
     * @throws ModelTypeException Exception that controls the type of model introduced. 
     */
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
