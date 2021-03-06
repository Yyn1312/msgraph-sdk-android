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
 * The class for the Base Workbook Chart Data Labels.
 */
public class BaseWorkbookChartDataLabels extends Entity implements IJsonBackedObject {


    /**
     * The Position.
     * 
     */
    @SerializedName("position")
    @Expose
    public String position;

    /**
     * The Separator.
     * 
     */
    @SerializedName("separator")
    @Expose
    public String separator;

    /**
     * The Show Bubble Size.
     * 
     */
    @SerializedName("showBubbleSize")
    @Expose
    public Boolean showBubbleSize;

    /**
     * The Show Category Name.
     * 
     */
    @SerializedName("showCategoryName")
    @Expose
    public Boolean showCategoryName;

    /**
     * The Show Legend Key.
     * 
     */
    @SerializedName("showLegendKey")
    @Expose
    public Boolean showLegendKey;

    /**
     * The Show Percentage.
     * 
     */
    @SerializedName("showPercentage")
    @Expose
    public Boolean showPercentage;

    /**
     * The Show Series Name.
     * 
     */
    @SerializedName("showSeriesName")
    @Expose
    public Boolean showSeriesName;

    /**
     * The Show Value.
     * 
     */
    @SerializedName("showValue")
    @Expose
    public Boolean showValue;

    /**
     * The Format.
     * 
     */
    @SerializedName("format")
    @Expose
    public WorkbookChartDataLabelFormat format;


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
