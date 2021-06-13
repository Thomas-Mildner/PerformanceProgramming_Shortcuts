package de.thro.lombok;

public class LombokExample
{
    public static void main(String[] args) throws Exception
    {
        var dataModel = new DataModel();
        dataModel.setModelId(1);
        dataModel.setDescription("Blala");
        dataModel.setLongDescription("Long balallaa");
        dataModel.setActive(true);

        System.out.println(dataModel.toString());


        var lombokModel = LombokModel.builder()
                .modelId(1)
                .description("blala")
                .longDescription("Long balala")
                .isActive(true)
                .build();

        System.out.println(lombokModel.toString());
    }
}
