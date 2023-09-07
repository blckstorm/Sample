import java.util.Scanner;

public class GradeCard
{
    public static void main(String[] args)
    {
        int arr[]= new int[10];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            System.out.println("Enter marks");
            arr[i]= sc.nextInt();
        }

        for(int i=0; i<10; i++)
        {
            if(arr[i]>=40 && arr[i]<=50)
            {
                System.out.println(arr[i] + " :Pass");
            }

            else if(arr[i]>=51 && arr[i]<=75)
            {
                System.out.println(arr[i] + " :Merit");
            }

            else if(arr[i]>=76)
            {
                System.out.println(arr[i] + " :Distinction");
            }

            else
            {
                System.out.println(" :Fail");
            }
        }
    }
}