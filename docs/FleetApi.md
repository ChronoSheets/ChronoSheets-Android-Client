# FleetApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fleetCreateVehicle**](FleetApi.md#fleetCreateVehicle) | **POST** /Fleet/CreateVehicle | Create a vehicle.    Requires the &#39;ManageFleet&#39; permission.
[**fleetDeleteVehicle**](FleetApi.md#fleetDeleteVehicle) | **DELETE** /Fleet/DeleteVehicle | Delete a vehicle from the fleet.  Requires the &#39;ManageFleet&#39; permission.
[**fleetGetVehicleById**](FleetApi.md#fleetGetVehicleById) | **GET** /Fleet/GetVehicleById | Get a particular vehicle.  Does not require any special permission.
[**fleetGetVehicles**](FleetApi.md#fleetGetVehicles) | **GET** /Fleet/GetVehicles | Get a collection of vehicles that are under your organisation.    Does not require any special permission.
[**fleetUpdateVehicle**](FleetApi.md#fleetUpdateVehicle) | **PUT** /Fleet/UpdateVehicle | Update a vehicle.    Requires the &#39;ManageFleet&#39; permission.



## fleetCreateVehicle

> ApiResponseInt32 fleetCreateVehicle(xChronosheetsAuth, request)

Create a vehicle.    Requires the &#39;ManageFleet&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FleetApi;

FleetApi apiInstance = new FleetApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
InsertVehicleRequest request = new InsertVehicleRequest(); // InsertVehicleRequest | An Insert Vehicle Request object containing values for the new Vehicle to create
try {
    ApiResponseInt32 result = apiInstance.fleetCreateVehicle(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetCreateVehicle");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**InsertVehicleRequest**](InsertVehicleRequest.md)| An Insert Vehicle Request object containing values for the new Vehicle to create |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## fleetDeleteVehicle

> ApiResponseBoolean fleetDeleteVehicle(vehicleId, xChronosheetsAuth)

Delete a vehicle from the fleet.  Requires the &#39;ManageFleet&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FleetApi;

FleetApi apiInstance = new FleetApi();
Integer vehicleId = null; // Integer | The unique ID of the vehicle you wish to delete
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseBoolean result = apiInstance.fleetDeleteVehicle(vehicleId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetDeleteVehicle");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Integer**| The unique ID of the vehicle you wish to delete | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## fleetGetVehicleById

> ApiResponseFleetVehicle fleetGetVehicleById(vehicleId, xChronosheetsAuth)

Get a particular vehicle.  Does not require any special permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FleetApi;

FleetApi apiInstance = new FleetApi();
Integer vehicleId = null; // Integer | The ID of the Vehicle you want to get
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseFleetVehicle result = apiInstance.fleetGetVehicleById(vehicleId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetGetVehicleById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Integer**| The ID of the Vehicle you want to get | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseFleetVehicle**](ApiResponseFleetVehicle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## fleetGetVehicles

> ApiResponseListFleetVehicle fleetGetVehicles(xChronosheetsAuth, includeDeleted)

Get a collection of vehicles that are under your organisation.    Does not require any special permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FleetApi;

FleetApi apiInstance = new FleetApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Boolean includeDeleted = null; // Boolean | Whether or not to include deleted vehicles
try {
    ApiResponseListFleetVehicle result = apiInstance.fleetGetVehicles(xChronosheetsAuth, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetGetVehicles");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **includeDeleted** | **Boolean**| Whether or not to include deleted vehicles | [optional] [default to null]

### Return type

[**ApiResponseListFleetVehicle**](ApiResponseListFleetVehicle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## fleetUpdateVehicle

> ApiResponseBoolean fleetUpdateVehicle(xChronosheetsAuth, request)

Update a vehicle.    Requires the &#39;ManageFleet&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FleetApi;

FleetApi apiInstance = new FleetApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
SaveVehicleRequest request = new SaveVehicleRequest(); // SaveVehicleRequest | A Save Vehicle Request object containing updated fields.  Make sure to specify the Vehicle Id in the request object so that ChronoSheets knows which Vehicle to update
try {
    ApiResponseBoolean result = apiInstance.fleetUpdateVehicle(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetUpdateVehicle");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**SaveVehicleRequest**](SaveVehicleRequest.md)| A Save Vehicle Request object containing updated fields.  Make sure to specify the Vehicle Id in the request object so that ChronoSheets knows which Vehicle to update |

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

