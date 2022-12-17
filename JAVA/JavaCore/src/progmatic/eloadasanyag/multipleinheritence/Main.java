package progmatic.eloadasanyag.multipleinheritence;

public class Main {
    public static void main(String[] args) {
        ChildOne one = new ChildOne();
        ChildTwo two = new ChildTwo();
        ChildThree three = new ChildThree();

        one.parentMethod();
        one.childOneMethod();
        one.methodForChildOneAndTwo();

        two.parentMethod();
        two.childTwoMethod();
        two.methodForChildOneAndTwo();

        three.parentMethod();
        three.childThreeMethod();
       // three.methodForChildOneAndTwo(); // nem látható az a metódus ami csak az One és Two osztály közös ősében van

    }
}
