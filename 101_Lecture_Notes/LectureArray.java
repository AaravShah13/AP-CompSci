/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {6,2,3,7,2,4,5,0,9};
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i]%2 == 0)
            {
                arr[i] = arr[i]-arr[i+1];
            }
            System.out.print(arr[i] + " ");
        }
	}
}