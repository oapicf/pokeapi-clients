# PokemonSpeciesDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Order** | Pointer to **NullableInt32** |  | [optional] 
**GenderRate** | Pointer to **NullableInt32** |  | [optional] 
**CaptureRate** | Pointer to **NullableInt32** |  | [optional] 
**BaseHappiness** | Pointer to **NullableInt32** |  | [optional] 
**IsBaby** | Pointer to **bool** |  | [optional] 
**IsLegendary** | Pointer to **bool** |  | [optional] 
**IsMythical** | Pointer to **bool** |  | [optional] 
**HatchCounter** | Pointer to **NullableInt32** |  | [optional] 
**HasGenderDifferences** | Pointer to **bool** |  | [optional] 
**FormsSwitchable** | Pointer to **bool** |  | [optional] 
**GrowthRate** | [**GrowthRateSummary**](GrowthRateSummary.md) |  | 
**PokedexNumbers** | [**[]PokemonDexEntry**](PokemonDexEntry.md) |  | 
**EggGroups** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Color** | [**PokemonColorSummary**](PokemonColorSummary.md) |  | 
**Shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) |  | 
**EvolvesFromSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**EvolutionChain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) |  | 
**Habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**Names** | [**[]PokemonFormDetailFormNamesInner**](PokemonFormDetailFormNamesInner.md) |  | 
**PalParkEncounters** | [**[]PokemonSpeciesDetailPalParkEncountersInner**](PokemonSpeciesDetailPalParkEncountersInner.md) |  | 
**FormDescriptions** | [**[]PokemonSpeciesDescription**](PokemonSpeciesDescription.md) |  | 
**FlavorTextEntries** | [**[]PokemonSpeciesFlavorText**](PokemonSpeciesFlavorText.md) |  | 
**Genera** | [**[]PokemonSpeciesDetailGeneraInner**](PokemonSpeciesDetailGeneraInner.md) |  | 
**Varieties** | [**[]PokemonSpeciesDetailVarietiesInner**](PokemonSpeciesDetailVarietiesInner.md) |  | 

## Methods

### NewPokemonSpeciesDetail

`func NewPokemonSpeciesDetail(id int32, name string, growthRate GrowthRateSummary, pokedexNumbers []PokemonDexEntry, eggGroups []AbilityDetailPokemonInnerPokemon, color PokemonColorSummary, shape PokemonShapeSummary, evolvesFromSpecies PokemonSpeciesSummary, evolutionChain EvolutionChainSummary, habitat PokemonHabitatSummary, generation GenerationSummary, names []PokemonFormDetailFormNamesInner, palParkEncounters []PokemonSpeciesDetailPalParkEncountersInner, formDescriptions []PokemonSpeciesDescription, flavorTextEntries []PokemonSpeciesFlavorText, genera []PokemonSpeciesDetailGeneraInner, varieties []PokemonSpeciesDetailVarietiesInner, ) *PokemonSpeciesDetail`

NewPokemonSpeciesDetail instantiates a new PokemonSpeciesDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesDetailWithDefaults

`func NewPokemonSpeciesDetailWithDefaults() *PokemonSpeciesDetail`

NewPokemonSpeciesDetailWithDefaults instantiates a new PokemonSpeciesDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokemonSpeciesDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokemonSpeciesDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokemonSpeciesDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokemonSpeciesDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonSpeciesDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonSpeciesDetail) SetName(v string)`

SetName sets Name field to given value.


### GetOrder

`func (o *PokemonSpeciesDetail) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *PokemonSpeciesDetail) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *PokemonSpeciesDetail) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *PokemonSpeciesDetail) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### SetOrderNil

`func (o *PokemonSpeciesDetail) SetOrderNil(b bool)`

 SetOrderNil sets the value for Order to be an explicit nil

### UnsetOrder
`func (o *PokemonSpeciesDetail) UnsetOrder()`

UnsetOrder ensures that no value is present for Order, not even an explicit nil
### GetGenderRate

