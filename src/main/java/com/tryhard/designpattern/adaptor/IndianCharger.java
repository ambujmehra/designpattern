package com.tryhard.designpattern.adaptor;

public class IndianCharger implements IAsiaCharger {
    @Override
    public Integer getPower(String appliance) {
        if (appliance == null)
            return 120;
        if (appliance.equals("laptop"))
            return 210;
        if (appliance.equals("phone"))
            return 200;
        return 220;
    }
}
