# UserPayRatesApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userPayRatesCreatePayRate**](UserPayRatesApi.md#userPayRatesCreatePayRate) | **POST** /UserPayRates/CreatePayRate | Create a new pay rate for a particular user, archiving the previous pay rate.    Requires the &#39;ManageOrganisationUsers&#39; permission.
[**userPayRatesGetPayRates**](UserPayRatesApi.md#userPayRatesGetPayRates) | **GET** /UserPayRates/GetPayRates | Get a collection of pay rates for a particular user, specified by user id.    Requires the &#39;ManageOrganisationUsers&#39; permission.



## userPayRatesCreatePayRate

> ApiResponseInt32 userPayRatesCreatePayRate(xChronosheetsAuth, request)

Create a new pay rate for a particular user, archiving the previous pay rate.    Requires the &#39;ManageOrganisationUsers&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.UserPayRatesApi;

UserPayRatesApi apiInstance = new UserPayRatesApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
InsertUserHourlyRateRequest request = new InsertUserHourlyRateRequest(); // InsertUserHourlyRateRequest | An Insert UserHourlyRate Request object containing values for the new UserHourlyRate to create
try {
    ApiResponseInt32 result = apiInstance.userPayRatesCreatePayRate(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPayRatesApi#userPayRatesCreatePayRate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**InsertUserHourlyRateRequest**](InsertUserHourlyRateRequest.md)| An Insert UserHourlyRate Request object containing values for the new UserHourlyRate to create |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## userPayRatesGetPayRates

> ApiResponseListUserHourlyRate userPayRatesGetPayRates(userId, xChronosheetsAuth)

Get a collection of pay rates for a particular user, specified by user id.    Requires the &#39;ManageOrganisationUsers&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.UserPayRatesApi;

UserPayRatesApi apiInstance = new UserPayRatesApi();
Integer userId = null; // Integer | The ID of the User for which you want to get UserHourlyRate objects
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseListUserHourlyRate result = apiInstance.userPayRatesGetPayRates(userId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPayRatesApi#userPayRatesGetPayRates");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The ID of the User for which you want to get UserHourlyRate objects | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseListUserHourlyRate**](ApiResponseListUserHourlyRate.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

