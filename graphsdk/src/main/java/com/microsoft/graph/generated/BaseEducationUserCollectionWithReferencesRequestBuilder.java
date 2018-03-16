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
 * The class for the Base Education User Collection With References Request Builder.
 */
public class BaseEducationUserCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IBaseEducationUserCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of EducationSchool
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseEducationUserCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IEducationUserCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IEducationUserCollectionWithReferencesRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new EducationUserCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationUserWithReferenceRequestBuilder byId(final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IEducationUserCollectionReferenceRequestBuilder references(){
        return new EducationUserCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
