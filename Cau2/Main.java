package Cau2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static ArrayList<AVehicle> sort(ArrayList<AVehicle> myList){
		Collections.sort(myList, new Comparator<AVehicle>() {
			@Override
			public int compare(AVehicle o1, AVehicle o2) {
				// TODO Auto-generated method stub
				if(o1.getMadeYear()>o2.getMadeYear()) {
					return 1;
				}
				else if(o1.getMadeYear()<o2.getMadeYear()) {
					return -1;
				}
				else
					return 0;
			//	return o1.getManufactor().getCompanyName().compareTo(o2.getManufactor().getCompanyName());
			}
		});
		return myList;
	}
	
	
	public static void printList(ArrayList<AVehicle> myList) {
		for (AVehicle aVehicle : myList) {
			System.out.println(aVehicle.toString());
		}
	}
 public static void main(String[] args) {
	 ArrayList<AVehicle> myList;
	 myList = new ArrayList<AVehicle>();
			AVehicle car1 = new Car("Xe du lich Civic ",2010,28000,new Manufactor("Honda", "Japan"),4,200,13);
			AVehicle bus1 = new Bus("Xe khach Hiace",2011,35000,new Manufactor("Toyota", "Japan"),12);
			AVehicle truck1  = new Truck("Xe tai MIGHTY",2010,18000,new Manufactor("Huyndai", "Korea"),2.5);
			AVehicle car2 = new Car("Xe du lich Civic Pro",2010,28000,new Manufactor("Camry", "Japan"),4,200,13);
			AVehicle bus2 = new Bus("Xe khach Hiace Pro",2011,35000,new Manufactor("Yamaha", "Japan"),12);
			AVehicle truck2  = new Truck("Xe tai MIGHTY Pro",2010,18000,new Manufactor("Honda", "Korea"),2.5);
			AVehicle car3 = new Car("Xe du lich Civic3",2010,28000,new Manufactor("Mercedes", "Germany"),4,200,13);
			AVehicle bus3 = new Bus("Xe khach Hiace3",2011,35000,new Manufactor("Ford", "USA"),12);
			AVehicle truck3  = new Truck("Xe tai MIGHTY3",2010,18000,new Manufactor("Mazda", "Korea"),2.5);
			AVehicle car4= new Car("Xe du lich Civic4",2010,28000,new Manufactor("Honda", "Japan"),4,200,13);
		myList.add(car1);
		myList.add(car2);
		myList.add(car3);
		myList.add(car4);
		myList.add(bus1);
		myList.add(bus2);
		myList.add(bus3);
		myList.add(truck1);
		myList.add(truck2);
		myList.add(truck3);
		//System.out.println(truck1.discount());
//		printList(myList);
//		System.out.println("Sorted:");
	printList(sort(myList));
		System.out.println("b".compareTo("a"));
}
}
