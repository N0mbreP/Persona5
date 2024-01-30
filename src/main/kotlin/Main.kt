import org.example.readInt

fun main() {
    do {
        var userOption: Int = readInt(
            pMessageIn = "Tria:\n1 La primera part de l'activitat (Persona)" +
                    "\n2 La segona part de l'activitat(cercles)\n3 Sortir",
            pMessageErrorDV = "Error opcio no existent, siusplau introdueix una OPCIO VALIDA",
            pMessageErrorDT = "Error, introdueix un altre cop el NUMERO", pMin = 1, pMax = 3
        )
        when (userOption) {
            1 -> persona5()
            2 -> cercles()
            3 -> println("""Deu \Owu/""")
        }
    }while (userOption!=3)
}

fun persona5(){
    val persona1:Persona=Persona()
    persona1.casament()
    println(persona1.toString())
    persona1.divorci()
    println(persona1.toString())
    val persona2:Persona=Persona("owo", "p")
    persona2.casament()
    println(persona2.toString())
    val persona3:Persona=Persona("dfh8","uwo","p", 18, false)
    persona3.aniversari()
    println(persona3.toString())
}

fun cercles(){
    var ultimCercle: Cercle? =null
    do {
        var cercleUser:Cercle?=null
        var userOption:Int= readInt(pMessageIn = "Tria una de les següents opcions:\n" +
                "1 Crear un cercle d'un radi determinat i d'un color determinat\n" +
                "2 Crear un cercle d'un radi determinat\n3 Mostrar últim cercle creat\n" +
                "4 Mostrar perímetre últim cercle creat\n5 Mostrar àrea últim cercle creat\n6 Sortir",
            pMessageErrorDT = "Error de tipus de dades introduides, siusplau introdueix un numero",
            pMessageErrorDV = "Error opcio no existent, siusplau introdueix una OPCIO VALIDA", pMax = 6, pMin = 1)
        when(userOption){
            1->{cercleUser=Cercle(); cercleUser.crearCercleComplet(cercleUser)}
            2->{cercleUser=Cercle(); cercleUser.crearCercleSenseColor(cercleUser)}
            3->if (ultimCercle!=null){ println(ultimCercle.mostrarCercle(ultimCercle))} else println("Error no hi ha ningun cercle creat")
            4->if (ultimCercle!=null){ println(ultimCercle.perimetre())}else println("Error no hi ha ningun cercle creat")
            5->if (ultimCercle!=null){ println(ultimCercle.area())}else println("Error no hi ha ningun cercle creat")
            6-> println("""Deu \owu/""")
        }
        if(cercleUser!=null){
            ultimCercle=cercleUser
        }
    }while (userOption!=6)
}