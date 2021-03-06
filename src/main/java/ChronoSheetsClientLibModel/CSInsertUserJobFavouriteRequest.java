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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Used to mark a JobCode as a Favourite.  Favourites can be used in the Mobile app and on the ChronoSheets website
 **/
@ApiModel(description = "Used to mark a JobCode as a Favourite.  Favourites can be used in the Mobile app and on the ChronoSheets website")
public class CSInsertUserJobFavouriteRequest {
  
  @SerializedName("JobId")
  private Integer jobId = null;

  /**
   * The Id of the JobCode that is being marked as a favourite
   **/
  @ApiModelProperty(value = "The Id of the JobCode that is being marked as a favourite")
  public Integer getJobId() {
    return jobId;
  }
  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertUserJobFavouriteRequest insertUserJobFavouriteRequest = (CSInsertUserJobFavouriteRequest) o;
    return (this.jobId == null ? insertUserJobFavouriteRequest.jobId == null : this.jobId.equals(insertUserJobFavouriteRequest.jobId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.jobId == null ? 0: this.jobId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertUserJobFavouriteRequest {\n");
    
    sb.append("  jobId: ").append(jobId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
