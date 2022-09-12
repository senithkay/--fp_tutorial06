object q1 extends App {
    class Rational(var num: Double):
        def p(): Unit= print(num);
        def neg():Double={num = -1*num};
    end Rational

    val r = new Rational(10);
    print(r.neg());
}