package exercise;

class NestedClass {
    String name = "Mhd. Farhan Lubis"; // complete with your name
    String studentID = "L200220277"; // complete with your student identification number

    public void printName() {
        System.out.println(name + " : " + studentID);
    }

    static class StaticNestedClass {
        static String major = "informatics";

        public static void printNameAccess(NestedClass outerClass) {
            outerClass.printName();
        }
    }

    class InnerClass {
        public void majorAccess() {
            System.out.println(StaticNestedClass.major);
        }
    }

    public static void main(String[] args) {

        System.out.println("\n=== Module 11 - Nested Class ===\n");

        NestedClass outerInstance = new NestedClass();
        outerInstance.printName();

        NestedClass.StaticNestedClass.printNameAccess(outerInstance);

        NestedClass.StaticNestedClass.major = "Computer Science";
        InnerClass innerInstance = outerInstance.new InnerClass();
        innerInstance.majorAccess();

        System.out.println("\n=== Code by " + outerInstance.name + " - " + outerInstance.studentID + " ===\n");
    }
}
