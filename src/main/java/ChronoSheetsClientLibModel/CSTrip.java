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

import ChronoSheetsClientLibModel.CSTripCoordinate;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSTrip {
  
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
  private List<CSTripCoordinate> pathCoordinates = null;
  @SerializedName("CacheExpiryDate")
  private Date cacheExpiryDate = null;

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
  public List<CSTripCoordinate> getPathCoordinates() {
    return pathCoordinates;
  }
  public void setPathCoordinates(List<CSTripCoordinate> pathCoordinates) {
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
    CSTrip trip = (CSTrip) o;
    return (this.tripId == null ? trip.tripId == null : this.tripId.equals(trip.tripId)) &&
        (this.timesheetId == null ? trip.timesheetId == null : this.timesheetId.equals(trip.timesheetId)) &&
        (this.vehicleId == null ? trip.vehicleId == null : this.vehicleId.equals(trip.vehicleId)) &&
        (this.userId == null ? trip.userId == null : this.userId.equals(trip.userId)) &&
        (this.orgId == null ? trip.orgId == null : this.orgId.equals(trip.orgId)) &&
        (this.mobilePlatform == null ? trip.mobilePlatform == null : this.mobilePlatform.equals(trip.mobilePlatform)) &&
        (this.startDate == null ? trip.startDate == null : this.startDate.equals(trip.startDate)) &&
        (this.endDate == null ? trip.endDate == null : this.endDate.equals(trip.endDate)) &&
        (this.vehicleName == null ? trip.vehicleName == null : this.vehicleName.equals(trip.vehicleName)) &&
        (this.vehicleMake == null ? trip.vehicleMake == null : this.vehicleMake.equals(trip.vehicleMake)) &&
        (this.vehicleModel == null ? trip.vehicleModel == null : this.vehicleModel.equals(trip.vehicleModel)) &&
        (this.vehicleYear == null ? trip.vehicleYear == null : this.vehicleYear.equals(trip.vehicleYear)) &&
        (this.costPerKilometer == null ? trip.costPerKilometer == null : this.costPerKilometer.equals(trip.costPerKilometer)) &&
        (this.tripTotalCost == null ? trip.tripTotalCost == null : this.tripTotalCost.equals(trip.tripTotalCost)) &&
        (this.totalTripDistanceMeters == null ? trip.totalTripDistanceMeters == null : this.totalTripDistanceMeters.equals(trip.totalTripDistanceMeters)) &&
        (this.startAddress == null ? trip.startAddress == null : this.startAddress.equals(trip.startAddress)) &&
        (this.endAddress == null ? trip.endAddress == null : this.endAddress.equals(trip.endAddress)) &&
        (this.pathCoordinates == null ? trip.pathCoordinates == null : this.pathCoordinates.equals(trip.pathCoordinates)) &&
        (this.cacheExpiryDate == null ? trip.cacheExpiryDate == null : this.cacheExpiryDate.equals(trip.cacheExpiryDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
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
    sb.append("class CSTrip {\n");
    
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
