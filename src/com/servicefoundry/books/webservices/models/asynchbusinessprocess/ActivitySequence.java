/* Generated by Together */

package com.servicefoundry.books.webservices.models.asynchbusinessprocess;

import java.util.LinkedList;
import com.servicefoundry.books.webservices.patterns.BusinessProcess.BusinessActivity;
import com.servicefoundry.books.webservices.patterns.BusinessProcess.Data;
public class ActivitySequence extends LinkedList {
    public com.servicefoundry.books.webservices.patterns.asynchbusinessprocess.BusinessActivity next() {
    }

    public com.servicefoundry.books.webservices.patterns.asynchbusinessprocess.BusinessActivity get() {
    }

    /**
     * @link aggregationByValue
     * @clientCardinality 1
     * @supplierCardinality 1
     * @directed 
     */
    private com.servicefoundry.books.webservices.patterns.asynchbusinessprocess.Data lnkData;

    /**
     * @clientCardinality 0..*
     * @supplierCardinality 0..*
     * @link aggregation
     * @directed 
     */
    private com.servicefoundry.books.webservices.patterns.asynchbusinessprocess.BusinessActivity lnkBusinessActivity;
}