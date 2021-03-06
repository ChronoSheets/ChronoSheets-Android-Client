# AggregateJobTasksApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregateJobTasksGetAggregateJobTasks**](AggregateJobTasksApi.md#aggregateJobTasksGetAggregateJobTasks) | **GET** /AggregateJobTasks/GetAggregateJobTasks | Get jobs and tasks information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.



## aggregateJobTasksGetAggregateJobTasks

> ApiResponseListAggregateJobCode aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth)

Get jobs and tasks information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.AggregateJobTasksApi;

AggregateJobTasksApi apiInstance = new AggregateJobTasksApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseListAggregateJobCode result = apiInstance.aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregateJobTasksApi#aggregateJobTasksGetAggregateJobTasks");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseListAggregateJobCode**](ApiResponseListAggregateJobCode.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

