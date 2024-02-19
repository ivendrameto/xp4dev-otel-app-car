package dev.xp4.article.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDTO implements Serializable {

    private Long id;
    private String identification;
    private Boolean active;

}
