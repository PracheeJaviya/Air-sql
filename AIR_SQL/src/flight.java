/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panth
 */
class flight {

    public flight(String origin, String dest, String flightno, String freq, String dep, String arr, String aircraft, int stops) {
        this.origin = origin;
        this.dest = dest;
        this.flightno = flightno;
        this.freq = freq;
        this.dep = dep;
        this.arr = arr;
        this.aircraft = aircraft;
        this.stops = stops;
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
    private String origin, dest, flightno, freq, dep, arr, aircraft;
    private int stops;

    
}