`func (o *PokemonSpeciesDetail) GetGenderRate() int32`

GetGenderRate returns the GenderRate field if non-nil, zero value otherwise.

### GetGenderRateOk

`func (o *PokemonSpeciesDetail) GetGenderRateOk() (*int32, bool)`

GetGenderRateOk returns a tuple with the GenderRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenderRate

`func (o *PokemonSpeciesDetail) SetGenderRate(v int32)`

SetGenderRate sets GenderRate field to given value.

### HasGenderRate

`func (o *PokemonSpeciesDetail) HasGenderRate() bool`

HasGenderRate returns a boolean if a field has been set.

### SetGenderRateNil

`func (o *PokemonSpeciesDetail) SetGenderRateNil(b bool)`

 SetGenderRateNil sets the value for GenderRate to be an explicit nil

### UnsetGenderRate
`func (o *PokemonSpeciesDetail) UnsetGenderRate()`

UnsetGenderRate ensures that no value is present for GenderRate, not even an explicit nil
### GetCaptureRate

`func (o *PokemonSpeciesDetail) GetCaptureRate() int32`

GetCaptureRate returns the CaptureRate field if non-nil, zero value otherwise.

### GetCaptureRateOk

`func (o *PokemonSpeciesDetail) GetCaptureRateOk() (*int32, bool)`

GetCaptureRateOk returns a tuple with the CaptureRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaptureRate

`func (o *PokemonSpeciesDetail) SetCaptureRate(v int32)`

SetCaptureRate sets CaptureRate field to given value.

### HasCaptureRate

`func (o *PokemonSpeciesDetail) HasCaptureRate() bool`

HasCaptureRate returns a boolean if a field has been set.

### SetCaptureRateNil

`func (o *PokemonSpeciesDetail) SetCaptureRateNil(b bool)`

 SetCaptureRateNil sets the value for CaptureRate to be an explicit nil

### UnsetCaptureRate
`func (o *PokemonSpeciesDetail) UnsetCaptureRate()`

UnsetCaptureRate ensures that no value is present for CaptureRate, not even an explicit nil
### GetBaseHappiness

`func (o *PokemonSpeciesDetail) GetBaseHappiness() int32`

GetBaseHappiness returns the BaseHappiness field if non-nil, zero value otherwise.

### GetBaseHappinessOk

`func (o *PokemonSpeciesDetail) GetBaseHappinessOk() (*int32, bool)`

GetBaseHappinessOk returns a tuple with the BaseHappiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseHappiness

`func (o *PokemonSpeciesDetail) SetBaseHappiness(v int32)`

SetBaseHappiness sets BaseHappiness field to given value.

### HasBaseHappiness

`func (o *PokemonSpeciesDetail) HasBaseHappiness() bool`

HasBaseHappiness returns a boolean if a field has been set.

### SetBaseHappinessNil

`func (o *PokemonSpeciesDetail) SetBaseHappinessNil(b bool)`

 SetBaseHappinessNil sets the value for BaseHappiness to be an explicit nil

### UnsetBaseHappiness
`func (o *PokemonSpeciesDetail) UnsetBaseHappiness()`

UnsetBaseHappiness ensures that no value is present for BaseHappiness, not even an explicit nil
### GetIsBaby

`func (o *PokemonSpeciesDetail) GetIsBaby() bool`

GetIsBaby returns the IsBaby field if non-nil, zero value otherwise.

### GetIsBabyOk

`func (o *PokemonSpeciesDetail) GetIsBabyOk() (*bool, bool)`

GetIsBabyOk returns a tuple with the IsBaby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBaby

`func (o *PokemonSpeciesDetail) SetIsBaby(v bool)`

SetIsBaby sets IsBaby field to given value.

### HasIsBaby

`func (o *PokemonSpeciesDetail) HasIsBaby() bool`

HasIsBaby returns a boolean if a field has been set.

### GetIsLegendary

`func (o *PokemonSpeciesDetail) GetIsLegendary() bool`

