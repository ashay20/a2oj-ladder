import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n+1][3];
        for(int i = 0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[n][0]+=arr[i][0];
            arr[i][1]=sc.nextInt();
            arr[n][1]+=arr[i][1];
            arr[i][2]=sc.nextInt();
            arr[n][2]+=arr[i][2];
        }
        if (arr[n][0]==0 && arr[n][1]==0 && arr[n][2]==0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
