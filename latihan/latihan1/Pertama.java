/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Informatika
 */
package latihan.latihan1;

public class Pertama{
    private int a = 10;

    protected void terprotek() {
        System.out.println("Method ini hanya untuk anaknya");
    }

    public void info(){
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada = "+this.getClass().getName());
    }

}
