# ChronoSheetsAPI

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.chronosheets.api.android</groupId>
    <artifactId>ChronoSheetsAPI</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.chronosheets.api.android:ChronoSheetsAPI:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/ChronoSheetsAPI-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ChronoSheetsClientLibApi.AggregateClientProjectsApi;

public class AggregateClientProjectsApiExample {

    public static void main(String[] args) {
        AggregateClientProjectsApi apiInstance = new AggregateClientProjectsApi();
        String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
        try {
            ApiResponseListAggregateClient result = apiInstance.aggregateClientProjectsGetAggregateClientProjects(xChronosheetsAuth);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregateClientProjectsApi#aggregateClientProjectsGetAggregateClientProjects");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.chronosheets.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AggregateClientProjectsApi* | [**aggregateClientProjectsGetAggregateClientProjects**](docs/AggregateClientProjectsApi.md#aggregateClientProjectsGetAggregateClientProjects) | **GET** /AggregateClientProjects/GetAggregateClientProjects | Get client and project information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageClientsAndProjects&#39; permissions.
*AggregateJobTasksApi* | [**aggregateJobTasksGetAggregateJobTasks**](docs/AggregateJobTasksApi.md#aggregateJobTasksGetAggregateJobTasks) | **GET** /AggregateJobTasks/GetAggregateJobTasks | Get jobs and tasks information, aggregated.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ClientsApi* | [**clientsCreateClient**](docs/ClientsApi.md#clientsCreateClient) | **POST** /Clients/CreateClient | Create a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*ClientsApi* | [**clientsGetClient**](docs/ClientsApi.md#clientsGetClient) | **GET** /Clients/GetClient | Get a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ClientsApi* | [**clientsGetClients**](docs/ClientsApi.md#clientsGetClients) | **GET** /Clients/GetClients | Get a collection of clients that are under your organisation.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ClientsApi* | [**clientsUpdateClient**](docs/ClientsApi.md#clientsUpdateClient) | **PUT** /Clients/UpdateClient | Update a client.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*FileAttachmentsApi* | [**fileAttachmentsDeleteTimesheetFileAttachment**](docs/FileAttachmentsApi.md#fileAttachmentsDeleteTimesheetFileAttachment) | **DELETE** /FileAttachments/DeleteTimesheetFileAttachment | Delete a particular timesheet file attachment  Requires the &#39;SubmitTimesheets&#39; permission.
*FileAttachmentsApi* | [**fileAttachmentsGetFileAttachmentById**](docs/FileAttachmentsApi.md#fileAttachmentsGetFileAttachmentById) | **GET** /FileAttachments/GetFileAttachmentById | Get a particular file attachment by ID.  User must own the file attachment for access.
*FileAttachmentsApi* | [**fileAttachmentsGetMyFileAttachments**](docs/FileAttachmentsApi.md#fileAttachmentsGetMyFileAttachments) | **GET** /FileAttachments/GetMyFileAttachments | Get my file attachments.  Get files you&#39;ve attached to timesheets.
*FleetApi* | [**fleetCreateVehicle**](docs/FleetApi.md#fleetCreateVehicle) | **POST** /Fleet/CreateVehicle | Create a vehicle.    Requires the &#39;ManageFleet&#39; permission.
*FleetApi* | [**fleetDeleteVehicle**](docs/FleetApi.md#fleetDeleteVehicle) | **DELETE** /Fleet/DeleteVehicle | Delete a vehicle from the fleet.  Requires the &#39;ManageFleet&#39; permission.
*FleetApi* | [**fleetGetVehicleById**](docs/FleetApi.md#fleetGetVehicleById) | **GET** /Fleet/GetVehicleById | Get a particular vehicle.  Does not require any special permission.
*FleetApi* | [**fleetGetVehicles**](docs/FleetApi.md#fleetGetVehicles) | **GET** /Fleet/GetVehicles | Get a collection of vehicles that are under your organisation.    Does not require any special permission.
*FleetApi* | [**fleetUpdateVehicle**](docs/FleetApi.md#fleetUpdateVehicle) | **PUT** /Fleet/UpdateVehicle | Update a vehicle.    Requires the &#39;ManageFleet&#39; permission.
*GeoFencingApi* | [**geoFencingCreateGeofence**](docs/GeoFencingApi.md#geoFencingCreateGeofence) | **POST** /GeoFencing/CreateGeofence | Create a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
*GeoFencingApi* | [**geoFencingDeleteGeofence**](docs/GeoFencingApi.md#geoFencingDeleteGeofence) | **DELETE** /GeoFencing/DeleteGeofence | Deletes a geofence.  Requires the &#39;ManageGeofencing&#39; permission.
*GeoFencingApi* | [**geoFencingGetGeofenceById**](docs/GeoFencingApi.md#geoFencingGetGeofenceById) | **GET** /GeoFencing/GetGeofenceById | Get a geofence by ID  Requires the &#39;SubmitTimesheets&#39; permission.
*GeoFencingApi* | [**geoFencingGetGeofences**](docs/GeoFencingApi.md#geoFencingGetGeofences) | **GET** /GeoFencing/GetGeofences | Get geofences belonging to your organisation  Requires the &#39;SubmitTimesheets&#39; permission.
*GeoFencingApi* | [**geoFencingGetGeofencesBasicInfo**](docs/GeoFencingApi.md#geoFencingGetGeofencesBasicInfo) | **GET** /GeoFencing/GetGeofencesBasicInfo | Gets a list of all geofences in your organisation, including just the name and ID.
*GeoFencingApi* | [**geoFencingUpdateGeofence**](docs/GeoFencingApi.md#geoFencingUpdateGeofence) | **PUT** /GeoFencing/UpdateGeofence | Updates a geofencing with rules to be used for clock on/off automation.  Requires the &#39;ManageGeofencing&#39; permission.
*JobCodesApi* | [**jobCodesCreateJobCode**](docs/JobCodesApi.md#jobCodesCreateJobCode) | **POST** /JobCodes/CreateJobCode | Create a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
*JobCodesApi* | [**jobCodesDeleteJobCode**](docs/JobCodesApi.md#jobCodesDeleteJobCode) | **DELETE** /JobCodes/DeleteJobCode | Delete a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
*JobCodesApi* | [**jobCodesGetJobCodeById**](docs/JobCodesApi.md#jobCodesGetJobCodeById) | **GET** /JobCodes/GetJobCodeById | Get a particular job code by job code id.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
*JobCodesApi* | [**jobCodesGetJobCodes**](docs/JobCodesApi.md#jobCodesGetJobCodes) | **GET** /JobCodes/GetJobCodes | Get job codes for your organisation.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
*JobCodesApi* | [**jobCodesUpdateJobCode**](docs/JobCodesApi.md#jobCodesUpdateJobCode) | **PUT** /JobCodes/UpdateJobCode | Update a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
*OrganisationApi* | [**organisationGetOrganisation**](docs/OrganisationApi.md#organisationGetOrganisation) | **GET** /Organisation/GetOrganisation | Get your organisation.    Requires &#39;OrganisationAdmin&#39; permission.
*OrganisationApi* | [**organisationUpdateOrganisation**](docs/OrganisationApi.md#organisationUpdateOrganisation) | **PUT** /Organisation/UpdateOrganisation | Update an organisation.    Requires &#39;OrganisationAdmin&#39; permission.
*OrganisationGroupUsersApi* | [**organisationGroupUsersGetOrganisationGroupUsers**](docs/OrganisationGroupUsersApi.md#organisationGroupUsersGetOrganisationGroupUsers) | **GET** /OrganisationGroupUsers/GetOrganisationGroupUsers | Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupUsersApi* | [**organisationGroupUsersUpdateOrganisationGroupUsers**](docs/OrganisationGroupUsersApi.md#organisationGroupUsersUpdateOrganisationGroupUsers) | **PUT** /OrganisationGroupUsers/UpdateOrganisationGroupUsers | Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsCreateOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsCreateOrganisationGroup) | **POST** /OrganisationGroups/CreateOrganisationGroup | Create an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsDeleteOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsDeleteOrganisationGroup) | **DELETE** /OrganisationGroups/DeleteOrganisationGroup | 
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroup) | **GET** /OrganisationGroups/GetOrganisationGroup | Get a particular organisation group.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroups**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroups) | **GET** /OrganisationGroups/GetOrganisationGroups | Get a collection of organisation groups that are under your organisation.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroupsForJob**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForJob) | **GET** /OrganisationGroups/GetOrganisationGroupsForJob | Get org groups for a particular job.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsGetOrganisationGroupsForVehicle**](docs/OrganisationGroupsApi.md#organisationGroupsGetOrganisationGroupsForVehicle) | **GET** /OrganisationGroups/GetOrganisationGroupsForVehicle | Get org groups for a particular vehicle.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageFleet&#39; or &#39;ManageOrganisationUsers&#39; permissions.
*OrganisationGroupsApi* | [**organisationGroupsUpdateOrganisationGroup**](docs/OrganisationGroupsApi.md#organisationGroupsUpdateOrganisationGroup) | **PUT** /OrganisationGroups/UpdateOrganisationGroup | Update an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
*ProjectsApi* | [**projectsCreateProject**](docs/ProjectsApi.md#projectsCreateProject) | **POST** /Projects/CreateProject | Create a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*ProjectsApi* | [**projectsGetProjectById**](docs/ProjectsApi.md#projectsGetProjectById) | **GET** /Projects/GetProjectById | Get a project by its Id.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ProjectsApi* | [**projectsGetProjectsForClient**](docs/ProjectsApi.md#projectsGetProjectsForClient) | **GET** /Projects/GetProjectsForClient | Get projects for a particular client.    Requires the &#39;ManageClientsAndProjects&#39; or &#39;ManageJobsAndTask&#39; permissions.
*ProjectsApi* | [**projectsUpdateProject**](docs/ProjectsApi.md#projectsUpdateProject) | **PUT** /Projects/UpdateProject | Update a project.    Requires the &#39;ManageClientsAndProjects&#39; permission.
*ReportsApi* | [**reportsGetAllChartsDataAdmin**](docs/ReportsApi.md#reportsGetAllChartsDataAdmin) | **GET** /Reports/GetAllChartsDataAdmin | Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetAllChartsDataUser**](docs/ReportsApi.md#reportsGetAllChartsDataUser) | **GET** /Reports/GetAllChartsDataUser | Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.
*ReportsApi* | [**reportsGetFleetSummaryAdmin**](docs/ReportsApi.md#reportsGetFleetSummaryAdmin) | **GET** /Reports/GetFleetSummaryAdmin | Gets a summary report, which includes total distance travelled and total running costs, for vehicles within your organisation  Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetOrgTripById**](docs/ReportsApi.md#reportsGetOrgTripById) | **GET** /Reports/GetOrgTripById | Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetOrganisationTimesheetFileAttachments**](docs/ReportsApi.md#reportsGetOrganisationTimesheetFileAttachments) | **GET** /Reports/GetOrganisationTimesheetFileAttachments | Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records)  Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetOrganisationTranscripts**](docs/ReportsApi.md#reportsGetOrganisationTranscripts) | **GET** /Reports/GetOrganisationTranscripts | Reports on Organisation transcripts (When an audio file is attached, it will be automatically transcribed, these are the transcriptions)    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetOrganisationTrips**](docs/ReportsApi.md#reportsGetOrganisationTrips) | **GET** /Reports/GetOrganisationTrips | Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsGetRawDataAdmin**](docs/ReportsApi.md#reportsGetRawDataAdmin) | **GET** /Reports/GetRawDataAdmin | Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsProjectCostingsAdmin**](docs/ReportsApi.md#reportsProjectCostingsAdmin) | **GET** /Reports/ProjectCostingsAdmin | Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.
*ReportsApi* | [**reportsUserJobsOverTime**](docs/ReportsApi.md#reportsUserJobsOverTime) | **GET** /Reports/UserJobsOverTime | Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.
*TasksApi* | [**tasksCreateTask**](docs/TasksApi.md#tasksCreateTask) | **POST** /Tasks/CreateTask | Create a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
*TasksApi* | [**tasksDeleteTask**](docs/TasksApi.md#tasksDeleteTask) | **DELETE** /Tasks/DeleteTask | Delete a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
*TasksApi* | [**tasksGetTaskById**](docs/TasksApi.md#tasksGetTaskById) | **GET** /Tasks/GetTaskById | Get a particular task by Id.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*TasksApi* | [**tasksGetTasks**](docs/TasksApi.md#tasksGetTasks) | **GET** /Tasks/GetTasks | Get tasks in your organisation.   Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*TasksApi* | [**tasksGetTasksForJob**](docs/TasksApi.md#tasksGetTasksForJob) | **GET** /Tasks/GetTasksForJob | Get a collection of tasks for a particular Job, specified by JobId.    Requires the &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTask&#39; permissions.
*TasksApi* | [**tasksUpdateTask**](docs/TasksApi.md#tasksUpdateTask) | **PUT** /Tasks/UpdateTask | Update a task.    Requires the &#39;ManageJobsAndTask&#39; permission.
*TimesheetAutomationApi* | [**timesheetAutomationCreateAutomationStep**](docs/TimesheetAutomationApi.md#timesheetAutomationCreateAutomationStep) | **POST** /TimesheetAutomation/CreateAutomationStep | Creates an automation step.  Timesheet automation is determined by looking at steps taken by the user.  Create a step to log some automation action, such as entering a geofence or tapping on an NFC badge.  Requires the &#39;SubmitTimesheets&#39; permission.
*TimesheetAutomationApi* | [**timesheetAutomationGetTimesheetAutomationAuditTrail**](docs/TimesheetAutomationApi.md#timesheetAutomationGetTimesheetAutomationAuditTrail) | **GET** /TimesheetAutomation/GetTimesheetAutomationAuditTrail | Retrieve the timesheet automation / alerts for geofences activities or NFC tap on/off.  Requires the &#39;ManageGeofencing&#39; permission.
*TimesheetsApi* | [**timesheetsCreateSingleTimesheet**](docs/TimesheetsApi.md#timesheetsCreateSingleTimesheet) | **POST** /Timesheets/CreateSingleTimesheet | Inserts a single timesheet record.    Requires the &#39;SubmitTimesheets&#39; permission.
*TimesheetsApi* | [**timesheetsDeleteTimesheet**](docs/TimesheetsApi.md#timesheetsDeleteTimesheet) | **DELETE** /Timesheets/DeleteTimesheet | Delete a timesheet.    Requires the &#39;SubmitTimesheets&#39; permission.
*TimesheetsApi* | [**timesheetsGetTimesheets**](docs/TimesheetsApi.md#timesheetsGetTimesheets) | **GET** /Timesheets/GetTimesheets | Get timesheets between start and end dates.  Note: the date range cannot exceed 24 hours.  This method is generally used to get timesheets for a particular day.    Requires the &#39;SubmitTimesheets&#39; permission.
*TimesheetsApi* | [**timesheetsUpdateTimesheets**](docs/TimesheetsApi.md#timesheetsUpdateTimesheets) | **PUT** /Timesheets/UpdateTimesheets | Batch update timesheets.    Requires the &#39;SubmitTimesheets&#39; permission.
*TranscriptsApi* | [**transcriptsGetMyTranscript**](docs/TranscriptsApi.md#transcriptsGetMyTranscript) | **GET** /Transcripts/GetMyTranscript | Get an audio to text transcript for a particular audio file attachment
*TranscriptsApi* | [**transcriptsGetMyTranscripts**](docs/TranscriptsApi.md#transcriptsGetMyTranscripts) | **GET** /Transcripts/GetMyTranscripts | Get my file transcripts.  Get audio to text transcripts that you&#39;ve created.
*TripsApi* | [**tripsCreateTrip**](docs/TripsApi.md#tripsCreateTrip) | **POST** /Trips/CreateTrip | Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.    Requires the &#39;SubmitTimesheets&#39; permission.
*TripsApi* | [**tripsGetMyTripById**](docs/TripsApi.md#tripsGetMyTripById) | **GET** /Trips/GetMyTripById | Get trip by Id.    Requires the &#39;ViewMyTrips&#39; permission.
*TripsApi* | [**tripsGetMyTrips**](docs/TripsApi.md#tripsGetMyTrips) | **GET** /Trips/GetMyTrips | Get my trips.  Get the GPS trips you&#39;ve recorded and submitted.    Requires the &#39;ViewMyTrips&#39; permission.
*UserJobFavouritesApi* | [**userJobFavouritesCreateJobFavourite**](docs/UserJobFavouritesApi.md#userJobFavouritesCreateJobFavourite) | **POST** /UserJobFavourites/CreateJobFavourite | Create a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
*UserJobFavouritesApi* | [**userJobFavouritesDeleteJobFavourite**](docs/UserJobFavouritesApi.md#userJobFavouritesDeleteJobFavourite) | **DELETE** /UserJobFavourites/DeleteJobFavourite | Delete a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
*UserJobFavouritesApi* | [**userJobFavouritesGetJobFavourites**](docs/UserJobFavouritesApi.md#userJobFavouritesGetJobFavourites) | **GET** /UserJobFavourites/GetJobFavourites | Get your job favourites.    Requires the &#39;SubmitTimesheets&#39; permission.
*UserPayRatesApi* | [**userPayRatesCreatePayRate**](docs/UserPayRatesApi.md#userPayRatesCreatePayRate) | **POST** /UserPayRates/CreatePayRate | Create a new pay rate for a particular user, archiving the previous pay rate.    Requires the &#39;ManageOrganisationUsers&#39; permission.
*UserPayRatesApi* | [**userPayRatesGetPayRates**](docs/UserPayRatesApi.md#userPayRatesGetPayRates) | **GET** /UserPayRates/GetPayRates | Get a collection of pay rates for a particular user, specified by user id.    Requires the &#39;ManageOrganisationUsers&#39; permission.
*UserProfileApi* | [**userProfileDoLogin**](docs/UserProfileApi.md#userProfileDoLogin) | **PUT** /UserProfile/DoLogin | Login to your ChronoSheets account and obtain an Auth Token which you can use for other ChronoSheets API methods.    Does not require any special permissions.
*UserProfileApi* | [**userProfileDoLogout**](docs/UserProfileApi.md#userProfileDoLogout) | **DELETE** /UserProfile/DoLogout | Logout of your ChronoSheets account.  This method ends and deletes your active session.    Does not require any special permissions.
*UserProfileApi* | [**userProfileGetMyProfile**](docs/UserProfileApi.md#userProfileGetMyProfile) | **GET** /UserProfile/GetMyProfile | Get your own profile.  Use this method to obtain detailed information about your ChronoSheets user profile.    Does not require any special permissions.
*UserProfileApi* | [**userProfileKeepSessionAlive**](docs/UserProfileApi.md#userProfileKeepSessionAlive) | **GET** /UserProfile/KeepSessionAlive | Keep a session alive.  Use this method to keep a session active.  You could use this to &#39;ping&#39; ChronoSheets every &#39;x&#39; minutes to make sure your Auth Token will keep working.    Does not require any special permissions.
*UserProfileApi* | [**userProfileUpdateMyProfile**](docs/UserProfileApi.md#userProfileUpdateMyProfile) | **PUT** /UserProfile/UpdateMyProfile | Update your own profile.  Use this method to update your profile information or update/change your password.    Does not require any special permissions.
*UsersApi* | [**usersCreateTimesheetUser**](docs/UsersApi.md#usersCreateTimesheetUser) | **POST** /Users/CreateTimesheetUser | Create a user account in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; permission.
*UsersApi* | [**usersGetTimesheetUser**](docs/UsersApi.md#usersGetTimesheetUser) | **GET** /Users/GetTimesheetUser | Get a particular user in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
*UsersApi* | [**usersGetTimesheetUsers**](docs/UsersApi.md#usersGetTimesheetUsers) | **GET** /Users/GetTimesheetUsers | Get users accounts in your organisation.  Requires the &#39;ManageOrganisationUsers&#39; or &#39;ManageOrganisationGroups&#39; permissions.
*UsersApi* | [**usersUpdateTimesheetUser**](docs/UsersApi.md#usersUpdateTimesheetUser) | **PUT** /Users/UpdateTimesheetUser | Update a user account.  Requires the &#39;ManageOrganisationUsers&#39; permission.
*UsualHoursApi* | [**usualHoursGetUsualHours**](docs/UsualHoursApi.md#usualHoursGetUsualHours) | **GET** /UsualHours/GetUsualHours | Get usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; permission.
*UsualHoursApi* | [**usualHoursSetUsualHours**](docs/UsualHoursApi.md#usualHoursSetUsualHours) | **PUT** /UsualHours/SetUsualHours | Set usual hours (rostered hours) for an employee.  Requires the &#39;ManageOrganisationUsers&#39; permission.


## Documentation for Models

 - [AggregateClient](docs/AggregateClient.md)
 - [AggregateJobCode](docs/AggregateJobCode.md)
 - [AggregateJobTask](docs/AggregateJobTask.md)
 - [AggregateProject](docs/AggregateProject.md)
 - [ApiResponseBoolean](docs/ApiResponseBoolean.md)
 - [ApiResponseClient](docs/ApiResponseClient.md)
 - [ApiResponseCombinedReportsData](docs/ApiResponseCombinedReportsData.md)
 - [ApiResponseDoLoginResponse](docs/ApiResponseDoLoginResponse.md)
 - [ApiResponseFleetVehicle](docs/ApiResponseFleetVehicle.md)
 - [ApiResponseForPaginatedListBasicGeofence](docs/ApiResponseForPaginatedListBasicGeofence.md)
 - [ApiResponseForPaginatedListExtendedGeofence](docs/ApiResponseForPaginatedListExtendedGeofence.md)
 - [ApiResponseForPaginatedListOrgReportTimesheetFileAttachment](docs/ApiResponseForPaginatedListOrgReportTimesheetFileAttachment.md)
 - [ApiResponseForPaginatedListOrgReportTranscript](docs/ApiResponseForPaginatedListOrgReportTranscript.md)
 - [ApiResponseForPaginatedListOrgReportTrip](docs/ApiResponseForPaginatedListOrgReportTrip.md)
 - [ApiResponseForPaginatedListRawReportItem](docs/ApiResponseForPaginatedListRawReportItem.md)
 - [ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence](docs/ApiResponseForPaginatedListTimesheetAutomationWithOrgAndGeofence.md)
 - [ApiResponseForPaginatedListTimesheetFileAttachment](docs/ApiResponseForPaginatedListTimesheetFileAttachment.md)
 - [ApiResponseForPaginatedListTrip](docs/ApiResponseForPaginatedListTrip.md)
 - [ApiResponseGeofence](docs/ApiResponseGeofence.md)
 - [ApiResponseInsertUserResponse](docs/ApiResponseInsertUserResponse.md)
 - [ApiResponseInt32](docs/ApiResponseInt32.md)
 - [ApiResponseJobCode](docs/ApiResponseJobCode.md)
 - [ApiResponseListAggregateClient](docs/ApiResponseListAggregateClient.md)
 - [ApiResponseListAggregateJobCode](docs/ApiResponseListAggregateJobCode.md)
 - [ApiResponseListClient](docs/ApiResponseListClient.md)
 - [ApiResponseListFleetSummaryReportItem](docs/ApiResponseListFleetSummaryReportItem.md)
 - [ApiResponseListFleetVehicle](docs/ApiResponseListFleetVehicle.md)
 - [ApiResponseListInt32](docs/ApiResponseListInt32.md)
 - [ApiResponseListJobCode](docs/ApiResponseListJobCode.md)
 - [ApiResponseListJobSeriesReportItem](docs/ApiResponseListJobSeriesReportItem.md)
 - [ApiResponseListOrganisationGroup](docs/ApiResponseListOrganisationGroup.md)
 - [ApiResponseListProject](docs/ApiResponseListProject.md)
 - [ApiResponseListProjectCostingReportItem](docs/ApiResponseListProjectCostingReportItem.md)
 - [ApiResponseListTimesheet](docs/ApiResponseListTimesheet.md)
 - [ApiResponseListTimesheetTask](docs/ApiResponseListTimesheetTask.md)
 - [ApiResponseListUserForManagement](docs/ApiResponseListUserForManagement.md)
 - [ApiResponseListUserHourlyRate](docs/ApiResponseListUserHourlyRate.md)
 - [ApiResponseListUserJobFavourite](docs/ApiResponseListUserJobFavourite.md)
 - [ApiResponseListUsualHoursDay](docs/ApiResponseListUsualHoursDay.md)
 - [ApiResponseOrganisation](docs/ApiResponseOrganisation.md)
 - [ApiResponseOrganisationGroup](docs/ApiResponseOrganisationGroup.md)
 - [ApiResponseProject](docs/ApiResponseProject.md)
 - [ApiResponseTimesheetFileAttachment](docs/ApiResponseTimesheetFileAttachment.md)
 - [ApiResponseTimesheetTask](docs/ApiResponseTimesheetTask.md)
 - [ApiResponseTranscription](docs/ApiResponseTranscription.md)
 - [ApiResponseTrip](docs/ApiResponseTrip.md)
 - [ApiResponseUpdateOrganisationResponse](docs/ApiResponseUpdateOrganisationResponse.md)
 - [ApiResponseUpdateProfileResponse](docs/ApiResponseUpdateProfileResponse.md)
 - [ApiResponseUpdateUserResponse](docs/ApiResponseUpdateUserResponse.md)
 - [ApiResponseUserForManagement](docs/ApiResponseUserForManagement.md)
 - [ApiResponseUserProfile](docs/ApiResponseUserProfile.md)
 - [BasicCoordinate](docs/BasicCoordinate.md)
 - [BasicGeofence](docs/BasicGeofence.md)
 - [BatchUpdateTimesheetRequest](docs/BatchUpdateTimesheetRequest.md)
 - [Client](docs/Client.md)
 - [ClientSeriesReportItem](docs/ClientSeriesReportItem.md)
 - [ClientSideUser](docs/ClientSideUser.md)
 - [ClientTotalsReportItem](docs/ClientTotalsReportItem.md)
 - [CombinedReportsData](docs/CombinedReportsData.md)
 - [CreateAutomationStepRequest](docs/CreateAutomationStepRequest.md)
 - [CreateGeoFenceRequest](docs/CreateGeoFenceRequest.md)
 - [CreateTripRequest](docs/CreateTripRequest.md)
 - [DoLoginRequest](docs/DoLoginRequest.md)
 - [DoLoginResponse](docs/DoLoginResponse.md)
 - [ExtendedGeofence](docs/ExtendedGeofence.md)
 - [FleetSummaryReportItem](docs/FleetSummaryReportItem.md)
 - [FleetVehicle](docs/FleetVehicle.md)
 - [Geofence](docs/Geofence.md)
 - [InsertClientRequest](docs/InsertClientRequest.md)
 - [InsertJobCodeRequest](docs/InsertJobCodeRequest.md)
 - [InsertOrganisationGroupRequest](docs/InsertOrganisationGroupRequest.md)
 - [InsertProjectRequest](docs/InsertProjectRequest.md)
 - [InsertTaskRequest](docs/InsertTaskRequest.md)
 - [InsertUserHourlyRateRequest](docs/InsertUserHourlyRateRequest.md)
 - [InsertUserJobFavouriteRequest](docs/InsertUserJobFavouriteRequest.md)
 - [InsertUserRequest](docs/InsertUserRequest.md)
 - [InsertUserResponse](docs/InsertUserResponse.md)
 - [InsertVehicleRequest](docs/InsertVehicleRequest.md)
 - [JobCode](docs/JobCode.md)
 - [JobSeriesReportItem](docs/JobSeriesReportItem.md)
 - [JobTotalsReportItem](docs/JobTotalsReportItem.md)
 - [OrgReportTimesheetFileAttachment](docs/OrgReportTimesheetFileAttachment.md)
 - [OrgReportTranscript](docs/OrgReportTranscript.md)
 - [OrgReportTrip](docs/OrgReportTrip.md)
 - [Organisation](docs/Organisation.md)
 - [OrganisationGroup](docs/OrganisationGroup.md)
 - [OrganisationPricingPlan](docs/OrganisationPricingPlan.md)
 - [Project](docs/Project.md)
 - [ProjectCostingReportItem](docs/ProjectCostingReportItem.md)
 - [ProjectSeriesReportItem](docs/ProjectSeriesReportItem.md)
 - [ProjectTotalsReportItem](docs/ProjectTotalsReportItem.md)
 - [RawReportItem](docs/RawReportItem.md)
 - [SaveClientRequest](docs/SaveClientRequest.md)
 - [SaveOrganisationGroupRequest](docs/SaveOrganisationGroupRequest.md)
 - [SaveVehicleRequest](docs/SaveVehicleRequest.md)
 - [SetOrganisationGroupUsersRequest](docs/SetOrganisationGroupUsersRequest.md)
 - [SetUsualHoursRequest](docs/SetUsualHoursRequest.md)
 - [TaskSeriesReportItem](docs/TaskSeriesReportItem.md)
 - [TaskTotalsReportItem](docs/TaskTotalsReportItem.md)
 - [TimeSlot](docs/TimeSlot.md)
 - [Timesheet](docs/Timesheet.md)
 - [TimesheetAutomationWithOrgAndGeofence](docs/TimesheetAutomationWithOrgAndGeofence.md)
 - [TimesheetFileAttachment](docs/TimesheetFileAttachment.md)
 - [TimesheetTask](docs/TimesheetTask.md)
 - [Transcription](docs/Transcription.md)
 - [Trip](docs/Trip.md)
 - [TripCoordinate](docs/TripCoordinate.md)
 - [UpdateGeoFenceRequest](docs/UpdateGeoFenceRequest.md)
 - [UpdateJobCodeRequest](docs/UpdateJobCodeRequest.md)
 - [UpdateMyProfileRequest](docs/UpdateMyProfileRequest.md)
 - [UpdateOrganisationRequest](docs/UpdateOrganisationRequest.md)
 - [UpdateOrganisationResponse](docs/UpdateOrganisationResponse.md)
 - [UpdateProfileResponse](docs/UpdateProfileResponse.md)
 - [UpdateProjectRequest](docs/UpdateProjectRequest.md)
 - [UpdateTaskRequest](docs/UpdateTaskRequest.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [UpdateUserResponse](docs/UpdateUserResponse.md)
 - [UserForManagement](docs/UserForManagement.md)
 - [UserHourlyRate](docs/UserHourlyRate.md)
 - [UserJobFavourite](docs/UserJobFavourite.md)
 - [UserProfile](docs/UserProfile.md)
 - [UsualHoursDay](docs/UsualHoursDay.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### x-chronosheets-auth

- **Type**: API key

- **API key parameter name**: x-chronosheets-auth
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



