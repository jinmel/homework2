package edu.postech.csed332.homework2;

import java.util.List;

/**
 * The Collection class represents a single collection. 
 * It contains a name of the collection and also has a list of references 
 * to every book and every sub-collection in that particular collection. 
 * 
 * A collection can be exported to and imported from a string representation. 
 * The format of the string is of your choice, 
 * but the string representation should have the name of 
 * this collection and all elements (books and sub-collections) 
 * contained in this collection.
 */
public final class Collection extends Element {
    List<Element> elements;
    private String name;
    
    /**
     * Creates a new collection with the given name.
     *
     * @param name the name of the collection
     */
    public Collection(String name) {
        // TODO implement this
    }

    /**
     * Restores a collection from its given string representation.
     *
     * @param stringRepresentation the string representation
     */
    public static Collection restoreCollection(String stringRepresentation) {
        // TODO implement this
        return null;
    }

    /**
     * Returns the string representation of a collection. 
     * The string representation should have the name of this collection, 
     * and all elements (books/subcollections) contained in this collection.
     *
     * @return string representation of this collection
     */
    public String getStringRepresentation() {
        // TODO implement this
        return null;
    }

    /**
     * Returns the name of the collection.
     *
     * @return the name
     */
    public String getName() {
        // TODO implement this
        return null;
    }
    
    /**
     * Adds an element to the collection.
     * If parentCollection of given element is not null,
     * do not actually add, but just return false.
     * (explanation: if given element is already a part of  
     * another collection, you should have deleted the element 
     * from that collection before adding to another collection)
     *
     * @param element the element to add
     * @return true on success, false on fail
     */
    public boolean addElement(Element element) {
        // TODO implement this
        return false;
    }
    
    /**
     * Deletes an element from the collection.
     * Returns false if the collection does not have 
     * this element.
     * Hint: Do not forget to clear parentCollection
     * of given element 
     *
     * @param element the element to remove
     * @return true on success, false on fail
     */
    public boolean deleteElement(Element element) {
        // TODO implement this
        return false;
    }
    
    /**
     * Returns the list of elements.
     * 
     * @return the list of elements
     */
    public List<Element> getElements() {
        // TODO implement this
        return null;
    }
    
    /**
     * Return the author of the given book title in the Collection.
     * Return null if the given book title doesn't exist.
     * If there are several books with the same title,
     * choose an arbitrary book among them and return its author.
     * 
     * @param title the book title that want to find Author
     * @return Return the Author of the given book title
     */
    public String findAuthor(String title) {
    		// TODO implement this
    		return null;
    }
    
}
