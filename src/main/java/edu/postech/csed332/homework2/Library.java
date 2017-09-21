package edu.postech.csed332.homework2;

import java.util.List;

/**
 * Container class for all the collections (that eventually contain books).
 * The library object is just a container for all collections.
 * A library can be exported to or imported from a file. 
 * 
 * The format of the file is of your choice. 
 * Again, we strongly encourage using some library to convert 
 * between Library objects and string representation.
 */
public final class Library {
    private List<Collection> collections;

    /**
     * Builds a new, empty library.
     */
    public Library() {
        // TODO implement this
    }

    /**
     * Builds a new library and restores its contents from the given file.
     *
     * @param fileName the file from where to restore the library.
     */
    public Library(String fileName) {
        // TODO implement this
    }

    /**
     * Saved the contents of the library to the given file.
     *
     * @param fileName the file where to save the library
     */
    public void saveLibraryToFile(String fileName) {
        // TODO implement this
    }

    /**
     * Returns the collections contained in the library.
     *
     * @return library contained elements
     */
    public List<Collection> getCollections() {
        // TODO implement this
        return null;
    }
    
    
    /**
     * Return the Author of the given book title in the Library.
     * Return null if the given book title doesn't exist.
     * If there are several books with the same title,
     * choose an arbitrary book among them and return its author.
     * (HINT. Use findAuthor method in Collection class)
     * 
     * @param title the book title that want to find Author
     * @return Return the Author of the given book title
     */
    public String findAuthor(String name) {
        // TODO implement this
        return null;  
    }
}
