package alex.klimchuk.rest.template.examples.domain;

import lombok.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Billing {
    
    private Card card;

}
