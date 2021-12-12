package de.thro.bookmarks;

public class BookmarksExample
{
    public static void main(String[] args)
    {
        /* F11 for Bookmarks */
        /* SHIFT + F11  */
        /* CTRL + SHIFT + Number */
        /* CTRL + Number */
        /* ALT + 2 */

        /*Exercise: Add new Field to BookmarksModel - Add toString() Function to Model */
        var dataModel = new BookmarksModel();
        dataModel.setTestString("Test");

        /* Modify printServiceModel to display new Property */
        var dataService = new BookmarksService();
        dataService.printServiceModel(dataModel);
    }


}




