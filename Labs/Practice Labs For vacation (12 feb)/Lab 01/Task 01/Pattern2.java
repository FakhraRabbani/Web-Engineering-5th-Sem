public class Pattern2 {
 
        public static void main(String args[])
        {
            int length = 7;
            int width = 2* length;
            int mid = (length+1)/2;
            int p = 0;

            for (int i = 1; i <= length; i++)
            {
                for (int j = 1; j <= width; j++)
                {
                    if ((i == 1 || i == length || j == 1 || j == width || (j % 2 == 1 && j < length) || (j % 2 == 0 && j > length+1) || (i != mid && (j > p && j < width - p ) )))   
                    {
                        System.out.print("*");
                    } 
                    else 
                    {
                        System.out.print(" ");
                    }
                }
                if(i >= mid)
                {
                    p = p - 2;
                }
                else if(i < mid)
                {
                    p = p + 2;
                }
            
                System.out.println(); 
        }
        }  

}