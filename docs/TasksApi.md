# TasksApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tasksCreateTask**](TasksApi.md#tasksCreateTask) | **POST** /Tasks/CreateTask | Create a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
[**tasksDeleteTask**](TasksApi.md#tasksDeleteTask) | **DELETE** /Tasks/DeleteTask | Delete a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
[**tasksGetTaskById**](TasksApi.md#tasksGetTaskById) | **GET** /Tasks/GetTaskById | Get a particular task by Id.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**tasksGetTasks**](TasksApi.md#tasksGetTasks) | **GET** /Tasks/GetTasks | Get tasks in your organisation.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**tasksGetTasksForJob**](TasksApi.md#tasksGetTasksForJob) | **GET** /Tasks/GetTasksForJob | Get a collection of tasks for a particular Job, specified by JobId.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
[**tasksUpdateTask**](TasksApi.md#tasksUpdateTask) | **PUT** /Tasks/UpdateTask | Update a task.    Requires the &#39;ManageJobsAndTask&#39; permission.



## tasksCreateTask

> ApiResponseInt32 tasksCreateTask(xChronosheetsAuth, request)

Create a task.    Requires the &#39;ManageJobsAndTask&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TasksApi;

TasksApi apiInstance = new TasksApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
InsertTaskRequest request = new InsertTaskRequest(); // InsertTaskRequest | An Insert Task Request object containing values for the new Task to create
try {
    ApiResponseInt32 result = apiInstance.tasksCreateTask(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksCreateTask");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**InsertTaskRequest**](InsertTaskRequest.md)| An Insert Task Request object containing values for the new Task to create |

### Return type

[**ApiResponseInt32**](ApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## tasksDeleteTask

> ApiResponseBoolean tasksDeleteTask(taskId, xChronosheetsAuth)

Delete a task.    Requires the &#39;ManageJobsAndTask&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TasksApi;

TasksApi apiInstance = new TasksApi();
Integer taskId = null; // Integer | The ID of the Task you want to delete
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseBoolean result = apiInstance.tasksDeleteTask(taskId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksDeleteTask");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Integer**| The ID of the Task you want to delete | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## tasksGetTaskById

> ApiResponseTimesheetTask tasksGetTaskById(taskId, xChronosheetsAuth)

Get a particular task by Id.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TasksApi;

TasksApi apiInstance = new TasksApi();
Integer taskId = null; // Integer | The ID of the TimesheetTask you want to get
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseTimesheetTask result = apiInstance.tasksGetTaskById(taskId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksGetTaskById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Integer**| The ID of the TimesheetTask you want to get | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseTimesheetTask**](ApiResponseTimesheetTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## tasksGetTasks

> ApiResponseListTimesheetTask tasksGetTasks(xChronosheetsAuth)

Get tasks in your organisation.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TasksApi;

TasksApi apiInstance = new TasksApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseListTimesheetTask result = apiInstance.tasksGetTasks(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksGetTasks");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseListTimesheetTask**](ApiResponseListTimesheetTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## tasksGetTasksForJob

> ApiResponseListTimesheetTask tasksGetTasksForJob(jobId, xChronosheetsAuth)

Get a collection of tasks for a particular Job, specified by JobId.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TasksApi;

TasksApi apiInstance = new TasksApi();
Integer jobId = null; // Integer | The ID of the job
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseListTimesheetTask result = apiInstance.tasksGetTasksForJob(jobId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksGetTasksForJob");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| The ID of the job | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseListTimesheetTask**](ApiResponseListTimesheetTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## tasksUpdateTask

> ApiResponseBoolean tasksUpdateTask(xChronosheetsAuth, request)

Update a task.    Requires the &#39;ManageJobsAndTask&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TasksApi;

TasksApi apiInstance = new TasksApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
UpdateTaskRequest request = new UpdateTaskRequest(); // UpdateTaskRequest | An Update Task Request object containing updated fields.  Make sure to specify the Task Id in the request object so that ChronoSheets knows which Task to update
try {
    ApiResponseBoolean result = apiInstance.tasksUpdateTask(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksUpdateTask");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**UpdateTaskRequest**](UpdateTaskRequest.md)| An Update Task Request object containing updated fields.  Make sure to specify the Task Id in the request object so that ChronoSheets knows which Task to update |

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

