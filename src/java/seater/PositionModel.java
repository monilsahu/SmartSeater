/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seater;

import java.util.ArrayList;

/**
 *
 * @author GOKU
 */
public class PositionModel 
{
    private ArrayList<Integer> Batch1=new ArrayList<>();
    private ArrayList<Integer> Batch2=new ArrayList<>();

    public ArrayList<Integer> getBatch1() {
        return Batch1;
    }

    public void setBatch1(ArrayList<Integer> Batch1) {
        this.Batch1 = Batch1;
    }

    public ArrayList<Integer> getBatch2() {
        return Batch2;
    }

    public void setBatch2(ArrayList<Integer> Batch2) {
        this.Batch2 = Batch2;
    }
    
    
}
