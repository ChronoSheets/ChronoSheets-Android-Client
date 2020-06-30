/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import ChronoSheetsClientLibModel.CSBasicCoordinate;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSTimesheetAutomationWithOrgAndGeofence {
  
  @SerializedName("OrgId")
  private Integer orgId = null;
  @SerializedName("GeofenceName")
  private String geofenceName = null;
  @SerializedName("Coordinates")
  private List<CSBasicCoordinate> coordinates = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("UserName")
  private String userName = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("AutomationId")
  private Integer automationId = null;
  public enum AutomationActionTypeEnum {
     EnterGeofence,  ExitGeofence,  TapOnNfc, 
  };
  @SerializedName("AutomationActionType")
  private AutomationActionTypeEnum automationActionType = null;
  @SerializedName("Created")
  private Date created = null;
  @SerializedName("Latitude")
  private Double latitude = null;
  @SerializedName("Longitude")
  private Double longitude = null;
  @SerializedName("IsProcessed")
  private Boolean isProcessed = null;
  @SerializedName("Expires")
  private Date expires = null;
  @SerializedName("ClientDateTime")
  private Date clientDateTime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrgId() {
    return orgId;
  }
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGeofenceName() {
    return geofenceName;
  }
  public void setGeofenceName(String geofenceName) {
    this.geofenceName = geofenceName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSBasicCoordinate> getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(List<CSBasicCoordinate> coordinates) {
    this.coordinates = coordinates;
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
  public Integer getAutomationId() {
    return automationId;
  }
  public void setAutomationId(Integer automationId) {
    this.automationId = automationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AutomationActionTypeEnum getAutomationActionType() {
    return automationActionType;
  }
  public void setAutomationActionType(AutomationActionTypeEnum automationActionType) {
    this.automationActionType = automationActionType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsProcessed() {
    return isProcessed;
  }
  public void setIsProcessed(Boolean isProcessed) {
    this.isProcessed = isProcessed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getClientDateTime() {
    return clientDateTime;
  }
  public void setClientDateTime(Date clientDateTime) {
    this.clientDateTime = clientDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSTimesheetAutomationWithOrgAndGeofence timesheetAutomationWithOrgAndGeofence = (CSTimesheetAutomationWithOrgAndGeofence) o;
    return (this.orgId == null ? timesheetAutomationWithOrgAndGeofence.orgId == null : this.orgId.equals(timesheetAutomationWithOrgAndGeofence.orgId)) &&
        (this.geofenceName == null ? timesheetAutomationWithOrgAndGeofence.geofenceName == null : this.geofenceName.equals(timesheetAutomationWithOrgAndGeofence.geofenceName)) &&
        (this.coordinates == null ? timesheetAutomationWithOrgAndGeofence.coordinates == null : this.coordinates.equals(timesheetAutomationWithOrgAndGeofence.coordinates)) &&
        (this.userId == null ? timesheetAutomationWithOrgAndGeofence.userId == null : this.userId.equals(timesheetAutomationWithOrgAndGeofence.userId)) &&
        (this.userName == null ? timesheetAutomationWithOrgAndGeofence.userName == null : this.userName.equals(timesheetAutomationWithOrgAndGeofence.userName)) &&
        (this.firstName == null ? timesheetAutomationWithOrgAndGeofence.firstName == null : this.firstName.equals(timesheetAutomationWithOrgAndGeofence.firstName)) &&
        (this.lastName == null ? timesheetAutomationWithOrgAndGeofence.lastName == null : this.lastName.equals(timesheetAutomationWithOrgAndGeofence.lastName)) &&
        (this.automationId == null ? timesheetAutomationWithOrgAndGeofence.automationId == null : this.automationId.equals(timesheetAutomationWithOrgAndGeofence.automationId)) &&
        (this.automationActionType == null ? timesheetAutomationWithOrgAndGeofence.automationActionType == null : this.automationActionType.equals(timesheetAutomationWithOrgAndGeofence.automationActionType)) &&
        (this.created == null ? timesheetAutomationWithOrgAndGeofence.created == null : this.created.equals(timesheetAutomationWithOrgAndGeofence.created)) &&
        (this.latitude == null ? timesheetAutomationWithOrgAndGeofence.latitude == null : this.latitude.equals(timesheetAutomationWithOrgAndGeofence.latitude)) &&
        (this.longitude == null ? timesheetAutomationWithOrgAndGeofence.longitude == null : this.longitude.equals(timesheetAutomationWithOrgAndGeofence.longitude)) &&
        (this.isProcessed == null ? timesheetAutomationWithOrgAndGeofence.isProcessed == null : this.isProcessed.equals(timesheetAutomationWithOrgAndGeofence.isProcessed)) &&
        (this.expires == null ? timesheetAutomationWithOrgAndGeofence.expires == null : this.expires.equals(timesheetAutomationWithOrgAndGeofence.expires)) &&
        (this.clientDateTime == null ? timesheetAutomationWithOrgAndGeofence.clientDateTime == null : this.clientDateTime.equals(timesheetAutomationWithOrgAndGeofence.clientDateTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orgId == null ? 0: this.orgId.hashCode());
    result = 31 * result + (this.geofenceName == null ? 0: this.geofenceName.hashCode());
    result = 31 * result + (this.coordinates == null ? 0: this.coordinates.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.userName == null ? 0: this.userName.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.automationId == null ? 0: this.automationId.hashCode());
    result = 31 * result + (this.automationActionType == null ? 0: this.automationActionType.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.isProcessed == null ? 0: this.isProcessed.hashCode());
    result = 31 * result + (this.expires == null ? 0: this.expires.hashCode());
    result = 31 * result + (this.clientDateTime == null ? 0: this.clientDateTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSTimesheetAutomationWithOrgAndGeofence {\n");
    
    sb.append("  orgId: ").append(orgId).append("\n");
    sb.append("  geofenceName: ").append(geofenceName).append("\n");
    sb.append("  coordinates: ").append(coordinates).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  automationId: ").append(automationId).append("\n");
    sb.append("  automationActionType: ").append(automationActionType).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  isProcessed: ").append(isProcessed).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  clientDateTime: ").append(clientDateTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
