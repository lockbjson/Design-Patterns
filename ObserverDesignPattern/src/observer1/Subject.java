package observer1;
public interface Subject {    
    public void attachObserver(Observer observer);// thêm ??i t??ng ??ng ký l?ng nghe thông báo.
 
 
    public void detachObserver(Observer observer);// h?y ??i t??ng ??ng ký l?ng nghe thông báo
 
 
    public void notifyObserver();// thong bao ??n t?t c? các ??i t??ng ?ã ??ng ký thông báo.
     
}