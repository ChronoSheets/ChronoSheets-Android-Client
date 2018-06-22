/**
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
public class CsApiInsertUserResponse {
  
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("ValidationErrors")
  private List<String> validationErrors = null;

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
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getValidationErrors() {
    return validationErrors;
  }
  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiInsertUserResponse insertUserResponse = (CsApiInsertUserResponse) o;
    return (this.organisationId == null ? insertUserResponse.organisationId == null : this.organisationId.equals(insertUserResponse.organisationId)) &&
        (this.userId == null ? insertUserResponse.userId == null : this.userId.equals(insertUserResponse.userId)) &&
        (this.validationErrors == null ? insertUserResponse.validationErrors == null : this.validationErrors.equals(insertUserResponse.validationErrors));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.validationErrors == null ? 0: this.validationErrors.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiInsertUserResponse {\n");
    
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  validationErrors: ").append(validationErrors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
