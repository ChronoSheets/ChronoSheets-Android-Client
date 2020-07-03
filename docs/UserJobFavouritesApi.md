# UserJobFavouritesApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userJobFavouritesCreateJobFavourite**](UserJobFavouritesApi.md#userJobFavouritesCreateJobFavourite) | **POST** /UserJobFavourites/CreateJobFavourite | Create a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
[**userJobFavouritesDeleteJobFavourite**](UserJobFavouritesApi.md#userJobFavouritesDeleteJobFavourite) | **DELETE** /UserJobFavourites/DeleteJobFavourite | Delete a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
[**userJobFavouritesGetJobFavourites**](UserJobFavouritesApi.md#userJobFavouritesGetJobFavourites) | **GET** /UserJobFavourites/GetJobFavourites | Get your job favourites.    Requires the &#39;SubmitTimesheets&#39; permission.



## userJobFavouritesCreateJobFavourite

> ApiResponseInt32 userJobFavouritesCreateJobFavourite(xChronosheetsAuth, request)

Create a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.UserJobFavouritesApi;

UserJobFavouritesApi apiInstance = new UserJobFavouritesApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
InsertUserJobFavouriteRequest request = new InsertUserJobFavouriteRequest(); // InsertUserJobFavouriteRequest | An Insert UserJobFavourite Request object containing values for the new UserJobFavourite to create
try {
    ApiResponseInt32 result = apiInstance.userJobFavouritesCreateJobFavourite(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserJobFavouritesApi#userJobFavouritesCreateJobFavourite");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**InsertUserJobFavouriteRequest**](InsertUserJobFavouriteRequest.md)| An Insert UserJobFavourite Request object containing values for the new UserJobFavourite to create |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## userJobFavouritesDeleteJobFavourite

> ApiResponseBoolean userJobFavouritesDeleteJobFavourite(jobId, xChronosheetsAuth)

Delete a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.UserJobFavouritesApi;

UserJobFavouritesApi apiInstance = new UserJobFavouritesApi();
Integer jobId = null; // Integer | The ID of the Job for the Job Favourite you want to delete.
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseBoolean result = apiInstance.userJobFavouritesDeleteJobFavourite(jobId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserJobFavouritesApi#userJobFavouritesDeleteJobFavourite");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| The ID of the Job for the Job Favourite you want to delete. | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## userJobFavouritesGetJobFavourites

> ApiResponseListUserJobFavourite userJobFavouritesGetJobFavourites(xChronosheetsAuth)

Get your job favourites.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.UserJobFavouritesApi;

UserJobFavouritesApi apiInstance = new UserJobFavouritesApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseListUserJobFavourite result = apiInstance.userJobFavouritesGetJobFavourites(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserJobFavouritesApi#userJobFavouritesGetJobFavourites");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseListUserJobFavourite**](ApiResponseListUserJobFavourite.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

