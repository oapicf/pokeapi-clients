# LocationAreaPokemonEncounter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon being encountered. | 
**VersionDetails** | [**[]LocationAreaPokemonEncounterVersion**](LocationAreaPokemonEncounterVersion.md) | A list of versions and encounters with Pokémon that might happen in the referenced location area. | 

## Methods

### NewLocationAreaPokemonEncounter

`func NewLocationAreaPokemonEncounter(pokemon PokemonSummary, versionDetails []LocationAreaPokemonEncounterVersion, ) *LocationAreaPokemonEncounter`

NewLocationAreaPokemonEncounter instantiates a new LocationAreaPokemonEncounter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationAreaPokemonEncounterWithDefaults

`func NewLocationAreaPokemonEncounterWithDefaults() *LocationAreaPokemonEncounter`

NewLocationAreaPokemonEncounterWithDefaults instantiates a new LocationAreaPokemonEncounter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPokemon

`func (o *LocationAreaPokemonEncounter) GetPokemon() PokemonSummary`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *LocationAreaPokemonEncounter) GetPokemonOk() (*PokemonSummary, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *LocationAreaPokemonEncounter) SetPokemon(v PokemonSummary)`

SetPokemon sets Pokemon field to given value.


### GetVersionDetails

`func (o *LocationAreaPokemonEncounter) GetVersionDetails() []LocationAreaPokemonEncounterVersion`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *LocationAreaPokemonEncounter) GetVersionDetailsOk() (*[]LocationAreaPokemonEncounterVersion, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *LocationAreaPokemonEncounter) SetVersionDetails(v []LocationAreaPokemonEncounterVersion)`

SetVersionDetails sets VersionDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


