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

import ChronoSheetsClientLibModel.CsApiApiResponseBoolean;
import ChronoSheetsClientLibModel.CsApiApiResponseInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseJobCode;
import ChronoSheetsClientLibModel.CsApiApiResponseListJobCode;
import ChronoSheetsClientLibModel.CsApiInsertJobCodeRequest;
import ChronoSheetsClientLibModel.CsApiUpdateJobCodeRequest;

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
  * Create a job code
  * 
   * @param request 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseInt32
  */
  public CsApiApiResponseInt32 jobCodesCreateJobCode (CsApiInsertJobCodeRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
   * Create a job code
   * 
   * @param request    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesCreateJobCode (CsApiInsertJobCodeRequest request, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseInt32> responseListener, final Response.ErrorListener errorListener) {
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
  * Delete a job code
  * 
   * @param jobCodeId The ID of the job code your want to delete
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseBoolean
  */
  public CsApiApiResponseBoolean jobCodesDeleteJobCode (Integer jobCodeId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
   * Delete a job code
   * 
   * @param jobCodeId The ID of the job code your want to delete   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesDeleteJobCode (Integer jobCodeId, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseBoolean> responseListener, final Response.ErrorListener errorListener) {
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
  * Get a particular job code by job code id
  * 
   * @param jobCodeId 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseJobCode
  */
  public CsApiApiResponseJobCode jobCodesGetJobCodeById (Integer jobCodeId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
         return (CsApiApiResponseJobCode) ApiInvoker.deserialize(localVarResponse, "", CsApiApiResponseJobCode.class);
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
   * Get a particular job code by job code id
   * 
   * @param jobCodeId    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesGetJobCodeById (Integer jobCodeId, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseJobCode> responseListener, final Response.ErrorListener errorListener) {
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
              responseListener.onResponse((CsApiApiResponseJobCode) ApiInvoker.deserialize(localVarResponse,  "", CsApiApiResponseJobCode.class));
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
  * Get job codes for your organisation
  * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseListJobCode
  */
  public CsApiApiResponseListJobCode jobCodesGetJobCodes (String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
         return (CsApiApiResponseListJobCode) ApiInvoker.deserialize(localVarResponse, "", CsApiApiResponseListJobCode.class);
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
   * Get job codes for your organisation
   * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesGetJobCodes (String xChronosheetsAuth, final Response.Listener<CsApiApiResponseListJobCode> responseListener, final Response.ErrorListener errorListener) {
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
              responseListener.onResponse((CsApiApiResponseListJobCode) ApiInvoker.deserialize(localVarResponse,  "", CsApiApiResponseListJobCode.class));
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
  * Update a job code
  * 
   * @param request 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CsApiApiResponseBoolean
  */
  public CsApiApiResponseBoolean jobCodesUpdateJobCode (CsApiUpdateJobCodeRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
   * Update a job code
   * 
   * @param request    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void jobCodesUpdateJobCode (CsApiUpdateJobCodeRequest request, String xChronosheetsAuth, final Response.Listener<CsApiApiResponseBoolean> responseListener, final Response.ErrorListener errorListener) {
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
}
