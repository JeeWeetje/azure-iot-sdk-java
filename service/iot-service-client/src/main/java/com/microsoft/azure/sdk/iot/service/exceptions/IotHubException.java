/*
 * Copyright (c) Microsoft. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.service.exceptions;

import java.lang.*;

/**
 * Super class for IotHub exceptions
 */
public class IotHubException extends Exception
{
    public IotHubException() { super(); }
    public IotHubException(String message) { super(message); }
}
