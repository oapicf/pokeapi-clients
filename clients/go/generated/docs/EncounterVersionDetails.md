# EncounterVersionDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 
**MaxChance** | Pointer to **int32** | The total percentage of all encounter potential. | [optional] 
**EncounterDetails** | Pointer to [**[]Encounter**](Encounter.md) | A list of encounters and their specifics. | [optional] 

## Methods

### NewEncounterVersionDetails

`func NewEncounterVersionDetails() *EncounterVersionDetails`

NewEncounterVersionDetails instantiates a new EncounterVersionDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterVersionDetailsWithDefaults

`func NewEncounterVersionDetailsWithDefaults() *EncounterVersionDetails`

NewEncounterVersionDetailsWithDefaults instantiates a new EncounterVersionDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersion

`func (o *EncounterVersionDetails) GetVersion() NamedAPIResource`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *EncounterVersionDetails) GetVersionOk() (*NamedAPIResource, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *EncounterVersionDetails) SetVersion(v NamedAPIResource)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *EncounterVersionDetails) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetMaxChance

`func (o *EncounterVersionDetails) GetMaxChance() int32`

GetMaxChance returns the MaxChance field if non-nil, zero value otherwise.

### GetMaxChanceOk

`func (o *EncounterVersionDetails) GetMaxChanceOk() (*int32, bool)`

GetMaxChanceOk returns a tuple with the MaxChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxChance

`func (o *EncounterVersionDetails) SetMaxChance(v int32)`

SetMaxChance sets MaxChance field to given value.

### HasMaxChance

`func (o *EncounterVersionDetails) HasMaxChance() bool`

HasMaxChance returns a boolean if a field has been set.

### GetEncounterDetails

`func (o *EncounterVersionDetails) GetEncounterDetails() []Encounter`

GetEncounterDetails returns the EncounterDetails field if non-nil, zero value otherwise.

### GetEncounterDetailsOk

`func (o *EncounterVersionDetails) GetEncounterDetailsOk() (*[]Encounter, bool)`

GetEncounterDetailsOk returns a tuple with the EncounterDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEncounterDetails

`func (o *EncounterVersionDetails) SetEncounterDetails(v []Encounter)`

SetEncounterDetails sets EncounterDetails field to given value.

### HasEncounterDetails

`func (o *EncounterVersionDetails) HasEncounterDetails() bool`

HasEncounterDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


