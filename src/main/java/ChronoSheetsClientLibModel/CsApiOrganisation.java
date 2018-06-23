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
public class CsApiOrganisation {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("AddressLine01")
  private String addressLine01 = null;
  @SerializedName("AddressLine02")
  private String addressLine02 = null;
  @SerializedName("Suburb")
  private String suburb = null;
  @SerializedName("State")
  private String state = null;
  @SerializedName("Postcode")
  private String postcode = null;
  @SerializedName("Country")
  private String country = null;
  @SerializedName("Phone")
  private String phone = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("Timezone")
  private String timezone = null;
  @SerializedName("SubscriptionCustomerId")
  private String subscriptionCustomerId = null;
  @SerializedName("SubscriptionPlanId")
  private String subscriptionPlanId = null;
  @SerializedName("SignupToken")
  private String signupToken = null;
  @SerializedName("NumberSeatsAvailable")
  private Integer numberSeatsAvailable = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  public String getSuburb() {
    return suburb;
  }
  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubscriptionCustomerId() {
    return subscriptionCustomerId;
  }
  public void setSubscriptionCustomerId(String subscriptionCustomerId) {
    this.subscriptionCustomerId = subscriptionCustomerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubscriptionPlanId() {
    return subscriptionPlanId;
  }
  public void setSubscriptionPlanId(String subscriptionPlanId) {
    this.subscriptionPlanId = subscriptionPlanId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSignupToken() {
    return signupToken;
  }
  public void setSignupToken(String signupToken) {
    this.signupToken = signupToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumberSeatsAvailable() {
    return numberSeatsAvailable;
  }
  public void setNumberSeatsAvailable(Integer numberSeatsAvailable) {
    this.numberSeatsAvailable = numberSeatsAvailable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiOrganisation organisation = (CsApiOrganisation) o;
    return (this.id == null ? organisation.id == null : this.id.equals(organisation.id)) &&
        (this.name == null ? organisation.name == null : this.name.equals(organisation.name)) &&
        (this.addressLine01 == null ? organisation.addressLine01 == null : this.addressLine01.equals(organisation.addressLine01)) &&
        (this.addressLine02 == null ? organisation.addressLine02 == null : this.addressLine02.equals(organisation.addressLine02)) &&
        (this.suburb == null ? organisation.suburb == null : this.suburb.equals(organisation.suburb)) &&
        (this.state == null ? organisation.state == null : this.state.equals(organisation.state)) &&
        (this.postcode == null ? organisation.postcode == null : this.postcode.equals(organisation.postcode)) &&
        (this.country == null ? organisation.country == null : this.country.equals(organisation.country)) &&
        (this.phone == null ? organisation.phone == null : this.phone.equals(organisation.phone)) &&
        (this.emailAddress == null ? organisation.emailAddress == null : this.emailAddress.equals(organisation.emailAddress)) &&
        (this.timezone == null ? organisation.timezone == null : this.timezone.equals(organisation.timezone)) &&
        (this.subscriptionCustomerId == null ? organisation.subscriptionCustomerId == null : this.subscriptionCustomerId.equals(organisation.subscriptionCustomerId)) &&
        (this.subscriptionPlanId == null ? organisation.subscriptionPlanId == null : this.subscriptionPlanId.equals(organisation.subscriptionPlanId)) &&
        (this.signupToken == null ? organisation.signupToken == null : this.signupToken.equals(organisation.signupToken)) &&
        (this.numberSeatsAvailable == null ? organisation.numberSeatsAvailable == null : this.numberSeatsAvailable.equals(organisation.numberSeatsAvailable));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.addressLine01 == null ? 0: this.addressLine01.hashCode());
    result = 31 * result + (this.addressLine02 == null ? 0: this.addressLine02.hashCode());
    result = 31 * result + (this.suburb == null ? 0: this.suburb.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.postcode == null ? 0: this.postcode.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.timezone == null ? 0: this.timezone.hashCode());
    result = 31 * result + (this.subscriptionCustomerId == null ? 0: this.subscriptionCustomerId.hashCode());
    result = 31 * result + (this.subscriptionPlanId == null ? 0: this.subscriptionPlanId.hashCode());
    result = 31 * result + (this.signupToken == null ? 0: this.signupToken.hashCode());
    result = 31 * result + (this.numberSeatsAvailable == null ? 0: this.numberSeatsAvailable.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiOrganisation {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  addressLine01: ").append(addressLine01).append("\n");
    sb.append("  addressLine02: ").append(addressLine02).append("\n");
    sb.append("  suburb: ").append(suburb).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  postcode: ").append(postcode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  subscriptionCustomerId: ").append(subscriptionCustomerId).append("\n");
    sb.append("  subscriptionPlanId: ").append(subscriptionPlanId).append("\n");
    sb.append("  signupToken: ").append(signupToken).append("\n");
    sb.append("  numberSeatsAvailable: ").append(numberSeatsAvailable).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
