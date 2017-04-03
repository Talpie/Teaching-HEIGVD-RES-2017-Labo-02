package ch.heigvd.res.labs.roulette.net.protocol;

import java.util.List;
import ch.heigvd.res.labs.roulette.net.server.RouletteV2ClientHandler.Status;

import ch.heigvd.res.labs.roulette.data.Student;

/**
 * This class is used to serialize/deserialize the response sent by the server
 * when processing the "LIST" command defined in the protocol specification. The
 * JsonObjectMapper utility class can use this class.
 * 
 * @author Tony Clavien
 */
public class ByeCommandResponse {

 private Status status;
 private int nbrCommands;

  public ByeCommandResponse() {
  }

  public ByeCommandResponse(Status s, int nbr) {
	  status = s;
	  nbrCommands = nbr;
  }

}
