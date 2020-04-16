/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panth
 */


class reservation {
    public reservation(String refno, String name, int age, String Gender, String to, String from, String flightno, String date, String dep, String arr, String seatno){
        
        this.refno = refno;
        this.name = name;
        this.age = age;
        this.gender = Gender;
        this.to = to;
        this.from = from;
        this.flightno = flightno;
        this.date = date;
        this.dep = dep;
        this.arr = arr;
        this.seatno = seatno;
    }

    public String getRefno() {
        return refno;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getFlightno() {
        return flightno;
    }

    public String getDate() {
        return date;
    }

    public String getDep() {
        return dep;
    }

    public String getArr() {
        return arr;
    }

    public String getSeatno() {
        return seatno;
    }

    public int getAge() {
        return age;
    }
    private String refno, name, gender, to, from, flightno, date, dep, arr, seatno;    
    private int age;
}

