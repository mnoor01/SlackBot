package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.model.User;
import nyc.c4q.ramonaharrison.network.Slack;

public class Main {

    public static void main(String[] args) {

//        Bot myBot = new Bot();
//
//        myBot.testApi();
//
//        myBot.listChannels();
//
//        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        User user=new User(null);
//        System.out.println(user.wordToPigLatin("pink"));
//        System.out.println(user.wordToPigLatin("fox"));
        System.out.println(user.sentenceToPigLatin("Pink fox Likes bananas"));

        // Post "Hello, world!" to the #bots channel
        //myBot.sendMessage("Hello, world!");

        // Post a pineapple photo to the #bots channel
        //myBot.sendMessage("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

    }
}