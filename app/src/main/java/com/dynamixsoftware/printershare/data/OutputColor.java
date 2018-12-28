package com.dynamixsoftware.printershare.data;

public class OutputColor {
    public String drv_params;
    public String id;
    public String name;

    @Override
    public String toString() {
        return id+";"+name+";"+drv_params;
    }
}
