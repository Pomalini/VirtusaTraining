import java.util.Scanner;
public class RotateArray {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int i=0;
        while(true){
            System.out.println("Enter 0 or 1 to rotate or 2 to termiante");
        int ch=scan.nextInt();
      
        if(ch==0){
        	if(i==0){
              
                i=n-1;
                System.out.println(i+"--->"+arr[i]);
            }
        	else if(i<=n-1){
          
                i=i-1;
                System.out.println(i+"--->"+arr[i]);
            }
             
            else{
            
            }
        }
        else if(ch==1){
            if(i==n-1){
                i=0;
           
                i=i;
                System.out.println(i+"--->"+arr[i]);
            }
            else if(i>=0){
             
                i=i+1;
                System.out.println(i+"--->"+arr[i]);
            }
            else{
                
            }
        }
        else{
            System.out.println("rotation terminated");
            break;
        }
        }
      
    }
}
