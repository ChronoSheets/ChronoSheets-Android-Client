/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A project in ChronoSheets
 **/
@ApiModel(description = "A project in ChronoSheets")
public class Project {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("CostEstimation")
  private Double costEstimation = null;
  @SerializedName("CostActual")
  private Double costActual = null;
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;

  /**
   * The ID of the project
   **/
  @ApiModelProperty(value = "The ID of the project")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The ID of the client for which the project is being undertaken for
   **/
  @ApiModelProperty(value = "The ID of the client for which the project is being undertaken for")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   * The ID of the organisation that is completing the project
   **/
  @ApiModelProperty(value = "The ID of the organisation that is completing the project")
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  /**
   * A descriptive name of the project
   **/
  @ApiModelProperty(value = "A descriptive name of the project")
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  /**
   * The project's estimated cost
   **/
  @ApiModelProperty(value = "The project's estimated cost")
  public Double getCostEstimation() {
    return costEstimation;
  }
  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }

  /**
   * The project's actual cost
   **/
  @ApiModelProperty(value = "The project's actual cost")
  public Double getCostActual() {
    return costActual;
  }
  public void setCostActual(Double costActual) {
    this.costActual = costActual;
  }

  /**
   * The start date and time of the project
   **/
  @ApiModelProperty(value = "The start date and time of the project")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * The end date and time of the project
   **/
  @ApiModelProperty(value = "The end date and time of the project")
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
    Project project = (Project) o;
    return (this.id == null ? project.id == null : this.id.equals(project.id)) &&
        (this.clientId == null ? project.clientId == null : this.clientId.equals(project.clientId)) &&
        (this.organisationId == null ? project.organisationId == null : this.organisationId.equals(project.organisationId)) &&
        (this.projectName == null ? project.projectName == null : this.projectName.equals(project.projectName)) &&
        (this.costEstimation == null ? project.costEstimation == null : this.costEstimation.equals(project.costEstimation)) &&
        (this.costActual == null ? project.costActual == null : this.costActual.equals(project.costActual)) &&
        (this.startDate == null ? project.startDate == null : this.startDate.equals(project.startDate)) &&
        (this.endDate == null ? project.endDate == null : this.endDate.equals(project.endDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.costEstimation == null ? 0: this.costEstimation.hashCode());
    result = 31 * result + (this.costActual == null ? 0: this.costActual.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  costEstimation: ").append(costEstimation).append("\n");
    sb.append("  costActual: ").append(costActual).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
