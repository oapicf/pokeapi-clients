# PokemonPastAbility

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Abilities** | [**[]PokemonAbilityPast**](PokemonAbilityPast.md) | The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed abilities. | 

## Methods

### NewPokemonPastAbility

`func NewPokemonPastAbility(abilities []PokemonAbilityPast, generation GenerationSummary, ) *PokemonPastAbility`

NewPokemonPastAbility instantiates a new PokemonPastAbility object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonPastAbilityWithDefaults

`func NewPokemonPastAbilityWithDefaults() *PokemonPastAbility`

NewPokemonPastAbilityWithDefaults instantiates a new PokemonPastAbility object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAbilities

`func (o *PokemonPastAbility) GetAbilities() []PokemonAbilityPast`

GetAbilities returns the Abilities field if non-nil, zero value otherwise.

### GetAbilitiesOk

`func (o *PokemonPastAbility) GetAbilitiesOk() (*[]PokemonAbilityPast, bool)`

GetAbilitiesOk returns a tuple with the Abilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbilities

`func (o *PokemonPastAbility) SetAbilities(v []PokemonAbilityPast)`

SetAbilities sets Abilities field to given value.


### GetGeneration

`func (o *PokemonPastAbility) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *PokemonPastAbility) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *PokemonPastAbility) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


