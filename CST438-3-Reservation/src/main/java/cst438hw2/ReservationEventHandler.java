package cst438hw2;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RabbitListener(queues = "city-reservation-q1")
public class ReservationEventHandler {

	private static final Logger log = 
          LoggerFactory.getLogger(ReservationEventHandler.class);

	@RabbitHandler
	public void receive(String in) {
		System.out.println(in);
		log.info(" [ReservationEventHandler] Received '" + 
                    in + "'");
	}
}