GetIsLegendary returns the IsLegendary field if non-nil, zero value otherwise.

### GetIsLegendaryOk

`func (o *PokemonSpeciesDetail) GetIsLegendaryOk() (*bool, bool)`

GetIsLegendaryOk returns a tuple with the IsLegendary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLegendary

`func (o *PokemonSpeciesDetail) SetIsLegendary(v bool)`

SetIsLegendary sets IsLegendary field to given value.

### HasIsLegendary

`func (o *PokemonSpeciesDetail) HasIsLegendary() bool`

HasIsLegendary returns a boolean if a field has been set.

### GetIsMythical

`func (o *PokemonSpeciesDetail) GetIsMythical() bool`

GetIsMythical returns the IsMythical field if non-nil, zero value otherwise.

### GetIsMythicalOk

`func (o *PokemonSpeciesDetail) GetIsMythicalOk() (*bool, bool)`

GetIsMythicalOk returns a tuple with the IsMythical field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMythical

`func (o *PokemonSpeciesDetail) SetIsMythical(v bool)`

SetIsMythical sets IsMythical field to given value.

### HasIsMythical

`func (o *PokemonSpeciesDetail) HasIsMythical() bool`

HasIsMythical returns a boolean if a field has been set.

### GetHatchCounter

`func (o *PokemonSpeciesDetail) GetHatchCounter() int32`

GetHatchCounter returns the HatchCounter field if non-nil, zero value otherwise.

### GetHatchCounterOk

`func (o *PokemonSpeciesDetail) GetHatchCounterOk() (*int32, bool)`

GetHatchCounterOk returns a tuple with the HatchCounter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHatchCounter

`func (o *PokemonSpeciesDetail) SetHatchCounter(v int32)`

SetHatchCounter sets HatchCounter field to given value.

### HasHatchCounter

`func (o *PokemonSpeciesDetail) HasHatchCounter() bool`

HasHatchCounter returns a boolean if a field has been set.

### SetHatchCounterNil

`func (o *PokemonSpeciesDetail) SetHatchCounterNil(b bool)`

 SetHatchCounterNil sets the value for HatchCounter to be an explicit nil

### UnsetHatchCounter
`func (o *PokemonSpeciesDetail) UnsetHatchCounter()`

UnsetHatchCounter ensures that no value is present for HatchCounter, not even an explicit nil
### GetHasGenderDifferences

`func (o *PokemonSpeciesDetail) GetHasGenderDifferences() bool`

GetHasGenderDifferences returns the HasGenderDifferences field if non-nil, zero value otherwise.

### GetHasGenderDifferencesOk

`func (o *PokemonSpeciesDetail) GetHasGenderDifferencesOk() (*bool, bool)`

GetHasGenderDifferencesOk returns a tuple with the HasGenderDifferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasGenderDifferences

`func (o *PokemonSpeciesDetail) SetHasGenderDifferences(v bool)`

SetHasGenderDifferences sets HasGenderDifferences field to given value.

### HasHasGenderDifferences

`func (o *PokemonSpeciesDetail) HasHasGenderDifferences() bool`

HasHasGenderDifferences returns a boolean if a field has been set.

### GetFormsSwitchable

`func (o *PokemonSpeciesDetail) GetFormsSwitchable() bool`

GetFormsSwitchable returns the FormsSwitchable field if non-nil, zero value otherwise.

### GetFormsSwitchableOk

`func (o *PokemonSpeciesDetail) GetFormsSwitchableOk() (*bool, bool)`

GetFormsSwitchableOk returns a tuple with the FormsSwitchable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormsSwitchable

`func (o *PokemonSpeciesDetail) SetFormsSwitchable(v bool)`

SetFormsSwitchable sets FormsSwitchable field to given value.

### HasFormsSwitchable

`func (o *PokemonSpeciesDetail) HasFormsSwitchable() bool`

HasFormsSwitchable returns a boolean if a field has been set.

### GetGrowthRate

