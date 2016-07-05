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
 * The class for the Base Event Request Builder.
 */
public class BaseEventRequestBuilder extends BaseRequestBuilder implements IBaseEventRequestBuilder {

    /**
     * The request builder for the Event
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseEventRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IEventRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IEventRequest buildRequest(final List<Option> options) {
        return new EventRequest(getRequestUrl(), getClient(), options);
    }


    /**
     * Gets the request builder for Calendar.
     */
    public ICalendarRequestBuilder getCalendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    public IEventCollectionRequestBuilder getInstances() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("instances"), getClient(), null);
    }

    public IEventRequestBuilder getInstances(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("instances") + "/" + id, getClient(), null);
    }
    public IExtensionCollectionRequestBuilder getExtensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder getExtensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public IAttachmentCollectionRequestBuilder getAttachments() {
        return new AttachmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("attachments"), getClient(), null);
    }

    public IAttachmentRequestBuilder getAttachments(final String id) {
        return new AttachmentRequestBuilder(getRequestUrlWithAdditionalSegment("attachments") + "/" + id, getClient(), null);
    }

    public IEventAcceptRequestBuilder getAccept(final String comment, final Boolean sendResponse) {
        return new EventAcceptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.accept"), getClient(), null, comment, sendResponse);
    }

    public IEventDeclineRequestBuilder getDecline(final String comment, final Boolean sendResponse) {
        return new EventDeclineRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.decline"), getClient(), null, comment, sendResponse);
    }

    public IEventTentativelyAcceptRequestBuilder getTentativelyAccept(final String comment, final Boolean sendResponse) {
        return new EventTentativelyAcceptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tentativelyAccept"), getClient(), null, comment, sendResponse);
    }

    public IEventSnoozeReminderRequestBuilder getSnoozeReminder(final DateTimeTimeZone newReminderTime) {
        return new EventSnoozeReminderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.snoozeReminder"), getClient(), null, newReminderTime);
    }

    public IEventDismissReminderRequestBuilder getDismissReminder() {
        return new EventDismissReminderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dismissReminder"), getClient(), null);
    }
}
