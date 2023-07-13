class plants{
    String kelebihan = "Tumbuhan ini mempunyai kelebihan : "; 
}
class peashooter extends plants{
    String tembak(){
    return "peashooter = menembakkan bola bola dari mulutnya ";
}}
class cherrybomb extends plants{
    String bom(){
        return "cherrybomb = jika disentuh akan meledak";
}}
class mulai{
    public static void main(String[] args) {
        peashooter pvs1 = new peashooter();
        cherrybomb pvs2 = new cherrybomb();

        System.out.println(pvs1.kelebihan);
        System.out.println(pvs1.tembak());
        System.out.println(pvs2.bom());
    }
}