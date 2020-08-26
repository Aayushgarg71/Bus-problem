import java.util.*;

public class Main
{
	
public static void main(String[] args) {
	
		
int a;
		
Scanner sc= new Scanner(System.in);
		
a=sc.nextInt();     //no.of nodes
		
int arr[]=new int[a];
        
for(int i=0;i<a;i++){
            
arr[i]=sc.nextInt();
        
}
        
int b=sc.nextInt();        // start node
	    
int c=sc.nextInt();        //destination node
        
int clk=0,counter=0;
        
for(int i=0;i<a;i++){
            
if(b<c){
            
if(i>=b&&i<c){
               
                
clk+=arr[i];
            
}
            
else{
           
                
counter+=arr[i];
            
}
                
            
}
            
if(b>c){
                
if(i>=b||i<c){
              
                
clk+=arr[i];
            
}
            
else{
               
                
counter+=arr[i];
            
}
        
}
}
        
if(clk>counter){
            
System.out.println("min"+counter);
        
}
        
else{
            
System.out.println("min"+clk);
        
}
	
}

}