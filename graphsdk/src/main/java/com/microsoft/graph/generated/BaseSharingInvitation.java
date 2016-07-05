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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Sharing Invitation.
 */
public class BaseSharingInvitation implements IJsonBackedObject {

    @SerializedName("@odata.type")
    public String oDataType;

    public BaseSharingInvitation() {
        oDataType = "microsoft.graph.sharingInvitation";
    }

    /**
     * The Email.
     */
    @SerializedName("email")
    public String email;

    /**
     * The Invited By.
     */
    @SerializedName("invitedBy")
    public IdentitySet invitedBy;

    /**
     * The Redeemed By.
     */
    @SerializedName("redeemedBy")
    public String redeemedBy;

    /**
     * The Sign In Required.
     */
    @SerializedName("signInRequired")
    public Boolean signInRequired;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
