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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CsApiUserProfile {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("UserName")
  private String userName = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;
  @SerializedName("Roles")
  private Long roles = null;
  @SerializedName("AlertSettings")
  private Long alertSettings = null;
  @SerializedName("OrganisationName")
  private String organisationName = null;
  @SerializedName("OrganisationSuburb")
  private String organisationSuburb = null;
  @SerializedName("OrganisationCountry")
  private String organisationCountry = null;

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
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
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
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
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
  public String getOrganisationName() {
    return organisationName;
  }
  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationSuburb() {
    return organisationSuburb;
  }
  public void setOrganisationSuburb(String organisationSuburb) {
    this.organisationSuburb = organisationSuburb;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationCountry() {
    return organisationCountry;
  }
  public void setOrganisationCountry(String organisationCountry) {
    this.organisationCountry = organisationCountry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiUserProfile userProfile = (CsApiUserProfile) o;
    return (this.id == null ? userProfile.id == null : this.id.equals(userProfile.id)) &&
        (this.organisationId == null ? userProfile.organisationId == null : this.organisationId.equals(userProfile.organisationId)) &&
        (this.userName == null ? userProfile.userName == null : this.userName.equals(userProfile.userName)) &&
        (this.firstName == null ? userProfile.firstName == null : this.firstName.equals(userProfile.firstName)) &&
        (this.lastName == null ? userProfile.lastName == null : this.lastName.equals(userProfile.lastName)) &&
        (this.emailAddress == null ? userProfile.emailAddress == null : this.emailAddress.equals(userProfile.emailAddress)) &&
        (this.isSubscribedToNewsletter == null ? userProfile.isSubscribedToNewsletter == null : this.isSubscribedToNewsletter.equals(userProfile.isSubscribedToNewsletter)) &&
        (this.roles == null ? userProfile.roles == null : this.roles.equals(userProfile.roles)) &&
        (this.alertSettings == null ? userProfile.alertSettings == null : this.alertSettings.equals(userProfile.alertSettings)) &&
        (this.organisationName == null ? userProfile.organisationName == null : this.organisationName.equals(userProfile.organisationName)) &&
        (this.organisationSuburb == null ? userProfile.organisationSuburb == null : this.organisationSuburb.equals(userProfile.organisationSuburb)) &&
        (this.organisationCountry == null ? userProfile.organisationCountry == null : this.organisationCountry.equals(userProfile.organisationCountry));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.userName == null ? 0: this.userName.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.isSubscribedToNewsletter == null ? 0: this.isSubscribedToNewsletter.hashCode());
    result = 31 * result + (this.roles == null ? 0: this.roles.hashCode());
    result = 31 * result + (this.alertSettings == null ? 0: this.alertSettings.hashCode());
    result = 31 * result + (this.organisationName == null ? 0: this.organisationName.hashCode());
    result = 31 * result + (this.organisationSuburb == null ? 0: this.organisationSuburb.hashCode());
    result = 31 * result + (this.organisationCountry == null ? 0: this.organisationCountry.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiUserProfile {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  isSubscribedToNewsletter: ").append(isSubscribedToNewsletter).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  alertSettings: ").append(alertSettings).append("\n");
    sb.append("  organisationName: ").append(organisationName).append("\n");
    sb.append("  organisationSuburb: ").append(organisationSuburb).append("\n");
    sb.append("  organisationCountry: ").append(organisationCountry).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
