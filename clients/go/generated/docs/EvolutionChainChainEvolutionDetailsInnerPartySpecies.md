# EvolutionChainChainEvolutionDetailsInnerPartySpecies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Order** | Pointer to **int32** |  | [optional] 
**GenderRate** | Pointer to **int32** |  | [optional] 
**CaptureRate** | Pointer to **int32** |  | [optional] 
**BaseHappiness** | Pointer to **int32** |  | [optional] 
**IsBaby** | Pointer to **bool** |  | [optional] 
**HatchCounter** | Pointer to **int32** |  | [optional] 
**HasGenderDifferences** | Pointer to **bool** |  | [optional] 
**FormsSwitchable** | Pointer to **bool** |  | [optional] 
**GrowthRate** | Pointer to [**GrowthRate**](GrowthRate.md) |  | [optional] 
**PokedexNumbers** | Pointer to [**[]PokemonSpeciesDexEntry**](PokemonSpeciesDexEntry.md) |  | [optional] 
**EggGroups** | Pointer to [**[]EggGroup**](EggGroup.md) |  | [optional] 
**Color** | Pointer to [**PokemonColor**](PokemonColor.md) |  | [optional] 
**Shape** | Pointer to [**PokemonShape**](PokemonShape.md) |  | [optional] 
**EvolvesFromSpecies** | Pointer to [**PokemonSpecies**](PokemonSpecies.md) |  | [optional] 
**EvolutionChain** | Pointer to [**EvolutionChain**](EvolutionChain.md) |  | [optional] 
**Habitat** | Pointer to [**PokemonHabitat**](PokemonHabitat.md) |  | [optional] 
**Generation** | Pointer to [**Generation**](Generation.md) |  | [optional] 
**Names** | Pointer to [**[]Name**](Name.md) |  | [optional] 
**PalParkEncounters** | Pointer to [**[]PalParkEncounterArea**](PalParkEncounterArea.md) |  | [optional] 
**FlavorTextEntries** | Pointer to [**[]FlavorText**](FlavorText.md) |  | [optional] 
**FormDescriptions** | Pointer to [**[]Description**](Description.md) |  | [optional] 
**Genera** | Pointer to [**[]Genus**](Genus.md) |  | [optional] 
**Varieties** | Pointer to [**[]PokemonSpeciesVariety**](PokemonSpeciesVariety.md) |  | [optional] 

## Methods

### NewEvolutionChainChainEvolutionDetailsInnerPartySpecies

`func NewEvolutionChainChainEvolutionDetailsInnerPartySpecies() *EvolutionChainChainEvolutionDetailsInnerPartySpecies`

NewEvolutionChainChainEvolutionDetailsInnerPartySpecies instantiates a new EvolutionChainChainEvolutionDetailsInnerPartySpecies object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionChainChainEvolutionDetailsInnerPartySpeciesWithDefaults

`func NewEvolutionChainChainEvolutionDetailsInnerPartySpeciesWithDefaults() *EvolutionChainChainEvolutionDetailsInnerPartySpecies`

NewEvolutionChainChainEvolutionDetailsInnerPartySpeciesWithDefaults instantiates a new EvolutionChainChainEvolutionDetailsInnerPartySpecies object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOrder

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetGenderRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGenderRate() int32`

GetGenderRate returns the GenderRate field if non-nil, zero value otherwise.

### GetGenderRateOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGenderRateOk() (*int32, bool)`

GetGenderRateOk returns a tuple with the GenderRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenderRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetGenderRate(v int32)`

SetGenderRate sets GenderRate field to given value.

### HasGenderRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasGenderRate() bool`

HasGenderRate returns a boolean if a field has been set.

### GetCaptureRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetCaptureRate() int32`

GetCaptureRate returns the CaptureRate field if non-nil, zero value otherwise.

### GetCaptureRateOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetCaptureRateOk() (*int32, bool)`

GetCaptureRateOk returns a tuple with the CaptureRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaptureRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetCaptureRate(v int32)`

SetCaptureRate sets CaptureRate field to given value.

### HasCaptureRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasCaptureRate() bool`

HasCaptureRate returns a boolean if a field has been set.

### GetBaseHappiness

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetBaseHappiness() int32`

GetBaseHappiness returns the BaseHappiness field if non-nil, zero value otherwise.

### GetBaseHappinessOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetBaseHappinessOk() (*int32, bool)`

GetBaseHappinessOk returns a tuple with the BaseHappiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseHappiness

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetBaseHappiness(v int32)`

SetBaseHappiness sets BaseHappiness field to given value.

### HasBaseHappiness

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasBaseHappiness() bool`

