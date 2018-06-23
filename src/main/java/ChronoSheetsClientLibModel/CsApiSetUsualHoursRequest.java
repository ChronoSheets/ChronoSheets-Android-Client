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

import ChronoSheetsClientLibModel.CsApiUsualHoursDay;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CsApiSetUsualHoursRequest {
  
  @SerializedName("UsualHoursData")
  private List<CsApiUsualHoursDay> usualHoursData = null;
  @SerializedName("UserId")
  private Integer userId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiUsualHoursDay> getUsualHoursData() {
    return usualHoursData;
  }
  public void setUsualHoursData(List<CsApiUsualHoursDay> usualHoursData) {
    this.usualHoursData = usualHoursData;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiSetUsualHoursRequest setUsualHoursRequest = (CsApiSetUsualHoursRequest) o;
    return (this.usualHoursData == null ? setUsualHoursRequest.usualHoursData == null : this.usualHoursData.equals(setUsualHoursRequest.usualHoursData)) &&
        (this.userId == null ? setUsualHoursRequest.userId == null : this.userId.equals(setUsualHoursRequest.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.usualHoursData == null ? 0: this.usualHoursData.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiSetUsualHoursRequest {\n");
    
    sb.append("  usualHoursData: ").append(usualHoursData).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
