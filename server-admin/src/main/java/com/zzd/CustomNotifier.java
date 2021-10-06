package com.zzd;

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.notify.AbstractStatusChangeNotifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class CustomNotifier extends AbstractStatusChangeNotifier {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public CustomNotifier(InstanceRepository repository) {
		super(repository);
	}


	@Override
	protected Mono<Void> doNotify(InstanceEvent instanceEvent, Instance instance) {

		logger.info(instanceEvent.toString(),instance.toString());
		return null;
	}




}
