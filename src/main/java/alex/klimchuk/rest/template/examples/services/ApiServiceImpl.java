package alex.klimchuk.rest.template.examples.services;

import alex.klimchuk.rest.template.examples.domain.User;
import alex.klimchuk.rest.template.examples.domain.UsersData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    private final String apiUrl;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(apiUrl)
                .queryParam("limit", limit);

        UsersData usersData = restTemplate.getForObject(uriBuilder.toUriString(), UsersData.class);

        return usersData.getData();
    }

    @Override
    public Flux<User> getUsers(Mono<Integer> limit) {
        return WebClient
                .create(apiUrl)
                .get()
                .uri(uriBuilder -> uriBuilder.queryParam("limit", limit.block()).build())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(resp -> resp.bodyToMono(UsersData.class))
                .flatMapIterable(UsersData::getData);
    }

}
