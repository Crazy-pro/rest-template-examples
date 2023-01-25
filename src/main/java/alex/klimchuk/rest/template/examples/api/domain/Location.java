package alex.klimchuk.rest.template.examples.api.domain;

import lombok.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private String street;

    private String city;

    private String state;

    private String postcode;

}
