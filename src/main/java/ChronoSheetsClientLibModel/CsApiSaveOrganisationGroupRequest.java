/**
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
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
public class CsApiSaveOrganisationGroupRequest {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("OrganisationGroupName")
  private String organisationGroupName = null;
  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

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
  public String getOrganisationGroupName() {
    return organisationGroupName;
  }
  public void setOrganisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiSaveOrganisationGroupRequest saveOrganisationGroupRequest = (CsApiSaveOrganisationGroupRequest) o;
    return (this.id == null ? saveOrganisationGroupRequest.id == null : this.id.equals(saveOrganisationGroupRequest.id)) &&
        (this.organisationGroupName == null ? saveOrganisationGroupRequest.organisationGroupName == null : this.organisationGroupName.equals(saveOrganisationGroupRequest.organisationGroupName)) &&
        (this.isDeleted == null ? saveOrganisationGroupRequest.isDeleted == null : this.isDeleted.equals(saveOrganisationGroupRequest.isDeleted));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.organisationGroupName == null ? 0: this.organisationGroupName.hashCode());
    result = 31 * result + (this.isDeleted == null ? 0: this.isDeleted.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiSaveOrganisationGroupRequest {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  organisationGroupName: ").append(organisationGroupName).append("\n");
    sb.append("  isDeleted: ").append(isDeleted).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
