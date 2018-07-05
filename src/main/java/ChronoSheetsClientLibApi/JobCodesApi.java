/**
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
 *
 * OpenAPI spec version: v1
 * Contact: lachlan@chronosheets.com
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

import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSApiResponseJobCode;
import ChronoSheetsClientLibModel.CSApiResponseListJobCode;
import ChronoSheetsClientLibModel.CSInsertJobCodeRequest;
import ChronoSheetsClientLibModel.CSUpdateJobCodeRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class JobCodesApi {
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
  * Create a job code.  Requires the &#39;ManageJobsAndTask&#39; permission.
  * 
   * @param request An Insert JobCode Request object containing values for the new JobCode to create
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseInt32
  */
  public CSApiResponseInt32 jobCodesCreateJobCode (CSInsertJobCodeRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling jobCodesCreateJobCode",
        new ApiException(400, "Missing the required parameter 'request' when calling jobCodesCreateJobCode"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesCreateJobCode",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesCreateJobCode"));
    }

    // create path and map variables
    String path = "/api/JobCodes/CreateJobCode";

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
         return (CSApiResponseInt32) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseInt32.class);
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
   * Create a job code.  Requires the &#39;ManageJobsAndTask&#39; permission.
   * 
   * @param request An Insert JobCode Request object containing values for the new JobCode to create   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesCreateJobCode (CSInsertJobCodeRequest request, String xChronosheetsAuth, final Response.Listener<CSApiResponseInt32> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling jobCodesCreateJobCode",
        new ApiException(400, "Missing the required parameter 'request' when calling jobCodesCreateJobCode"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesCreateJobCode",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesCreateJobCode"));
    }

    // create path and map variables
    String path = "/api/JobCodes/CreateJobCode".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((CSApiResponseInt32) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseInt32.class));
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
  * Delete a job code.  Requires the &#39;ManageJobsAndTask&#39; permission.
  * 
   * @param jobCodeId The ID of the job code you want to delete
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseBoolean
  */
  public CSApiResponseBoolean jobCodesDeleteJobCode (Integer jobCodeId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'jobCodeId' is set
    if (jobCodeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'jobCodeId' when calling jobCodesDeleteJobCode",
        new ApiException(400, "Missing the required parameter 'jobCodeId' when calling jobCodesDeleteJobCode"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesDeleteJobCode",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesDeleteJobCode"));
    }

    // create path and map variables
    String path = "/api/JobCodes/DeleteJobCode";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "JobCodeId", jobCodeId));
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
         return (CSApiResponseBoolean) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseBoolean.class);
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
   * Delete a job code.  Requires the &#39;ManageJobsAndTask&#39; permission.
   * 
   * @param jobCodeId The ID of the job code you want to delete   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesDeleteJobCode (Integer jobCodeId, String xChronosheetsAuth, final Response.Listener<CSApiResponseBoolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'jobCodeId' is set
    if (jobCodeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'jobCodeId' when calling jobCodesDeleteJobCode",
        new ApiException(400, "Missing the required parameter 'jobCodeId' when calling jobCodesDeleteJobCode"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesDeleteJobCode",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesDeleteJobCode"));
    }

    // create path and map variables
    String path = "/api/JobCodes/DeleteJobCode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "JobCodeId", jobCodeId));

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
              responseListener.onResponse((CSApiResponseBoolean) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseBoolean.class));
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
  * Get a particular job code by job code id.  Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
  * 
   * @param jobCodeId The ID of the JobCode you want to get
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseJobCode
  */
  public CSApiResponseJobCode jobCodesGetJobCodeById (Integer jobCodeId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'jobCodeId' is set
    if (jobCodeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'jobCodeId' when calling jobCodesGetJobCodeById",
        new ApiException(400, "Missing the required parameter 'jobCodeId' when calling jobCodesGetJobCodeById"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodeById",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodeById"));
    }

    // create path and map variables
    String path = "/api/JobCodes/GetJobCodeById";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "JobCodeId", jobCodeId));
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
         return (CSApiResponseJobCode) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseJobCode.class);
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
   * Get a particular job code by job code id.  Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
   * 
   * @param jobCodeId The ID of the JobCode you want to get   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesGetJobCodeById (Integer jobCodeId, String xChronosheetsAuth, final Response.Listener<CSApiResponseJobCode> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'jobCodeId' is set
    if (jobCodeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'jobCodeId' when calling jobCodesGetJobCodeById",
        new ApiException(400, "Missing the required parameter 'jobCodeId' when calling jobCodesGetJobCodeById"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodeById",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodeById"));
    }

    // create path and map variables
    String path = "/api/JobCodes/GetJobCodeById".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "JobCodeId", jobCodeId));

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
              responseListener.onResponse((CSApiResponseJobCode) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseJobCode.class));
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
  * Get job codes for your organisation.  Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
  * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseListJobCode
  */
  public CSApiResponseListJobCode jobCodesGetJobCodes (String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodes",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodes"));
    }

    // create path and map variables
    String path = "/api/JobCodes/GetJobCodes";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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
         return (CSApiResponseListJobCode) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseListJobCode.class);
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
   * Get job codes for your organisation.  Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
   * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesGetJobCodes (String xChronosheetsAuth, final Response.Listener<CSApiResponseListJobCode> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodes",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodes"));
    }

    // create path and map variables
    String path = "/api/JobCodes/GetJobCodes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


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
              responseListener.onResponse((CSApiResponseListJobCode) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseListJobCode.class));
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
  * Update a job code.  Requires the &#39;ManageJobsAndTask&#39; permission.
  * 
   * @param request A Update JobCode Request object containing updated fields.  Make sure to specify the JobCode Id in the request object so that ChronoSheets knows which JobCode to update
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseBoolean
  */
  public CSApiResponseBoolean jobCodesUpdateJobCode (CSUpdateJobCodeRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling jobCodesUpdateJobCode",
        new ApiException(400, "Missing the required parameter 'request' when calling jobCodesUpdateJobCode"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesUpdateJobCode",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesUpdateJobCode"));
    }

    // create path and map variables
    String path = "/api/JobCodes/UpdateJobCode";

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
         return (CSApiResponseBoolean) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseBoolean.class);
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
   * Update a job code.  Requires the &#39;ManageJobsAndTask&#39; permission.
   * 
   * @param request A Update JobCode Request object containing updated fields.  Make sure to specify the JobCode Id in the request object so that ChronoSheets knows which JobCode to update   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesUpdateJobCode (CSUpdateJobCodeRequest request, String xChronosheetsAuth, final Response.Listener<CSApiResponseBoolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling jobCodesUpdateJobCode",
        new ApiException(400, "Missing the required parameter 'request' when calling jobCodesUpdateJobCode"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesUpdateJobCode",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling jobCodesUpdateJobCode"));
    }

    // create path and map variables
    String path = "/api/JobCodes/UpdateJobCode".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((CSApiResponseBoolean) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseBoolean.class));
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
