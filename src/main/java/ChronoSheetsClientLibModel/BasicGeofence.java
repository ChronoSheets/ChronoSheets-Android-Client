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
public class BasicGeofence {
  
  @SerializedName("GeoFencingId")
  private Integer geoFencingId = null;
  @SerializedName("Name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getGeoFencingId() {
    return geoFencingId;
  }
  public void setGeoFencingId(Integer geoFencingId) {
    this.geoFencingId = geoFencingId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicGeofence basicGeofence = (BasicGeofence) o;
    return (this.geoFencingId == null ? basicGeofence.geoFencingId == null : this.geoFencingId.equals(basicGeofence.geoFencingId)) &&
        (this.name == null ? basicGeofence.name == null : this.name.equals(basicGeofence.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.geoFencingId == null ? 0: this.geoFencingId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicGeofence {\n");
    
    sb.append("  geoFencingId: ").append(geoFencingId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
