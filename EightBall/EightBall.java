package EightBall;//for importing to main GamePlatform
public class EightBall { // main class  
    
        public static void main ( String[] args ) {// main method
            int choice = 1 + (int)(Math.random()*20);/// generates a random number between 1 and 20
            String response = "";// initialize the response string
            /// The program randomly selects a response based on the random number generated to Magic Eight ball to answer questions, than prints response.
            
    
        if ( choice == 1 ) // generate choice 1 
            response = "It is certain";
        else if ( choice == 2 )
            response = "It is decidedly so";
        else if ( choice == 3 )/// All the same, different choices different responses, but randomly picked.
            response = "Without a doubt";
        else if ( choice == 4 )
            response = "Yes - definitely";
        else if ( choice == 5 )
            response = "You may rely on it";
        else if ( choice == 6 )
            response = "As I see it, yes";
        else if ( choice == 7 )
            response = "Most likely";
        else if ( choice == 8 )
            response = "Outlook good";
        else if ( choice == 9 )
            response = "Signs point to yes";
        else if ( choice == 10 )
            response = "Yes";
        else if ( choice == 11 )
            response = "Reply hazy, try again";
        else if ( choice == 12 )
            response = "Ask again later";
        else if ( choice == 13 )
            response = "Better not tell you now";
        else if ( choice == 14 )
            response = "Cannot predict now";
        else if ( choice == 15 )
            response = "Concentrate and ask again";
        else if ( choice == 16 )
            response = "Don't count on it";
        else if ( choice == 17 )
            response = "My reply is no";
        else if ( choice == 18 )
            response = "My source says no";
        else if ( choice == 19 )
            response = "Outlook not so good";
        else if ( choice == 20 )
            response = "Very doubtful";
        else
            response = "8-BALL ERROR!";
                System.out.println( "MAGIC 8-BALL SAYS: " + response ); /// after selecting a random number, it will print the random response.
                /// all 20 choices with random responses.
        } //closing bracket
    }//closing bracket

