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

import ChronoSheetsClientLibModel.Timesheet;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Contains a collection of Timesheet objects that are to be either created or updated.  If the ID of the timesheet is specified in the Timesheet object, then that Timesheet will be updated otherwise it will be created
 **/
@ApiModel(description = "Contains a collection of Timesheet objects that are to be either created or updated.  If the ID of the timesheet is specified in the Timesheet object, then that Timesheet will be updated otherwise it will be created")
public class BatchUpdateTimesheetRequest {
  
  @SerializedName("Timesheets")
  private List<Timesheet> timesheets = null;

  /**
   * A collection of Timesheet objects to be either created or updated
   **/
  @ApiModelProperty(value = "A collection of Timesheet objects to be either created or updated")
  public List<Timesheet> getTimesheets() {
    return timesheets;
  }
  public void setTimesheets(List<Timesheet> timesheets) {
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
    BatchUpdateTimesheetRequest batchUpdateTimesheetRequest = (BatchUpdateTimesheetRequest) o;
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
    sb.append("class BatchUpdateTimesheetRequest {\n");
    
    sb.append("  timesheets: ").append(timesheets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
