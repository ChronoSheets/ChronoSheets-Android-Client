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

package ChronoSheetsClientLibModel;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSInsertProjectRequest {
  
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("CostEstimation")
  private Double costEstimation = null;
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCostEstimation() {
    return costEstimation;
  }
  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertProjectRequest insertProjectRequest = (CSInsertProjectRequest) o;
    return (this.clientId == null ? insertProjectRequest.clientId == null : this.clientId.equals(insertProjectRequest.clientId)) &&
        (this.projectName == null ? insertProjectRequest.projectName == null : this.projectName.equals(insertProjectRequest.projectName)) &&
        (this.costEstimation == null ? insertProjectRequest.costEstimation == null : this.costEstimation.equals(insertProjectRequest.costEstimation)) &&
        (this.startDate == null ? insertProjectRequest.startDate == null : this.startDate.equals(insertProjectRequest.startDate)) &&
        (this.endDate == null ? insertProjectRequest.endDate == null : this.endDate.equals(insertProjectRequest.endDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.costEstimation == null ? 0: this.costEstimation.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertProjectRequest {\n");
    
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  costEstimation: ").append(costEstimation).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}