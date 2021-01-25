/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgReportTranscript {
  
  @SerializedName("FinishedJob")
  private Boolean finishedJob = null;
  @SerializedName("CompletedProcessing")
  private Date completedProcessing = null;
  @SerializedName("Created")
  private Date created = null;
  @SerializedName("StartedProcessing")
  private Date startedProcessing = null;
  @SerializedName("TranscriptionId")
  private Integer transcriptionId = null;
  @SerializedName("JobName")
  private String jobName = null;
  @SerializedName("Contents")
  private String contents = null;
  public enum MediaTypeEnum {
     Other,  Mp3,  Mp4,  Wav,  Flac, 
  };
  @SerializedName("MediaType")
  private MediaTypeEnum mediaType = null;
  public enum TranscriptionStatusEnum {
     Saved,  Processing,  Completed,  FailedWithError, 
  };
  @SerializedName("TranscriptionStatus")
  private TranscriptionStatusEnum transcriptionStatus = null;
  @SerializedName("Username")
  private String username = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;
  @SerializedName("DocumentS3SignedUrl")
  private String documentS3SignedUrl = null;
  @SerializedName("ImageLargeS3SignedUrl")
  private String imageLargeS3SignedUrl = null;
  @SerializedName("ImageMediumS3SignedUrl")
  private String imageMediumS3SignedUrl = null;
  @SerializedName("ImageSmallS3SignedUrl")
  private String imageSmallS3SignedUrl = null;
  @SerializedName("TimesheetStart")
  private Date timesheetStart = null;
  @SerializedName("TimesheetEnd")
  private Date timesheetEnd = null;
  @SerializedName("FileAttachmentId")
  private Integer fileAttachmentId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("OrgId")
  private Integer orgId = null;
  public enum MobilePlatformEnum {
     Unknown,  iOS,  Android, 
  };
  @SerializedName("MobilePlatform")
  private MobilePlatformEnum mobilePlatform = null;
  public enum AttachmentTypeEnum {
     Image,  WordDoc,  Pdf,  MSSpreadSheet,  MSPowerPoint,  RichTextFormat,  ZipFile,  Other,  Audio, 
  };
  @SerializedName("AttachmentType")
  private AttachmentTypeEnum attachmentType = null;
  @SerializedName("Notes")
  private String notes = null;
  @SerializedName("NonImageFilePath")
  private String nonImageFilePath = null;
  @SerializedName("ImageLargeFilePath")
  private String imageLargeFilePath = null;
  @SerializedName("ImageMediumFilePath")
  private String imageMediumFilePath = null;
  @SerializedName("ImageSmallFilePath")
  private String imageSmallFilePath = null;
  @SerializedName("OriginalFileName")
  private String originalFileName = null;
  @SerializedName("Latitude")
  private Double latitude = null;
  @SerializedName("Longitude")
  private Double longitude = null;
  @SerializedName("DateUploaded")
  private Date dateUploaded = null;
  @SerializedName("DateImageCaptured")
  private Date dateImageCaptured = null;
  @SerializedName("StorageAllocationBytes")
  private Long storageAllocationBytes = null;
  @SerializedName("AudioDurationSeconds")
  private Integer audioDurationSeconds = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFinishedJob() {
    return finishedJob;
  }
  public void setFinishedJob(Boolean finishedJob) {
    this.finishedJob = finishedJob;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCompletedProcessing() {
    return completedProcessing;
  }
  public void setCompletedProcessing(Date completedProcessing) {
    this.completedProcessing = completedProcessing;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStartedProcessing() {
    return startedProcessing;
  }
  public void setStartedProcessing(Date startedProcessing) {
    this.startedProcessing = startedProcessing;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTranscriptionId() {
    return transcriptionId;
  }
  public void setTranscriptionId(Integer transcriptionId) {
    this.transcriptionId = transcriptionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getJobName() {
    return jobName;
  }
  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TranscriptionStatusEnum getTranscriptionStatus() {
    return transcriptionStatus;
  }
  public void setTranscriptionStatus(TranscriptionStatusEnum transcriptionStatus) {
    this.transcriptionStatus = transcriptionStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
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
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The ID of the timesheet this attachment is attached to.
   **/
  @ApiModelProperty(value = "The ID of the timesheet this attachment is attached to.")
  public Integer getTimesheetId() {
    return timesheetId;
  }
  public void setTimesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
  }

  /**
   * The limited use signed URL for the document (if it's not an image).  This URL is unique and will eventually expire.  If the attachment is an image, then this won't be set.
   **/
  @ApiModelProperty(value = "The limited use signed URL for the document (if it's not an image).  This URL is unique and will eventually expire.  If the attachment is an image, then this won't be set.")
  public String getDocumentS3SignedUrl() {
    return documentS3SignedUrl;
  }
  public void setDocumentS3SignedUrl(String documentS3SignedUrl) {
    this.documentS3SignedUrl = documentS3SignedUrl;
  }

  /**
   * The limited use signed URL for the large version of the image.  This URL is unique and will eventually expire.  Only set when the attachment is actually an image.
   **/
  @ApiModelProperty(value = "The limited use signed URL for the large version of the image.  This URL is unique and will eventually expire.  Only set when the attachment is actually an image.")
  public String getImageLargeS3SignedUrl() {
    return imageLargeS3SignedUrl;
  }
  public void setImageLargeS3SignedUrl(String imageLargeS3SignedUrl) {
    this.imageLargeS3SignedUrl = imageLargeS3SignedUrl;
  }

  /**
   * The limited use signed URL for the medium version of the image.  This URL is unique and will eventually expire.  Only set when the attachment is actually an image.
   **/
  @ApiModelProperty(value = "The limited use signed URL for the medium version of the image.  This URL is unique and will eventually expire.  Only set when the attachment is actually an image.")
  public String getImageMediumS3SignedUrl() {
    return imageMediumS3SignedUrl;
  }
  public void setImageMediumS3SignedUrl(String imageMediumS3SignedUrl) {
    this.imageMediumS3SignedUrl = imageMediumS3SignedUrl;
  }

  /**
   * The limited use signed URL for the small version of the image.  This URL is unique and will eventually expire.  Only set when the attachment is actually an image.
   **/
  @ApiModelProperty(value = "The limited use signed URL for the small version of the image.  This URL is unique and will eventually expire.  Only set when the attachment is actually an image.")
  public String getImageSmallS3SignedUrl() {
    return imageSmallS3SignedUrl;
  }
  public void setImageSmallS3SignedUrl(String imageSmallS3SignedUrl) {
    this.imageSmallS3SignedUrl = imageSmallS3SignedUrl;
  }

  /**
   * The start date and time of the timesheet that this attachment is attached to
   **/
  @ApiModelProperty(value = "The start date and time of the timesheet that this attachment is attached to")
  public Date getTimesheetStart() {
    return timesheetStart;
  }
  public void setTimesheetStart(Date timesheetStart) {
    this.timesheetStart = timesheetStart;
  }

  /**
   * The end date and time of the timesheet that this attachment is attached to
   **/
  @ApiModelProperty(value = "The end date and time of the timesheet that this attachment is attached to")
  public Date getTimesheetEnd() {
    return timesheetEnd;
  }
  public void setTimesheetEnd(Date timesheetEnd) {
    this.timesheetEnd = timesheetEnd;
  }

  /**
   * The ID of the file attachment
   **/
  @ApiModelProperty(value = "The ID of the file attachment")
  public Integer getFileAttachmentId() {
    return fileAttachmentId;
  }
  public void setFileAttachmentId(Integer fileAttachmentId) {
    this.fileAttachmentId = fileAttachmentId;
  }

  /**
   * The ID of the user who attached the file
   **/
  @ApiModelProperty(value = "The ID of the user who attached the file")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The ID of the organisation that owns the file and employs the employee
   **/
  @ApiModelProperty(value = "The ID of the organisation that owns the file and employs the employee")
  public Integer getOrgId() {
    return orgId;
  }
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  /**
   * The mobile platform that was used to attach the file
   **/
  @ApiModelProperty(value = "The mobile platform that was used to attach the file")
  public MobilePlatformEnum getMobilePlatform() {
    return mobilePlatform;
  }
  public void setMobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
  }

  /**
   * The type of file attachment
   **/
  @ApiModelProperty(value = "The type of file attachment")
  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }
  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }

  /**
   * Any notes regarding the file attachment
   **/
  @ApiModelProperty(value = "Any notes regarding the file attachment")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * The path to the file attachment as hosted by ChronoSheets storage, if it's not an image.  If the attachment is an image then this won't be set.
   **/
  @ApiModelProperty(value = "The path to the file attachment as hosted by ChronoSheets storage, if it's not an image.  If the attachment is an image then this won't be set.")
  public String getNonImageFilePath() {
    return nonImageFilePath;
  }
  public void setNonImageFilePath(String nonImageFilePath) {
    this.nonImageFilePath = nonImageFilePath;
  }

  /**
   * The path to the file attachment as hosted by ChronoSheets storage, only set if it's an image.  This is regarding the large version of the image.
   **/
  @ApiModelProperty(value = "The path to the file attachment as hosted by ChronoSheets storage, only set if it's an image.  This is regarding the large version of the image.")
  public String getImageLargeFilePath() {
    return imageLargeFilePath;
  }
  public void setImageLargeFilePath(String imageLargeFilePath) {
    this.imageLargeFilePath = imageLargeFilePath;
  }

  /**
   * The path to the file attachment as hosted by ChronoSheets storage, only set if it's an image.  This is regarding the medium version of the image.
   **/
  @ApiModelProperty(value = "The path to the file attachment as hosted by ChronoSheets storage, only set if it's an image.  This is regarding the medium version of the image.")
  public String getImageMediumFilePath() {
    return imageMediumFilePath;
  }
  public void setImageMediumFilePath(String imageMediumFilePath) {
    this.imageMediumFilePath = imageMediumFilePath;
  }

  /**
   * The path to the file attachment as hosted by ChronoSheets storage, only set if it's an image.  This is regarding the small version of the image.
   **/
  @ApiModelProperty(value = "The path to the file attachment as hosted by ChronoSheets storage, only set if it's an image.  This is regarding the small version of the image.")
  public String getImageSmallFilePath() {
    return imageSmallFilePath;
  }
  public void setImageSmallFilePath(String imageSmallFilePath) {
    this.imageSmallFilePath = imageSmallFilePath;
  }

  /**
   * The original file name of the attachment
   **/
  @ApiModelProperty(value = "The original file name of the attachment")
  public String getOriginalFileName() {
    return originalFileName;
  }
  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  /**
   * Meta-data indicating the latitude of the file attachment.  If the attachment is an image, this data originates from the meta data inside the image file.
   **/
  @ApiModelProperty(value = "Meta-data indicating the latitude of the file attachment.  If the attachment is an image, this data originates from the meta data inside the image file.")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * Meta-data indicating the longitude of the file attachment.  If the attachment is an image, this data originates from the meta data inside the image file.
   **/
  @ApiModelProperty(value = "Meta-data indicating the longitude of the file attachment.  If the attachment is an image, this data originates from the meta data inside the image file.")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   * The date and time the attachment was uploaded.  Time is in UTC.
   **/
  @ApiModelProperty(value = "The date and time the attachment was uploaded.  Time is in UTC.")
  public Date getDateUploaded() {
    return dateUploaded;
  }
  public void setDateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
  }

  /**
   * The original date and time the image was captured, if it was an image.  This data originates from the meta data inside the image file.
   **/
  @ApiModelProperty(value = "The original date and time the image was captured, if it was an image.  This data originates from the meta data inside the image file.")
  public Date getDateImageCaptured() {
    return dateImageCaptured;
  }
  public void setDateImageCaptured(Date dateImageCaptured) {
    this.dateImageCaptured = dateImageCaptured;
  }

  /**
   * The number of bytes allocated for storing the file attachment.
   **/
  @ApiModelProperty(value = "The number of bytes allocated for storing the file attachment.")
  public Long getStorageAllocationBytes() {
    return storageAllocationBytes;
  }
  public void setStorageAllocationBytes(Long storageAllocationBytes) {
    this.storageAllocationBytes = storageAllocationBytes;
  }

  /**
   * If the attachment was an audio file, this field indicates the duration of the audio file in seconds.  This data originates from the meta data inside the audio file.
   **/
  @ApiModelProperty(value = "If the attachment was an audio file, this field indicates the duration of the audio file in seconds.  This data originates from the meta data inside the audio file.")
  public Integer getAudioDurationSeconds() {
    return audioDurationSeconds;
  }
  public void setAudioDurationSeconds(Integer audioDurationSeconds) {
    this.audioDurationSeconds = audioDurationSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgReportTranscript orgReportTranscript = (OrgReportTranscript) o;
    return (this.finishedJob == null ? orgReportTranscript.finishedJob == null : this.finishedJob.equals(orgReportTranscript.finishedJob)) &&
        (this.completedProcessing == null ? orgReportTranscript.completedProcessing == null : this.completedProcessing.equals(orgReportTranscript.completedProcessing)) &&
        (this.created == null ? orgReportTranscript.created == null : this.created.equals(orgReportTranscript.created)) &&
        (this.startedProcessing == null ? orgReportTranscript.startedProcessing == null : this.startedProcessing.equals(orgReportTranscript.startedProcessing)) &&
        (this.transcriptionId == null ? orgReportTranscript.transcriptionId == null : this.transcriptionId.equals(orgReportTranscript.transcriptionId)) &&
        (this.jobName == null ? orgReportTranscript.jobName == null : this.jobName.equals(orgReportTranscript.jobName)) &&
        (this.contents == null ? orgReportTranscript.contents == null : this.contents.equals(orgReportTranscript.contents)) &&
        (this.mediaType == null ? orgReportTranscript.mediaType == null : this.mediaType.equals(orgReportTranscript.mediaType)) &&
        (this.transcriptionStatus == null ? orgReportTranscript.transcriptionStatus == null : this.transcriptionStatus.equals(orgReportTranscript.transcriptionStatus)) &&
        (this.username == null ? orgReportTranscript.username == null : this.username.equals(orgReportTranscript.username)) &&
        (this.emailAddress == null ? orgReportTranscript.emailAddress == null : this.emailAddress.equals(orgReportTranscript.emailAddress)) &&
        (this.firstName == null ? orgReportTranscript.firstName == null : this.firstName.equals(orgReportTranscript.firstName)) &&
        (this.lastName == null ? orgReportTranscript.lastName == null : this.lastName.equals(orgReportTranscript.lastName)) &&
        (this.timesheetId == null ? orgReportTranscript.timesheetId == null : this.timesheetId.equals(orgReportTranscript.timesheetId)) &&
        (this.documentS3SignedUrl == null ? orgReportTranscript.documentS3SignedUrl == null : this.documentS3SignedUrl.equals(orgReportTranscript.documentS3SignedUrl)) &&
        (this.imageLargeS3SignedUrl == null ? orgReportTranscript.imageLargeS3SignedUrl == null : this.imageLargeS3SignedUrl.equals(orgReportTranscript.imageLargeS3SignedUrl)) &&
        (this.imageMediumS3SignedUrl == null ? orgReportTranscript.imageMediumS3SignedUrl == null : this.imageMediumS3SignedUrl.equals(orgReportTranscript.imageMediumS3SignedUrl)) &&
        (this.imageSmallS3SignedUrl == null ? orgReportTranscript.imageSmallS3SignedUrl == null : this.imageSmallS3SignedUrl.equals(orgReportTranscript.imageSmallS3SignedUrl)) &&
        (this.timesheetStart == null ? orgReportTranscript.timesheetStart == null : this.timesheetStart.equals(orgReportTranscript.timesheetStart)) &&
        (this.timesheetEnd == null ? orgReportTranscript.timesheetEnd == null : this.timesheetEnd.equals(orgReportTranscript.timesheetEnd)) &&
        (this.fileAttachmentId == null ? orgReportTranscript.fileAttachmentId == null : this.fileAttachmentId.equals(orgReportTranscript.fileAttachmentId)) &&
        (this.userId == null ? orgReportTranscript.userId == null : this.userId.equals(orgReportTranscript.userId)) &&
        (this.orgId == null ? orgReportTranscript.orgId == null : this.orgId.equals(orgReportTranscript.orgId)) &&
        (this.mobilePlatform == null ? orgReportTranscript.mobilePlatform == null : this.mobilePlatform.equals(orgReportTranscript.mobilePlatform)) &&
        (this.attachmentType == null ? orgReportTranscript.attachmentType == null : this.attachmentType.equals(orgReportTranscript.attachmentType)) &&
        (this.notes == null ? orgReportTranscript.notes == null : this.notes.equals(orgReportTranscript.notes)) &&
        (this.nonImageFilePath == null ? orgReportTranscript.nonImageFilePath == null : this.nonImageFilePath.equals(orgReportTranscript.nonImageFilePath)) &&
        (this.imageLargeFilePath == null ? orgReportTranscript.imageLargeFilePath == null : this.imageLargeFilePath.equals(orgReportTranscript.imageLargeFilePath)) &&
        (this.imageMediumFilePath == null ? orgReportTranscript.imageMediumFilePath == null : this.imageMediumFilePath.equals(orgReportTranscript.imageMediumFilePath)) &&
        (this.imageSmallFilePath == null ? orgReportTranscript.imageSmallFilePath == null : this.imageSmallFilePath.equals(orgReportTranscript.imageSmallFilePath)) &&
        (this.originalFileName == null ? orgReportTranscript.originalFileName == null : this.originalFileName.equals(orgReportTranscript.originalFileName)) &&
        (this.latitude == null ? orgReportTranscript.latitude == null : this.latitude.equals(orgReportTranscript.latitude)) &&
        (this.longitude == null ? orgReportTranscript.longitude == null : this.longitude.equals(orgReportTranscript.longitude)) &&
        (this.dateUploaded == null ? orgReportTranscript.dateUploaded == null : this.dateUploaded.equals(orgReportTranscript.dateUploaded)) &&
        (this.dateImageCaptured == null ? orgReportTranscript.dateImageCaptured == null : this.dateImageCaptured.equals(orgReportTranscript.dateImageCaptured)) &&
        (this.storageAllocationBytes == null ? orgReportTranscript.storageAllocationBytes == null : this.storageAllocationBytes.equals(orgReportTranscript.storageAllocationBytes)) &&
        (this.audioDurationSeconds == null ? orgReportTranscript.audioDurationSeconds == null : this.audioDurationSeconds.equals(orgReportTranscript.audioDurationSeconds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.finishedJob == null ? 0: this.finishedJob.hashCode());
    result = 31 * result + (this.completedProcessing == null ? 0: this.completedProcessing.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.startedProcessing == null ? 0: this.startedProcessing.hashCode());
    result = 31 * result + (this.transcriptionId == null ? 0: this.transcriptionId.hashCode());
    result = 31 * result + (this.jobName == null ? 0: this.jobName.hashCode());
    result = 31 * result + (this.contents == null ? 0: this.contents.hashCode());
    result = 31 * result + (this.mediaType == null ? 0: this.mediaType.hashCode());
    result = 31 * result + (this.transcriptionStatus == null ? 0: this.transcriptionStatus.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.timesheetId == null ? 0: this.timesheetId.hashCode());
    result = 31 * result + (this.documentS3SignedUrl == null ? 0: this.documentS3SignedUrl.hashCode());
    result = 31 * result + (this.imageLargeS3SignedUrl == null ? 0: this.imageLargeS3SignedUrl.hashCode());
    result = 31 * result + (this.imageMediumS3SignedUrl == null ? 0: this.imageMediumS3SignedUrl.hashCode());
    result = 31 * result + (this.imageSmallS3SignedUrl == null ? 0: this.imageSmallS3SignedUrl.hashCode());
    result = 31 * result + (this.timesheetStart == null ? 0: this.timesheetStart.hashCode());
    result = 31 * result + (this.timesheetEnd == null ? 0: this.timesheetEnd.hashCode());
    result = 31 * result + (this.fileAttachmentId == null ? 0: this.fileAttachmentId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.orgId == null ? 0: this.orgId.hashCode());
    result = 31 * result + (this.mobilePlatform == null ? 0: this.mobilePlatform.hashCode());
    result = 31 * result + (this.attachmentType == null ? 0: this.attachmentType.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    result = 31 * result + (this.nonImageFilePath == null ? 0: this.nonImageFilePath.hashCode());
    result = 31 * result + (this.imageLargeFilePath == null ? 0: this.imageLargeFilePath.hashCode());
    result = 31 * result + (this.imageMediumFilePath == null ? 0: this.imageMediumFilePath.hashCode());
    result = 31 * result + (this.imageSmallFilePath == null ? 0: this.imageSmallFilePath.hashCode());
    result = 31 * result + (this.originalFileName == null ? 0: this.originalFileName.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.dateUploaded == null ? 0: this.dateUploaded.hashCode());
    result = 31 * result + (this.dateImageCaptured == null ? 0: this.dateImageCaptured.hashCode());
    result = 31 * result + (this.storageAllocationBytes == null ? 0: this.storageAllocationBytes.hashCode());
    result = 31 * result + (this.audioDurationSeconds == null ? 0: this.audioDurationSeconds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgReportTranscript {\n");
    
    sb.append("  finishedJob: ").append(finishedJob).append("\n");
    sb.append("  completedProcessing: ").append(completedProcessing).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  startedProcessing: ").append(startedProcessing).append("\n");
    sb.append("  transcriptionId: ").append(transcriptionId).append("\n");
    sb.append("  jobName: ").append(jobName).append("\n");
    sb.append("  contents: ").append(contents).append("\n");
    sb.append("  mediaType: ").append(mediaType).append("\n");
    sb.append("  transcriptionStatus: ").append(transcriptionStatus).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  timesheetId: ").append(timesheetId).append("\n");
    sb.append("  documentS3SignedUrl: ").append(documentS3SignedUrl).append("\n");
    sb.append("  imageLargeS3SignedUrl: ").append(imageLargeS3SignedUrl).append("\n");
    sb.append("  imageMediumS3SignedUrl: ").append(imageMediumS3SignedUrl).append("\n");
    sb.append("  imageSmallS3SignedUrl: ").append(imageSmallS3SignedUrl).append("\n");
    sb.append("  timesheetStart: ").append(timesheetStart).append("\n");
    sb.append("  timesheetEnd: ").append(timesheetEnd).append("\n");
    sb.append("  fileAttachmentId: ").append(fileAttachmentId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  orgId: ").append(orgId).append("\n");
    sb.append("  mobilePlatform: ").append(mobilePlatform).append("\n");
    sb.append("  attachmentType: ").append(attachmentType).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  nonImageFilePath: ").append(nonImageFilePath).append("\n");
    sb.append("  imageLargeFilePath: ").append(imageLargeFilePath).append("\n");
    sb.append("  imageMediumFilePath: ").append(imageMediumFilePath).append("\n");
    sb.append("  imageSmallFilePath: ").append(imageSmallFilePath).append("\n");
    sb.append("  originalFileName: ").append(originalFileName).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  dateUploaded: ").append(dateUploaded).append("\n");
    sb.append("  dateImageCaptured: ").append(dateImageCaptured).append("\n");
    sb.append("  storageAllocationBytes: ").append(storageAllocationBytes).append("\n");
    sb.append("  audioDurationSeconds: ").append(audioDurationSeconds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
