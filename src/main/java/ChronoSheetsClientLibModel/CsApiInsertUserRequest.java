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
public class CsApiInsertUserRequest {
  
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;
  @SerializedName("Roles")
  private Long roles = null;
  @SerializedName("AlertSettings")
  private Long alertSettings = null;
  @SerializedName("UserName")
  private String userName = null;
  @SerializedName("HourlyPayRate")
  private Double hourlyPayRate = null;
  @SerializedName("HourlyOvertimePayRate")
  private Double hourlyOvertimePayRate = null;
  @SerializedName("CurrentDate")
  private Date currentDate = null;

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
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }
  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRoles() {
    return roles;
  }
  public void setRoles(Long roles) {
    this.roles = roles;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAlertSettings() {
    return alertSettings;
  }
  public void setAlertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHourlyPayRate() {
    return hourlyPayRate;
  }
  public void setHourlyPayRate(Double hourlyPayRate) {
    this.hourlyPayRate = hourlyPayRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHourlyOvertimePayRate() {
    return hourlyOvertimePayRate;
  }
  public void setHourlyOvertimePayRate(Double hourlyOvertimePayRate) {
    this.hourlyOvertimePayRate = hourlyOvertimePayRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCurrentDate() {
    return currentDate;
  }
  public void setCurrentDate(Date currentDate) {
    this.currentDate = currentDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiInsertUserRequest insertUserRequest = (CsApiInsertUserRequest) o;
    return (this.emailAddress == null ? insertUserRequest.emailAddress == null : this.emailAddress.equals(insertUserRequest.emailAddress)) &&
        (this.firstName == null ? insertUserRequest.firstName == null : this.firstName.equals(insertUserRequest.firstName)) &&
        (this.lastName == null ? insertUserRequest.lastName == null : this.lastName.equals(insertUserRequest.lastName)) &&
        (this.isSubscribedToNewsletter == null ? insertUserRequest.isSubscribedToNewsletter == null : this.isSubscribedToNewsletter.equals(insertUserRequest.isSubscribedToNewsletter)) &&
        (this.roles == null ? insertUserRequest.roles == null : this.roles.equals(insertUserRequest.roles)) &&
        (this.alertSettings == null ? insertUserRequest.alertSettings == null : this.alertSettings.equals(insertUserRequest.alertSettings)) &&
        (this.userName == null ? insertUserRequest.userName == null : this.userName.equals(insertUserRequest.userName)) &&
        (this.hourlyPayRate == null ? insertUserRequest.hourlyPayRate == null : this.hourlyPayRate.equals(insertUserRequest.hourlyPayRate)) &&
        (this.hourlyOvertimePayRate == null ? insertUserRequest.hourlyOvertimePayRate == null : this.hourlyOvertimePayRate.equals(insertUserRequest.hourlyOvertimePayRate)) &&
        (this.currentDate == null ? insertUserRequest.currentDate == null : this.currentDate.equals(insertUserRequest.currentDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.isSubscribedToNewsletter == null ? 0: this.isSubscribedToNewsletter.hashCode());
    result = 31 * result + (this.roles == null ? 0: this.roles.hashCode());
    result = 31 * result + (this.alertSettings == null ? 0: this.alertSettings.hashCode());
    result = 31 * result + (this.userName == null ? 0: this.userName.hashCode());
    result = 31 * result + (this.hourlyPayRate == null ? 0: this.hourlyPayRate.hashCode());
    result = 31 * result + (this.hourlyOvertimePayRate == null ? 0: this.hourlyOvertimePayRate.hashCode());
    result = 31 * result + (this.currentDate == null ? 0: this.currentDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiInsertUserRequest {\n");
    
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  isSubscribedToNewsletter: ").append(isSubscribedToNewsletter).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  alertSettings: ").append(alertSettings).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  hourlyPayRate: ").append(hourlyPayRate).append("\n");
    sb.append("  hourlyOvertimePayRate: ").append(hourlyOvertimePayRate).append("\n");
    sb.append("  currentDate: ").append(currentDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
