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

import ChronoSheetsClientLibModel.CsApiTripCoordinate;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CsApiOrgReportTrip {
  
  @SerializedName("Username")
  private String username = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("TripId")
  private Integer tripId = null;
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;
  @SerializedName("VehicleId")
  private Integer vehicleId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("OrgId")
  private Integer orgId = null;
  public enum MobilePlatformEnum {
     Unknown,  iOS,  Android, 
  };
  @SerializedName("MobilePlatform")
  private MobilePlatformEnum mobilePlatform = null;
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;
  @SerializedName("VehicleName")
  private String vehicleName = null;
  @SerializedName("VehicleMake")
  private String vehicleMake = null;
  @SerializedName("VehicleModel")
  private String vehicleModel = null;
  @SerializedName("VehicleYear")
  private String vehicleYear = null;
  @SerializedName("CostPerKilometer")
  private Double costPerKilometer = null;
  @SerializedName("TripTotalCost")
  private Double tripTotalCost = null;
  @SerializedName("TotalTripDistanceMeters")
  private Double totalTripDistanceMeters = null;
  @SerializedName("StartAddress")
  private String startAddress = null;
  @SerializedName("EndAddress")
  private String endAddress = null;
  @SerializedName("PathCoordinates")
  private List<CsApiTripCoordinate> pathCoordinates = null;
  @SerializedName("CacheExpiryDate")
  private Date cacheExpiryDate = null;

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
  public Integer getTripId() {
    return tripId;
  }
  public void setTripId(Integer tripId) {
    this.tripId = tripId;
  }

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
  public Integer getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
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
  public Integer getOrgId() {
    return orgId;
  }
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MobilePlatformEnum getMobilePlatform() {
    return mobilePlatform;
  }
  public void setMobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
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
  public String getVehicleName() {
    return vehicleName;
  }
  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVehicleMake() {
    return vehicleMake;
  }
  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVehicleModel() {
    return vehicleModel;
  }
  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVehicleYear() {
    return vehicleYear;
  }
  public void setVehicleYear(String vehicleYear) {
    this.vehicleYear = vehicleYear;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCostPerKilometer() {
    return costPerKilometer;
  }
  public void setCostPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTripTotalCost() {
    return tripTotalCost;
  }
  public void setTripTotalCost(Double tripTotalCost) {
    this.tripTotalCost = tripTotalCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTotalTripDistanceMeters() {
    return totalTripDistanceMeters;
  }
  public void setTotalTripDistanceMeters(Double totalTripDistanceMeters) {
    this.totalTripDistanceMeters = totalTripDistanceMeters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStartAddress() {
    return startAddress;
  }
  public void setStartAddress(String startAddress) {
    this.startAddress = startAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEndAddress() {
    return endAddress;
  }
  public void setEndAddress(String endAddress) {
    this.endAddress = endAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiTripCoordinate> getPathCoordinates() {
    return pathCoordinates;
  }
  public void setPathCoordinates(List<CsApiTripCoordinate> pathCoordinates) {
    this.pathCoordinates = pathCoordinates;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCacheExpiryDate() {
    return cacheExpiryDate;
  }
  public void setCacheExpiryDate(Date cacheExpiryDate) {
    this.cacheExpiryDate = cacheExpiryDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiOrgReportTrip orgReportTrip = (CsApiOrgReportTrip) o;
    return (this.username == null ? orgReportTrip.username == null : this.username.equals(orgReportTrip.username)) &&
        (this.emailAddress == null ? orgReportTrip.emailAddress == null : this.emailAddress.equals(orgReportTrip.emailAddress)) &&
        (this.firstName == null ? orgReportTrip.firstName == null : this.firstName.equals(orgReportTrip.firstName)) &&
        (this.lastName == null ? orgReportTrip.lastName == null : this.lastName.equals(orgReportTrip.lastName)) &&
        (this.tripId == null ? orgReportTrip.tripId == null : this.tripId.equals(orgReportTrip.tripId)) &&
        (this.timesheetId == null ? orgReportTrip.timesheetId == null : this.timesheetId.equals(orgReportTrip.timesheetId)) &&
        (this.vehicleId == null ? orgReportTrip.vehicleId == null : this.vehicleId.equals(orgReportTrip.vehicleId)) &&
        (this.userId == null ? orgReportTrip.userId == null : this.userId.equals(orgReportTrip.userId)) &&
        (this.orgId == null ? orgReportTrip.orgId == null : this.orgId.equals(orgReportTrip.orgId)) &&
        (this.mobilePlatform == null ? orgReportTrip.mobilePlatform == null : this.mobilePlatform.equals(orgReportTrip.mobilePlatform)) &&
        (this.startDate == null ? orgReportTrip.startDate == null : this.startDate.equals(orgReportTrip.startDate)) &&
        (this.endDate == null ? orgReportTrip.endDate == null : this.endDate.equals(orgReportTrip.endDate)) &&
        (this.vehicleName == null ? orgReportTrip.vehicleName == null : this.vehicleName.equals(orgReportTrip.vehicleName)) &&
        (this.vehicleMake == null ? orgReportTrip.vehicleMake == null : this.vehicleMake.equals(orgReportTrip.vehicleMake)) &&
        (this.vehicleModel == null ? orgReportTrip.vehicleModel == null : this.vehicleModel.equals(orgReportTrip.vehicleModel)) &&
        (this.vehicleYear == null ? orgReportTrip.vehicleYear == null : this.vehicleYear.equals(orgReportTrip.vehicleYear)) &&
        (this.costPerKilometer == null ? orgReportTrip.costPerKilometer == null : this.costPerKilometer.equals(orgReportTrip.costPerKilometer)) &&
        (this.tripTotalCost == null ? orgReportTrip.tripTotalCost == null : this.tripTotalCost.equals(orgReportTrip.tripTotalCost)) &&
        (this.totalTripDistanceMeters == null ? orgReportTrip.totalTripDistanceMeters == null : this.totalTripDistanceMeters.equals(orgReportTrip.totalTripDistanceMeters)) &&
        (this.startAddress == null ? orgReportTrip.startAddress == null : this.startAddress.equals(orgReportTrip.startAddress)) &&
        (this.endAddress == null ? orgReportTrip.endAddress == null : this.endAddress.equals(orgReportTrip.endAddress)) &&
        (this.pathCoordinates == null ? orgReportTrip.pathCoordinates == null : this.pathCoordinates.equals(orgReportTrip.pathCoordinates)) &&
        (this.cacheExpiryDate == null ? orgReportTrip.cacheExpiryDate == null : this.cacheExpiryDate.equals(orgReportTrip.cacheExpiryDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.tripId == null ? 0: this.tripId.hashCode());
    result = 31 * result + (this.timesheetId == null ? 0: this.timesheetId.hashCode());
    result = 31 * result + (this.vehicleId == null ? 0: this.vehicleId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.orgId == null ? 0: this.orgId.hashCode());
    result = 31 * result + (this.mobilePlatform == null ? 0: this.mobilePlatform.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.vehicleName == null ? 0: this.vehicleName.hashCode());
    result = 31 * result + (this.vehicleMake == null ? 0: this.vehicleMake.hashCode());
    result = 31 * result + (this.vehicleModel == null ? 0: this.vehicleModel.hashCode());
    result = 31 * result + (this.vehicleYear == null ? 0: this.vehicleYear.hashCode());
    result = 31 * result + (this.costPerKilometer == null ? 0: this.costPerKilometer.hashCode());
    result = 31 * result + (this.tripTotalCost == null ? 0: this.tripTotalCost.hashCode());
    result = 31 * result + (this.totalTripDistanceMeters == null ? 0: this.totalTripDistanceMeters.hashCode());
    result = 31 * result + (this.startAddress == null ? 0: this.startAddress.hashCode());
    result = 31 * result + (this.endAddress == null ? 0: this.endAddress.hashCode());
    result = 31 * result + (this.pathCoordinates == null ? 0: this.pathCoordinates.hashCode());
    result = 31 * result + (this.cacheExpiryDate == null ? 0: this.cacheExpiryDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiOrgReportTrip {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  tripId: ").append(tripId).append("\n");
    sb.append("  timesheetId: ").append(timesheetId).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  orgId: ").append(orgId).append("\n");
    sb.append("  mobilePlatform: ").append(mobilePlatform).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  vehicleName: ").append(vehicleName).append("\n");
    sb.append("  vehicleMake: ").append(vehicleMake).append("\n");
    sb.append("  vehicleModel: ").append(vehicleModel).append("\n");
    sb.append("  vehicleYear: ").append(vehicleYear).append("\n");
    sb.append("  costPerKilometer: ").append(costPerKilometer).append("\n");
    sb.append("  tripTotalCost: ").append(tripTotalCost).append("\n");
    sb.append("  totalTripDistanceMeters: ").append(totalTripDistanceMeters).append("\n");
    sb.append("  startAddress: ").append(startAddress).append("\n");
    sb.append("  endAddress: ").append(endAddress).append("\n");
    sb.append("  pathCoordinates: ").append(pathCoordinates).append("\n");
    sb.append("  cacheExpiryDate: ").append(cacheExpiryDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
