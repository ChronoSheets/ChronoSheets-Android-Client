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

/**
 * An API Request object for logging into ChronoSheets
 **/
@ApiModel(description = "An API Request object for logging into ChronoSheets")
public class CSDoLoginRequest {
  
  @SerializedName("UsernameOrEmail")
  private String usernameOrEmail = null;
  @SerializedName("Password")
  private String password = null;

  /**
   * Your ChronoSheets username or registered email address
   **/
  @ApiModelProperty(value = "Your ChronoSheets username or registered email address")
  public String getUsernameOrEmail() {
    return usernameOrEmail;
  }
  public void setUsernameOrEmail(String usernameOrEmail) {
    this.usernameOrEmail = usernameOrEmail;
  }

  /**
   * Your ChronoSheets password
   **/
  @ApiModelProperty(value = "Your ChronoSheets password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSDoLoginRequest doLoginRequest = (CSDoLoginRequest) o;
    return (this.usernameOrEmail == null ? doLoginRequest.usernameOrEmail == null : this.usernameOrEmail.equals(doLoginRequest.usernameOrEmail)) &&
        (this.password == null ? doLoginRequest.password == null : this.password.equals(doLoginRequest.password));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.usernameOrEmail == null ? 0: this.usernameOrEmail.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSDoLoginRequest {\n");
    
    sb.append("  usernameOrEmail: ").append(usernameOrEmail).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
