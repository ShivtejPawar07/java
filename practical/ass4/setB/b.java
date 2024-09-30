/*b) Define class EmailId with members ,username and password. Define default and
parameterized constructors. Accept values from the command line Throw user
defined exceptions – “InvalidUsernameException” or “InvalidPasswordException” if
the username and password are invalid */

class InvalidUsernameException extends Exception {
    String msg;

    InvalidUsernameException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "InvalidUsernameException: " + msg;
    }
}

class InvalidPasswordException extends Exception {
    String msg;

    InvalidPasswordException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "InvalidPasswordException: " + msg;
    }
}

class email{

 int m;
 String u;
 String pass;
 email() {
    this.u="";
    this.pass="";
}
 email(String u,String pass)
 {
   this.u=u;
   this.pass=pass;
 

try{
    
if(!u.equals("shivtej"))
{
  throw new InvalidUsernameException("invalidusernameexception"+u);
}
 
if(!pass.equals("1234"))
{
throw new InvalidPasswordException("invalidpasswordexception"+pass);
}
 System.out.println("login successfuly");
}
catch( InvalidUsernameException  | InvalidPasswordException e)
{
System.out.println(e);
}
}
}
class demo
{
public static void main(String args[]){
  
    String u = args[0];
    String pass = args[1];
    new email(u, pass);
}
}

