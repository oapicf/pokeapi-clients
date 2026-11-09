# LocationAreaEncounterRate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EncounterMethod** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method in which Pokémon may be encountered in an area.. | 
**VersionDetails** | [**[]LocationAreaEncounterVersionDetail**](LocationAreaEncounterVersionDetail.md) | The chance of the encounter to occur on a version of the game. | 

## Methods

### NewLocationAreaEncounterRate

`func NewLocationAreaEncounterRate(encounterMethod EncounterMethodSummary, versionDetails []LocationAreaEncounterVersionDetail, ) *LocationAreaEncounterRate`

NewLocationAreaEncounterRate instantiates a new LocationAreaEncounterRate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationAreaEncounterRateWithDefaults

`func NewLocationAreaEncounterRateWithDefaults() *LocationAreaEncounterRate`

NewLocationAreaEncounterRateWithDefaults instantiates a new LocationAreaEncounterRate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEncounterMethod

`func (o *LocationAreaEncounterRate) GetEncounterMethod() EncounterMethodSummary`

GetEncounterMethod returns the EncounterMethod field if non-nil, zero value otherwise.

### GetEncounterMethodOk

`func (o *LocationAreaEncounterRate) GetEncounterMethodOk() (*EncounterMethodSummary, bool)`

GetEncounterMethodOk returns a tuple with the EncounterMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEncounterMethod

`func (o *LocationAreaEncounterRate) SetEncounterMethod(v EncounterMethodSummary)`

SetEncounterMethod sets EncounterMethod field to given value.


### GetVersionDetails

`func (o *LocationAreaEncounterRate) GetVersionDetails() []LocationAreaEncounterVersionDetail`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *LocationAreaEncounterRate) GetVersionDetailsOk() (*[]LocationAreaEncounterVersionDetail, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *LocationAreaEncounterRate) SetVersionDetails(v []LocationAreaEncounterVersionDetail)`

SetVersionDetails sets VersionDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


