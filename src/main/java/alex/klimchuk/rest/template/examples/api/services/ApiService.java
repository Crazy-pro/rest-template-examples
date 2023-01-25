package alex.klimchuk.rest.template.examples.api.services;

import alex.klimchuk.rest.template.examples.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface ApiService {

    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);

}
