object q1 extends App {
    class Rational(var num: String):
        var ar = num.split('/')
        val x = ar(0).toInt;
        val y = ar(1).toInt;

        def printRa():Unit= println(x+"/"+y/*s"$x / $y"*/);
        def -(that: Rational):Rational={
            var res = new Rational((this.x*that.y - this.y*that.x).toString+'/'+(this.y*that.y).toString);
            return res;
        }

    end Rational
    
    val r1 = new Rational("3/5")
    val r2 = new Rational("1/5")
    val r3 = r1-r2
    r3.printRa()


}