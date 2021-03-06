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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSFleetVehicle {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("CostPerKilometer")
  private Double costPerKilometer = null;
  @SerializedName("Make")
  private String make = null;
  @SerializedName("Model")
  private String model = null;
  @SerializedName("Year")
  private String year = null;
  @SerializedName("LicencePlateNumber")
  private String licencePlateNumber = null;
  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;
  @SerializedName("PermittedEmployees")
  private List<Integer> permittedEmployees = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getYear() {
    return year;
  }
  public void setYear(String year) {
    this.year = year;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLicencePlateNumber() {
    return licencePlateNumber;
  }
  public void setLicencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getPermittedEmployees() {
    return permittedEmployees;
  }
  public void setPermittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSFleetVehicle fleetVehicle = (CSFleetVehicle) o;
    return (this.id == null ? fleetVehicle.id == null : this.id.equals(fleetVehicle.id)) &&
        (this.organisationId == null ? fleetVehicle.organisationId == null : this.organisationId.equals(fleetVehicle.organisationId)) &&
        (this.name == null ? fleetVehicle.name == null : this.name.equals(fleetVehicle.name)) &&
        (this.costPerKilometer == null ? fleetVehicle.costPerKilometer == null : this.costPerKilometer.equals(fleetVehicle.costPerKilometer)) &&
        (this.make == null ? fleetVehicle.make == null : this.make.equals(fleetVehicle.make)) &&
        (this.model == null ? fleetVehicle.model == null : this.model.equals(fleetVehicle.model)) &&
        (this.year == null ? fleetVehicle.year == null : this.year.equals(fleetVehicle.year)) &&
        (this.licencePlateNumber == null ? fleetVehicle.licencePlateNumber == null : this.licencePlateNumber.equals(fleetVehicle.licencePlateNumber)) &&
        (this.isDeleted == null ? fleetVehicle.isDeleted == null : this.isDeleted.equals(fleetVehicle.isDeleted)) &&
        (this.permittedEmployees == null ? fleetVehicle.permittedEmployees == null : this.permittedEmployees.equals(fleetVehicle.permittedEmployees));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.costPerKilometer == null ? 0: this.costPerKilometer.hashCode());
    result = 31 * result + (this.make == null ? 0: this.make.hashCode());
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.year == null ? 0: this.year.hashCode());
    result = 31 * result + (this.licencePlateNumber == null ? 0: this.licencePlateNumber.hashCode());
    result = 31 * result + (this.isDeleted == null ? 0: this.isDeleted.hashCode());
    result = 31 * result + (this.permittedEmployees == null ? 0: this.permittedEmployees.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSFleetVehicle {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  costPerKilometer: ").append(costPerKilometer).append("\n");
    sb.append("  make: ").append(make).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  year: ").append(year).append("\n");
    sb.append("  licencePlateNumber: ").append(licencePlateNumber).append("\n");
    sb.append("  isDeleted: ").append(isDeleted).append("\n");
    sb.append("  permittedEmployees: ").append(permittedEmployees).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
