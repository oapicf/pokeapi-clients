# LocationAreaEncounterVersionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rate** | **int32** | The chance of an encounter to occur. | 
**Version** | [**VersionSummary**](VersionSummary.md) | The version of the game in which the encounter can occur with the given chance. | 

## Methods

### NewLocationAreaEncounterVersionDetail

`func NewLocationAreaEncounterVersionDetail(rate int32, version VersionSummary, ) *LocationAreaEncounterVersionDetail`

NewLocationAreaEncounterVersionDetail instantiates a new LocationAreaEncounterVersionDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationAreaEncounterVersionDetailWithDefaults

`func NewLocationAreaEncounterVersionDetailWithDefaults() *LocationAreaEncounterVersionDetail`

NewLocationAreaEncounterVersionDetailWithDefaults instantiates a new LocationAreaEncounterVersionDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRate

`func (o *LocationAreaEncounterVersionDetail) GetRate() int32`

GetRate returns the Rate field if non-nil, zero value otherwise.

### GetRateOk

`func (o *LocationAreaEncounterVersionDetail) GetRateOk() (*int32, bool)`

GetRateOk returns a tuple with the Rate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRate

`func (o *LocationAreaEncounterVersionDetail) SetRate(v int32)`

SetRate sets Rate field to given value.


### GetVersion

`func (o *LocationAreaEncounterVersionDetail) GetVersion() VersionSummary`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *LocationAreaEncounterVersionDetail) GetVersionOk() (*VersionSummary, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *LocationAreaEncounterVersionDetail) SetVersion(v VersionSummary)`

SetVersion sets Version field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


