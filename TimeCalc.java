public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt(""+ args[0].charAt(0)+ args[0].charAt(1));
        int minuutes = Integer.parseInt("" +args[0].charAt(3)+ args[0].charAt(4));
        int minuutesToAdd = Integer.parseInt(args[1]);

        int Totalminutes = (hours * 60 + minuutes + minuutesToAdd);
        int Totalhours = Totalminutes / 60 ; 
        int newhours = Totalhours % 24 ; 
        int newminutes = Totalminutes - (Totalhours * 60);
        if ( newhours < 10){
            System.out.print("0");
        }
        System.out.print(newhours);
        System.out.print( " : ");
        if (newminutes < 10 ) {
            System.out.print ("0");
        }
        System.out.print( newminutes);


    }
}
