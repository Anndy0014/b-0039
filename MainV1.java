import java.util.ArrayList;

/**
 * MainV1
 */
public class MainV1 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setID("A-0035");
        s1.setName("le van lam");
        s1.setAge("25");
        s1.setTel("090-999-078");
        students.add(s1);

        Student s2 = new Student();
        s2.setID("A-0036");
        s2.setName("tran thi tam");
        s2.setAge("24");
        s2.setTel("090-456-765");
        students.add(s2);

        Student s3 = new Student();
        s3.setID("A-0037");
        s3.setName("le thi na");
        s3.setAge("22");
        s3.setTel("090-236-746");
        students.add(s3);

        Student s4 = new Student();
        s4.setID("A-0037");
        s4.setName("nguyen xuan ti");
        s4.setAge("25");
        s4.setTel("090-980-345");
        students.add(s4);

        Student s5 = new Student();
        s5.setID("A-0039");
        s5.setName("nguyen thi le");
        s5.setAge("25");
        s5.setTel("078-435-654");
        students.add(s5);

        ArrayList<Student> result = new ArrayList<>();
        String keyword = "nguyen";
        for(int i=0;i<students.size();i++){
            Student a = students.get(i);
            String name = a.getName();
            if(keyword.contains(name)){
                result.add(a);
            }
        }
        for(int j = 0;j<result.size();j++){
            Student names = result.get(j);
            System.out.println(names.getName());
        }

    }
}