package posts;

import comments.*;
import users.*;

import java.util.SortedMap;
import java.util.Iterator;

public interface Post {
    
    /**
     * @return The posts' ID.
     */
    int getId();
    
    /**
     * @return The posts' truthfulness.
     */
    boolean getTruthfulness();
    
    /**
     * @return The posts' message.
     */
    String getMessage();
    
    /**
     * Adds a new comment to the post.
     * @param comment New comment.
     */
    void addComment(Comment comment);
    
    /**
     * @return Number of comments on the post.
     */
    int getNumComments();
    
    /**
     * @return The post authors' ID.
     */
    String getAuthorId();
    
    /**
     * @return New comments iterator.
     */
    Iterator<Comment> newCommentsIterator();

    /**
     * Returns the friend list of the author of the post, at the time of creation.
     * @return The friend list of the post's author at creation time.
     */
    public SortedMap<String, User> getAuthorFriends();
    
}