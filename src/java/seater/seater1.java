/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seater;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/seater1")
public class seater1 
{    
    @POST 
    @Produces(MediaType.APPLICATION_JSON)
    public PositionModel sayHelloHTML(@QueryParam("b1") Integer batch1 ,@QueryParam("b2") Integer batch2, @QueryParam("capacity") Integer strength )
    {
        algo a=new algo();
        return a.layout(batch1,batch2, strength);
    }

}
