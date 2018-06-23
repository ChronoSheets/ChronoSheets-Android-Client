
# CsApiOrgReportTimesheetFileAttachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** |  |  [optional]
**emailAddress** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**timesheetStart** | [**Date**](Date.md) |  |  [optional]
**timesheetEnd** | [**Date**](Date.md) |  |  [optional]
**timesheetId** | **Integer** |  |  [optional]
**documentS3SignedUrl** | **String** |  |  [optional]
**imageLargeS3SignedUrl** | **String** |  |  [optional]
**imageMediumS3SignedUrl** | **String** |  |  [optional]
**imageSmallS3SignedUrl** | **String** |  |  [optional]
**fileAttachmentId** | **Integer** |  |  [optional]
**userId** | **Integer** |  |  [optional]
**orgId** | **Integer** |  |  [optional]
**mobilePlatform** | [**MobilePlatformEnum**](#MobilePlatformEnum) | 0 &#x3D; Unknown, 1 &#x3D; iOS, 2 &#x3D; Android |  [optional]
**attachmentType** | [**AttachmentTypeEnum**](#AttachmentTypeEnum) | 1 &#x3D; Image, 30 &#x3D; WordDoc, 31 &#x3D; Pdf, 32 &#x3D; MSSpreadSheet, 33 &#x3D; MSPowerPoint, 34 &#x3D; RichTextFormat, 35 &#x3D; ZipFile, 100 &#x3D; Other |  [optional]
**notes** | **String** |  |  [optional]
**nonImageFilePath** | **String** |  |  [optional]
**imageLargeFilePath** | **String** |  |  [optional]
**imageMediumFilePath** | **String** |  |  [optional]
**imageSmallFilePath** | **String** |  |  [optional]
**originalFileName** | **String** |  |  [optional]
**latitude** | **Double** |  |  [optional]
**longitude** | **Double** |  |  [optional]
**dateUploaded** | [**Date**](Date.md) |  |  [optional]
**dateImageCaptured** | [**Date**](Date.md) |  |  [optional]
**storageAllocationBytes** | **Long** |  |  [optional]


<a name="MobilePlatformEnum"></a>
## Enum: MobilePlatformEnum
Name | Value
---- | -----


<a name="AttachmentTypeEnum"></a>
## Enum: AttachmentTypeEnum
Name | Value
---- | -----



