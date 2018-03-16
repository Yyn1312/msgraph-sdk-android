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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Person.
 */
public class BasePerson extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The person's display name.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Given Name.
     * The person's given name.
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Surname.
     * The person's surname.
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Birthday.
     * The person's birthday.
     */
    @SerializedName("birthday")
    @Expose
    public String birthday;

    /**
     * The Person Notes.
     * Free-form notes that the user has taken about this person.
     */
    @SerializedName("personNotes")
    @Expose
    public String personNotes;

    /**
     * The Is Favorite.
     * true if the user has flagged this person as a favorite.
     */
    @SerializedName("isFavorite")
    @Expose
    public Boolean isFavorite;

    /**
     * The Scored Email Addresses.
     * The person's email addresses.
     */
    @SerializedName("scoredEmailAddresses")
    @Expose
    public java.util.List<ScoredEmailAddress> scoredEmailAddresses;

    /**
     * The Phones.
     * The person's phone numbers.
     */
    @SerializedName("phones")
    @Expose
    public java.util.List<Phone> phones;

    /**
     * The Postal Addresses.
     * The person's addresses.
     */
    @SerializedName("postalAddresses")
    @Expose
    public java.util.List<Location> postalAddresses;

    /**
     * The Websites.
     * The person's websites.
     */
    @SerializedName("websites")
    @Expose
    public java.util.List<Website> websites;

    /**
     * The Job Title.
     * The person's job title.
     */
    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;

    /**
     * The Company Name.
     * The name of the person's company.
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Yomi Company.
     * The phonetic Japanese name of the person's company.
     */
    @SerializedName("yomiCompany")
    @Expose
    public String yomiCompany;

    /**
     * The Department.
     * The person's department.
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Office Location.
     * The location of the person's office.
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Profession.
     * The person's profession.
     */
    @SerializedName("profession")
    @Expose
    public String profession;

    /**
     * The Person Type.
     * The type of person.
     */
    @SerializedName("personType")
    @Expose
    public PersonType personType;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person's email name. The general format is alias@domain.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Im Address.
     * The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
     */
    @SerializedName("imAddress")
    @Expose
    public String imAddress;


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
