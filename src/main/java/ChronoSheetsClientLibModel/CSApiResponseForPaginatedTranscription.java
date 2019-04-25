/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import ChronoSheetsClientLibModel.CSTranscription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSApiResponseForPaginatedTranscription {
  
  @SerializedName("TotalSetCount")
  private Integer totalSetCount = null;
  @SerializedName("Data")
  private CSTranscription data = null;
  public enum StatusEnum {
     Succeeded,  FatalException,  GeneralError,  ValidationError,  UnAuthorized,  SessionExpired, 
  };
  @SerializedName("Status")
  private StatusEnum status = null;
  @SerializedName("Message")
  private String message = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalSetCount() {
    return totalSetCount;
  }
  public void setTotalSetCount(Integer totalSetCount) {
    this.totalSetCount = totalSetCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CSTranscription getData() {
    return data;
  }
  public void setData(CSTranscription data) {
    this.data = data;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    CSApiResponseForPaginatedTranscription apiResponseForPaginatedTranscription = (CSApiResponseForPaginatedTranscription) o;
    return (this.totalSetCount == null ? apiResponseForPaginatedTranscription.totalSetCount == null : this.totalSetCount.equals(apiResponseForPaginatedTranscription.totalSetCount)) &&
        (this.data == null ? apiResponseForPaginatedTranscription.data == null : this.data.equals(apiResponseForPaginatedTranscription.data)) &&
        (this.status == null ? apiResponseForPaginatedTranscription.status == null : this.status.equals(apiResponseForPaginatedTranscription.status)) &&
        (this.message == null ? apiResponseForPaginatedTranscription.message == null : this.message.equals(apiResponseForPaginatedTranscription.message));
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
    sb.append("class CSApiResponseForPaginatedTranscription {\n");
    
    sb.append("  totalSetCount: ").append(totalSetCount).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}