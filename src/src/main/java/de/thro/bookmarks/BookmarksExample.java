package de.thro.bookmarks;

public class BookmarksExample
{
    public static void main(String[] args)
    {

        /*Exercise: Add new Field to BookmarksModel - Add toString() Function to Model */
        var dataModel = new BookmarksModel();
        dataModel.setTestString("Test");

        /* Modify printServiceModel to display new Property */
        var dataService = new BookmarksService();
        dataService.printServiceModel(dataModel);
    }


}




