package edu.greenriver.it.messagingapp.bootstrap;

import edu.greenriver.it.messagingapp.model.Message;
import edu.greenriver.it.messagingapp.repositories.IMessagesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Slf4j
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private IMessagesRepository repo;

    public DataLoader(IMessagesRepository repo){
        this.repo = repo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Message msg1 = Message.builder()
                .author("ryguy8806")
                .body("I love Sam!")
                .posted(LocalDate.now()).build();

        Message msg3 = Message.builder()
                .author("remyrue0523")
                .body("I love Mama!")
                .posted(LocalDate.now()).build();

        Message msg2 = Message.builder()
                .author("samahu77")
                .body("I love Ryan!")
                .posted(LocalDate.now()).build();

        repo.save(msg1);
        repo.save(msg2);
        repo.save(msg3);

        log.info("Dummy data loaded.");
    }
}
