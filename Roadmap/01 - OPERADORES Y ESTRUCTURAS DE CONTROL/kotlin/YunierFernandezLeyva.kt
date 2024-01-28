fun main(){

    //********Declaración de variables********
    val a: Int = 4
    val b: Int = 2
    print("-> Las variables son: ")
    println("a = " + a + "  b = " + b + " <-")
    println()
    println("--Operadores aritméticos--" )
    println()

    //********Operadores aritméticos**********

    //SUMA
    val suma = a + b
    println("Suma = " + suma)

    //RESTA
    val resta = a - b
    println("Resta = " + resta)
    
    //MULTIPLICACIÓN
    val multi = a * b
    println("Multiplicación = " + multi)
    
    //DIVISIÓN
    val div = a / b
    println("División = " + div)
    
    //RESTO
    val res = a % b
    println("Resto = " + res)
    
    println("_____________________________________________________________")
    println()
    println("--Operadores de comparación--" )
    println()
    //*******Operadores de comparación*********
    
    //IGUALDAD
    val igual = a == b
    
    if(igual){
        println("- a y b son iguales")
    }else{
        println("- a y b no son iguales")
    }
    
    //DESIGUALDAD
    val noIgual = a != b
    
    if(noIgual){
        println("- a y b no son iguales")
    }else{
        println("- a y b son iguales")
    }
    
    //MAYOR QUE >
    val may = a > b
    
    if(may){
        println("- a es mayor que b")
    }else{
        println("- a no es mayor que b")
    }
    
    //MENOR QUE <
    val men = a < b
    
    if(men){
        println("- a es menor que b")      
    }else{
        println("- a no es menor que b")
    }
    
    //MAYOR O IGUAL >=
    val mayIgual = a >= b
    
    if(mayIgual){
        println("- a es mayor o igual que b")
    }else{
        println("- a no es mayor o igual que b")
    }
    
    //MENOR O IGUAL <=
    val menIgual = a <= b
    
    if(menIgual){
        println("- a es menor o igual que b")      
    }else{
        println("- a no es menor o igual que b")
    }
    
   
    println("_____________________________________________________________")
    println()
    println("--Operadores lógicos--" )
    println()
    //*******Operadores lógicos*********
    
    //***Declaración de varibles lógicas AND***
    val edad = 34
    val mayorEdad: Boolean = true
   
 	
    //AND &&
   	if(edad >= 18 && mayorEdad){
        println("- Es mayor de edad")
    }else{
        println("- No es mayor de edad")
    }
    
    //***Declaración de varibles lógicas AND***
    val trabajador = true
    val estudiante = false
    
    //OR ||
    if(trabajador || estudiante){
        println("- Es estudiante o trabajador")
    }else{
        println("- No es estudiante ni trabajador")
    }
    
    
    println("_____________________________________________________________")
    println()
    println("--Estructuras de control--" )
    println()
    
    //FOR
    for( i in 1..a){
        
        println("esto es una vuelta hasta llegar a $a")  
    }
    
    //WHILE
    var x = 6
    while (x > 1){
        print(x)
      	--x
    }
    
    println()
    //DO-WHILE
    var y = 8
    do{
        print(y)
        --y
    }while(y > 0)
       
}