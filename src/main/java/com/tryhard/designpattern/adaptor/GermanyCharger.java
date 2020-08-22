package com.tryhard.designpattern.adaptor;

public class GermanyCharger implements IEuroCharger {
    @Override
    public Integer getPower(String appliance) {
        if (appliance == null)
            return 120;
        if (appliance.equals("laptop"))
            return 120;
        if (appliance.equals("phone"))
            return 110;
        return 120;
    }
}
