package praktikum.models.getUserOrders;

import java.util.ArrayList;

public class Orders {

    private ArrayList<String> ingredients;
    private String _id;
    private String status;
    private Integer number;
    private String name;
    private String createdAt;
    private String updatedAt;

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public String get_id() {
        return _id;
    }

    public String getStatus() {
        return status;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
