package plaindoll;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class WelcomerTest {
        
        private Welcomer welcomer = new Welcomer();

        @Test
        public void welcomerSaysWelcome() {
                assertThat(welcomer.sayWelcome(), containsString("Welcome"));
        }

        @Test
        public void welcomerSaysFarewell() {
                assertThat(welcomer.sayFarewell(), containsString("Farewell"));
        }

        @Test
        public void welcomerSaysHunter() {
                assertThat(welcomer.sayHunter(), containsString("Hunter"));
        }

        @Test
        public void welcomerSaysSilver() {
                assertThat(welcomer.saySilver(), containsString("Silver"));
        }

        @Test
        public void welcomerSaysHunterReply() {
                String reply = welcomer.getHunterReply();
                assertTrue(reply.contains("hunter"));
        }
}