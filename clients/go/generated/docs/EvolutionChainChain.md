# EvolutionChainChain

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsBaby** | Pointer to **bool** | Whether or not this is a baby Pokémon | [optional] 
**Species** | Pointer to [**PokemonSpecies**](PokemonSpecies.md) |  | [optional] 
**EvolutionDetails** | Pointer to [**[]EvolutionChainChainEvolutionDetailsInner**](EvolutionChainChainEvolutionDetailsInner.md) | The chain of Pokémon species that forms part of this evolution chain | [optional] 

## Methods

### NewEvolutionChainChain

`func NewEvolutionChainChain() *EvolutionChainChain`

NewEvolutionChainChain instantiates a new EvolutionChainChain object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionChainChainWithDefaults

`func NewEvolutionChainChainWithDefaults() *EvolutionChainChain`

NewEvolutionChainChainWithDefaults instantiates a new EvolutionChainChain object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsBaby

`func (o *EvolutionChainChain) GetIsBaby() bool`

GetIsBaby returns the IsBaby field if non-nil, zero value otherwise.

### GetIsBabyOk

`func (o *EvolutionChainChain) GetIsBabyOk() (*bool, bool)`

GetIsBabyOk returns a tuple with the IsBaby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBaby

`func (o *EvolutionChainChain) SetIsBaby(v bool)`

SetIsBaby sets IsBaby field to given value.

### HasIsBaby

`func (o *EvolutionChainChain) HasIsBaby() bool`

HasIsBaby returns a boolean if a field has been set.

### GetSpecies

`func (o *EvolutionChainChain) GetSpecies() PokemonSpecies`

GetSpecies returns the Species field if non-nil, zero value otherwise.

### GetSpeciesOk

`func (o *EvolutionChainChain) GetSpeciesOk() (*PokemonSpecies, bool)`

GetSpeciesOk returns a tuple with the Species field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecies

`func (o *EvolutionChainChain) SetSpecies(v PokemonSpecies)`

SetSpecies sets Species field to given value.

### HasSpecies

`func (o *EvolutionChainChain) HasSpecies() bool`

HasSpecies returns a boolean if a field has been set.

### GetEvolutionDetails

`func (o *EvolutionChainChain) GetEvolutionDetails() []EvolutionChainChainEvolutionDetailsInner`

GetEvolutionDetails returns the EvolutionDetails field if non-nil, zero value otherwise.

### GetEvolutionDetailsOk

`func (o *EvolutionChainChain) GetEvolutionDetailsOk() (*[]EvolutionChainChainEvolutionDetailsInner, bool)`

GetEvolutionDetailsOk returns a tuple with the EvolutionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolutionDetails

`func (o *EvolutionChainChain) SetEvolutionDetails(v []EvolutionChainChainEvolutionDetailsInner)`

SetEvolutionDetails sets EvolutionDetails field to given value.

### HasEvolutionDetails

`func (o *EvolutionChainChain) HasEvolutionDetails() bool`

HasEvolutionDetails returns a boolean if a field has been set.

### SetEvolutionDetailsNil

`func (o *EvolutionChainChain) SetEvolutionDetailsNil(b bool)`

 SetEvolutionDetailsNil sets the value for EvolutionDetails to be an explicit nil

### UnsetEvolutionDetails
`func (o *EvolutionChainChain) UnsetEvolutionDetails()`

UnsetEvolutionDetails ensures that no value is present for EvolutionDetails, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


