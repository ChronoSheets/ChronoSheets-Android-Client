# ReportsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsGetAllChartsDataAdmin**](ReportsApi.md#reportsGetAllChartsDataAdmin) | **GET** /Reports/GetAllChartsDataAdmin | Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetAllChartsDataUser**](ReportsApi.md#reportsGetAllChartsDataUser) | **GET** /Reports/GetAllChartsDataUser | Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.
[**reportsGetFleetSummaryAdmin**](ReportsApi.md#reportsGetFleetSummaryAdmin) | **GET** /Reports/GetFleetSummaryAdmin | Gets a summary report, which includes total distance travelled and total running costs, for vehicles within your organisation  Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrgTripById**](ReportsApi.md#reportsGetOrgTripById) | **GET** /Reports/GetOrgTripById | Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTimesheetFileAttachments**](ReportsApi.md#reportsGetOrganisationTimesheetFileAttachments) | **GET** /Reports/GetOrganisationTimesheetFileAttachments | Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records)  Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTranscripts**](ReportsApi.md#reportsGetOrganisationTranscripts) | **GET** /Reports/GetOrganisationTranscripts | Reports on Organisation transcripts (When an audio file is attached, it will be automatically transcribed, these are the transcriptions)    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetOrganisationTrips**](ReportsApi.md#reportsGetOrganisationTrips) | **GET** /Reports/GetOrganisationTrips | Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.
[**reportsGetRawDataAdmin**](ReportsApi.md#reportsGetRawDataAdmin) | **GET** /Reports/GetRawDataAdmin | Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsProjectCostingsAdmin**](ReportsApi.md#reportsProjectCostingsAdmin) | **GET** /Reports/ProjectCostingsAdmin | Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.
[**reportsUserJobsOverTime**](ReportsApi.md#reportsUserJobsOverTime) | **GET** /Reports/UserJobsOverTime | Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.



## reportsGetAllChartsDataAdmin

> ApiResponseCombinedReportsData reportsGetAllChartsDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, forceOnlyThisChart)

Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
String userIds = null; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
String forceOnlyThisChart = null; // String | A flag to indicate which report data you require.  Choose a particular set of data, or if you want all data use the 'NotForced' option.
try {
    ApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, forceOnlyThisChart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetAllChartsDataAdmin");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional] [default to null]
 **forceOnlyThisChart** | **String**| A flag to indicate which report data you require.  Choose a particular set of data, or if you want all data use the &#39;NotForced&#39; option. | [optional] [default to null] [enum: NotForced, SeriesJobCodes, SeriesClients, SeriesProjects, SeriesTasks, TotalsClients, TotalsJobCodes, TotalsProjects, TotalsTasks]

### Return type

[**ApiResponseCombinedReportsData**](ApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsGetAllChartsDataUser

> ApiResponseCombinedReportsData reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth)

Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseCombinedReportsData result = apiInstance.reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetAllChartsDataUser");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseCombinedReportsData**](ApiResponseCombinedReportsData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsGetFleetSummaryAdmin

> ApiResponseListFleetSummaryReportItem reportsGetFleetSummaryAdmin(startDate, endDate, xChronosheetsAuth, userIds)

Gets a summary report, which includes total distance travelled and total running costs, for vehicles within your organisation  Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
String userIds = null; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
try {
    ApiResponseListFleetSummaryReportItem result = apiInstance.reportsGetFleetSummaryAdmin(startDate, endDate, xChronosheetsAuth, userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetFleetSummaryAdmin");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional] [default to null]

### Return type

[**ApiResponseListFleetSummaryReportItem**](ApiResponseListFleetSummaryReportItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsGetOrgTripById

> ApiResponseTrip reportsGetOrgTripById(tripId, xChronosheetsAuth)

Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Integer tripId = null; // Integer | The ID of the Trip you want to get
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseTrip result = apiInstance.reportsGetOrgTripById(tripId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrgTripById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tripId** | **Integer**| The ID of the Trip you want to get | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseTrip**](ApiResponseTrip.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsGetOrganisationTimesheetFileAttachments

> ApiResponseForPaginatedListOrgReportTimesheetFileAttachment reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take, userIds)

Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records)  Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Skip this many items
Integer take = null; // Integer | Take this many items
String userIds = null; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
try {
    ApiResponseForPaginatedListOrgReportTimesheetFileAttachment result = apiInstance.reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take, userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTimesheetFileAttachments");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Skip this many items | [optional] [default to null]
 **take** | **Integer**| Take this many items | [optional] [default to null]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListOrgReportTimesheetFileAttachment**](ApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsGetOrganisationTranscripts

> ApiResponseForPaginatedListOrgReportTranscript reportsGetOrganisationTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, userIds, keywords)

Reports on Organisation transcripts (When an audio file is attached, it will be automatically transcribed, these are the transcriptions)    Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Skip this many items
Integer take = null; // Integer | Take this many items
String userIds = null; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
String keywords = null; // String | Search the transcripts by keyword(s)
try {
    ApiResponseForPaginatedListOrgReportTranscript result = apiInstance.reportsGetOrganisationTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, userIds, keywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTranscripts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Skip this many items | [optional] [default to null]
 **take** | **Integer**| Take this many items | [optional] [default to null]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional] [default to null]
 **keywords** | **String**| Search the transcripts by keyword(s) | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListOrgReportTranscript**](ApiResponseForPaginatedListOrgReportTranscript.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsGetOrganisationTrips

> ApiResponseForPaginatedListOrgReportTrip reportsGetOrganisationTrips(startDate, endDate, xChronosheetsAuth, skip, take, userIds)

Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Skip this many items
Integer take = null; // Integer | Take this many items
String userIds = null; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
try {
    ApiResponseForPaginatedListOrgReportTrip result = apiInstance.reportsGetOrganisationTrips(startDate, endDate, xChronosheetsAuth, skip, take, userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetOrganisationTrips");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Skip this many items | [optional] [default to null]
 **take** | **Integer**| Take this many items | [optional] [default to null]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListOrgReportTrip**](ApiResponseForPaginatedListOrgReportTrip.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsGetRawDataAdmin

> ApiResponseForPaginatedListRawReportItem reportsGetRawDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, sort, order, skip, take)

Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
String userIds = null; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
String sort = null; // String | Decide which column to sort on
String order = null; // String | Decide which direction to sort the column
Integer skip = null; // Integer | Skip this many rows
Integer take = null; // Integer | Take this many rows
try {
    ApiResponseForPaginatedListRawReportItem result = apiInstance.reportsGetRawDataAdmin(startDate, endDate, xChronosheetsAuth, userIds, sort, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetRawDataAdmin");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional] [default to null]
 **sort** | **String**| Decide which column to sort on | [optional] [default to null] [enum: EmailAddress, JobCode, TaskName, ClientName, ProjectName, StartDate, EndDate, SpanSeconds, Description, PayAmount, PayOvertimeAmount, TripCost, TripDistanceMeters, Username]
 **order** | **String**| Decide which direction to sort the column | [optional] [default to null] [enum: Ascending, Descending]
 **skip** | **Integer**| Skip this many rows | [optional] [default to null]
 **take** | **Integer**| Take this many rows | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListRawReportItem**](ApiResponseForPaginatedListRawReportItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsProjectCostingsAdmin

> ApiResponseListProjectCostingReportItem reportsProjectCostingsAdmin(startDate, endDate, xChronosheetsAuth, userIds)

Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
String userIds = null; // String | A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string.
try {
    ApiResponseListProjectCostingReportItem result = apiInstance.reportsProjectCostingsAdmin(startDate, endDate, xChronosheetsAuth, userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsProjectCostingsAdmin");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **userIds** | **String**| A comma-separated list of user Ids, if you want to filter the report data to particular users.  If you want all, send a blank string. | [optional] [default to null]

### Return type

[**ApiResponseListProjectCostingReportItem**](ApiResponseListProjectCostingReportItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## reportsUserJobsOverTime

> ApiResponseListJobSeriesReportItem reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth)

Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
Date startDate = null; // Date | The start date for the date range.  Report data in the response is after this date
Date endDate = null; // Date | The end date for the date range.  Report data in the response is before this date
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseListJobSeriesReportItem result = apiInstance.reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsUserJobsOverTime");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The start date for the date range.  Report data in the response is after this date | [default to null]
 **endDate** | **Date**| The end date for the date range.  Report data in the response is before this date | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseListJobSeriesReportItem**](ApiResponseListJobSeriesReportItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

