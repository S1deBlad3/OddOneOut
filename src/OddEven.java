
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class OddEven {

    static Random random = new Random();
    public static List<java.lang.String> red = new ArrayList<java.lang.String>();
    public static List<java.lang.String> black = new ArrayList<java.lang.String>();
    public static List<java.lang.String> green = new ArrayList<java.lang.String>();
    public static List<java.lang.String> roulette = new ArrayList<java.lang.String>();
    
    public static int startSum;
    public static int totalSum;
    public static int inputMoney = 1000;
    

    public static int[] filterOdd(int[] a) {
        int l = 0;
        int j = 0;
        for(int i=0; i<a.length; i++) {

        	if(a[i] == 0) {green.add("GREEN");}

            if(a[i]%2==1) {
                l++;
            }
        }
        int k[]=new int[l];
        for(int i=0; i<a.length; i++) {

            if(a[i]%2==1) {

                k[j] = a[i];
                j++;
            }
        }
        return k;
    }
    public static int[] filterEven(int[] a) {
        int l = 0;
        int j = 0;
        for(int i=0; i<a.length; i++) {

            if(a[i] == 0) {green.add("GREEN");};

            if(a[i]%2==0) {
                l++;
            }
        }
        int k[] = new int[l];
        for(int i=0; i<a.length; i++) {
            if(a[i]%2==0) {
                k[j] = a[i];
                j++;
            }
        }
        return k;
    }
    
    public static void calcSum(int Money){
    	
    	startSum = Money;
    	/*
    	for (int i = 0; i < black.size(); i++){
    		startSum += (0.5 * startSum) -0.3 * startSum - 0.1 * startSum;
    		System.out.println(startSum);
    	}
    	
    	
    	for (int i = 0; i < red.size(); i++) {
    		startSum += (0.3 * startSum) - 0.5 * startSum - 0.1 * startSum;
    		System.out.println(startSum);
    		
    	}
    	
    	for (int i = 0; i < green.size(); i++){
    		startSum += startSum * 12 -(0.5 * startSum - 0.3 * startSum);
    	}
    	
    	*/
    	for (int i = 0; i < roulette.size(); i++){
    		
    		String target = roulette.get(i);
    		
    		if(target.equals("RED")){
    			startSum += (0.3 * startSum) - 0.5 * startSum - 0.1 * startSum;
        		System.out.println(startSum);
    		}
    		if(target.equals("BLACK")){
    			startSum += (0.5 * startSum) -0.3 * startSum - 0.1 * startSum;
        		System.out.println(startSum);
    		}
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	System.out.println(roulette.size());
    	
    	for (int i = 0; i < roulette.size(); i++){
    		System.out.println(roulette.get(i));
    	}
    	System.out.println("The winning when leaving:" + "" + startSum);
    	totalSum = startSum - Money;
    	System.out.println("The winning is after:" + "" + totalSum);
    	
    }
    
    
    
    
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        System.out.println("enter number Elements in Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter Elements ");
        for(int i=0; i<n; i++) {
            arr[i] = random.nextInt(100);
        }
        int [] odd = filterOdd(arr);
        try {
            for(int i=0; i<n; i++) {

            	if(odd[i] == 0) {
            		green.add("GREEN");
            	}
            	
                red.add("RED");

                //System.out.println("Odd" + odd[i]);
                System.out.println(red.get(i));

            }
        
            
        } catch(ArrayIndexOutOfBoundsException e) {}
        int [] even = filterEven(arr);
        try {
            for(int i=0; i<n; i++) {
            	
            	if(even[i] == 0) {
            		green.add("GREEN");
            	}
            	
            	
            	black.add("BLACK");
            	System.out.println(black.get(i));
                //System.out.println("Even" + even[i]);
            }
            
        } catch(ArrayIndexOutOfBoundsException e) {}
    
        roulette.addAll(black);
        roulette.addAll(red);
        Collections.shuffle(roulette);
        calcSum(inputMoney);
    
    }




}


