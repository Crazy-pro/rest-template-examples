package alex.klimchuk.rest.template.examples.domain;

import lombok.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    private String title;

    private String company;

}
