# GeoFencingApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geoFencingCreateGeofence**](GeoFencingApi.md#geoFencingCreateGeofence) | **POST** /GeoFencing/CreateGeofence | Create a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
[**geoFencingDeleteGeofence**](GeoFencingApi.md#geoFencingDeleteGeofence) | **DELETE** /GeoFencing/DeleteGeofence | Deletes a geofence.  Requires the &#39;ManageGeofencing&#39; permission.
[**geoFencingGetGeofenceById**](GeoFencingApi.md#geoFencingGetGeofenceById) | **GET** /GeoFencing/GetGeofenceById | Get a geofence by ID  Requires the &#39;SubmitTimesheets&#39; permission.
[**geoFencingGetGeofences**](GeoFencingApi.md#geoFencingGetGeofences) | **GET** /GeoFencing/GetGeofences | Get geofences belonging to your organisation  Requires the &#39;SubmitTimesheets&#39; permission.
[**geoFencingGetGeofencesBasicInfo**](GeoFencingApi.md#geoFencingGetGeofencesBasicInfo) | **GET** /GeoFencing/GetGeofencesBasicInfo | Gets a list of all geofences in your organisation, including just the name and ID.
[**geoFencingUpdateGeofence**](GeoFencingApi.md#geoFencingUpdateGeofence) | **PUT** /GeoFencing/UpdateGeofence | Updates a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.



## geoFencingCreateGeofence

> ApiResponseInt32 geoFencingCreateGeofence(xChronosheetsAuth, request)

Create a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.GeoFencingApi;

GeoFencingApi apiInstance = new GeoFencingApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
CreateGeoFenceRequest request = new CreateGeoFenceRequest(); // CreateGeoFenceRequest | 
try {
    ApiResponseInt32 result = apiInstance.geoFencingCreateGeofence(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingCreateGeofence");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**CreateGeoFenceRequest**](CreateGeoFenceRequest.md)|  |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## geoFencingDeleteGeofence

> ApiResponseGeofence geoFencingDeleteGeofence(geofenceId, xChronosheetsAuth)

Deletes a geofence.  Requires the &#39;ManageGeofencing&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.GeoFencingApi;

GeoFencingApi apiInstance = new GeoFencingApi();
Integer geofenceId = null; // Integer | Specify the geofence you want to delete with the geofence ID.
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseGeofence result = apiInstance.geoFencingDeleteGeofence(geofenceId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingDeleteGeofence");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geofenceId** | **Integer**| Specify the geofence you want to delete with the geofence ID. | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseGeofence**](ApiResponseGeofence.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## geoFencingGetGeofenceById

> ApiResponseGeofence geoFencingGetGeofenceById(geofenceId, xChronosheetsAuth)

Get a geofence by ID  Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.GeoFencingApi;

GeoFencingApi apiInstance = new GeoFencingApi();
Integer geofenceId = null; // Integer | The ID of the geofence you want to obtain
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseGeofence result = apiInstance.geoFencingGetGeofenceById(geofenceId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingGetGeofenceById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geofenceId** | **Integer**| The ID of the geofence you want to obtain | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseGeofence**](ApiResponseGeofence.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## geoFencingGetGeofences

> ApiResponseForPaginatedListExtendedGeofence geoFencingGetGeofences(xChronosheetsAuth, skip, take)

Get geofences belonging to your organisation  Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.GeoFencingApi;

GeoFencingApi apiInstance = new GeoFencingApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Number of records to skip
Integer take = null; // Integer | Number of records to take
try {
    ApiResponseForPaginatedListExtendedGeofence result = apiInstance.geoFencingGetGeofences(xChronosheetsAuth, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingGetGeofences");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Number of records to skip | [optional] [default to null]
 **take** | **Integer**| Number of records to take | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListExtendedGeofence**](ApiResponseForPaginatedListExtendedGeofence.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## geoFencingGetGeofencesBasicInfo

> ApiResponseForPaginatedListBasicGeofence geoFencingGetGeofencesBasicInfo(xChronosheetsAuth)

Gets a list of all geofences in your organisation, including just the name and ID.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.GeoFencingApi;

GeoFencingApi apiInstance = new GeoFencingApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseForPaginatedListBasicGeofence result = apiInstance.geoFencingGetGeofencesBasicInfo(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingGetGeofencesBasicInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseForPaginatedListBasicGeofence**](ApiResponseForPaginatedListBasicGeofence.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## geoFencingUpdateGeofence

> ApiResponseInt32 geoFencingUpdateGeofence(xChronosheetsAuth, request)

Updates a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.GeoFencingApi;

GeoFencingApi apiInstance = new GeoFencingApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
UpdateGeoFenceRequest request = new UpdateGeoFenceRequest(); // UpdateGeoFenceRequest | 
try {
    ApiResponseInt32 result = apiInstance.geoFencingUpdateGeofence(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeoFencingApi#geoFencingUpdateGeofence");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**UpdateGeoFenceRequest**](UpdateGeoFenceRequest.md)|  |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

