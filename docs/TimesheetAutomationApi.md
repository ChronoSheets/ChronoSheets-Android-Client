# TimesheetAutomationApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timesheetAutomationCreateAutomationStep**](TimesheetAutomationApi.md#timesheetAutomationCreateAutomationStep) | **POST** /TimesheetAutomation/CreateAutomationStep | Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.
[**timesheetAutomationGetTimesheetAutomationAuditTrail**](TimesheetAutomationApi.md#timesheetAutomationGetTimesheetAutomationAuditTrail) | **GET** /TimesheetAutomation/GetTimesheetAutomationAuditTrail | Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.



## timesheetAutomationCreateAutomationStep

> ApiResponseInt32 timesheetAutomationCreateAutomationStep(xChronosheetsAuth, request)

Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TimesheetAutomationApi;

TimesheetAutomationApi apiInstance = new TimesheetAutomationApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
CreateAutomationStepRequest request = new CreateAutomationStepRequest(); // CreateAutomationStepRequest | 
try {
    ApiResponseInt32 result = apiInstance.timesheetAutomationCreateAutomationStep(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetAutomationApi#timesheetAutomationCreateAutomationStep");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**CreateAutomationStepRequest**](CreateAutomationStepRequest.md)|  |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## timesheetAutomationGetTimesheetAutomationAuditTrail

> ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence timesheetAutomationGetTimesheetAutomationAuditTrail(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take)

Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TimesheetAutomationApi;

TimesheetAutomationApi apiInstance = new TimesheetAutomationApi();
Integer geofenceId = null; // Integer | The ID of the Geofence
Integer userId = null; // Integer | 
String sort = null; // String | 
String order = null; // String | 
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Skip this many records
Integer take = null; // Integer | Take this many records
try {
    ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence result = apiInstance.timesheetAutomationGetTimesheetAutomationAuditTrail(geofenceId, userId, sort, order, xChronosheetsAuth, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimesheetAutomationApi#timesheetAutomationGetTimesheetAutomationAuditTrail");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geofenceId** | **Integer**| The ID of the Geofence | [default to null]
 **userId** | **Integer**|  | [default to null]
 **sort** | **String**|  | [default to null] [enum: UserName, AutomationActionType, ClientDateTime, IsProcessed]
 **order** | **String**|  | [default to null] [enum: Ascending, Descending]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Skip this many records | [optional] [default to null]
 **take** | **Integer**| Take this many records | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence**](ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

