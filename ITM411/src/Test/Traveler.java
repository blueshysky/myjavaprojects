/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author jpapademas
 */
public class Traveler extends Object implements Distance{

    double miles ;
    public static final double R = 6372.8; // In kilometers

    public Traveler(double miles){
        
        this.miles=miles;
        
    }
    // calculate distance with haversine formula
    
public double distance(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.sin(dLon / 
                   2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }

// example how to use
public static void main(String[] args) {
    	
Traveler uber = new Traveler(5);
 
if(uber.getMiles()>=uber.distance(41.958662, -87.790307, 41.862799, -87.670279))
        
 System.out.println("Service ready for hire!");

else
        System.out.println("No one in service in your area");
}


    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
	 
}
