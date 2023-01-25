package alex.klimchuk.rest.template.examples.api.domain;

import lombok.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String gender;

    private Name name;

    private Location location;

    private String email;

    private Login login;

    private String phone;

    private Job job;

    private Billing billing;

    private String language;

    private String currency;

}
