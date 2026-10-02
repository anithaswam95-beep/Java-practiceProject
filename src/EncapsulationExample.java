public class EncapsulationExample {

    class Student {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {

        EncapsulationExample obj = new EncapsulationExample();

        Student s = obj.new Student();

        // Setter
        s.setName("Anitha");
        s.setAge(25);

        // Getter
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
