// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Directory Object Collection Reference Request.
 */
public class BaseDirectoryObjectCollectionReferenceRequest extends BaseCollectionRequest<BaseDirectoryObjectCollectionResponse, IDirectoryObjectCollectionPage> implements IBaseDirectoryObjectCollectionReferenceRequest {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDirectoryObjectCollectionReferenceRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseDirectoryObjectCollectionResponse.class, IDirectoryObjectCollectionPage.class);
    }

    public void post(final DirectoryObject newDirectoryObject, final ICallback<DirectoryObject> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/directoryObjects/" + newDirectoryObject.id);
        new DirectoryObjectWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newDirectoryObject, body, callback);
    }

    public DirectoryObject post(final DirectoryObject newDirectoryObject) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/directoryObjects/" + newDirectoryObject.id);
        return new DirectoryObjectWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest()
                .post(newDirectoryObject, body);
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDirectoryObjectCollectionReferenceRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DirectoryObjectCollectionReferenceRequest)this;
    }
}
