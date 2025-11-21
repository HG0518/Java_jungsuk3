public class Exercise08_09 {
    public static void main(String[] args) {
        throw new UnsupportedFuncionException("지원하지 않는 기능입니다.",100);
    }
}

class UnsupportedFuncionException extends RuntimeException{
    final private int ERR_CODE;

    UnsupportedFuncionException(String msg, int ERR_CODE){
        super(msg);
        this.ERR_CODE=ERR_CODE;
    }

    public int getErrCode(){
        return ERR_CODE;
    }

    public String getMessage(){
        return("["+getErrCode()+"]"+super.getMessage());
    }
}
