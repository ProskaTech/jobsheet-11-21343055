/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Infomatika
 */
package latihan.latihan2;


    public class Person {
        protected String name;
        protected int age;
        
        public Person (String name, int age){
            this.name = name;
            this.age = age;
        }

        // metode
        public void info(){
            System.out.println("Nama : "+ this.name);
            System.out.println("Usia : "+ this.age);

        }

    }
