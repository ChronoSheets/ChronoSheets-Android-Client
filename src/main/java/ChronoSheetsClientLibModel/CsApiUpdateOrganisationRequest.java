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
public class CsApiUpdateOrganisationRequest {
  
  @SerializedName("OrgansationId")
  private Integer organsationId = null;
  @SerializedName("OrganisationName")
  private String organisationName = null;
  @SerializedName("AddressLine01")
  private String addressLine01 = null;
  @SerializedName("AddressLine02")
  private String addressLine02 = null;
  @SerializedName("OrganisationSuburb")
  private String organisationSuburb = null;
  @SerializedName("OrganisationState")
  private String organisationState = null;
  @SerializedName("OrganisationPostcode")
  private String organisationPostcode = null;
  @SerializedName("OrganisationCountry")
  private String organisationCountry = null;
  @SerializedName("OrganisationPhone")
  private String organisationPhone = null;
  @SerializedName("OrganisationEmailAddress")
  private String organisationEmailAddress = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrgansationId() {
    return organsationId;
  }
  public void setOrgansationId(Integer organsationId) {
    this.organsationId = organsationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationName() {
    return organisationName;
  }
  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressLine01() {
    return addressLine01;
  }
  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressLine02() {
    return addressLine02;
  }
  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationSuburb() {
    return organisationSuburb;
  }
  public void setOrganisationSuburb(String organisationSuburb) {
    this.organisationSuburb = organisationSuburb;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationState() {
    return organisationState;
  }
  public void setOrganisationState(String organisationState) {
    this.organisationState = organisationState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationPostcode() {
    return organisationPostcode;
  }
  public void setOrganisationPostcode(String organisationPostcode) {
    this.organisationPostcode = organisationPostcode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationCountry() {
    return organisationCountry;
  }
  public void setOrganisationCountry(String organisationCountry) {
    this.organisationCountry = organisationCountry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationPhone() {
    return organisationPhone;
  }
  public void setOrganisationPhone(String organisationPhone) {
    this.organisationPhone = organisationPhone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganisationEmailAddress() {
    return organisationEmailAddress;
  }
  public void setOrganisationEmailAddress(String organisationEmailAddress) {
    this.organisationEmailAddress = organisationEmailAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiUpdateOrganisationRequest updateOrganisationRequest = (CsApiUpdateOrganisationRequest) o;
    return (this.organsationId == null ? updateOrganisationRequest.organsationId == null : this.organsationId.equals(updateOrganisationRequest.organsationId)) &&
        (this.organisationName == null ? updateOrganisationRequest.organisationName == null : this.organisationName.equals(updateOrganisationRequest.organisationName)) &&
        (this.addressLine01 == null ? updateOrganisationRequest.addressLine01 == null : this.addressLine01.equals(updateOrganisationRequest.addressLine01)) &&
        (this.addressLine02 == null ? updateOrganisationRequest.addressLine02 == null : this.addressLine02.equals(updateOrganisationRequest.addressLine02)) &&
        (this.organisationSuburb == null ? updateOrganisationRequest.organisationSuburb == null : this.organisationSuburb.equals(updateOrganisationRequest.organisationSuburb)) &&
        (this.organisationState == null ? updateOrganisationRequest.organisationState == null : this.organisationState.equals(updateOrganisationRequest.organisationState)) &&
        (this.organisationPostcode == null ? updateOrganisationRequest.organisationPostcode == null : this.organisationPostcode.equals(updateOrganisationRequest.organisationPostcode)) &&
        (this.organisationCountry == null ? updateOrganisationRequest.organisationCountry == null : this.organisationCountry.equals(updateOrganisationRequest.organisationCountry)) &&
        (this.organisationPhone == null ? updateOrganisationRequest.organisationPhone == null : this.organisationPhone.equals(updateOrganisationRequest.organisationPhone)) &&
        (this.organisationEmailAddress == null ? updateOrganisationRequest.organisationEmailAddress == null : this.organisationEmailAddress.equals(updateOrganisationRequest.organisationEmailAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organsationId == null ? 0: this.organsationId.hashCode());
    result = 31 * result + (this.organisationName == null ? 0: this.organisationName.hashCode());
    result = 31 * result + (this.addressLine01 == null ? 0: this.addressLine01.hashCode());
    result = 31 * result + (this.addressLine02 == null ? 0: this.addressLine02.hashCode());
    result = 31 * result + (this.organisationSuburb == null ? 0: this.organisationSuburb.hashCode());
    result = 31 * result + (this.organisationState == null ? 0: this.organisationState.hashCode());
    result = 31 * result + (this.organisationPostcode == null ? 0: this.organisationPostcode.hashCode());
    result = 31 * result + (this.organisationCountry == null ? 0: this.organisationCountry.hashCode());
    result = 31 * result + (this.organisationPhone == null ? 0: this.organisationPhone.hashCode());
    result = 31 * result + (this.organisationEmailAddress == null ? 0: this.organisationEmailAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiUpdateOrganisationRequest {\n");
    
    sb.append("  organsationId: ").append(organsationId).append("\n");
    sb.append("  organisationName: ").append(organisationName).append("\n");
    sb.append("  addressLine01: ").append(addressLine01).append("\n");
    sb.append("  addressLine02: ").append(addressLine02).append("\n");
    sb.append("  organisationSuburb: ").append(organisationSuburb).append("\n");
    sb.append("  organisationState: ").append(organisationState).append("\n");
    sb.append("  organisationPostcode: ").append(organisationPostcode).append("\n");
    sb.append("  organisationCountry: ").append(organisationCountry).append("\n");
    sb.append("  organisationPhone: ").append(organisationPhone).append("\n");
    sb.append("  organisationEmailAddress: ").append(organisationEmailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
