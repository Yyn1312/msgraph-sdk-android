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
 * The interface for the Base Outlook User Request.
 */
public interface IBaseOutlookUserRequest extends IHttpRequest {

    /**
     * Gets the OutlookUser from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<OutlookUser> callback);

    /**
     * Gets the OutlookUser from the service
     * @return The OutlookUser from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OutlookUser get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OutlookUser with a source
     * @param sourceOutlookUser The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final OutlookUser sourceOutlookUser, final ICallback<OutlookUser> callback);

    /**
     * Patches this OutlookUser with a source
     * @param sourceOutlookUser The source object with updates
     * @return The updated OutlookUser
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OutlookUser patch(final OutlookUser sourceOutlookUser) throws ClientException;

    /**
     * Posts a OutlookUser with a new object
     * @param newOutlookUser The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final OutlookUser newOutlookUser, final ICallback<OutlookUser> callback);

    /**
     * Posts a OutlookUser with a new object
     * @param newOutlookUser The new object to create
     * @return The created OutlookUser
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OutlookUser post(final OutlookUser newOutlookUser) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseOutlookUserRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseOutlookUserRequest expand(final String value);

}

