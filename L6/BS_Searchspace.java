public class BS_Searchspace {
   
    static boolean check(int speed,int time,int distance){
     int tempdistance;
        tempdistance=speed*time;
        return tempdistance>=distance;
    }


    static int safespeed(int high,int low,int distance,int time ){
    int ans=-1;
    while(low<=high)
    {
    int mid=(high+low)/2;
    if(check(mid, time, distance)){
    ans=mid;
    high=mid-1;
    }
    else{
        low=mid+1;
    }
  }
  return ans;
  }
    public static void main(String[] args) {
        int distance=100;
        int time=3;
        int low=0;
        int high=Integer.MAX_VALUE;
        int speed=safespeed(high, low, distance, time);
        System.out.println(speed);
    }
}
