
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class flight {

    public flight(String origin, String dest, String flightno, String dep, String arr, String aircraft, int stops,int index,int efare,int bfare) {
        this.origin = origin;
        this.dest = dest;
        this.flightno = flightno;
        this.dep = dep;
        this.arr = arr;
        this.aircraft = aircraft;
        this.stops = stops;
        this.efare = efare;
        this.bfare = bfare;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDest() {
        return dest;
    }

    public String getFlightno() {
        return flightno;
    }

    public String getFreq() {
        return freq;
    }

    public String getDep() {
        return dep;
    }

    public String getArr() {
        return arr;
    }

    public String getAircraft() {
        return aircraft;
    }

    public int getStops() {
        return stops;
    }

    public int getEfare() {
        return efare;
    }

    public int getBfare() {
        return bfare;
    }
    private String origin, dest, flightno, freq, dep, arr, aircraft;
    private int stops,efare,bfare,index;

    
}