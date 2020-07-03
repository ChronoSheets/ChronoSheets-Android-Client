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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TaskTotalsReportItem {
  
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("TaskId")
  private Integer taskId = null;
  @SerializedName("TaskName")
  private String taskName = null;
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
  public Integer getTaskId() {
    return taskId;
  }
  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }
  public void setTaskName(String taskName) {
    this.taskName = taskName;
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
    TaskTotalsReportItem taskTotalsReportItem = (TaskTotalsReportItem) o;
    return (this.organisationId == null ? taskTotalsReportItem.organisationId == null : this.organisationId.equals(taskTotalsReportItem.organisationId)) &&
        (this.userId == null ? taskTotalsReportItem.userId == null : this.userId.equals(taskTotalsReportItem.userId)) &&
        (this.taskId == null ? taskTotalsReportItem.taskId == null : this.taskId.equals(taskTotalsReportItem.taskId)) &&
        (this.taskName == null ? taskTotalsReportItem.taskName == null : this.taskName.equals(taskTotalsReportItem.taskName)) &&
        (this.spanSeconds == null ? taskTotalsReportItem.spanSeconds == null : this.spanSeconds.equals(taskTotalsReportItem.spanSeconds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.taskId == null ? 0: this.taskId.hashCode());
    result = 31 * result + (this.taskName == null ? 0: this.taskName.hashCode());
    result = 31 * result + (this.spanSeconds == null ? 0: this.spanSeconds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskTotalsReportItem {\n");
    
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  taskId: ").append(taskId).append("\n");
    sb.append("  taskName: ").append(taskName).append("\n");
    sb.append("  spanSeconds: ").append(spanSeconds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}