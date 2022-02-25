package kr.legossol.borachat.domain.reader;

import javax.persistence.PostPersist;
import kr.legossol.borachat.common.DomainEvent.DomainEventType;
import kr.legossol.borachat.domain.model.entity.Message;
import kr.legossol.borachat.domain.reader.event.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class MessageEventListener {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @PostPersist
    public void messagePostPersist(Message message) {
        eventPublisher.publishEvent(new MessageEvent(message, DomainEventType.CREATE,"topic","key"));
    }

}
