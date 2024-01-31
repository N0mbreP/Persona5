class Persona (){

    private var dni:String
    private var nom:String
    private var cognoms:String
    private var edat:Int
    private var estatCivil:Boolean

    init {
        dni="dni"
        nom="nom"
        cognoms="cognoms"
        edat=0
        estatCivil=false
    }

    constructor(nom:String, cognoms:String):this(){
        this.nom=nom
        this.cognoms=cognoms
    }

    constructor(dni:String, nom:String, cognoms:String, edat:Int, estatCivil:Boolean):this(){
        this.nom=nom
        this.cognoms=cognoms
        this.dni=dni
        this.edat=edat
        this.estatCivil=estatCivil
    }

    override fun toString(): String {
        return "owu ${super.toString()}"
    }

    fun aniversari(){
        edat++
    }

    fun casament(){
        estatCivil=true
    }

    fun divorci() {
        estatCivil = false
    }
}