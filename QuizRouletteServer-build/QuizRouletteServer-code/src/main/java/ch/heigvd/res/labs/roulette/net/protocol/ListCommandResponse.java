package ch.heigvd.res.labs.roulette.net.protocol;

import java.util.List;

import ch.heigvd.res.labs.roulette.data.Student;

/**
 * This class is used to serialize/deserialize the response sent by the server
 * when processing the "LIST" command defined in the protocol specification. The
 * JsonObjectMapper utility class can use this class.
 * 
 * @author Tony Clavien
 */
public class ListCommandResponse {

	private List<Student> students;

  public ListCommandResponse() {
  }

  public ListCommandResponse(List<Student> stu) {
	  students = stu;
  }

  public List<Student> getStudents() {
    return students;
  }

}
