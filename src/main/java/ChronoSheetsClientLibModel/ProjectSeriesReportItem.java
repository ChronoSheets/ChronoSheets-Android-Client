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

@ApiModel(description = "")
public class ProjectSeriesReportItem {
  
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;
  @SerializedName("ProjectId")
  private Integer projectId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;

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
    ProjectSeriesReportItem projectSeriesReportItem = (ProjectSeriesReportItem) o;
    return (this.startDate == null ? projectSeriesReportItem.startDate == null : this.startDate.equals(projectSeriesReportItem.startDate)) &&
        (this.endDate == null ? projectSeriesReportItem.endDate == null : this.endDate.equals(projectSeriesReportItem.endDate)) &&
        (this.projectId == null ? projectSeriesReportItem.projectId == null : this.projectId.equals(projectSeriesReportItem.projectId)) &&
        (this.projectName == null ? projectSeriesReportItem.projectName == null : this.projectName.equals(projectSeriesReportItem.projectName)) &&
        (this.spanSeconds == null ? projectSeriesReportItem.spanSeconds == null : this.spanSeconds.equals(projectSeriesReportItem.spanSeconds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.spanSeconds == null ? 0: this.spanSeconds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSeriesReportItem {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  spanSeconds: ").append(spanSeconds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}