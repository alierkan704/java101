

        public class Main {
            public static void main(String[] args) {

                Course mat= new Course("Matematik", "Mat101","MAT");
                Course fizik= new Course("Fizik", "Fiz101","FZK");
                Course kimya= new Course("Kimya", "Kim101","KMY");

                Teacher t1= new Teacher("Behzat Hoca", "90550000198", "MAT");
                Teacher t2= new Teacher("Ali Hoca", "90550000253", "FZK");
                Teacher t3= new Teacher("Ahmet Hoca", "90550000764", "KMY");

                mat.addTeacher(t1);
                fizik.addTeacher(t2);
                kimya.addTeacher(t3);

                Student s1 = new Student("Yiğit", 10, "97612", mat, fizik, kimya);
                s1.addBulkExamNote(50, 60, 70);
                s1.addBulkOpinionNote(60, 50, 75);
                s1.isPass();

                Student s2 = new Student("Burak", 10, "97612", mat, fizik, kimya);
                s2.addBulkExamNote(60, 65, 70);
                s2.addBulkOpinionNote(70, 80, 100);
                s2.isPass();

                Student s3 = new Student("Ayşe", 10, "97612", mat, fizik, kimya);
                s3.addBulkExamNote(45, 70, 85);
                s3.addBulkOpinionNote(70, 80, 70);
                s3.isPass();
            }

        }

