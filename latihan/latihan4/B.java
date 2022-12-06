/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Informatika
 */
package latihan.latihan4;

public class B extends A {
    private int b; 

    public void setB (int nilai){
        b = nilai;
    }

    public int getB (){
        return b;
    }

    // melakukan override terhadap method tampilkanNilai()
    // yang terhadap pada kelas A 
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b = "+ getB());
    }

}

