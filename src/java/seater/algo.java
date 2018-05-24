/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seater;

import static java.lang.System.exit;
import java.util.ArrayList;
import static javafx.application.Platform.exit;

/**
 *
 * @author GOKU
 */
public class algo {
    
    int Row=5,Col=0,n;
    
    public PositionModel layout(int b1,int b2, int strength) 
    {
        PositionModel pModel = new PositionModel();
        ArrayList<Integer> B1=new ArrayList<>();
        ArrayList<Integer> B2=new ArrayList<>();
    
        n=b1+b2;
        
        if(strength >= n && strength/2 >= b1 && strength/2 >= b2)
        {
            Row= (strength)/5;
        
            int[][] C=new int[Row][Col];
        
            for(int x=0;x<=Row;x++)
            {
                 for(int y=0;y<=Col;y++)
                {
                    if(C[x+1][y]==0 && C[x-1][y]==0 && C[x][y+1]==0 && C[x][y-1]==0 )
                    {
                        C[x][y]=1;
                        int position=(10*x) + y;
                        B1.add(position);
                    }
                }
        }
            for(int x=0;x<=Row;x++)
            {
                 for(int y=0;y<=Col;y++)
                {
                    if(C[x][y]==0)
                    {
                        int position=(10*x) + y;
                        B2.add(position);
                    }
                }
            }
        }
        pModel.setBatch1(B1);
        pModel.setBatch2(B2);
        return pModel;
    }
}
