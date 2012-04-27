/*(C) 2007-2012 Alibaba Group Holding Limited.	

//jdk1.5 java.sql.SQLExceptionû�д�Throwable cause�Ĺ��캯��
//public class TAtomDataSourceException extends java.sql.SQLException {

/**
 * @author yangzhu
 * 
 */
public class TAtomDataSourceException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	public TAtomDataSourceException() {
		super();
	}

	public TAtomDataSourceException(String msg) {
		super(msg);
	}

	public TAtomDataSourceException(Throwable cause) {
		super(cause);
	}

	public TAtomDataSourceException(String msg, Throwable cause) {
		super(msg, cause);
	}

}