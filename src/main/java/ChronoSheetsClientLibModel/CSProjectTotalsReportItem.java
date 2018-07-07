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
public class CSProjectTotalsReportItem {
  
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("ProjectId")
  private Integer projectId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;

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
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
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
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSpanSeconds() {
    return spanSeconds;
  }
  public void setSpanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSProjectTotalsReportItem projectTotalsReportItem = (CSProjectTotalsReportItem) o;
    return (this.organisationId == null ? projectTotalsReportItem.organisationId == null : this.organisationId.equals(projectTotalsReportItem.organisationId)) &&
        (this.userId == null ? projectTotalsReportItem.userId == null : this.userId.equals(projectTotalsReportItem.userId)) &&
        (this.projectId == null ? projectTotalsReportItem.projectId == null : this.projectId.equals(projectTotalsReportItem.projectId)) &&
        (this.projectName == null ? projectTotalsReportItem.projectName == null : this.projectName.equals(projectTotalsReportItem.projectName)) &&
        (this.spanSeconds == null ? projectTotalsReportItem.spanSeconds == null : this.spanSeconds.equals(projectTotalsReportItem.spanSeconds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.spanSeconds == null ? 0: this.spanSeconds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSProjectTotalsReportItem {\n");
    
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  spanSeconds: ").append(spanSeconds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
