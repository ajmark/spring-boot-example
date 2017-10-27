package hello.Util;

public class Response {
    String code;
    String message;
    String id;
    public Response (String code, String id, String message) {
        this.code = code;
        this.id = id;
        this.message = message;
    }
}
