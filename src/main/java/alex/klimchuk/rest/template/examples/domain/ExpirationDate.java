package alex.klimchuk.rest.template.examples.domain;

import lombok.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpirationDate {
    
    private String date;
    
    private Integer timezoneType;
    
    private String timezone;

}
