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
public class CsApiInsertUserJobFavouriteRequest {
  
  @SerializedName("JobId")
  private Integer jobId = null;

  /**
   **/
  @ApiModelProperty(value = "")
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
    CsApiInsertUserJobFavouriteRequest insertUserJobFavouriteRequest = (CsApiInsertUserJobFavouriteRequest) o;
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
    sb.append("class CsApiInsertUserJobFavouriteRequest {\n");
    
    sb.append("  jobId: ").append(jobId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
