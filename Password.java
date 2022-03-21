class Password_validation extends RuntimeException
{
    Password_validation(String s){
        super(s);
    }
    class Password{
        public static void main(String[] args){

            String password = args[0];
            if(password.equals("Pr@neeth"))
            {
                System.out.println("valid user");

            }
            else
            {
                try{
                    throw new Password_validation("invalid password");
                }
                catch(Password_validation s)
                {
                    System.out.println("unable to continue" +s);
                }
            }
        }
    }
}
