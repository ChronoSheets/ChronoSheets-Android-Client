# ProjectsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectsCreateProject**](ProjectsApi.md#projectsCreateProject) | **POST** /Projects/CreateProject | Create a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.
[**projectsGetProjectById**](ProjectsApi.md#projectsGetProjectById) | **GET** /Projects/GetProjectById | Get a project by its Id.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**projectsGetProjectsForClient**](ProjectsApi.md#projectsGetProjectsForClient) | **GET** /Projects/GetProjectsForClient | Get projects for a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**projectsUpdateProject**](ProjectsApi.md#projectsUpdateProject) | **PUT** /Projects/UpdateProject | Update a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.



## projectsCreateProject

> ApiResponseInt32 projectsCreateProject(xChronosheetsAuth, request)

Create a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ProjectsApi;

ProjectsApi apiInstance = new ProjectsApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
InsertProjectRequest request = new InsertProjectRequest(); // InsertProjectRequest | An Insert Project Request object containing values for the new Project to create.  Make sure to specify a correct Client Id - this will be used to attach the new project under that client.
try {
    ApiResponseInt32 result = apiInstance.projectsCreateProject(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsCreateProject");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**InsertProjectRequest**](InsertProjectRequest.md)| An Insert Project Request object containing values for the new Project to create.  Make sure to specify a correct Client Id - this will be used to attach the new project under that client. |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## projectsGetProjectById

> ApiResponseProject projectsGetProjectById(projectId, xChronosheetsAuth)

Get a project by its Id.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ProjectsApi;

ProjectsApi apiInstance = new ProjectsApi();
Integer projectId = null; // Integer | The ID of the Project you want to get
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseProject result = apiInstance.projectsGetProjectById(projectId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsGetProjectById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**| The ID of the Project you want to get | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseProject**](ApiResponseProject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## projectsGetProjectsForClient

> ApiResponseListProject projectsGetProjectsForClient(clientId, xChronosheetsAuth)

Get projects for a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ProjectsApi;

ProjectsApi apiInstance = new ProjectsApi();
Integer clientId = null; // Integer | The ID of the client
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseListProject result = apiInstance.projectsGetProjectsForClient(clientId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsGetProjectsForClient");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**| The ID of the client | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseListProject**](ApiResponseListProject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## projectsUpdateProject

> ApiResponseBoolean projectsUpdateProject(xChronosheetsAuth, request)

Update a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.ProjectsApi;

ProjectsApi apiInstance = new ProjectsApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
UpdateProjectRequest request = new UpdateProjectRequest(); // UpdateProjectRequest | An Update Project Request object containing updated fields.  Make sure to specify the Project Id in the request object so that ChronoSheets knows which Project to update
try {
    ApiResponseBoolean result = apiInstance.projectsUpdateProject(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#projectsUpdateProject");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**UpdateProjectRequest**](UpdateProjectRequest.md)| An Update Project Request object containing updated fields.  Make sure to specify the Project Id in the request object so that ChronoSheets knows which Project to update |

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

