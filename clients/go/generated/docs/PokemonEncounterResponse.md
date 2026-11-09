# PokemonEncounterResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LocationArea** | [**LocationAreaSummary**](LocationAreaSummary.md) | The location area the referenced Pokémon can be encountered in. | 
**VersionDetails** | [**[]PokemonEncounterVersionDetailResponse**](PokemonEncounterVersionDetailResponse.md) | A list of versions and encounters with the referenced Pokémon that might happen. | 

## Methods

### NewPokemonEncounterResponse

`func NewPokemonEncounterResponse(locationArea LocationAreaSummary, versionDetails []PokemonEncounterVersionDetailResponse, ) *PokemonEncounterResponse`

NewPokemonEncounterResponse instantiates a new PokemonEncounterResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonEncounterResponseWithDefaults

`func NewPokemonEncounterResponseWithDefaults() *PokemonEncounterResponse`

NewPokemonEncounterResponseWithDefaults instantiates a new PokemonEncounterResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLocationArea

`func (o *PokemonEncounterResponse) GetLocationArea() LocationAreaSummary`

GetLocationArea returns the LocationArea field if non-nil, zero value otherwise.

### GetLocationAreaOk

`func (o *PokemonEncounterResponse) GetLocationAreaOk() (*LocationAreaSummary, bool)`

GetLocationAreaOk returns a tuple with the LocationArea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocationArea

`func (o *PokemonEncounterResponse) SetLocationArea(v LocationAreaSummary)`

SetLocationArea sets LocationArea field to given value.


### GetVersionDetails

`func (o *PokemonEncounterResponse) GetVersionDetails() []PokemonEncounterVersionDetailResponse`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *PokemonEncounterResponse) GetVersionDetailsOk() (*[]PokemonEncounterVersionDetailResponse, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *PokemonEncounterResponse) SetVersionDetails(v []PokemonEncounterVersionDetailResponse)`

SetVersionDetails sets VersionDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


