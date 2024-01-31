import org.example.readFloat
import org.example.readSentence


class Cercle(){
    private var radi:Float=0f
    private var color:String="blanc"

    constructor(radi:Float):this(){
        this.radi=radi
    }
    constructor(radi: Float, color: String):this(){
        this.radi=radi
        this.color=color
    }

    fun crearCercleComplet(cercle: Cercle){
        cercle.radi= readFloat(pMessageIn = "Introdueix la mida del radi del cercle",
            pMessageErrorDT = "Error, introdueix un altre cop el numero")
        cercle.color= readSentence(pMessageIn = "Introdueix el color del cercle",
            pMessageErrorDT = "Error, introdueix un altre cop el color")
    }

    fun crearCercleSenseColor(cercle: Cercle){
        cercle.radi= readFloat(pMessageIn = "Introdueix la mida del radi del cercle",
            pMessageErrorDT = "Error, introdueix un altre cop el numero")
    }

    override fun toString(): String {
        return "OwU ${super.toString()}"
    }

    fun perimetre():Float{
        return 2*3.14f*radi
    }

    fun area():Float{
        return (radi*radi)*3.14f
    }

    fun mostrarCercle(cercle: Cercle):String{
        return "L'ultim cercle te un radi de $radi i es de color $color"
    }

}