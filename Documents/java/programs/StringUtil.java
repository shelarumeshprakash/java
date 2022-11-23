
public class StringUtil{
public boolean isPolindrome(String word){

char[] charArray = word.toCharArray();
int start=0;
int end = word.length()-1;

while(start<end){
if(charArray[start] != charArray[end]){
return false;
}
start++;
end--;
}
return true;
}

public static void main(String[] args){
StringUtil stringUtil = new StringUtil();
if(stringUtil.isPolindrome("madam")){
System.out.println("the string is Polindrome");
}
else{
System.out.println("not Polindrome");
}
}
}