package de.thro.lombok;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class LombokModel
{
    private int modelId;
    private String description;
    private String longDescription;
    private boolean isActive;
}
