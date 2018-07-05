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

import ChronoSheetsClientLibModel.CSAggregateJobTask;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSAggregateJobCode {
  
  @SerializedName("AvailableTasks")
  private List<CSAggregateJobTask> availableTasks = null;
  @SerializedName("PermittedEmployees")
  private List<Integer> permittedEmployees = null;
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("Code")
  private String code = null;
  @SerializedName("Client")
  private String client = null;
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("Project")
  private String project = null;
  @SerializedName("ProjectId")
  private Integer projectId = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSAggregateJobTask> getAvailableTasks() {
    return availableTasks;
  }
  public void setAvailableTasks(List<CSAggregateJobTask> availableTasks) {
    this.availableTasks = availableTasks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getPermittedEmployees() {
    return permittedEmployees;
  }
  public void setPermittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
  }

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
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
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
  public String getProject() {
    return project;
  }
  public void setProject(String project) {
    this.project = project;
  }

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
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSAggregateJobCode aggregateJobCode = (CSAggregateJobCode) o;
    return (this.availableTasks == null ? aggregateJobCode.availableTasks == null : this.availableTasks.equals(aggregateJobCode.availableTasks)) &&
        (this.permittedEmployees == null ? aggregateJobCode.permittedEmployees == null : this.permittedEmployees.equals(aggregateJobCode.permittedEmployees)) &&
        (this.id == null ? aggregateJobCode.id == null : this.id.equals(aggregateJobCode.id)) &&
        (this.code == null ? aggregateJobCode.code == null : this.code.equals(aggregateJobCode.code)) &&
        (this.client == null ? aggregateJobCode.client == null : this.client.equals(aggregateJobCode.client)) &&
        (this.clientId == null ? aggregateJobCode.clientId == null : this.clientId.equals(aggregateJobCode.clientId)) &&
        (this.project == null ? aggregateJobCode.project == null : this.project.equals(aggregateJobCode.project)) &&
        (this.projectId == null ? aggregateJobCode.projectId == null : this.projectId.equals(aggregateJobCode.projectId)) &&
        (this.organisationId == null ? aggregateJobCode.organisationId == null : this.organisationId.equals(aggregateJobCode.organisationId)) &&
        (this.isDeleted == null ? aggregateJobCode.isDeleted == null : this.isDeleted.equals(aggregateJobCode.isDeleted));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.availableTasks == null ? 0: this.availableTasks.hashCode());
    result = 31 * result + (this.permittedEmployees == null ? 0: this.permittedEmployees.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.client == null ? 0: this.client.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.project == null ? 0: this.project.hashCode());
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.isDeleted == null ? 0: this.isDeleted.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSAggregateJobCode {\n");
    
    sb.append("  availableTasks: ").append(availableTasks).append("\n");
    sb.append("  permittedEmployees: ").append(permittedEmployees).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  client: ").append(client).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  project: ").append(project).append("\n");
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  isDeleted: ").append(isDeleted).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}