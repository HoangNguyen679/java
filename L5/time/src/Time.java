/**
 * Created by hoang on 27/02/2017.
 */
public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time(){
    setTime(0, 0, 0);
  }

  public void setHour(int h) { hour = (h >= 0 && h < 24) ? h : 0 ;}
  public void setMinute(int m) { minute = (m >= 0 && m < 60 ) ? m : 0 ;}
  public void setSecond(int s) { second = (s >= 0 && s < 60 ) ? s : 0 ;}

  public void setTime(int h, int m, int s){
    setHour(h);
    setMinute(m);
    setSecond(s);
  }

  public int getHour() { return hour;}
  public int getMinute() { return  minute;}
  public int getSecond() { return  second;}

  public void getTime(){
    System.out.println(hour + " : " + minute + " : " + second);
  }
}
