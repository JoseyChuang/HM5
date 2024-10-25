import java.io.Bufferedreader;

public class Sample2_2
{
    public static void maiin(string args)throws IOException
    {
        System.out.prinln("請輸入整數");

        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num == 1)
            System.out.println("輸入的是1");
            System.out.println("選擇的1");
        
        System.out.println("結束處理");
        
    }
}