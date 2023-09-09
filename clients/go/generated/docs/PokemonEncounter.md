# PokemonEncounter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 
**VersionDetails** | Pointer to [**[]EncounterVersionDetails**](EncounterVersionDetails.md) |  | [optional] 

## Methods

### NewPokemonEncounter

`func NewPokemonEncounter() *PokemonEncounter`

NewPokemonEncounter instantiates a new PokemonEncounter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonEncounterWithDefaults

`func NewPokemonEncounterWithDefaults() *PokemonEncounter`

NewPokemonEncounterWithDefaults instantiates a new PokemonEncounter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPokemon

`func (o *PokemonEncounter) GetPokemon() NamedAPIResource`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *PokemonEncounter) GetPokemonOk() (*NamedAPIResource, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *PokemonEncounter) SetPokemon(v NamedAPIResource)`

SetPokemon sets Pokemon field to given value.

### HasPokemon

`func (o *PokemonEncounter) HasPokemon() bool`

HasPokemon returns a boolean if a field has been set.

### GetVersionDetails

`func (o *PokemonEncounter) GetVersionDetails() []EncounterVersionDetails`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *PokemonEncounter) GetVersionDetailsOk() (*[]EncounterVersionDetails, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *PokemonEncounter) SetVersionDetails(v []EncounterVersionDetails)`

SetVersionDetails sets VersionDetails field to given value.

### HasVersionDetails

`func (o *PokemonEncounter) HasVersionDetails() bool`

HasVersionDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


