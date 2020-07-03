# TranscriptsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptsGetMyTranscript**](TranscriptsApi.md#transcriptsGetMyTranscript) | **GET** /Transcripts/GetMyTranscript | Get an audio to text transcript for a particular audio file attachment
[**transcriptsGetMyTranscripts**](TranscriptsApi.md#transcriptsGetMyTranscripts) | **GET** /Transcripts/GetMyTranscripts | Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.



## transcriptsGetMyTranscript

> ApiResponseTranscription transcriptsGetMyTranscript(fileAttachmentId, xChronosheetsAuth)

Get an audio to text transcript for a particular audio file attachment

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TranscriptsApi;

TranscriptsApi apiInstance = new TranscriptsApi();
Integer fileAttachmentId = null; // Integer | The ID of the file attachment that has a transcript.  It should be an audio file attachment.
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseTranscription result = apiInstance.transcriptsGetMyTranscript(fileAttachmentId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptsApi#transcriptsGetMyTranscript");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileAttachmentId** | **Integer**| The ID of the file attachment that has a transcript.  It should be an audio file attachment. | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseTranscription**](ApiResponseTranscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## transcriptsGetMyTranscripts

> ApiResponseForPaginatedListOrgReportTranscript transcriptsGetMyTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, keyword)

Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.TranscriptsApi;

TranscriptsApi apiInstance = new TranscriptsApi();
Date startDate = null; // Date | The Start date of the date range.  Transcripts after this date will be obtained.
Date endDate = null; // Date | The End date of the date range.  Transcripts before this date will be obtained.
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Skip this many transcripts
Integer take = null; // Integer | Take this many transcripts
String keyword = null; // String | Search the text content of the transcript keywords
try {
    ApiResponseForPaginatedListOrgReportTranscript result = apiInstance.transcriptsGetMyTranscripts(startDate, endDate, xChronosheetsAuth, skip, take, keyword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptsApi#transcriptsGetMyTranscripts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The Start date of the date range.  Transcripts after this date will be obtained. | [default to null]
 **endDate** | **Date**| The End date of the date range.  Transcripts before this date will be obtained. | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Skip this many transcripts | [optional] [default to null]
 **take** | **Integer**| Take this many transcripts | [optional] [default to null]
 **keyword** | **String**| Search the text content of the transcript keywords | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListOrgReportTranscript**](ApiResponseForPaginatedListOrgReportTranscript.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

