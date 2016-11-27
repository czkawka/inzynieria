package pl.wmii;

import javax.ws.rs.core.Response;

public class ZestawyImpl implements Zestawy {

  @Override
  public Response podajZestaw(int id) {
    // TODO Auto-generated method stub
    return Response.ok("Witam Panowie " + id).build();
  }

}
