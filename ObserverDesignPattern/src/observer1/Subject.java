package observer1;
public interface Subject {    
    public void attachObserver(Observer observer);// th�m ??i t??ng ??ng k� l?ng nghe th�ng b�o.
 
 
    public void detachObserver(Observer observer);// h?y ??i t??ng ??ng k� l?ng nghe th�ng b�o
 
 
    public void notifyObserver();// thong bao ??n t?t c? c�c ??i t??ng ?� ??ng k� th�ng b�o.
     
}