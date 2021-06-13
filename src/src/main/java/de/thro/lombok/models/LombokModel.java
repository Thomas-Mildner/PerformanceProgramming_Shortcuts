package de.thro.lombok.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class LombokModel
{
    private int modelId;
    @NonNull
    private String description;
    private String longDescription;
    private boolean isActive;


}
