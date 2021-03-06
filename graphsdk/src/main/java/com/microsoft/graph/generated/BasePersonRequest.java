// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Person Request.
 */
public class BasePersonRequest extends BaseRequest implements IBasePersonRequest {

    /**
     * The request for the Person
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePersonRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Person from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Person> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Person from the service
     * @return The Person from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Person get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Person with a source
     * @param sourcePerson The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Person sourcePerson, final ICallback<Person> callback) {
        send(HttpMethod.PATCH, callback, sourcePerson);
    }

    /**
     * Patches this Person with a source
     * @param sourcePerson The source object with updates
     * @return The updated Person
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Person patch(final Person sourcePerson) throws ClientException {
        return send(HttpMethod.PATCH, sourcePerson);
    }

    /**
     * Creates a Person with a new object
     * @param newPerson The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Person newPerson, final ICallback<Person> callback) {
        send(HttpMethod.POST, callback, newPerson);
    }

    /**
     * Creates a Person with a new object
     * @param newPerson The new object to create
     * @return The created Person
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Person post(final Person newPerson) throws ClientException {
        return send(HttpMethod.POST, newPerson);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPersonRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PersonRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPersonRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PersonRequest)this;
     }

}

