package Ravikumar.Sujatha.RotateArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * Created by sujatharavikumar on 9/14/16.
 */
public class RotateArray extends ArrayList{

    int count = 0;

    public void rotateArray(int moveByElements){
        for (int index = 1; index < 7; index++)
            this.add(index);

        System.out.println("Before Array rotation:" +this);
        while(count < moveByElements){
            for (int i = 0; i<5; i++){
                Collections.swap(this,i,i+1);
            }
            count++;
        }
        System.out.println("After Array Rotation:" +this);
    }



    public static void main(String[] args) {

        RotateArray rotateObj = new RotateArray();
        rotateObj.rotateArray(2);
    }

}
