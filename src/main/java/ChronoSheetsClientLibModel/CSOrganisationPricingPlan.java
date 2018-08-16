/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
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

@ApiModel(description = "")
public class CSOrganisationPricingPlan {
  
  @SerializedName("PlanId")
  private String planId = null;
  @SerializedName("Quantity")
  private Integer quantity = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPlanId() {
    return planId;
  }
  public void setPlanId(String planId) {
    this.planId = planId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSOrganisationPricingPlan organisationPricingPlan = (CSOrganisationPricingPlan) o;
    return (this.planId == null ? organisationPricingPlan.planId == null : this.planId.equals(organisationPricingPlan.planId)) &&
        (this.quantity == null ? organisationPricingPlan.quantity == null : this.quantity.equals(organisationPricingPlan.quantity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.planId == null ? 0: this.planId.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSOrganisationPricingPlan {\n");
    
    sb.append("  planId: ").append(planId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
