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

import ChronoSheetsClientLibModel.CsApiTimesheet;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CsApiBatchUpdateTimesheetRequest {
  
  @SerializedName("Timesheets")
  private List<CsApiTimesheet> timesheets = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiTimesheet> getTimesheets() {
    return timesheets;
  }
  public void setTimesheets(List<CsApiTimesheet> timesheets) {
    this.timesheets = timesheets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiBatchUpdateTimesheetRequest batchUpdateTimesheetRequest = (CsApiBatchUpdateTimesheetRequest) o;
    return (this.timesheets == null ? batchUpdateTimesheetRequest.timesheets == null : this.timesheets.equals(batchUpdateTimesheetRequest.timesheets));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.timesheets == null ? 0: this.timesheets.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiBatchUpdateTimesheetRequest {\n");
    
    sb.append("  timesheets: ").append(timesheets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
