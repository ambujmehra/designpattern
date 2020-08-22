package com.tryhard.designpattern.adaptor;

public class AsiaToEuroAdaptor implements IAsiaCharger{

    private IEuroCharger iEuroCharger;

    public AsiaToEuroAdaptor(IEuroCharger iEuroCharger) {
        this.iEuroCharger = iEuroCharger;
    }

    @Override
    public Integer getPower(String appliance) {
        return this.iEuroCharger.getPower(appliance);
    }
}
