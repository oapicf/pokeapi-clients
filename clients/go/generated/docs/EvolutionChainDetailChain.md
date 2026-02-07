# EvolutionChainDetailChain

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EvolutionDetails** | **[]interface{}** |  | 
**EvolvesTo** | [**[]EvolutionChainDetailChainEvolvesToInner**](EvolutionChainDetailChainEvolvesToInner.md) |  | 
**IsBaby** | **bool** |  | 
**Species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewEvolutionChainDetailChain

`func NewEvolutionChainDetailChain(evolutionDetails []interface{}, evolvesTo []EvolutionChainDetailChainEvolvesToInner, isBaby bool, species AbilityDetailPokemonInnerPokemon, ) *EvolutionChainDetailChain`

NewEvolutionChainDetailChain instantiates a new EvolutionChainDetailChain object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionChainDetailChainWithDefaults

`func NewEvolutionChainDetailChainWithDefaults() *EvolutionChainDetailChain`

NewEvolutionChainDetailChainWithDefaults instantiates a new EvolutionChainDetailChain object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvolutionDetails

`func (o *EvolutionChainDetailChain) GetEvolutionDetails() []interface{}`

GetEvolutionDetails returns the EvolutionDetails field if non-nil, zero value otherwise.

### GetEvolutionDetailsOk

`func (o *EvolutionChainDetailChain) GetEvolutionDetailsOk() (*[]interface{}, bool)`

GetEvolutionDetailsOk returns a tuple with the EvolutionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolutionDetails

`func (o *EvolutionChainDetailChain) SetEvolutionDetails(v []interface{})`

SetEvolutionDetails sets EvolutionDetails field to given value.


### GetEvolvesTo

`func (o *EvolutionChainDetailChain) GetEvolvesTo() []EvolutionChainDetailChainEvolvesToInner`

GetEvolvesTo returns the EvolvesTo field if non-nil, zero value otherwise.

### GetEvolvesToOk

`func (o *EvolutionChainDetailChain) GetEvolvesToOk() (*[]EvolutionChainDetailChainEvolvesToInner, bool)`

GetEvolvesToOk returns a tuple with the EvolvesTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolvesTo

`func (o *EvolutionChainDetailChain) SetEvolvesTo(v []EvolutionChainDetailChainEvolvesToInner)`

SetEvolvesTo sets EvolvesTo field to given value.


### GetIsBaby

`func (o *EvolutionChainDetailChain) GetIsBaby() bool`

GetIsBaby returns the IsBaby field if non-nil, zero value otherwise.

### GetIsBabyOk

`func (o *EvolutionChainDetailChain) GetIsBabyOk() (*bool, bool)`

GetIsBabyOk returns a tuple with the IsBaby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBaby

`func (o *EvolutionChainDetailChain) SetIsBaby(v bool)`

SetIsBaby sets IsBaby field to given value.


### GetSpecies

`func (o *EvolutionChainDetailChain) GetSpecies() AbilityDetailPokemonInnerPokemon`

GetSpecies returns the Species field if non-nil, zero value otherwise.

### GetSpeciesOk

`func (o *EvolutionChainDetailChain) GetSpeciesOk() (*AbilityDetailPokemonInnerPokemon, bool)`

GetSpeciesOk returns a tuple with the Species field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecies

`func (o *EvolutionChainDetailChain) SetSpecies(v AbilityDetailPokemonInnerPokemon)`

SetSpecies sets Species field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


