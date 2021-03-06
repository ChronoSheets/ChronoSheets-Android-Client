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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSProjectCostingReportItem {
  
  @SerializedName("ProjectId")
  private Integer projectId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("ClientName")
  private String clientName = null;
  @SerializedName("EstimatedCost")
  private Double estimatedCost = null;
  @SerializedName("ActualCostFiltered")
  private Double actualCostFiltered = null;
  @SerializedName("ActualCost")
  private Double actualCost = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getProjectId() {
    return projectId;
  }
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
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
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientName() {
    return clientName;
  }
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getEstimatedCost() {
    return estimatedCost;
  }
  public void setEstimatedCost(Double estimatedCost) {
    this.estimatedCost = estimatedCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getActualCostFiltered() {
    return actualCostFiltered;
  }
  public void setActualCostFiltered(Double actualCostFiltered) {
    this.actualCostFiltered = actualCostFiltered;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getActualCost() {
    return actualCost;
  }
  public void setActualCost(Double actualCost) {
    this.actualCost = actualCost;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSProjectCostingReportItem projectCostingReportItem = (CSProjectCostingReportItem) o;
    return (this.projectId == null ? projectCostingReportItem.projectId == null : this.projectId.equals(projectCostingReportItem.projectId)) &&
        (this.projectName == null ? projectCostingReportItem.projectName == null : this.projectName.equals(projectCostingReportItem.projectName)) &&
        (this.clientId == null ? projectCostingReportItem.clientId == null : this.clientId.equals(projectCostingReportItem.clientId)) &&
        (this.organisationId == null ? projectCostingReportItem.organisationId == null : this.organisationId.equals(projectCostingReportItem.organisationId)) &&
        (this.clientName == null ? projectCostingReportItem.clientName == null : this.clientName.equals(projectCostingReportItem.clientName)) &&
        (this.estimatedCost == null ? projectCostingReportItem.estimatedCost == null : this.estimatedCost.equals(projectCostingReportItem.estimatedCost)) &&
        (this.actualCostFiltered == null ? projectCostingReportItem.actualCostFiltered == null : this.actualCostFiltered.equals(projectCostingReportItem.actualCostFiltered)) &&
        (this.actualCost == null ? projectCostingReportItem.actualCost == null : this.actualCost.equals(projectCostingReportItem.actualCost));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.clientName == null ? 0: this.clientName.hashCode());
    result = 31 * result + (this.estimatedCost == null ? 0: this.estimatedCost.hashCode());
    result = 31 * result + (this.actualCostFiltered == null ? 0: this.actualCostFiltered.hashCode());
    result = 31 * result + (this.actualCost == null ? 0: this.actualCost.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSProjectCostingReportItem {\n");
    
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  clientName: ").append(clientName).append("\n");
    sb.append("  estimatedCost: ").append(estimatedCost).append("\n");
    sb.append("  actualCostFiltered: ").append(actualCostFiltered).append("\n");
    sb.append("  actualCost: ").append(actualCost).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
