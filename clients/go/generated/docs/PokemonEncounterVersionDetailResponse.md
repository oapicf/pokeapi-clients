# PokemonEncounterVersionDetailResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. | 
**MaxChance** | **int32** | The total percentage of all encounter potential. | 
**EncounterDetails** | [**[]PokemonEncounterDetailResponse**](PokemonEncounterDetailResponse.md) | A list of encounters and their specifics. | 

## Methods

### NewPokemonEncounterVersionDetailResponse

`func NewPokemonEncounterVersionDetailResponse(version VersionSummary, maxChance int32, encounterDetails []PokemonEncounterDetailResponse, ) *PokemonEncounterVersionDetailResponse`

NewPokemonEncounterVersionDetailResponse instantiates a new PokemonEncounterVersionDetailResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonEncounterVersionDetailResponseWithDefaults

`func NewPokemonEncounterVersionDetailResponseWithDefaults() *PokemonEncounterVersionDetailResponse`

NewPokemonEncounterVersionDetailResponseWithDefaults instantiates a new PokemonEncounterVersionDetailResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersion

`func (o *PokemonEncounterVersionDetailResponse) GetVersion() VersionSummary`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *PokemonEncounterVersionDetailResponse) GetVersionOk() (*VersionSummary, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *PokemonEncounterVersionDetailResponse) SetVersion(v VersionSummary)`

SetVersion sets Version field to given value.


### GetMaxChance

`func (o *PokemonEncounterVersionDetailResponse) GetMaxChance() int32`

GetMaxChance returns the MaxChance field if non-nil, zero value otherwise.

### GetMaxChanceOk

`func (o *PokemonEncounterVersionDetailResponse) GetMaxChanceOk() (*int32, bool)`

GetMaxChanceOk returns a tuple with the MaxChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxChance

`func (o *PokemonEncounterVersionDetailResponse) SetMaxChance(v int32)`

SetMaxChance sets MaxChance field to given value.


### GetEncounterDetails

`func (o *PokemonEncounterVersionDetailResponse) GetEncounterDetails() []PokemonEncounterDetailResponse`

GetEncounterDetails returns the EncounterDetails field if non-nil, zero value otherwise.

### GetEncounterDetailsOk

`func (o *PokemonEncounterVersionDetailResponse) GetEncounterDetailsOk() (*[]PokemonEncounterDetailResponse, bool)`

GetEncounterDetailsOk returns a tuple with the EncounterDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEncounterDetails

`func (o *PokemonEncounterVersionDetailResponse) SetEncounterDetails(v []PokemonEncounterDetailResponse)`

SetEncounterDetails sets EncounterDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


