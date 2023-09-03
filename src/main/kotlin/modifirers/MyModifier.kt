package modifirers

open class MyModifier {

    //public  -- domyslny , private, protected, internal
    //mozemy uzywac do funkcji zminnych klas interfejsow
    //public - dostepny w calym projecie
    //internal - dostpne dla wszyskich kas w modlule
    //protected - widoczny tylko w klasie i klasach dziedziczacych co oznacza ze jest jak privet jesli klasa nie jest oznaczona jako open
    //privet - ytylko w pliku zwierajacym ta deklaracje

    public var namePub: String =  "public"
    internal var nameInter: String = "internal"
    protected var nameProtected: String = "protected"
    private var namePrivate: String = "private"

}