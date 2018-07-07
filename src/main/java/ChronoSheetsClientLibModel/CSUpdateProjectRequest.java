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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Fields for updating a project
 **/
@ApiModel(description = "Fields for updating a project")
public class CSUpdateProjectRequest {
  
  @SerializedName("ProjectId")
  private Integer projectId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("CostEstimation")
  private Double costEstimation = null;
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;

  /**
   * The Id of the Project that is to be updated
   **/
  @ApiModelProperty(value = "The Id of the Project that is to be updated")
  public Integer getProjectId() {
    return projectId;
  }
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  /**
   * The new name of the Project
   **/
  @ApiModelProperty(value = "The new name of the Project")
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  /**
   * The updated estimated cost of the Project
   **/
  @ApiModelProperty(value = "The updated estimated cost of the Project")
  public Double getCostEstimation() {
    return costEstimation;
  }
  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }

  /**
   * The updated project start date
   **/
  @ApiModelProperty(value = "The updated project start date")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * The update project end date
   **/
  @ApiModelProperty(value = "The update project end date")
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
    CSUpdateProjectRequest updateProjectRequest = (CSUpdateProjectRequest) o;
    return (this.projectId == null ? updateProjectRequest.projectId == null : this.projectId.equals(updateProjectRequest.projectId)) &&
        (this.projectName == null ? updateProjectRequest.projectName == null : this.projectName.equals(updateProjectRequest.projectName)) &&
        (this.costEstimation == null ? updateProjectRequest.costEstimation == null : this.costEstimation.equals(updateProjectRequest.costEstimation)) &&
        (this.startDate == null ? updateProjectRequest.startDate == null : this.startDate.equals(updateProjectRequest.startDate)) &&
        (this.endDate == null ? updateProjectRequest.endDate == null : this.endDate.equals(updateProjectRequest.endDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.costEstimation == null ? 0: this.costEstimation.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateProjectRequest {\n");
    
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  costEstimation: ").append(costEstimation).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
