package ch.heigvd.res.labs.roulette.net.client;

import ch.heigvd.res.labs.roulette.data.JsonObjectMapper;
import ch.heigvd.res.labs.roulette.data.Student;
import ch.heigvd.res.labs.roulette.data.StudentsList;
import ch.heigvd.res.labs.roulette.net.protocol.ListCommandResponse;
import ch.heigvd.res.labs.roulette.net.protocol.RouletteV1Protocol;
import ch.heigvd.res.labs.roulette.net.protocol.RouletteV2Protocol;
import java.io.IOException;
import java.util.List;

/**
 * This class implements the client side of the protocol specification (version 2).
 *
 * @author Olivier Liechti
 */
public class RouletteV2ClientImpl extends RouletteV1ClientImpl implements IRouletteV2Client {

  @Override
  public void clearDataStore() throws IOException {
	// Send the message to the server
	  writer.println(RouletteV2Protocol.CMD_CLEAR);
	  // flush the buffers
	  writer.flush();
	  reader.readLine();
  }

  @Override
  public List<Student> listStudents() throws IOException {
	// Send the message to the server
	writer.println(RouletteV2Protocol.CMD_LIST);
	// flush the buffers
	writer.flush();
	
	// personal JSON
	return JsonObjectMapper.parseJson(reader.readLine(), ListCommandResponse.class).getStudents();
  }
  
}
