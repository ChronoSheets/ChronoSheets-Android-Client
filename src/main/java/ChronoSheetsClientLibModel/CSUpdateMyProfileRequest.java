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
public class CSUpdateMyProfileRequest {
  
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("OldPassword")
  private String oldPassword = null;
  @SerializedName("NewPassword")
  private String newPassword = null;
  @SerializedName("ConfirmNewPassword")
  private String confirmNewPassword = null;
  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;
  @SerializedName("WantsToChangePassword")
  private Boolean wantsToChangePassword = null;

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
  public String getOldPassword() {
    return oldPassword;
  }
  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConfirmNewPassword() {
    return confirmNewPassword;
  }
  public void setConfirmNewPassword(String confirmNewPassword) {
    this.confirmNewPassword = confirmNewPassword;
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
  public Boolean getWantsToChangePassword() {
    return wantsToChangePassword;
  }
  public void setWantsToChangePassword(Boolean wantsToChangePassword) {
    this.wantsToChangePassword = wantsToChangePassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUpdateMyProfileRequest updateMyProfileRequest = (CSUpdateMyProfileRequest) o;
    return (this.emailAddress == null ? updateMyProfileRequest.emailAddress == null : this.emailAddress.equals(updateMyProfileRequest.emailAddress)) &&
        (this.firstName == null ? updateMyProfileRequest.firstName == null : this.firstName.equals(updateMyProfileRequest.firstName)) &&
        (this.lastName == null ? updateMyProfileRequest.lastName == null : this.lastName.equals(updateMyProfileRequest.lastName)) &&
        (this.oldPassword == null ? updateMyProfileRequest.oldPassword == null : this.oldPassword.equals(updateMyProfileRequest.oldPassword)) &&
        (this.newPassword == null ? updateMyProfileRequest.newPassword == null : this.newPassword.equals(updateMyProfileRequest.newPassword)) &&
        (this.confirmNewPassword == null ? updateMyProfileRequest.confirmNewPassword == null : this.confirmNewPassword.equals(updateMyProfileRequest.confirmNewPassword)) &&
        (this.isSubscribedToNewsletter == null ? updateMyProfileRequest.isSubscribedToNewsletter == null : this.isSubscribedToNewsletter.equals(updateMyProfileRequest.isSubscribedToNewsletter)) &&
        (this.wantsToChangePassword == null ? updateMyProfileRequest.wantsToChangePassword == null : this.wantsToChangePassword.equals(updateMyProfileRequest.wantsToChangePassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.oldPassword == null ? 0: this.oldPassword.hashCode());
    result = 31 * result + (this.newPassword == null ? 0: this.newPassword.hashCode());
    result = 31 * result + (this.confirmNewPassword == null ? 0: this.confirmNewPassword.hashCode());
    result = 31 * result + (this.isSubscribedToNewsletter == null ? 0: this.isSubscribedToNewsletter.hashCode());
    result = 31 * result + (this.wantsToChangePassword == null ? 0: this.wantsToChangePassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateMyProfileRequest {\n");
    
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  oldPassword: ").append(oldPassword).append("\n");
    sb.append("  newPassword: ").append(newPassword).append("\n");
    sb.append("  confirmNewPassword: ").append(confirmNewPassword).append("\n");
    sb.append("  isSubscribedToNewsletter: ").append(isSubscribedToNewsletter).append("\n");
    sb.append("  wantsToChangePassword: ").append(wantsToChangePassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
