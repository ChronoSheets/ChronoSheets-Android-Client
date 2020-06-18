/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
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

import ChronoSheetsClientLibModel.CSApiResponseForPaginatedListExtendedGeofence;
import ChronoSheetsClientLibModel.CSApiResponseGeofence;
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSCreateGeoFenceRequest;
import ChronoSheetsClientLibModel.CSUpdateGeoFenceRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class GeoFencingApi {
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
  * Create a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
  * 
   * @param request 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseInt32
  */
  public CSApiResponseInt32 geoFencingCreateGeofence (CSCreateGeoFenceRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling geoFencingCreateGeofence",
        new ApiException(400, "Missing the required parameter 'request' when calling geoFencingCreateGeofence"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingCreateGeofence",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingCreateGeofence"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/CreateGeofence";

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
   * Create a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
   * 
   * @param request    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void geoFencingCreateGeofence (CSCreateGeoFenceRequest request, String xChronosheetsAuth, final Response.Listener<CSApiResponseInt32> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling geoFencingCreateGeofence",
        new ApiException(400, "Missing the required parameter 'request' when calling geoFencingCreateGeofence"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingCreateGeofence",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingCreateGeofence"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/CreateGeofence".replaceAll("\\{format\\}","json");

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
  * Deletes a geofence.  Requires the &#39;ManageGeofencing&#39; permission.
  * 
   * @param geofenceId Specify the geofence you want to delete with the geofence ID.
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseGeofence
  */
  public CSApiResponseGeofence geoFencingDeleteGeofence (Integer geofenceId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'geofenceId' is set
    if (geofenceId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'geofenceId' when calling geoFencingDeleteGeofence",
        new ApiException(400, "Missing the required parameter 'geofenceId' when calling geoFencingDeleteGeofence"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingDeleteGeofence",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingDeleteGeofence"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/DeleteGeofence";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "GeofenceId", geofenceId));
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
         return (CSApiResponseGeofence) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseGeofence.class);
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
   * Deletes a geofence.  Requires the &#39;ManageGeofencing&#39; permission.
   * 
   * @param geofenceId Specify the geofence you want to delete with the geofence ID.   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void geoFencingDeleteGeofence (Integer geofenceId, String xChronosheetsAuth, final Response.Listener<CSApiResponseGeofence> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'geofenceId' is set
    if (geofenceId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'geofenceId' when calling geoFencingDeleteGeofence",
        new ApiException(400, "Missing the required parameter 'geofenceId' when calling geoFencingDeleteGeofence"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingDeleteGeofence",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingDeleteGeofence"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/DeleteGeofence".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "GeofenceId", geofenceId));

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
              responseListener.onResponse((CSApiResponseGeofence) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseGeofence.class));
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
  * Get a geofence by ID  Requires the &#39;SubmitTimesheets&#39; permission.
  * 
   * @param geofenceId The ID of the geofence you want to obtain
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseGeofence
  */
  public CSApiResponseGeofence geoFencingGetGeofenceById (Integer geofenceId, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'geofenceId' is set
    if (geofenceId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'geofenceId' when calling geoFencingGetGeofenceById",
        new ApiException(400, "Missing the required parameter 'geofenceId' when calling geoFencingGetGeofenceById"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofenceById",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofenceById"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/GetGeofenceById";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "GeofenceId", geofenceId));
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
         return (CSApiResponseGeofence) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseGeofence.class);
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
   * Get a geofence by ID  Requires the &#39;SubmitTimesheets&#39; permission.
   * 
   * @param geofenceId The ID of the geofence you want to obtain   * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void geoFencingGetGeofenceById (Integer geofenceId, String xChronosheetsAuth, final Response.Listener<CSApiResponseGeofence> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'geofenceId' is set
    if (geofenceId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'geofenceId' when calling geoFencingGetGeofenceById",
        new ApiException(400, "Missing the required parameter 'geofenceId' when calling geoFencingGetGeofenceById"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofenceById",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofenceById"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/GetGeofenceById".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "GeofenceId", geofenceId));

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
              responseListener.onResponse((CSApiResponseGeofence) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseGeofence.class));
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
  * Get geofences belonging to your organisation  Requires the &#39;SubmitTimesheets&#39; permission.
  * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @param skip Number of records to skip
   * @param take Number of records to take
   * @return CSApiResponseForPaginatedListExtendedGeofence
  */
  public CSApiResponseForPaginatedListExtendedGeofence geoFencingGetGeofences (String xChronosheetsAuth, Integer skip, Integer take) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofences",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofences"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/GetGeofences";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Skip", skip));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Take", take));
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
         return (CSApiResponseForPaginatedListExtendedGeofence) ApiInvoker.deserialize(localVarResponse, "", CSApiResponseForPaginatedListExtendedGeofence.class);
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
   * Get geofences belonging to your organisation  Requires the &#39;SubmitTimesheets&#39; permission.
   * 
   * @param xChronosheetsAuth The ChronoSheets Auth Token   * @param skip Number of records to skip   * @param take Number of records to take
  */
  public void geoFencingGetGeofences (String xChronosheetsAuth, Integer skip, Integer take, final Response.Listener<CSApiResponseForPaginatedListExtendedGeofence> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofences",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingGetGeofences"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/GetGeofences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "Skip", skip));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Take", take));

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
              responseListener.onResponse((CSApiResponseForPaginatedListExtendedGeofence) ApiInvoker.deserialize(localVarResponse,  "", CSApiResponseForPaginatedListExtendedGeofence.class));
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
  * Updates a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
  * 
   * @param request 
   * @param xChronosheetsAuth The ChronoSheets Auth Token
   * @return CSApiResponseInt32
  */
  public CSApiResponseInt32 geoFencingUpdateGeofence (CSUpdateGeoFenceRequest request, String xChronosheetsAuth) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling geoFencingUpdateGeofence",
        new ApiException(400, "Missing the required parameter 'request' when calling geoFencingUpdateGeofence"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingUpdateGeofence",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingUpdateGeofence"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/UpdateGeofence";

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
   * Updates a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
   * 
   * @param request    * @param xChronosheetsAuth The ChronoSheets Auth Token
  */
  public void geoFencingUpdateGeofence (CSUpdateGeoFenceRequest request, String xChronosheetsAuth, final Response.Listener<CSApiResponseInt32> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling geoFencingUpdateGeofence",
        new ApiException(400, "Missing the required parameter 'request' when calling geoFencingUpdateGeofence"));
    }
    // verify the required parameter 'xChronosheetsAuth' is set
    if (xChronosheetsAuth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xChronosheetsAuth' when calling geoFencingUpdateGeofence",
        new ApiException(400, "Missing the required parameter 'xChronosheetsAuth' when calling geoFencingUpdateGeofence"));
    }

    // create path and map variables
    String path = "/api/GeoFencing/UpdateGeofence".replaceAll("\\{format\\}","json");

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
}
