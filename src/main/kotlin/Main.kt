// Player and Characters
var playerX :Boolean = true

const val cross = "X"
const val nought = "O"

var initArray = mutableListOf("_", "", "", "", "", "", "", "", "")
private fun main () {
    initArray[0] = "_"
    initArray[1] = "_"
    initArray[2] = "_"
    initArray[3] = "_"
    initArray[4] = "_"
    initArray[5] = "_"
    initArray[6] = "_"
    initArray[7] = "_"
    initArray[8] = "_"
//Experimental purpose***
    println(initArray)
    println("Enter a number between 0-8:")


    //Loop to introduce a change in variable by input
    for (i in initArray.indices) {
        val inputR = readLine()!!.toString()
        playerTurn(inputR)
        if (initArray[i] == cross) {
            playerX = false
            if (initArray[i] == nought) {
                playerX = true
            }

        }

        /*
         GAME BOARD PRINTING!!!!!!11
         */
        println("---------")
        print(
            """
               | ${initArray[0]} ${initArray[1]} ${initArray[2]} |
               | ${initArray[3]} ${initArray[4]} ${initArray[5]} |
               | ${initArray[6]} ${initArray[7]} ${initArray[8]} |
        """.trimIndent()
        )
        println(" ")
        println("---------")

    }
    gameTerminate()
}
private fun gameTerminate()= println("GAME OVER!!!")
private fun playerTurn (input:String) {

    while(playerX ){
        when (input){
            //for "X" placement
            "0" -> initArray[0] = cross
            "1" -> initArray[1] = cross
            "2" -> initArray[2] = cross
            "3" -> initArray[3] = cross
            "4" -> initArray[4] = cross
            "5" -> initArray[5] = cross
            "6" -> initArray[6] = cross
            "7" -> initArray[7] = cross
            "8" -> initArray[8] = cross
            else ->println("Allowed numbers 0- 9")
        }

        break

    }

    while(!playerX ) {
        when(input){
            //For "O" placement
            "0" -> initArray[0] = nought
            "1" -> initArray[1] = nought
            "2" -> initArray[2] = nought
            "3" -> initArray[3] = nought
            "4" -> initArray[4] = nought
            "5" -> initArray[5] = nought
            "6" -> initArray[6] = nought
            "7" -> initArray[7] = nought
            "8" -> initArray[8] = nought
            else -> println(" Number must be between 0 and 8")
        }

        break
    }


}

