/**
 * ChronoSheets API
 * An API for integrating into ChronoSheets timesheets
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
public class CsApiProject {
  
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
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
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
    CsApiProject project = (CsApiProject) o;
    return (this.id == null ? project.id == null : this.id.equals(project.id)) &&
        (this.clientId == null ? project.clientId == null : this.clientId.equals(project.clientId)) &&
        (this.organisationId == null ? project.organisationId == null : this.organisationId.equals(project.organisationId)) &&
        (this.projectName == null ? project.projectName == null : this.projectName.equals(project.projectName)) &&
        (this.costEstimation == null ? project.costEstimation == null : this.costEstimation.equals(project.costEstimation)) &&
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
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiProject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  costEstimation: ").append(costEstimation).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
