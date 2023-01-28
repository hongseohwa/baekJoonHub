class Solution { 

public int[] solution(int denum1, int num1, int denum2, int num2) { 
    int[] answer = new int[2]; 
    int[] arr= new int[2]; 
    
    if(num1==num2){
        arr[0]=denum1+denum2; 
        arr[1]=num1; 
    } 
    else if(num1!=num2){
        arr[0]=num2*denum1+num1*denum2;
        arr[1]=num1*num2; 
    } 
    for(int i=2; i<arr[1]; i++){ 
        if(arr[0]==arr[1]){ 
            arr[0]=1; 
            arr[1]=1; 
        } 
        else if(arr[0]%arr[1]==0){ 
            arr[0]/=arr[1]; 
            arr[1]=1; 
        } 
        else if(arr[0]%i==0 && arr[1]%i==0){ 
            arr[0]/=i; 
            arr[1]/=i; 
            i--; 
        } 
    } 
    for(int i=0; i<arr.length; i++){
        answer[i]=arr[i]; 
    }
    return answer; 
}
}