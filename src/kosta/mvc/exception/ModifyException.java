package kosta.mvc.exception;
/**
 * 수정할떄 발생하는 예외
 * @author 이경민
 *
 */
public class ModifyException extends Exception {
	public  ModifyException() {
	}
	
	public ModifyException(String message) {
		super(message);
	}

}
