public class driver {
    public static void main(String[]args){
        Pair pair = new Pair();
        pair.meow();
        pair.privateMeow();
        System.out.println(pair.meows);
        System.out.println(pair.secretMeows);
    }

}
