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

import ChronoSheetsClientLibModel.CsApiClientSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiClientTotalsReportItem;
import ChronoSheetsClientLibModel.CsApiJobSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiJobTotalsReportItem;
import ChronoSheetsClientLibModel.CsApiProjectSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiProjectTotalsReportItem;
import ChronoSheetsClientLibModel.CsApiTaskSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiTaskTotalsReportItem;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CsApiCombinedReportsData {
  
  @SerializedName("SeriesJobCodes")
  private List<CsApiJobSeriesReportItem> seriesJobCodes = null;
  @SerializedName("SeriesTasks")
  private List<CsApiTaskSeriesReportItem> seriesTasks = null;
  @SerializedName("SeriesClients")
  private List<CsApiClientSeriesReportItem> seriesClients = null;
  @SerializedName("SeriesProjects")
  private List<CsApiProjectSeriesReportItem> seriesProjects = null;
  @SerializedName("TotalsJobCodes")
  private List<CsApiJobTotalsReportItem> totalsJobCodes = null;
  @SerializedName("TotalsTasks")
  private List<CsApiTaskTotalsReportItem> totalsTasks = null;
  @SerializedName("TotalsClients")
  private List<CsApiClientTotalsReportItem> totalsClients = null;
  @SerializedName("TotalsProjects")
  private List<CsApiProjectTotalsReportItem> totalsProjects = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiJobSeriesReportItem> getSeriesJobCodes() {
    return seriesJobCodes;
  }
  public void setSeriesJobCodes(List<CsApiJobSeriesReportItem> seriesJobCodes) {
    this.seriesJobCodes = seriesJobCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiTaskSeriesReportItem> getSeriesTasks() {
    return seriesTasks;
  }
  public void setSeriesTasks(List<CsApiTaskSeriesReportItem> seriesTasks) {
    this.seriesTasks = seriesTasks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiClientSeriesReportItem> getSeriesClients() {
    return seriesClients;
  }
  public void setSeriesClients(List<CsApiClientSeriesReportItem> seriesClients) {
    this.seriesClients = seriesClients;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiProjectSeriesReportItem> getSeriesProjects() {
    return seriesProjects;
  }
  public void setSeriesProjects(List<CsApiProjectSeriesReportItem> seriesProjects) {
    this.seriesProjects = seriesProjects;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiJobTotalsReportItem> getTotalsJobCodes() {
    return totalsJobCodes;
  }
  public void setTotalsJobCodes(List<CsApiJobTotalsReportItem> totalsJobCodes) {
    this.totalsJobCodes = totalsJobCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiTaskTotalsReportItem> getTotalsTasks() {
    return totalsTasks;
  }
  public void setTotalsTasks(List<CsApiTaskTotalsReportItem> totalsTasks) {
    this.totalsTasks = totalsTasks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiClientTotalsReportItem> getTotalsClients() {
    return totalsClients;
  }
  public void setTotalsClients(List<CsApiClientTotalsReportItem> totalsClients) {
    this.totalsClients = totalsClients;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiProjectTotalsReportItem> getTotalsProjects() {
    return totalsProjects;
  }
  public void setTotalsProjects(List<CsApiProjectTotalsReportItem> totalsProjects) {
    this.totalsProjects = totalsProjects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiCombinedReportsData combinedReportsData = (CsApiCombinedReportsData) o;
    return (this.seriesJobCodes == null ? combinedReportsData.seriesJobCodes == null : this.seriesJobCodes.equals(combinedReportsData.seriesJobCodes)) &&
        (this.seriesTasks == null ? combinedReportsData.seriesTasks == null : this.seriesTasks.equals(combinedReportsData.seriesTasks)) &&
        (this.seriesClients == null ? combinedReportsData.seriesClients == null : this.seriesClients.equals(combinedReportsData.seriesClients)) &&
        (this.seriesProjects == null ? combinedReportsData.seriesProjects == null : this.seriesProjects.equals(combinedReportsData.seriesProjects)) &&
        (this.totalsJobCodes == null ? combinedReportsData.totalsJobCodes == null : this.totalsJobCodes.equals(combinedReportsData.totalsJobCodes)) &&
        (this.totalsTasks == null ? combinedReportsData.totalsTasks == null : this.totalsTasks.equals(combinedReportsData.totalsTasks)) &&
        (this.totalsClients == null ? combinedReportsData.totalsClients == null : this.totalsClients.equals(combinedReportsData.totalsClients)) &&
        (this.totalsProjects == null ? combinedReportsData.totalsProjects == null : this.totalsProjects.equals(combinedReportsData.totalsProjects));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.seriesJobCodes == null ? 0: this.seriesJobCodes.hashCode());
    result = 31 * result + (this.seriesTasks == null ? 0: this.seriesTasks.hashCode());
    result = 31 * result + (this.seriesClients == null ? 0: this.seriesClients.hashCode());
    result = 31 * result + (this.seriesProjects == null ? 0: this.seriesProjects.hashCode());
    result = 31 * result + (this.totalsJobCodes == null ? 0: this.totalsJobCodes.hashCode());
    result = 31 * result + (this.totalsTasks == null ? 0: this.totalsTasks.hashCode());
    result = 31 * result + (this.totalsClients == null ? 0: this.totalsClients.hashCode());
    result = 31 * result + (this.totalsProjects == null ? 0: this.totalsProjects.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiCombinedReportsData {\n");
    
    sb.append("  seriesJobCodes: ").append(seriesJobCodes).append("\n");
    sb.append("  seriesTasks: ").append(seriesTasks).append("\n");
    sb.append("  seriesClients: ").append(seriesClients).append("\n");
    sb.append("  seriesProjects: ").append(seriesProjects).append("\n");
    sb.append("  totalsJobCodes: ").append(totalsJobCodes).append("\n");
    sb.append("  totalsTasks: ").append(totalsTasks).append("\n");
    sb.append("  totalsClients: ").append(totalsClients).append("\n");
    sb.append("  totalsProjects: ").append(totalsProjects).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
