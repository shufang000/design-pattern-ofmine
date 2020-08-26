package com.shufang.test;

import java.util.List;

public class ReadModal {
    static interface ProductDao {
        ProductDisplay findById(int id);
        List<ProductDisplay> findByName(String name);
        List<ProductInventory> findOutOfStockProducts();
    }

    public class ProductDisplay {
        private int id;
        private String name;
        private String description;
        private double unitPrice;
        private boolean isOutOfStock;
        private double userRating;
    }

    private class ProductInventory {
        private int id;
        private String name;
        private int currentStock;
    }
}

interface Command {
    int getId();
}

class RateProduct implements Command{
    private int id;
    private int uid;
    private double rating;

    public RateProduct(int id, int uid, double rating) {
        this.id = id;
        this.uid = uid;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }
    public int getUid() {
        return uid;
    }

    public double getRating() {
        return rating;
    }
}

class ProductCommandHandler {
    public void handleCommand(Command command) {
        switch (command.getClass().getSimpleName()) {
            case "RateProduct":
                // handle product rating
            default :
                // default action
        }
    }
}

