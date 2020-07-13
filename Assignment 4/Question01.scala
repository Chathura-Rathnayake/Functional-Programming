object Question01 extends App{

  val TheAlphabet = ('A' to 'Z').toList; //Declaring the alphabet

  //The Encryption function

  /*

  * 1. First, each letter is converted into uppercase.
  * 2. Then I used toInt conversion method to get the ASCII value of the particular character.
  * 3. In order to get the position of that character in the alphabet, I substracted 65 from the ASCII value.
  * 4. Then I added the shift to the current position to get the encrypted character.
  *
  * */

  val encrypt = (Alphabet:List[Char],text:String,shift:Int) => text.map(x=>TheAlphabet(((x.toUpper.toInt-65)+shift)%TheAlphabet.size));


  //The Decryption Function

  /*

  * 1. First, each letter is converted into uppercase.
  * 2. Then I used toInt conversion method to get the ASCII value of the particular character.
  * 3. In order to get the position of that character in the alphabet, I substracted 65 from the ASCII value.
  * 4. Then I added the (size of the Alphabet - shift) to get the old position of that character.
  *
  * */

  val decrypt = (Alphabet:List[Char],text:String,shift:Int) => text.map(x=>TheAlphabet(((x.toUpper.toInt-65)+TheAlphabet.size-shift)%TheAlphabet.size));

  //The Cipher Function

  val cypher = (operation:(List[Char],String,Int)=>String,Alphabet:List[Char],text:String,shift:Int)=> operation(Alphabet,text,shift);

  //Test the program
  //Text --> "TheSecretMessage"
  println("Encrypted Version : "+cypher(encrypt,TheAlphabet,"TheSecretMessage",5));
  println("Decrypted Version : "+cypher(decrypt,TheAlphabet,"YMJXJHWJYRJXXFLJ",5));


}
