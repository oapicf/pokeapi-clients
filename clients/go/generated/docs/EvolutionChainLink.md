# EvolutionChainLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsBaby** | **bool** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | 
**EvolutionDetails** | [**[]PokemonEvolution**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**EvolvesTo** | [**[]EvolutionChainLink**](EvolutionChainLink.md) | A List of chain objects. | [readonly] 

## Methods

### NewEvolutionChainLink

`func NewEvolutionChainLink(isBaby bool, species PokemonSpeciesSummary, evolutionDetails []PokemonEvolution, evolvesTo []EvolutionChainLink, ) *EvolutionChainLink`

NewEvolutionChainLink instantiates a new EvolutionChainLink object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionChainLinkWithDefaults

`func NewEvolutionChainLinkWithDefaults() *EvolutionChainLink`

NewEvolutionChainLinkWithDefaults instantiates a new EvolutionChainLink object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsBaby

`func (o *EvolutionChainLink) GetIsBaby() bool`

GetIsBaby returns the IsBaby field if non-nil, zero value otherwise.

### GetIsBabyOk

`func (o *EvolutionChainLink) GetIsBabyOk() (*bool, bool)`

GetIsBabyOk returns a tuple with the IsBaby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBaby

`func (o *EvolutionChainLink) SetIsBaby(v bool)`

SetIsBaby sets IsBaby field to given value.


### GetSpecies

`func (o *EvolutionChainLink) GetSpecies() PokemonSpeciesSummary`

GetSpecies returns the Species field if non-nil, zero value otherwise.

### GetSpeciesOk

`func (o *EvolutionChainLink) GetSpeciesOk() (*PokemonSpeciesSummary, bool)`

GetSpeciesOk returns a tuple with the Species field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecies

`func (o *EvolutionChainLink) SetSpecies(v PokemonSpeciesSummary)`

SetSpecies sets Species field to given value.


### GetEvolutionDetails

`func (o *EvolutionChainLink) GetEvolutionDetails() []PokemonEvolution`

GetEvolutionDetails returns the EvolutionDetails field if non-nil, zero value otherwise.

### GetEvolutionDetailsOk

`func (o *EvolutionChainLink) GetEvolutionDetailsOk() (*[]PokemonEvolution, bool)`

GetEvolutionDetailsOk returns a tuple with the EvolutionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolutionDetails

`func (o *EvolutionChainLink) SetEvolutionDetails(v []PokemonEvolution)`

SetEvolutionDetails sets EvolutionDetails field to given value.


### GetEvolvesTo

`func (o *EvolutionChainLink) GetEvolvesTo() []EvolutionChainLink`

GetEvolvesTo returns the EvolvesTo field if non-nil, zero value otherwise.

### GetEvolvesToOk

`func (o *EvolutionChainLink) GetEvolvesToOk() (*[]EvolutionChainLink, bool)`

GetEvolvesToOk returns a tuple with the EvolvesTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolvesTo

`func (o *EvolutionChainLink) SetEvolvesTo(v []EvolutionChainLink)`

SetEvolvesTo sets EvolvesTo field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