HasBaseHappiness returns a boolean if a field has been set.

### GetIsBaby

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetIsBaby() bool`

GetIsBaby returns the IsBaby field if non-nil, zero value otherwise.

### GetIsBabyOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetIsBabyOk() (*bool, bool)`

GetIsBabyOk returns a tuple with the IsBaby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBaby

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetIsBaby(v bool)`

SetIsBaby sets IsBaby field to given value.

### HasIsBaby

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasIsBaby() bool`

HasIsBaby returns a boolean if a field has been set.

### GetHatchCounter

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetHatchCounter() int32`

GetHatchCounter returns the HatchCounter field if non-nil, zero value otherwise.

### GetHatchCounterOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetHatchCounterOk() (*int32, bool)`

GetHatchCounterOk returns a tuple with the HatchCounter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHatchCounter

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetHatchCounter(v int32)`

SetHatchCounter sets HatchCounter field to given value.

### HasHatchCounter

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasHatchCounter() bool`

HasHatchCounter returns a boolean if a field has been set.

### GetHasGenderDifferences

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetHasGenderDifferences() bool`

GetHasGenderDifferences returns the HasGenderDifferences field if non-nil, zero value otherwise.

### GetHasGenderDifferencesOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetHasGenderDifferencesOk() (*bool, bool)`

GetHasGenderDifferencesOk returns a tuple with the HasGenderDifferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasGenderDifferences

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetHasGenderDifferences(v bool)`

SetHasGenderDifferences sets HasGenderDifferences field to given value.

### HasHasGenderDifferences

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasHasGenderDifferences() bool`

HasHasGenderDifferences returns a boolean if a field has been set.

### GetFormsSwitchable

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetFormsSwitchable() bool`

GetFormsSwitchable returns the FormsSwitchable field if non-nil, zero value otherwise.

### GetFormsSwitchableOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetFormsSwitchableOk() (*bool, bool)`

GetFormsSwitchableOk returns a tuple with the FormsSwitchable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormsSwitchable

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetFormsSwitchable(v bool)`

SetFormsSwitchable sets FormsSwitchable field to given value.

### HasFormsSwitchable

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasFormsSwitchable() bool`

HasFormsSwitchable returns a boolean if a field has been set.

### GetGrowthRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGrowthRate() GrowthRate`

GetGrowthRate returns the GrowthRate field if non-nil, zero value otherwise.

### GetGrowthRateOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGrowthRateOk() (*GrowthRate, bool)`

GetGrowthRateOk returns a tuple with the GrowthRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetGrowthRate(v GrowthRate)`

SetGrowthRate sets GrowthRate field to given value.

### HasGrowthRate

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasGrowthRate() bool`

HasGrowthRate returns a boolean if a field has been set.

### GetPokedexNumbers

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetPokedexNumbers() []PokemonSpeciesDexEntry`

GetPokedexNumbers returns the PokedexNumbers field if non-nil, zero value otherwise.

### GetPokedexNumbersOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetPokedexNumbersOk() (*[]PokemonSpeciesDexEntry, bool)`

GetPokedexNumbersOk returns a tuple with the PokedexNumbers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedexNumbers

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetPokedexNumbers(v []PokemonSpeciesDexEntry)`

SetPokedexNumbers sets PokedexNumbers field to given value.

### HasPokedexNumbers

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasPokedexNumbers() bool`

HasPokedexNumbers returns a boolean if a field has been set.

### GetEggGroups

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetEggGroups() []EggGroup`

GetEggGroups returns the EggGroups field if non-nil, zero value otherwise.

### GetEggGroupsOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetEggGroupsOk() (*[]EggGroup, bool)`

GetEggGroupsOk returns a tuple with the EggGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEggGroups

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetEggGroups(v []EggGroup)`

SetEggGroups sets EggGroups field to given value.

### HasEggGroups

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasEggGroups() bool`

HasEggGroups returns a boolean if a field has been set.

### GetColor

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetColor() PokemonColor`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetColorOk() (*PokemonColor, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetColor(v PokemonColor)`

SetColor sets Color field to given value.

### HasColor

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetShape

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetShape() PokemonShape`

GetShape returns the Shape field if non-nil, zero value otherwise.

### GetShapeOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetShapeOk() (*PokemonShape, bool)`

GetShapeOk returns a tuple with the Shape field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShape

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetShape(v PokemonShape)`

SetShape sets Shape field to given value.

### HasShape

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasShape() bool`

HasShape returns a boolean if a field has been set.

