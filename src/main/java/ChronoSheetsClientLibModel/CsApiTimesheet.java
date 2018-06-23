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
public class CsApiTimesheet {
  
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("JobId")
  private Integer jobId = null;
  @SerializedName("TaskId")
  private Integer taskId = null;
  @SerializedName("StartDateTime")
  private Date startDateTime = null;
  @SerializedName("EndDateTime")
  private Date endDateTime = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("TripId")
  private Integer tripId = null;
  @SerializedName("FileAttachmentCount")
  private Integer fileAttachmentCount = null;
  @SerializedName("PayAmount")
  private Double payAmount = null;
  @SerializedName("OvertimePayAmount")
  private Double overtimePayAmount = null;
  @SerializedName("IncludesOvertime")
  private Boolean includesOvertime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTimesheetId() {
    return timesheetId;
  }
  public void setTimesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
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
  public Integer getJobId() {
    return jobId;
  }
  public void setJobId(Integer jobId) {
    this.jobId = jobId;
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
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTripId() {
    return tripId;
  }
  public void setTripId(Integer tripId) {
    this.tripId = tripId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFileAttachmentCount() {
    return fileAttachmentCount;
  }
  public void setFileAttachmentCount(Integer fileAttachmentCount) {
    this.fileAttachmentCount = fileAttachmentCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPayAmount() {
    return payAmount;
  }
  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getOvertimePayAmount() {
    return overtimePayAmount;
  }
  public void setOvertimePayAmount(Double overtimePayAmount) {
    this.overtimePayAmount = overtimePayAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIncludesOvertime() {
    return includesOvertime;
  }
  public void setIncludesOvertime(Boolean includesOvertime) {
    this.includesOvertime = includesOvertime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiTimesheet timesheet = (CsApiTimesheet) o;
    return (this.timesheetId == null ? timesheet.timesheetId == null : this.timesheetId.equals(timesheet.timesheetId)) &&
        (this.userId == null ? timesheet.userId == null : this.userId.equals(timesheet.userId)) &&
        (this.jobId == null ? timesheet.jobId == null : this.jobId.equals(timesheet.jobId)) &&
        (this.taskId == null ? timesheet.taskId == null : this.taskId.equals(timesheet.taskId)) &&
        (this.startDateTime == null ? timesheet.startDateTime == null : this.startDateTime.equals(timesheet.startDateTime)) &&
        (this.endDateTime == null ? timesheet.endDateTime == null : this.endDateTime.equals(timesheet.endDateTime)) &&
        (this.description == null ? timesheet.description == null : this.description.equals(timesheet.description)) &&
        (this.tripId == null ? timesheet.tripId == null : this.tripId.equals(timesheet.tripId)) &&
        (this.fileAttachmentCount == null ? timesheet.fileAttachmentCount == null : this.fileAttachmentCount.equals(timesheet.fileAttachmentCount)) &&
        (this.payAmount == null ? timesheet.payAmount == null : this.payAmount.equals(timesheet.payAmount)) &&
        (this.overtimePayAmount == null ? timesheet.overtimePayAmount == null : this.overtimePayAmount.equals(timesheet.overtimePayAmount)) &&
        (this.includesOvertime == null ? timesheet.includesOvertime == null : this.includesOvertime.equals(timesheet.includesOvertime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.timesheetId == null ? 0: this.timesheetId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.jobId == null ? 0: this.jobId.hashCode());
    result = 31 * result + (this.taskId == null ? 0: this.taskId.hashCode());
    result = 31 * result + (this.startDateTime == null ? 0: this.startDateTime.hashCode());
    result = 31 * result + (this.endDateTime == null ? 0: this.endDateTime.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.tripId == null ? 0: this.tripId.hashCode());
    result = 31 * result + (this.fileAttachmentCount == null ? 0: this.fileAttachmentCount.hashCode());
    result = 31 * result + (this.payAmount == null ? 0: this.payAmount.hashCode());
    result = 31 * result + (this.overtimePayAmount == null ? 0: this.overtimePayAmount.hashCode());
    result = 31 * result + (this.includesOvertime == null ? 0: this.includesOvertime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiTimesheet {\n");
    
    sb.append("  timesheetId: ").append(timesheetId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  jobId: ").append(jobId).append("\n");
    sb.append("  taskId: ").append(taskId).append("\n");
    sb.append("  startDateTime: ").append(startDateTime).append("\n");
    sb.append("  endDateTime: ").append(endDateTime).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  tripId: ").append(tripId).append("\n");
    sb.append("  fileAttachmentCount: ").append(fileAttachmentCount).append("\n");
    sb.append("  payAmount: ").append(payAmount).append("\n");
    sb.append("  overtimePayAmount: ").append(overtimePayAmount).append("\n");
    sb.append("  includesOvertime: ").append(includesOvertime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
