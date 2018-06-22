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
public class CsApiInsertOrganisationGroupRequest {
  
  @SerializedName("OrganisationGroupName")
  private String organisationGroupName = null;
  @SerializedName("OrganisationGroupUserIds")
  private List<Integer> organisationGroupUserIds = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationGroupName() {
    return organisationGroupName;
  }
  public void setOrganisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getOrganisationGroupUserIds() {
    return organisationGroupUserIds;
  }
  public void setOrganisationGroupUserIds(List<Integer> organisationGroupUserIds) {
    this.organisationGroupUserIds = organisationGroupUserIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiInsertOrganisationGroupRequest insertOrganisationGroupRequest = (CsApiInsertOrganisationGroupRequest) o;
    return (this.organisationGroupName == null ? insertOrganisationGroupRequest.organisationGroupName == null : this.organisationGroupName.equals(insertOrganisationGroupRequest.organisationGroupName)) &&
        (this.organisationGroupUserIds == null ? insertOrganisationGroupRequest.organisationGroupUserIds == null : this.organisationGroupUserIds.equals(insertOrganisationGroupRequest.organisationGroupUserIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organisationGroupName == null ? 0: this.organisationGroupName.hashCode());
    result = 31 * result + (this.organisationGroupUserIds == null ? 0: this.organisationGroupUserIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiInsertOrganisationGroupRequest {\n");
    
    sb.append("  organisationGroupName: ").append(organisationGroupName).append("\n");
    sb.append("  organisationGroupUserIds: ").append(organisationGroupUserIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
