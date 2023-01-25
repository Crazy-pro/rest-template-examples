package alex.klimchuk.rest.template.examples.api.domain;

import lombok.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Login {

    private String username;

    private String password;

    private String md5;

    private String sha1;

    private String sha256;

}
