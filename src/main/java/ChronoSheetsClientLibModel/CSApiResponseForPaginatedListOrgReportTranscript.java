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

package ChronoSheetsClientLibModel;

import ChronoSheetsClientLibModel.CSOrgReportTranscript;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A paginated API repsonse
 **/
@ApiModel(description = "A paginated API repsonse")
public class CSApiResponseForPaginatedListOrgReportTranscript {
  
  @SerializedName("TotalSetCount")
  private Integer totalSetCount = null;
  @SerializedName("Data")
  private List<CSOrgReportTranscript> data = null;
  public enum StatusEnum {
     Succeeded,  FatalException,  GeneralError,  ValidationError,  UnAuthorized,  SessionExpired, 
  };
  @SerializedName("Status")
  private StatusEnum status = null;
  @SerializedName("Message")
  private String message = null;

  /**
   * The count of total records that are being paginated
   **/
  @ApiModelProperty(value = "The count of total records that are being paginated")
  public Integer getTotalSetCount() {
    return totalSetCount;
  }
  public void setTotalSetCount(Integer totalSetCount) {
    this.totalSetCount = totalSetCount;
  }

  /**
   * The main Data of the response
   **/
  @ApiModelProperty(value = "The main Data of the response")
  public List<CSOrgReportTranscript> getData() {
    return data;
  }
  public void setData(List<CSOrgReportTranscript> data) {
    this.data = data;
  }

  /**
   * The API response status. Indicates if the request was successful, failed or was unauthorised.
   **/
  @ApiModelProperty(value = "The API response status. Indicates if the request was successful, failed or was unauthorised.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.
   **/
  @ApiModelProperty(value = "A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSApiResponseForPaginatedListOrgReportTranscript apiResponseForPaginatedListOrgReportTranscript = (CSApiResponseForPaginatedListOrgReportTranscript) o;
    return (this.totalSetCount == null ? apiResponseForPaginatedListOrgReportTranscript.totalSetCount == null : this.totalSetCount.equals(apiResponseForPaginatedListOrgReportTranscript.totalSetCount)) &&
        (this.data == null ? apiResponseForPaginatedListOrgReportTranscript.data == null : this.data.equals(apiResponseForPaginatedListOrgReportTranscript.data)) &&
        (this.status == null ? apiResponseForPaginatedListOrgReportTranscript.status == null : this.status.equals(apiResponseForPaginatedListOrgReportTranscript.status)) &&
        (this.message == null ? apiResponseForPaginatedListOrgReportTranscript.message == null : this.message.equals(apiResponseForPaginatedListOrgReportTranscript.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.totalSetCount == null ? 0: this.totalSetCount.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSApiResponseForPaginatedListOrgReportTranscript {\n");
    
    sb.append("  totalSetCount: ").append(totalSetCount).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
