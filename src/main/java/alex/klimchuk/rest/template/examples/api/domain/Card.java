package alex.klimchuk.rest.template.examples.api.domain;

import lombok.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    private String type;
    
    private String number;
    
    private ExpirationDate expirationDate;
    
    private String iban;
    
    private String swift;

}
