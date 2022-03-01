//players & game_loop variables
var game_loop = 1
var initArray1 = mutableListOf("_", "_", "_", "_", "_", "_", "_", "_", "_" )
const val player_X = "X"
const val player_O = "O"

 private fun main(){
     println(initArray1)
     println("Enter only 'X' or 'O': ")
     while(game_loop >= 1) {
         if(game_loop <= 0){
             break

         }

         for (i in initArray1.indices) {
             var inputRead = readLine()!!.toString().uppercase()
             if (inputRead == player_X || inputRead == player_O) {
                 initArray1[i] = inputRead
             } else {
                 println("Only characters allowed: 'X' or 'O'")
             }
             if (i == 8 ) {
                 staleMate()
                 gameOver()
                 break
             }
             if(i in 4..7){
                 checkWinner()

             }

                 checkWinner()

             /*For Game Board Printing!!!*/
             println("---------")
             print(
                 """
               | ${initArray1[0]} ${initArray1[1]} ${initArray1[2]} |
               | ${initArray1[3]} ${initArray1[4]} ${initArray1[5]} |
               | ${initArray1[6]} ${initArray1[7]} ${initArray1[8]} |`
             """.trimIndent())
             println(" ")
             print("---------")

         }
         break


     }


 }
//winner output
private fun winnerX() = println("X is Winner!")
private fun winnerO() = println("O is Winner!")
private fun gameOver()= println("GAME OVER!!!")
private fun staleMate() = println("Draw!!!")
private fun impossible() = println("Not POSSIBLE!!!")

 private fun checkWinner(){
     //0->2 Horizontal Check, 3->5, 6->8
     if(player_X == initArray1[0]  && player_X == initArray1[1] && player_X == initArray1[2]) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_X == initArray1[0] && player_X == initArray1[3]
         && player_X == initArray1[4] && player_X == initArray1[5]) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_X == initArray1[0] && player_X == initArray1[6]
         && player_X == initArray1[7] && player_X == initArray1[8]) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_X == initArray1[0] && player_X == initArray1[4]
         && player_X == initArray1[8] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_X == initArray1[2] && player_X == initArray1[4]
         && player_X == initArray1[6] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_X == initArray1[0] && player_X == initArray1[3]
         && player_X == initArray1[6] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_X == initArray1[1] && player_X == initArray1[4]
         && player_X == initArray1[7] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_X == initArray1[2] && player_X == initArray1[5]
         && player_X == initArray1[8] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }

     //Win Conditions for O
     if(player_O == initArray1[0]  && player_O == initArray1[1] && player_O == initArray1[2]) {
         winnerO()
         gameOver()
         game_loop = 0
     }
     else if( player_O == initArray1[0] && player_O == initArray1[3]
         && player_O == initArray1[4] && player_X == initArray1[5]) {
         winnerO()
         gameOver()
         game_loop = 0
     }
     else if( player_O == initArray1[0] && player_O == initArray1[6]
         && player_O == initArray1[7] && player_O == initArray1[8]) {
         winnerO()
         gameOver()
         game_loop = 0
     }
     else if( player_O == initArray1[0] && player_O == initArray1[4]
         && player_O == initArray1[8] ) {
         winnerO()
         gameOver()
         game_loop = 0
     }
     else if( player_O == initArray1[2] && player_O == initArray1[4]
         && player_O == initArray1[6] ) {
         winnerO()
         gameOver()
         game_loop = 0
     }
     else if( player_O == initArray1[0] && player_O == initArray1[3]
         && player_O == initArray1[6] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_O == initArray1[1] && player_O == initArray1[4]
         && player_O == initArray1[7] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }
     else if( player_O == initArray1[2] && player_O == initArray1[5]
         && player_O == initArray1[8] ) {
         winnerX()
         gameOver()
         game_loop = 0
     }
}
