package ch.heigvd.res.labs.roulette.net.protocol;

import java.util.List;

import ch.heigvd.res.labs.roulette.data.Student;
import ch.heigvd.res.labs.roulette.net.server.RouletteV2ClientHandler.Status;

/**
 * This class is used to serialize/deserialize the response sent by the server
 * when processing the "LOAD" command defined in the protocol specification. The
 * JsonObjectMapper utility class can use this class.
 * 
 * @author Tony Clavien
 */
public class LoadCommandResponse {
	
	private Status status;
	private int nbrStudents;

  public LoadCommandResponse() {
  }

  public LoadCommandResponse(Status sucess, int nbr) {
	status = sucess;
	nbrStudents = nbr;
  }

}
