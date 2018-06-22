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

package ChronoSheetsClientLibModel;

import ChronoSheetsClientLibModel.CsApiProjectCostingReportItem;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CsApiApiResponseListProjectCostingReportItem {
  
  @SerializedName("Data")
  private List<CsApiProjectCostingReportItem> data = null;
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
  public List<CsApiProjectCostingReportItem> getData() {
    return data;
  }
  public void setData(List<CsApiProjectCostingReportItem> data) {
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
    CsApiApiResponseListProjectCostingReportItem apiResponseListProjectCostingReportItem = (CsApiApiResponseListProjectCostingReportItem) o;
    return (this.data == null ? apiResponseListProjectCostingReportItem.data == null : this.data.equals(apiResponseListProjectCostingReportItem.data)) &&
        (this.status == null ? apiResponseListProjectCostingReportItem.status == null : this.status.equals(apiResponseListProjectCostingReportItem.status)) &&
        (this.message == null ? apiResponseListProjectCostingReportItem.message == null : this.message.equals(apiResponseListProjectCostingReportItem.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiApiResponseListProjectCostingReportItem {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
