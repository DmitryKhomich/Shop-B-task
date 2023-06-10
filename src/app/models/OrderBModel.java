package app.models;

import app.base.BaseModel;
import app.utils.Constants;

public class OrderBModel implements BaseModel {

    public double deliveryRate = Constants.DELIVERY_RATE;

    @Override
    public double getOrderCost(int quota, double price) {
        return (quota * price) * (1 + deliveryRate / 100);
    }

    public  double getDeliveryCost(int quota, double price) {
        return quota * price * deliveryRate / 100;
    }
}
