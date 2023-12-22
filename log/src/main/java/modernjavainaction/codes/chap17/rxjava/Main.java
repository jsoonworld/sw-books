package modernjavainaction.codes.chap17.rxjava;

import static modernjavainaction.codes.chap17.rxjava.TempObservable.getTemperature;

import modernjavainaction.codes.chap17.TempInfo;
import io.reactivex.Observable;

public class Main {

  public static void main(String[] args) {
    Observable<TempInfo> observable = getTemperature("New York");
    observable.subscribe(new TempObserver());

    try {
      Thread.sleep(10000L);
    }
    catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

}
