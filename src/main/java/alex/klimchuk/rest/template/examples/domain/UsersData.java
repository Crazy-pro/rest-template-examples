package alex.klimchuk.rest.template.examples.domain;

import lombok.*;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersData {

    List<User> data;

}
