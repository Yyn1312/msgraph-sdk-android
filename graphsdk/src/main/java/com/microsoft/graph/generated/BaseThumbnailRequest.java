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
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Thumbnail Request.
 */
public class BaseThumbnailRequest extends BaseRequest implements IBaseThumbnailRequest {

    /**
     * The request for the Thumbnail
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseThumbnailRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the Thumbnail from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Thumbnail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Thumbnail from the service
     * @return The Thumbnail from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Thumbnail get() throws ClientException {
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
     * Patches this Thumbnail with a source
     * @param sourceThumbnail The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Thumbnail sourceThumbnail, final ICallback<Thumbnail> callback) {
        send(HttpMethod.PATCH, callback, sourceThumbnail);
    }

    /**
     * Patches this Thumbnail with a source
     * @param sourceThumbnail The source object with updates
     * @return The updated Thumbnail
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Thumbnail patch(final Thumbnail sourceThumbnail) throws ClientException {
        return send(HttpMethod.PATCH, sourceThumbnail);
    }

    /**
     * Creates a Thumbnail with a new object
     * @param newThumbnail The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Thumbnail newThumbnail, final ICallback<Thumbnail> callback) {
        send(HttpMethod.POST, callback, newThumbnail);
    }

    /**
     * Creates a Thumbnail with a new object
     * @param newThumbnail The new object to create
     * @return The created Thumbnail
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Thumbnail post(final Thumbnail newThumbnail) throws ClientException {
        return send(HttpMethod.POST, newThumbnail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IThumbnailRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ThumbnailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IThumbnailRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ThumbnailRequest)this;
     }

}
