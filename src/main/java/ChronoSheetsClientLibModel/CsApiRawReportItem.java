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
public class CsApiRawReportItem {
  
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("Username")
  private String username = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("JobCode")
  private String jobCode = null;
  @SerializedName("TaskName")
  private String taskName = null;
  @SerializedName("ClientName")
  private String clientName = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;
  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("PayAmount")
  private Double payAmount = null;
  @SerializedName("PayOvertimeAmount")
  private Double payOvertimeAmount = null;
  @SerializedName("TripCost")
  private Double tripCost = null;
  @SerializedName("TripDistanceMeters")
  private Double tripDistanceMeters = null;

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
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getJobCode() {
    return jobCode;
  }
  public void setJobCode(String jobCode) {
    this.jobCode = jobCode;
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
  public String getClientName() {
    return clientName;
  }
  public void setClientName(String clientName) {
    this.clientName = clientName;
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
  public Integer getSpanSeconds() {
    return spanSeconds;
  }
  public void setSpanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
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
  public Double getPayAmount() {
    return payAmount;
  }
  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPayOvertimeAmount() {
    return payOvertimeAmount;
  }
  public void setPayOvertimeAmount(Double payOvertimeAmount) {
    this.payOvertimeAmount = payOvertimeAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTripCost() {
    return tripCost;
  }
  public void setTripCost(Double tripCost) {
    this.tripCost = tripCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTripDistanceMeters() {
    return tripDistanceMeters;
  }
  public void setTripDistanceMeters(Double tripDistanceMeters) {
    this.tripDistanceMeters = tripDistanceMeters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiRawReportItem rawReportItem = (CsApiRawReportItem) o;
    return (this.organisationId == null ? rawReportItem.organisationId == null : this.organisationId.equals(rawReportItem.organisationId)) &&
        (this.userId == null ? rawReportItem.userId == null : this.userId.equals(rawReportItem.userId)) &&
        (this.username == null ? rawReportItem.username == null : this.username.equals(rawReportItem.username)) &&
        (this.emailAddress == null ? rawReportItem.emailAddress == null : this.emailAddress.equals(rawReportItem.emailAddress)) &&
        (this.jobCode == null ? rawReportItem.jobCode == null : this.jobCode.equals(rawReportItem.jobCode)) &&
        (this.taskName == null ? rawReportItem.taskName == null : this.taskName.equals(rawReportItem.taskName)) &&
        (this.clientName == null ? rawReportItem.clientName == null : this.clientName.equals(rawReportItem.clientName)) &&
        (this.projectName == null ? rawReportItem.projectName == null : this.projectName.equals(rawReportItem.projectName)) &&
        (this.startDate == null ? rawReportItem.startDate == null : this.startDate.equals(rawReportItem.startDate)) &&
        (this.endDate == null ? rawReportItem.endDate == null : this.endDate.equals(rawReportItem.endDate)) &&
        (this.spanSeconds == null ? rawReportItem.spanSeconds == null : this.spanSeconds.equals(rawReportItem.spanSeconds)) &&
        (this.description == null ? rawReportItem.description == null : this.description.equals(rawReportItem.description)) &&
        (this.payAmount == null ? rawReportItem.payAmount == null : this.payAmount.equals(rawReportItem.payAmount)) &&
        (this.payOvertimeAmount == null ? rawReportItem.payOvertimeAmount == null : this.payOvertimeAmount.equals(rawReportItem.payOvertimeAmount)) &&
        (this.tripCost == null ? rawReportItem.tripCost == null : this.tripCost.equals(rawReportItem.tripCost)) &&
        (this.tripDistanceMeters == null ? rawReportItem.tripDistanceMeters == null : this.tripDistanceMeters.equals(rawReportItem.tripDistanceMeters));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.jobCode == null ? 0: this.jobCode.hashCode());
    result = 31 * result + (this.taskName == null ? 0: this.taskName.hashCode());
    result = 31 * result + (this.clientName == null ? 0: this.clientName.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.spanSeconds == null ? 0: this.spanSeconds.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.payAmount == null ? 0: this.payAmount.hashCode());
    result = 31 * result + (this.payOvertimeAmount == null ? 0: this.payOvertimeAmount.hashCode());
    result = 31 * result + (this.tripCost == null ? 0: this.tripCost.hashCode());
    result = 31 * result + (this.tripDistanceMeters == null ? 0: this.tripDistanceMeters.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiRawReportItem {\n");
    
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  jobCode: ").append(jobCode).append("\n");
    sb.append("  taskName: ").append(taskName).append("\n");
    sb.append("  clientName: ").append(clientName).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  spanSeconds: ").append(spanSeconds).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  payAmount: ").append(payAmount).append("\n");
    sb.append("  payOvertimeAmount: ").append(payOvertimeAmount).append("\n");
    sb.append("  tripCost: ").append(tripCost).append("\n");
    sb.append("  tripDistanceMeters: ").append(tripDistanceMeters).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
