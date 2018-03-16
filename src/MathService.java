import java.rmi.Remote;
import java.rmi.RemoteException;
 
public interface MathService extends Remote{
    public int add(int a, int b) throws RemoteException;
    public int subtract(int a, int b) throws RemoteException;
    public int multiply(int a, int b) throws RemoteException;
    public int divide(int a, int b) throws RemoteException;

    // added by IT16032798
    public double squareRoot(double number) throws RemoteException;
    public double square(double number) throws RemoteException;
}