`func (o *PokemonSpeciesDetail) GetGrowthRate() GrowthRateSummary`

GetGrowthRate returns the GrowthRate field if non-nil, zero value otherwise.

### GetGrowthRateOk

`func (o *PokemonSpeciesDetail) GetGrowthRateOk() (*GrowthRateSummary, bool)`

GetGrowthRateOk returns a tuple with the GrowthRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthRate

`func (o *PokemonSpeciesDetail) SetGrowthRate(v GrowthRateSummary)`

SetGrowthRate sets GrowthRate field to given value.


### GetPokedexNumbers

`func (o *PokemonSpeciesDetail) GetPokedexNumbers() []PokemonDexEntry`

GetPokedexNumbers returns the PokedexNumbers field if non-nil, zero value otherwise.

### GetPokedexNumbersOk

`func (o *PokemonSpeciesDetail) GetPokedexNumbersOk() (*[]PokemonDexEntry, bool)`

GetPokedexNumbersOk returns a tuple with the PokedexNumbers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedexNumbers

`func (o *PokemonSpeciesDetail) SetPokedexNumbers(v []PokemonDexEntry)`

SetPokedexNumbers sets PokedexNumbers field to given value.


### GetEggGroups

`func (o *PokemonSpeciesDetail) GetEggGroups() []AbilityDetailPokemonInnerPokemon`

GetEggGroups returns the EggGroups field if non-nil, zero value otherwise.

### GetEggGroupsOk

`func (o *PokemonSpeciesDetail) GetEggGroupsOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetEggGroupsOk returns a tuple with the EggGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEggGroups

`func (o *PokemonSpeciesDetail) SetEggGroups(v []AbilityDetailPokemonInnerPokemon)`

SetEggGroups sets EggGroups field to given value.


### GetColor

`func (o *PokemonSpeciesDetail) GetColor() PokemonColorSummary`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *PokemonSpeciesDetail) GetColorOk() (*PokemonColorSummary, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *PokemonSpeciesDetail) SetColor(v PokemonColorSummary)`

SetColor sets Color field to given value.


### GetShape

`func (o *PokemonSpeciesDetail) GetShape() PokemonShapeSummary`

GetShape returns the Shape field if non-nil, zero value otherwise.

### GetShapeOk

`func (o *PokemonSpeciesDetail) GetShapeOk() (*PokemonShapeSummary, bool)`

GetShapeOk returns a tuple with the Shape field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShape

`func (o *PokemonSpeciesDetail) SetShape(v PokemonShapeSummary)`

SetShape sets Shape field to given value.


### GetEvolvesFromSpecies

`func (o *PokemonSpeciesDetail) GetEvolvesFromSpecies() PokemonSpeciesSummary`

GetEvolvesFromSpecies returns the EvolvesFromSpecies field if non-nil, zero value otherwise.

### GetEvolvesFromSpeciesOk

`func (o *PokemonSpeciesDetail) GetEvolvesFromSpeciesOk() (*PokemonSpeciesSummary, bool)`

GetEvolvesFromSpeciesOk returns a tuple with the EvolvesFromSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolvesFromSpecies

`func (o *PokemonSpeciesDetail) SetEvolvesFromSpecies(v PokemonSpeciesSummary)`

SetEvolvesFromSpecies sets EvolvesFromSpecies field to given value.


### GetEvolutionChain

`func (o *PokemonSpeciesDetail) GetEvolutionChain() EvolutionChainSummary`

GetEvolutionChain returns the EvolutionChain field if non-nil, zero value otherwise.

### GetEvolutionChainOk

`func (o *PokemonSpeciesDetail) GetEvolutionChainOk() (*EvolutionChainSummary, bool)`

GetEvolutionChainOk returns a tuple with the EvolutionChain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolutionChain

`func (o *PokemonSpeciesDetail) SetEvolutionChain(v EvolutionChainSummary)`

SetEvolutionChain sets EvolutionChain field to given value.


### GetHabitat

