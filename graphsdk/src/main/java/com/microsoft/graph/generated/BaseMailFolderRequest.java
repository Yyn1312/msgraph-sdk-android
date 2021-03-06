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
 * The class for the Base Mail Folder Request.
 */
public class BaseMailFolderRequest extends BaseRequest implements IBaseMailFolderRequest {

    /**
     * The request for the MailFolder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseMailFolderRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the MailFolder from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<MailFolder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MailFolder from the service
     * @return The MailFolder from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public MailFolder get() throws ClientException {
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
     * Patches this MailFolder with a source
     * @param sourceMailFolder The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final MailFolder sourceMailFolder, final ICallback<MailFolder> callback) {
        send(HttpMethod.PATCH, callback, sourceMailFolder);
    }

    /**
     * Patches this MailFolder with a source
     * @param sourceMailFolder The source object with updates
     * @return The updated MailFolder
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public MailFolder patch(final MailFolder sourceMailFolder) throws ClientException {
        return send(HttpMethod.PATCH, sourceMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     * @param newMailFolder The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final MailFolder newMailFolder, final ICallback<MailFolder> callback) {
        send(HttpMethod.POST, callback, newMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     * @param newMailFolder The new object to create
     * @return The created MailFolder
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public MailFolder post(final MailFolder newMailFolder) throws ClientException {
        return send(HttpMethod.POST, newMailFolder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IMailFolderRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MailFolderRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IMailFolderRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MailFolderRequest)this;
     }

}

