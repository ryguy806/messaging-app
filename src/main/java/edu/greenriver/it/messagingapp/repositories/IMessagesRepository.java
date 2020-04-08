package edu.greenriver.it.messagingapp.repositories;

import edu.greenriver.it.messagingapp.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMessagesRepository extends CrudRepository<Message, Integer> {

    //Nothing else to do for the database. This is the database layer and it automatically holds the
    //create, read, update, and delete methods.
}