`func (o *PokemonSpeciesDetail) GetHabitat() PokemonHabitatSummary`

GetHabitat returns the Habitat field if non-nil, zero value otherwise.

### GetHabitatOk

`func (o *PokemonSpeciesDetail) GetHabitatOk() (*PokemonHabitatSummary, bool)`

GetHabitatOk returns a tuple with the Habitat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHabitat

`func (o *PokemonSpeciesDetail) SetHabitat(v PokemonHabitatSummary)`

SetHabitat sets Habitat field to given value.


### GetGeneration

`func (o *PokemonSpeciesDetail) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *PokemonSpeciesDetail) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *PokemonSpeciesDetail) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetNames

`func (o *PokemonSpeciesDetail) GetNames() []PokemonFormDetailFormNamesInner`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokemonSpeciesDetail) GetNamesOk() (*[]PokemonFormDetailFormNamesInner, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokemonSpeciesDetail) SetNames(v []PokemonFormDetailFormNamesInner)`

SetNames sets Names field to given value.


### GetPalParkEncounters

`func (o *PokemonSpeciesDetail) GetPalParkEncounters() []PokemonSpeciesDetailPalParkEncountersInner`

GetPalParkEncounters returns the PalParkEncounters field if non-nil, zero value otherwise.

### GetPalParkEncountersOk

`func (o *PokemonSpeciesDetail) GetPalParkEncountersOk() (*[]PokemonSpeciesDetailPalParkEncountersInner, bool)`

GetPalParkEncountersOk returns a tuple with the PalParkEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPalParkEncounters

`func (o *PokemonSpeciesDetail) SetPalParkEncounters(v []PokemonSpeciesDetailPalParkEncountersInner)`

SetPalParkEncounters sets PalParkEncounters field to given value.


### GetFormDescriptions

`func (o *PokemonSpeciesDetail) GetFormDescriptions() []PokemonSpeciesDescription`

GetFormDescriptions returns the FormDescriptions field if non-nil, zero value otherwise.

### GetFormDescriptionsOk

`func (o *PokemonSpeciesDetail) GetFormDescriptionsOk() (*[]PokemonSpeciesDescription, bool)`

GetFormDescriptionsOk returns a tuple with the FormDescriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormDescriptions

`func (o *PokemonSpeciesDetail) SetFormDescriptions(v []PokemonSpeciesDescription)`

SetFormDescriptions sets FormDescriptions field to given value.


### GetFlavorTextEntries

`func (o *PokemonSpeciesDetail) GetFlavorTextEntries() []PokemonSpeciesFlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *PokemonSpeciesDetail) GetFlavorTextEntriesOk() (*[]PokemonSpeciesFlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *PokemonSpeciesDetail) SetFlavorTextEntries(v []PokemonSpeciesFlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.


### GetGenera

`func (o *PokemonSpeciesDetail) GetGenera() []PokemonSpeciesDetailGeneraInner`

GetGenera returns the Genera field if non-nil, zero value otherwise.

### GetGeneraOk

`func (o *PokemonSpeciesDetail) GetGeneraOk() (*[]PokemonSpeciesDetailGeneraInner, bool)`

GetGeneraOk returns a tuple with the Genera field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenera

`func (o *PokemonSpeciesDetail) SetGenera(v []PokemonSpeciesDetailGeneraInner)`

SetGenera sets Genera field to given value.


### GetVarieties

`func (o *PokemonSpeciesDetail) GetVarieties() []PokemonSpeciesDetailVarietiesInner`

GetVarieties returns the Varieties field if non-nil, zero value otherwise.

### GetVarietiesOk

`func (o *PokemonSpeciesDetail) GetVarietiesOk() (*[]PokemonSpeciesDetailVarietiesInner, bool)`

GetVarietiesOk returns a tuple with the Varieties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVarieties

`func (o *PokemonSpeciesDetail) SetVarieties(v []PokemonSpeciesDetailVarietiesInner)`

SetVarieties sets Varieties field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


