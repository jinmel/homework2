package edu.postech.csed332.homework2;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Our books will contain only the title and the author(s), 
 * each of which is represented as simple strings. 
 * �쏛uthor�� can encode multiple people, possibly with 
 * some special characters to separate people. 
 * 
 * A book can be exported to and imported from a string representation. 
 * The format of the string is of your choice, but by using the format, 
 * you should be able to construct a book object.
 * 
 * Do not reinvent the wheel. We strongly recommend that 
 * you use some library for XML, JSON, YML, or similar format 
 * instead of writing your own parsing code.
 * 
 * While using the library requires adding it to pom.xml, 
 * it will be overall faster for you, likely result in less buggy code, 
 * and you will get to learn more about Maven and Java.
 */
public final class Book extends Element {
    private String title;
    private String author;
    
    public static String TYPE = "BOOK";

    /**
     * Builds a book with the given title and author.
     *
     * @param title the title of the book
     * @param author the author of the book
     */
    public Book(String title, String author) {
    	this.title = title;
    	this.author = author;
    }

    /**
     * Builds a book from the string representation, 
     * which contains the title and author of the book. 
     *
     * @param stringRepresentation the string representation
     */
    public Book(String stringRepresentation) {
    	JSONParser parser = new JSONParser();
    	try {
    		JSONObject json = (JSONObject) parser.parse(stringRepresentation);
    		String type = (String) json.get("type");
    		assert type == Book.TYPE;
    		this.title = (String)json.get("title");
    		this.author = (String)json.get("author");
    		
    	} catch (ParseException e) {
    	}
    }
    
    public JSONObject toJSON() {
    	JSONObject json = new JSONObject();
    	json.put("title", this.title);
    	json.put("author", this.author);
    	json.put("type", Book.TYPE);
    	return json;
    }

    /**
     * Returns the string representation of the given book.
     * The representation contains the title and author of the book.
     *
     * @return the string representation
     */
    public String getStringRepresentation() {
        // TODO implement this
        return null;
    }

    /**
     * Returns all the collections that this book belongs to directly and indirectly.
     * Consider the following. 
     * (1) Computer Science is a collection. 
     * (2) Operating Systems is a collection under Computer Science. 
     * (3) The Linux Kernel is a book under Operating System collection. 
     * Then, getContainingCollections method for The Linux Kernel should return a list 
     * of these two collections (Computer Science, Operating System), starting from 
     * the top-level collection.
     *
     * @return the list of collections
     */
    public List<Collection> getContainingCollections() {
        // TODO implement this
        return null;
    }

    /**
     * Returns the title of the book.
     *
     * @return the title
     */
    public String getTitle() {
        // TODO implement this
        return null;
    }

    /**
     * Returns the author of the book.
     *
     * @return the author
     */
    public String getAuthor() {
        // TODO implement this
        return null;
    }
}
