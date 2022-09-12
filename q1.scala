object q1 extends App {
    class Rational(var num: String){
        var ar = num.split('/')
        var x = ar(0).toInt;
        var y = ar(1).toInt;

        def neg():Unit=x = -1*x
        def printRa():Unit= println(x+"/"+y/*s"$x / $y"*/);


    }


    val r = new Rational("10/25");
    r.neg();
    r.printRa();
}