package de.thro.lombok;

import java.util.Objects;

public class DataModel
{
    private int modelId;
    private String description;
    private String longDescription;
    private boolean isActive;

    public int getModelId()
    {
        return modelId;
    }

    public void setModelId(int modelId)
    {
        this.modelId = modelId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getLongDescription()
    {
        return longDescription;
    }

    public void setLongDescription(String longDescription)
    {
        this.longDescription = longDescription;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void setActive(boolean active)
    {
        isActive = active;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataModel dataModel = (DataModel) o;
        return modelId == dataModel.modelId && isActive == dataModel.isActive && Objects.equals(description, dataModel.description) && Objects.equals(longDescription, dataModel.longDescription);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(modelId, description, longDescription, isActive);
    }

    @Override
    public String toString()
    {
        return "DataModel{" +
                "modelId=" + modelId +
                ", description='" + description + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
