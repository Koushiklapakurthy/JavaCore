public class Strings {
    public static void main(String[] args){
        //strings
        //concatenate
        String name1 = "Divya";
        String name2 = "Adithya";
        String name3 = name1 + " and " +name2;
        System.out.println(name3);
        //charAt
        String name = "Divya";
        System.out.println(name.charAt(4));
        //length
        System.out.println(name3.length());
        //replace
        String name4 = name.replace('a','b');
        System.out.println(name4);
        //substring
        String name5 = "Divya tejaswi";
        System.out.println(name5.substring(6,13));


    }
}
