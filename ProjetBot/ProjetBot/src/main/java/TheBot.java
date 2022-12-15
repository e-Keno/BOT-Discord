import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class TheBot {
    public static void main(String[] args) throws LoginException
    {
        JDABuilder jdaBuilder = JDABuilder.createDefault("MTAyOTA1NzE1NzcyOTEwMzk0Mg.GM12E_.pEDIRXZLlFwhEFIcCSY08gs5NdGooZqWOiWk0M");
        jdaBuilder.build();
    }
}
