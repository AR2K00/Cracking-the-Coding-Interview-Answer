//For each user, there is an array of messages which contain the time and text of the message
//In the server there would be ideally a map of users, but in this case we will use an array
//Messages could be sent through the server class, or through the user class directed through the server
//Add users/delete users which ive done on other assignment and am not showing
//There would be a notification that shows that they have a new message
//A cool feature that could be added is a class called conversation contianing an arraylist of users and message between them, removing the need for individual recieve/sent message arraylists



import java.util.ArrayList;

public class Question7Point7 {
    public static void main(String args[]){

    }
    public class server{
        ArrayList<user> users;

        server(ArrayList<user>u){
            users=u;
        }
        public void sendMessage(user u1, user u2, message m){
            if (verifyrequest(u1,u2)==false){
                return;
            }
            u1.messagesSent.add(m);
            u2.messagesRec.add(m);
        }
        public boolean verifyrequest(user u1, user u2){
            boolean check1 = false;
            boolean check2 = false;
            for (user u : users){
                if (u1 == u){
                    check1 = true;
                }}
            for (user u : users){
                if (u2 == u){
                    check2 = true;
                }}
            if (check1==true&&check2==true){
                return true;
            }
            return false;
        }
    }
    public class user{
        String id;
        ArrayList<message>messagesSent;
        ArrayList<message>messagesRec;
        server serv;

        user(String i, ArrayList<message>ms, ArrayList<message>mr, server s){
            id=i;
            messagesSent=ms;
            messagesRec=mr;
            serv = s;
        }
        public void requestmessage(user u1,message mess, user u2, server ser){
            ser.sendMessage(u1, u2, mess);
        }

    }
    public class message{
        String test;
        String datetime;

        message(String t, String d){
            test=t;
            datetime=d;
        }
    }
}
