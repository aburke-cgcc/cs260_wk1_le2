class HelloWorld2{
    public static void main(String[] args){
        //Remove the old way of printing Hello World!
        //System.out.println("Hello World!");
        
        char[] helloWorldArr = printHelloWorldFromCharArray();
        
        for(int i = 0; i <= helloWorldArr.length - 1; i++){
            System.out.print(helloWorldArr[i]);
        }

    }

    public static char[] printHelloWorldFromCharArray(){
        char[] arr = {'H','e','l','l', 'o', ' ', 'W', 'o', 'r', 'l','d'};

        return arr;
    }
}