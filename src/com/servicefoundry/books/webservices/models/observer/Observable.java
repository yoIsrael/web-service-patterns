/* Generated by Together */

package com.servicefoundry.books.webservices.models.observer;

/**
 * @stereotype wsdl 
 */
public interface Observable {
    void addObserver(String location);

    void removeObserver(String location);
}
