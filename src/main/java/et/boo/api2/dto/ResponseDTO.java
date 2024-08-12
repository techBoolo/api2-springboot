package et.boo.api2.dto;

public class ResponseDTO {

  private String message;

  public ResponseDTO() {
  }

  public ResponseDTO(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "ResponseDTO{" +
      "message='" + message + '\'' +
      '}';
  }
}