### GetEvolvesFromSpecies

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetEvolvesFromSpecies() PokemonSpecies`

GetEvolvesFromSpecies returns the EvolvesFromSpecies field if non-nil, zero value otherwise.

### GetEvolvesFromSpeciesOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetEvolvesFromSpeciesOk() (*PokemonSpecies, bool)`

GetEvolvesFromSpeciesOk returns a tuple with the EvolvesFromSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolvesFromSpecies

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetEvolvesFromSpecies(v PokemonSpecies)`

SetEvolvesFromSpecies sets EvolvesFromSpecies field to given value.

### HasEvolvesFromSpecies

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasEvolvesFromSpecies() bool`

HasEvolvesFromSpecies returns a boolean if a field has been set.

### GetEvolutionChain

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetEvolutionChain() EvolutionChain`

GetEvolutionChain returns the EvolutionChain field if non-nil, zero value otherwise.

### GetEvolutionChainOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetEvolutionChainOk() (*EvolutionChain, bool)`

GetEvolutionChainOk returns a tuple with the EvolutionChain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolutionChain

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetEvolutionChain(v EvolutionChain)`

SetEvolutionChain sets EvolutionChain field to given value.

### HasEvolutionChain

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasEvolutionChain() bool`

HasEvolutionChain returns a boolean if a field has been set.

### GetHabitat

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetHabitat() PokemonHabitat`

GetHabitat returns the Habitat field if non-nil, zero value otherwise.

### GetHabitatOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetHabitatOk() (*PokemonHabitat, bool)`

GetHabitatOk returns a tuple with the Habitat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHabitat

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetHabitat(v PokemonHabitat)`

SetHabitat sets Habitat field to given value.

### HasHabitat

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasHabitat() bool`

HasHabitat returns a boolean if a field has been set.

### GetGeneration

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGeneration() Generation`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGenerationOk() (*Generation, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetGeneration(v Generation)`

SetGeneration sets Generation field to given value.

### HasGeneration

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasGeneration() bool`

HasGeneration returns a boolean if a field has been set.

### GetNames

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetNames(v []Name)`

SetNames sets Names field to given value.

### HasNames

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasNames() bool`

HasNames returns a boolean if a field has been set.

### GetPalParkEncounters

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetPalParkEncounters() []PalParkEncounterArea`

GetPalParkEncounters returns the PalParkEncounters field if non-nil, zero value otherwise.

### GetPalParkEncountersOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetPalParkEncountersOk() (*[]PalParkEncounterArea, bool)`

GetPalParkEncountersOk returns a tuple with the PalParkEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPalParkEncounters

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetPalParkEncounters(v []PalParkEncounterArea)`

SetPalParkEncounters sets PalParkEncounters field to given value.

### HasPalParkEncounters

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasPalParkEncounters() bool`

HasPalParkEncounters returns a boolean if a field has been set.

### GetFlavorTextEntries

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetFlavorTextEntries() []FlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetFlavorTextEntriesOk() (*[]FlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetFlavorTextEntries(v []FlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.

### HasFlavorTextEntries

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasFlavorTextEntries() bool`

HasFlavorTextEntries returns a boolean if a field has been set.

### GetFormDescriptions

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetFormDescriptions() []Description`

GetFormDescriptions returns the FormDescriptions field if non-nil, zero value otherwise.

### GetFormDescriptionsOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetFormDescriptionsOk() (*[]Description, bool)`

GetFormDescriptionsOk returns a tuple with the FormDescriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormDescriptions

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetFormDescriptions(v []Description)`

SetFormDescriptions sets FormDescriptions field to given value.

### HasFormDescriptions

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasFormDescriptions() bool`

HasFormDescriptions returns a boolean if a field has been set.

### GetGenera

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGenera() []Genus`

GetGenera returns the Genera field if non-nil, zero value otherwise.

### GetGeneraOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetGeneraOk() (*[]Genus, bool)`

GetGeneraOk returns a tuple with the Genera field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenera

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetGenera(v []Genus)`

SetGenera sets Genera field to given value.

### HasGenera

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasGenera() bool`

HasGenera returns a boolean if a field has been set.

### GetVarieties

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetVarieties() []PokemonSpeciesVariety`

GetVarieties returns the Varieties field if non-nil, zero value otherwise.

### GetVarietiesOk

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) GetVarietiesOk() (*[]PokemonSpeciesVariety, bool)`

GetVarietiesOk returns a tuple with the Varieties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVarieties

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) SetVarieties(v []PokemonSpeciesVariety)`

SetVarieties sets Varieties field to given value.

### HasVarieties

`func (o *EvolutionChainChainEvolutionDetailsInnerPartySpecies) HasVarieties() bool`

HasVarieties returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


