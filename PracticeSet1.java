import java.util.Scanner;

public class PracticeSet1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*	Tom is off to a school Annual Day and is searching for a matching pair of socks. 
		His drawer is filled with socks, each pair of a different color. 
		In its worst case scenario, how many socks (x) should Tom remove from his drawer 
		until he finds a matching pair?  */
//		int n = sc.nextInt();
//		Sytem.out.println(n+1);
		//Explanation
		/* suppose he having 8 pairs so there are total 16 socks that means after drawing 8
		  different socks, The 9th sock picked will definitely match one of previously picked  */
	
		int arr[][] = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        
//        BufferReader bstr = new BufferReader();
//        String equality
        String s1 = new String("Crest");
        String s2 = new String("Crest");
        System.out.println(s1==s2); //s1 and s2 are two different objects in heap memory, 
//        basically in this equality we checking that objects are equal or not definitely it's not.
//        the objects are created/stored in different memory location.
        System.out.println(s1=="Crest");//in this case we are comparing an object with a string
//        to compare the objects we can use equals method.
        System.out.println(s1.equalsIgnoreCase(s2));
        
//        String pool-> in heap memory there is string pool
        String s3 = "amore";
        String s4 = "amore";
        if(s1==s2)
        	System.out.println("true");
        else
        	System.out.println("false");
        /*here in this case it gives true bcauz when we initializing the object s2 the pool memory
          first searches to it's string memory if the given string is already present in that pool
          than the new object points to previously created string rather than storing the same value */
        /* in case of constructor the object is created in heap memory but outside the 
          String pool
         */
        System.out.println(String.join("-","co","ff","ee"));//here we are using a delimiter to seprate strings.
        String str1 = "Probe Solar parker";
        String str2 = str1.substring(4,11);
        System.out.println(str2);
       
        //vowels and consonents 
        String S = sc.next();
        int vowels=0, conso=0;
        for(int i=0; i<S.length(); i++){
          if((S.charAt(i)=='A')||(S.charAt(i)=='E')||(S.charAt(i)=='I')||(S.charAt(i)=='O')||(S.charAt(i)=='U'))
            vowels += 1;
          else
            conso += 1;
        }
        System.out.println(vowels +" "+ conso);
        
      /*  int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i=0; i<N; i++){
          arr[i] = sc.nextInt();
        }
        int min = arr1[0];
        int index = 0;
        for(int i=1; i<N; i++){
          if(arr1[i]<min){
            min = arr1[i];
            index = i;
          }
        }
        System.out.println(index); */
	}

}
