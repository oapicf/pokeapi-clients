# EvolutionTriggerDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Names** | [**[]EvolutionTriggerName**](EvolutionTriggerName.md) |  | 
**PokemonSpecies** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewEvolutionTriggerDetail

`func NewEvolutionTriggerDetail(id int32, name string, names []EvolutionTriggerName, pokemonSpecies []AbilityDetailPokemonInnerPokemon, ) *EvolutionTriggerDetail`

NewEvolutionTriggerDetail instantiates a new EvolutionTriggerDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionTriggerDetailWithDefaults

`func NewEvolutionTriggerDetailWithDefaults() *EvolutionTriggerDetail`

NewEvolutionTriggerDetailWithDefaults instantiates a new EvolutionTriggerDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EvolutionTriggerDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EvolutionTriggerDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EvolutionTriggerDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EvolutionTriggerDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EvolutionTriggerDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EvolutionTriggerDetail) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *EvolutionTriggerDetail) GetNames() []EvolutionTriggerName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EvolutionTriggerDetail) GetNamesOk() (*[]EvolutionTriggerName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EvolutionTriggerDetail) SetNames(v []EvolutionTriggerName)`

SetNames sets Names field to given value.


### GetPokemonSpecies

`func (o *EvolutionTriggerDetail) GetPokemonSpecies() []AbilityDetailPokemonInnerPokemon`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *EvolutionTriggerDetail) GetPokemonSpeciesOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *EvolutionTriggerDetail) SetPokemonSpecies(v []AbilityDetailPokemonInnerPokemon)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


