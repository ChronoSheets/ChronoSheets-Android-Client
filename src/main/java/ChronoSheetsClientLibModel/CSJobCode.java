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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSJobCode {
  
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
   * The ID of the job code (not the code itself)
   **/
  @ApiModelProperty(value = "The ID of the job code (not the code itself)")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The job code itself
   **/
  @ApiModelProperty(value = "The job code itself")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The name of the client
   **/
  @ApiModelProperty(value = "The name of the client")
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }

  /**
   * The ID of the client
   **/
  @ApiModelProperty(value = "The ID of the client")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   * The name of the project
   **/
  @ApiModelProperty(value = "The name of the project")
  public String getProject() {
    return project;
  }
  public void setProject(String project) {
    this.project = project;
  }

  /**
   * The ID of the project
   **/
  @ApiModelProperty(value = "The ID of the project")
  public Integer getProjectId() {
    return projectId;
  }
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  /**
   * Your organisation ID
   **/
  @ApiModelProperty(value = "Your organisation ID")
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  /**
   * A flag indicating whether or not the job code has been marked as deleted
   **/
  @ApiModelProperty(value = "A flag indicating whether or not the job code has been marked as deleted")
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
    CSJobCode jobCode = (CSJobCode) o;
    return (this.id == null ? jobCode.id == null : this.id.equals(jobCode.id)) &&
        (this.code == null ? jobCode.code == null : this.code.equals(jobCode.code)) &&
        (this.client == null ? jobCode.client == null : this.client.equals(jobCode.client)) &&
        (this.clientId == null ? jobCode.clientId == null : this.clientId.equals(jobCode.clientId)) &&
        (this.project == null ? jobCode.project == null : this.project.equals(jobCode.project)) &&
        (this.projectId == null ? jobCode.projectId == null : this.projectId.equals(jobCode.projectId)) &&
        (this.organisationId == null ? jobCode.organisationId == null : this.organisationId.equals(jobCode.organisationId)) &&
        (this.isDeleted == null ? jobCode.isDeleted == null : this.isDeleted.equals(jobCode.isDeleted));
  }

  @Override
  public int hashCode() {
    int result = 17;
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
    sb.append("class CSJobCode {\n");
    
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
