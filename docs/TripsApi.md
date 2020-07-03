# TripsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tripsCreateTrip**](TripsApi.md#tripsCreateTrip) | **POST** /Trips/CreateTrip | Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.    Requires the &#39;SubmitTimesheets&#39; permission.
[**tripsGetMyTripById**](TripsApi.md#tripsGetMyTripById) | **GET** /Trips/GetMyTripById | Get trip by Id.    Requires the &#39;ViewMyTrips&#39; permission.
[**tripsGetMyTrips**](TripsApi.md#tripsGetMyTrips) | **GET** /Trips/GetMyTrips | Get my trips.  Get the GPS trips you&#39;ve recorded and submitted.    Requires the &#39;ViewMyTrips&#39; permission.



## tripsCreateTrip

> ApiResponseInt32 tripsCreateTrip(xChronosheetsAuth, request)

Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.    Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TripsApi;

TripsApi apiInstance = new TripsApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
CreateTripRequest request = new CreateTripRequest(); // CreateTripRequest | A Create Trip Request object containing values for the new Trip to create
try {
    ApiResponseInt32 result = apiInstance.tripsCreateTrip(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#tripsCreateTrip");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**CreateTripRequest**](CreateTripRequest.md)| A Create Trip Request object containing values for the new Trip to create |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## tripsGetMyTripById

> ApiResponseTrip tripsGetMyTripById(tripId, xChronosheetsAuth)

Get trip by Id.    Requires the &#39;ViewMyTrips&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TripsApi;

TripsApi apiInstance = new TripsApi();
Integer tripId = null; // Integer | The ID of the Trip you want to get
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseTrip result = apiInstance.tripsGetMyTripById(tripId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#tripsGetMyTripById");
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


## tripsGetMyTrips

> ApiResponseForPaginatedListTrip tripsGetMyTrips(startDate, endDate, xChronosheetsAuth, skip, take, vehicleId)

Get my trips.  Get the GPS trips you&#39;ve recorded and submitted.    Requires the &#39;ViewMyTrips&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TripsApi;

TripsApi apiInstance = new TripsApi();
Date startDate = null; // Date | The Start date of the date range.  Trips after this date will be obtained.
Date endDate = null; // Date | The End date of the date range.  Trips before this date will be obtained.
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Skip this many Trips
Integer take = null; // Integer | Take this many Trips
Integer vehicleId = null; // Integer | Filter by a particular Vehicle (get trips made with a particular vehicle), specified by VehicleId
try {
    ApiResponseForPaginatedListTrip result = apiInstance.tripsGetMyTrips(startDate, endDate, xChronosheetsAuth, skip, take, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#tripsGetMyTrips");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The Start date of the date range.  Trips after this date will be obtained. | [default to null]
 **endDate** | **Date**| The End date of the date range.  Trips before this date will be obtained. | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Skip this many Trips | [optional] [default to null]
 **take** | **Integer**| Take this many Trips | [optional] [default to null]
 **vehicleId** | **Integer**| Filter by a particular Vehicle (get trips made with a particular vehicle), specified by VehicleId | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListTrip**](ApiResponseForPaginatedListTrip.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

