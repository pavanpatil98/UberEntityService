package com.example.UberProjectEntityService.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExactLocation extends BaseModel {

    private Double latitude;
    private Double longitude;
}
