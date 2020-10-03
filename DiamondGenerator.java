import java.util.ArrayList;
import java.lang.*;

public class DiamondGenerator{

     public static void main(String []args){
        //Do the calculation
        ArrayList<String> returned = diamond(25);
        //Print every single row
        for(int k = 0; k < returned.size(); k++){
            System.out.println(returned.get(k));
        }
     }
     
     public static ArrayList<String> diamond(int max){
         
         //Declare empty list
         ArrayList<String> array = new ArrayList<String>();
         
         //Figure out the total amount including blank spaces
         int totalSize = max + max - 1;
         
         //Loop for the top triangle
         for(int k = 1; k <= max; k++){
             //Character array generation, fill with empty spaces
             char[] row = new char[totalSize];
             for(int y = 0; y < totalSize; y++){
                row[y] = ' ';
             }
             int middle = (int)Math.floor(totalSize/2.0);
             
             //If there is an even amount stars
             if(k % 2 == 0){
                 //Offset since there is no middle
                 int startingPointLeft = middle - 1;
                 int startingPointRight = middle + 1;
                 //Figure out the amount you need for each side
                 int amountToAdd = k / 2;
                 for(int y = 0; y < amountToAdd; y++){
                     //Loop through until you added them all
                     int left = startingPointLeft - (y * 2) + 1;
                     int right = startingPointRight + (y * 2) + 1;
                     //Assign stars to where you need to add them
                     row[left - 1] = '*';
                     row[right - 1] = '*';
                 }
             }
             //If there is an odd amount of stars
             else{
                 //First handle the middle star
                 int amountToAdd = (k-1) / 2;
                 row[middle] = '*';
                 for(int y = 0; y < amountToAdd; y++){
                     //Offset it by 2 for every one you need to add on each side
                     int left = middle - (y * 2) - 2;
                     int right = middle + (y * 2) + 2;
                     //Assign stars to where you need to add them
                     row[left] = '*';
                     row[right] = '*';
                 }
             }
             
             //Create a new string
             String rowString = new String(row);
             //Add to array
             array.add(rowString);
         }
         
         //Loop for the bottom reversed triangle (loop it from highest number but subtract 1 to not have multiple middle rows)
         for(int k = max - 1; k > 0; k--){
             char[] row = new char[totalSize];
             for(int y = 0; y < totalSize; y++){
                row[y] = ' ';
             }
             int middle = (int)Math.floor(totalSize/2.0);
             
             //If there is an even amount stars
             if(k % 2 == 0){
                 //Offset since there is no middle
                 int startingPointLeft = middle - 1;
                 int startingPointRight = middle + 1;
                 //Figure out the amount you need for each side
                 int amountToAdd = k / 2;
                 for(int y = 0; y < amountToAdd; y++){
                     //Loop through until you added them all
                     int left = startingPointLeft - (y * 2) + 1;
                     int right = startingPointRight + (y * 2) + 1;
                     //Assign stars to where you need to add them
                     row[left - 1] = '*';
                     row[right - 1] = '*';
                 }
             }
             //If there is an odd amount of stars
             else{
                 //First handle the middle star
                 int amountToAdd = (k-1) / 2;
                 row[middle] = '*';
                 for(int y = 0; y < amountToAdd; y++){
                     //Offset it by 2 for every one you need to add on each side
                     int left = middle - (y * 2) - 2;
                     int right = middle + (y * 2) + 2;
                     //Assign stars to where you need to add them
                     row[left] = '*';
                     row[right] = '*';
                 }
             }
             
             //Create a new string
             String rowString = new String(row);
             //Add to array
             array.add(rowString);
         }
         
         return array;
     }
}
