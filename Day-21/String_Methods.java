public class String_Methods {
    public static void main(String[] args){
        String str="welcome";
        String str1="WELCOME";
        String s2=new String("welcome");
        System.out.println(str.contentEquals(str1)); ///compare two strings equal or not
        System.out.println(str.startsWith("we"));  //it checks string starts with given character or not
        System.out.println(str1.equalsIgnoreCase(str));  //compare two strings ignore lowercase and uppercase
        String str2="   welcome to java";
        String s =String.format("my company name is %s",str2);  // concates the two strings 
        System.out.println(s);
        String st=String.format("value is %.6f",44.5678); //output is given upto 8 decimal places
        System.out.println(st);
        System.out.println(str.getBytes()); //convert the string into bytes
        System.out.println(str1.isEmpty());  //it checks given string is empty or not
        System.out.println(str1.toLowerCase());  //convert the given string into lowercase
        System.out.println(str.toUpperCase());   //convert the given string into uppercase
        System.out.println(str2.indexOf("java"));  //it gives the position of the first occurence of the given character
        String s1=String.join("my" , "name", "is", "ABC" );  // it concatenates all the given elements
        System.out.println(s1);
        System.out.println(str2.replace('a','e')); // searches a string for a specified character and replace that character with a new character
         System.out.println(str2.replaceAll("a","e"));  // replace all the spcified characters to a new character in the given string
        System.out.println(s2.hashCode());  //it returns code to the given string
         System.out.println(str2.substring(10,  15)); 
         System.out.println(str2.trim());  //it remove all the white spaces in the given string


    }
    
}
