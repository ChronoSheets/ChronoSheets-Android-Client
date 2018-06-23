/**
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiInvoker;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.Pair;

import ChronoSheetsClientLibModel.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import ChronoSheetsClientLibModel.CsApiApiResponseBoolean;
import ChronoSheetsClientLibModel.CsApiApiResponseInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseListInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseListTimesheet;
import ChronoSheetsClientLibModel.CsApiBatchUpdateTimesheetRequest;
import ChronoSheetsClientLibModel.CsApiTimesheet;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class TimesheetsApi {
  String basePath = "https://www.chronosheets.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Delete a timesheet
  * 
   * @param timesheetId The ID of the timesheet to delete
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseBoolean
  */
  public CsApiApiResponseBoolean timesheetsDeleteTimesheet (Integer timesheetId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'timesheetId' is set
    if (timesheetId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timesheetId' when calling timesheetsDeleteTimesheet",
        new ApiException(400, "Missing the required parameter 'timesheetId' when calling timesheetsDeleteTimesheet"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsDeleteTimesheet",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsDeleteTimesheet"));
    }

    // create path and map variables
    String path = "/api/Timesheets/DeleteTimesheet";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "TimesheetId", timesheetId));
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CsApiApiResponseBoolean) ApiInvoker.deserialize(localVarResponse, "", CsApiApiResponseBoolean.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Delete a timesheet
   * 
   * @param timesheetId The ID of the timesheet to delete   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void timesheetsDeleteTimesheet (Integer timesheetId, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseBoolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'timesheetId' is set
    if (timesheetId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timesheetId' when calling timesheetsDeleteTimesheet",
        new ApiException(400, "Missing the required parameter 'timesheetId' when calling timesheetsDeleteTimesheet"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsDeleteTimesheet",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsDeleteTimesheet"));
    }

    // create path and map variables
    String path = "/api/Timesheets/DeleteTimesheet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "TimesheetId", timesheetId));

    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CsApiApiResponseBoolean) ApiInvoker.deserialize(localVarResponse,  "", CsApiApiResponseBoolean.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get timesheets between start and end dates
  * 
   * @param startDate The start date of the date range
   * @param endDate The end date of the date range
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseListTimesheet
  */
  public CsApiApiResponseListTimesheet timesheetsGetTimesheets (Date startDate, Date endDate, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling timesheetsGetTimesheets",
        new ApiException(400, "Missing the required parameter 'startDate' when calling timesheetsGetTimesheets"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling timesheetsGetTimesheets",
        new ApiException(400, "Missing the required parameter 'endDate' when calling timesheetsGetTimesheets"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsGetTimesheets",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsGetTimesheets"));
    }

    // create path and map variables
    String path = "/api/Timesheets/GetTimesheets";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "StartDate", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "EndDate", endDate));
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CsApiApiResponseListTimesheet) ApiInvoker.deserialize(localVarResponse, "", CsApiApiResponseListTimesheet.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get timesheets between start and end dates
   * 
   * @param startDate The start date of the date range   * @param endDate The end date of the date range   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void timesheetsGetTimesheets (Date startDate, Date endDate, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseListTimesheet> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling timesheetsGetTimesheets",
        new ApiException(400, "Missing the required parameter 'startDate' when calling timesheetsGetTimesheets"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling timesheetsGetTimesheets",
        new ApiException(400, "Missing the required parameter 'endDate' when calling timesheetsGetTimesheets"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsGetTimesheets",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsGetTimesheets"));
    }

    // create path and map variables
    String path = "/api/Timesheets/GetTimesheets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "StartDate", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "EndDate", endDate));

    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CsApiApiResponseListTimesheet) ApiInvoker.deserialize(localVarResponse,  "", CsApiApiResponseListTimesheet.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Inserts a single timesheet record
  * 
   * @param request The timesheet request object
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseInt32
  */
  public CsApiApiResponseInt32 timesheetsInsertSingleTimesheet (CsApiTimesheet request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling timesheetsInsertSingleTimesheet",
        new ApiException(400, "Missing the required parameter 'request' when calling timesheetsInsertSingleTimesheet"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsInsertSingleTimesheet",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsInsertSingleTimesheet"));
    }

    // create path and map variables
    String path = "/api/Timesheets/InsertSingleTimesheet";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded",
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CsApiApiResponseInt32) ApiInvoker.deserialize(localVarResponse, "", CsApiApiResponseInt32.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Inserts a single timesheet record
   * 
   * @param request The timesheet request object   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void timesheetsInsertSingleTimesheet (CsApiTimesheet request, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseInt32> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling timesheetsInsertSingleTimesheet",
        new ApiException(400, "Missing the required parameter 'request' when calling timesheetsInsertSingleTimesheet"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsInsertSingleTimesheet",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsInsertSingleTimesheet"));
    }

    // create path and map variables
    String path = "/api/Timesheets/InsertSingleTimesheet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded","multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CsApiApiResponseInt32) ApiInvoker.deserialize(localVarResponse,  "", CsApiApiResponseInt32.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Batch update timesheets
  * 
   * @param request The batch update timesheets request
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseListInt32
  */
  public CsApiApiResponseListInt32 timesheetsUpdateTimesheets (CsApiBatchUpdateTimesheetRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling timesheetsUpdateTimesheets",
        new ApiException(400, "Missing the required parameter 'request' when calling timesheetsUpdateTimesheets"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsUpdateTimesheets",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsUpdateTimesheets"));
    }

    // create path and map variables
    String path = "/api/Timesheets/UpdateTimesheets";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded",
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CsApiApiResponseListInt32) ApiInvoker.deserialize(localVarResponse, "", CsApiApiResponseListInt32.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Batch update timesheets
   * 
   * @param request The batch update timesheets request   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void timesheetsUpdateTimesheets (CsApiBatchUpdateTimesheetRequest request, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseListInt32> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling timesheetsUpdateTimesheets",
        new ApiException(400, "Missing the required parameter 'request' when calling timesheetsUpdateTimesheets"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling timesheetsUpdateTimesheets",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling timesheetsUpdateTimesheets"));
    }

    // create path and map variables
    String path = "/api/Timesheets/UpdateTimesheets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("x-chronosheets-auth", ApiInvoker.parameterToString(xChronosheetsAuth));

    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded","multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CsApiApiResponseListInt32) ApiInvoker.deserialize(localVarResponse,  "", CsApiApiResponseListInt32.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
