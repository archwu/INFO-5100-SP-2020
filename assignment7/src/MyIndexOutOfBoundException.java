public class MyIndexOutOfBoundException extends RuntimeException {
  private final long serialVersionUID = -8460356990632230194L;
  public MyIndexOutOfBoundException(String errorMsg, Throwable err){
    super(errorMsg, err);
  }
  public MyIndexOutOfBoundException(){
    super();
  }

  public MyIndexOutOfBoundException(String s) {
    super(s);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
