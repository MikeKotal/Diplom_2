package praktikum.models.getIngredients;

import java.util.ArrayList;

public class GetIngredientsResponse {

    private Boolean success;
    private ArrayList<Data> data;

    public Boolean getSuccess() {
        return success;
    }

    public ArrayList<Data> getData() {
        return data;
    }
}
