# PokemonSpecies

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

### NewPokemonSpecies

`func NewPokemonSpecies() *PokemonSpecies`

NewPokemonSpecies instantiates a new PokemonSpecies object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesWithDefaults

`func NewPokemonSpeciesWithDefaults() *PokemonSpecies`

NewPokemonSpeciesWithDefaults instantiates a new PokemonSpecies object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokemonSpecies) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokemonSpecies) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokemonSpecies) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *PokemonSpecies) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *PokemonSpecies) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonSpecies) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonSpecies) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *PokemonSpecies) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOrder

`func (o *PokemonSpecies) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *PokemonSpecies) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *PokemonSpecies) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *PokemonSpecies) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetGenderRate

`func (o *PokemonSpecies) GetGenderRate() int32`

GetGenderRate returns the GenderRate field if non-nil, zero value otherwise.

### GetGenderRateOk

`func (o *PokemonSpecies) GetGenderRateOk() (*int32, bool)`

GetGenderRateOk returns a tuple with the GenderRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenderRate

`func (o *PokemonSpecies) SetGenderRate(v int32)`

SetGenderRate sets GenderRate field to given value.

### HasGenderRate

`func (o *PokemonSpecies) HasGenderRate() bool`

HasGenderRate returns a boolean if a field has been set.

### GetCaptureRate

`func (o *PokemonSpecies) GetCaptureRate() int32`

GetCaptureRate returns the CaptureRate field if non-nil, zero value otherwise.

### GetCaptureRateOk

`func (o *PokemonSpecies) GetCaptureRateOk() (*int32, bool)`

GetCaptureRateOk returns a tuple with the CaptureRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaptureRate

`func (o *PokemonSpecies) SetCaptureRate(v int32)`

SetCaptureRate sets CaptureRate field to given value.

### HasCaptureRate

`func (o *PokemonSpecies) HasCaptureRate() bool`

HasCaptureRate returns a boolean if a field has been set.

### GetBaseHappiness

`func (o *PokemonSpecies) GetBaseHappiness() int32`

GetBaseHappiness returns the BaseHappiness field if non-nil, zero value otherwise.

### GetBaseHappinessOk

`func (o *PokemonSpecies) GetBaseHappinessOk() (*int32, bool)`

GetBaseHappinessOk returns a tuple with the BaseHappiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseHappiness

`func (o *PokemonSpecies) SetBaseHappiness(v int32)`

SetBaseHappiness sets BaseHappiness field to given value.

### HasBaseHappiness

`func (o *PokemonSpecies) HasBaseHappiness() bool`

HasBaseHappiness returns a boolean if a field has been set.

### GetIsBaby

`func (o *PokemonSpecies) GetIsBaby() bool`

GetIsBaby returns the IsBaby field if non-nil, zero value otherwise.

### GetIsBabyOk

`func (o *PokemonSpecies) GetIsBabyOk() (*bool, bool)`

GetIsBabyOk returns a tuple with the IsBaby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBaby

`func (o *PokemonSpecies) SetIsBaby(v bool)`

SetIsBaby sets IsBaby field to given value.

### HasIsBaby

`func (o *PokemonSpecies) HasIsBaby() bool`

HasIsBaby returns a boolean if a field has been set.

### GetHatchCounter

`func (o *PokemonSpecies) GetHatchCounter() int32`

GetHatchCounter returns the HatchCounter field if non-nil, zero value otherwise.

### GetHatchCounterOk

`func (o *PokemonSpecies) GetHatchCounterOk() (*int32, bool)`

GetHatchCounterOk returns a tuple with the HatchCounter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHatchCounter

`func (o *PokemonSpecies) SetHatchCounter(v int32)`

SetHatchCounter sets HatchCounter field to given value.

### HasHatchCounter

`func (o *PokemonSpecies) HasHatchCounter() bool`

HasHatchCounter returns a boolean if a field has been set.

### GetHasGenderDifferences

`func (o *PokemonSpecies) GetHasGenderDifferences() bool`

GetHasGenderDifferences returns the HasGenderDifferences field if non-nil, zero value otherwise.

### GetHasGenderDifferencesOk

`func (o *PokemonSpecies) GetHasGenderDifferencesOk() (*bool, bool)`

GetHasGenderDifferencesOk returns a tuple with the HasGenderDifferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasGenderDifferences

`func (o *PokemonSpecies) SetHasGenderDifferences(v bool)`

SetHasGenderDifferences sets HasGenderDifferences field to given value.

### HasHasGenderDifferences

`func (o *PokemonSpecies) HasHasGenderDifferences() bool`

HasHasGenderDifferences returns a boolean if a field has been set.

### GetFormsSwitchable

`func (o *PokemonSpecies) GetFormsSwitchable() bool`

GetFormsSwitchable returns the FormsSwitchable field if non-nil, zero value otherwise.

### GetFormsSwitchableOk

`func (o *PokemonSpecies) GetFormsSwitchableOk() (*bool, bool)`

GetFormsSwitchableOk returns a tuple with the FormsSwitchable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormsSwitchable

`func (o *PokemonSpecies) SetFormsSwitchable(v bool)`

SetFormsSwitchable sets FormsSwitchable field to given value.

### HasFormsSwitchable

`func (o *PokemonSpecies) HasFormsSwitchable() bool`

HasFormsSwitchable returns a boolean if a field has been set.

### GetGrowthRate

`func (o *PokemonSpecies) GetGrowthRate() GrowthRate`

GetGrowthRate returns the GrowthRate field if non-nil, zero value otherwise.

### GetGrowthRateOk

`func (o *PokemonSpecies) GetGrowthRateOk() (*GrowthRate, bool)`

GetGrowthRateOk returns a tuple with the GrowthRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthRate

`func (o *PokemonSpecies) SetGrowthRate(v GrowthRate)`

SetGrowthRate sets GrowthRate field to given value.

### HasGrowthRate

`func (o *PokemonSpecies) HasGrowthRate() bool`

HasGrowthRate returns a boolean if a field has been set.

### GetPokedexNumbers

`func (o *PokemonSpecies) GetPokedexNumbers() []PokemonSpeciesDexEntry`

GetPokedexNumbers returns the PokedexNumbers field if non-nil, zero value otherwise.

### GetPokedexNumbersOk

`func (o *PokemonSpecies) GetPokedexNumbersOk() (*[]PokemonSpeciesDexEntry, bool)`

GetPokedexNumbersOk returns a tuple with the PokedexNumbers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedexNumbers

`func (o *PokemonSpecies) SetPokedexNumbers(v []PokemonSpeciesDexEntry)`

SetPokedexNumbers sets PokedexNumbers field to given value.

### HasPokedexNumbers

`func (o *PokemonSpecies) HasPokedexNumbers() bool`

HasPokedexNumbers returns a boolean if a field has been set.

### GetEggGroups

`func (o *PokemonSpecies) GetEggGroups() []EggGroup`

GetEggGroups returns the EggGroups field if non-nil, zero value otherwise.

### GetEggGroupsOk

`func (o *PokemonSpecies) GetEggGroupsOk() (*[]EggGroup, bool)`

GetEggGroupsOk returns a tuple with the EggGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEggGroups

`func (o *PokemonSpecies) SetEggGroups(v []EggGroup)`

SetEggGroups sets EggGroups field to given value.

### HasEggGroups

`func (o *PokemonSpecies) HasEggGroups() bool`

HasEggGroups returns a boolean if a field has been set.

### GetColor

`func (o *PokemonSpecies) GetColor() PokemonColor`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *PokemonSpecies) GetColorOk() (*PokemonColor, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *PokemonSpecies) SetColor(v PokemonColor)`

SetColor sets Color field to given value.

### HasColor

`func (o *PokemonSpecies) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetShape

`func (o *PokemonSpecies) GetShape() PokemonShape`

GetShape returns the Shape field if non-nil, zero value otherwise.

### GetShapeOk

`func (o *PokemonSpecies) GetShapeOk() (*PokemonShape, bool)`

GetShapeOk returns a tuple with the Shape field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShape

`func (o *PokemonSpecies) SetShape(v PokemonShape)`

SetShape sets Shape field to given value.

### HasShape

`func (o *PokemonSpecies) HasShape() bool`

HasShape returns a boolean if a field has been set.

### GetEvolvesFromSpecies

`func (o *PokemonSpecies) GetEvolvesFromSpecies() PokemonSpecies`

GetEvolvesFromSpecies returns the EvolvesFromSpecies field if non-nil, zero value otherwise.

### GetEvolvesFromSpeciesOk

`func (o *PokemonSpecies) GetEvolvesFromSpeciesOk() (*PokemonSpecies, bool)`

GetEvolvesFromSpeciesOk returns a tuple with the EvolvesFromSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolvesFromSpecies

`func (o *PokemonSpecies) SetEvolvesFromSpecies(v PokemonSpecies)`

SetEvolvesFromSpecies sets EvolvesFromSpecies field to given value.

### HasEvolvesFromSpecies

`func (o *PokemonSpecies) HasEvolvesFromSpecies() bool`

HasEvolvesFromSpecies returns a boolean if a field has been set.

### GetEvolutionChain

`func (o *PokemonSpecies) GetEvolutionChain() EvolutionChain`

GetEvolutionChain returns the EvolutionChain field if non-nil, zero value otherwise.

### GetEvolutionChainOk

`func (o *PokemonSpecies) GetEvolutionChainOk() (*EvolutionChain, bool)`

GetEvolutionChainOk returns a tuple with the EvolutionChain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolutionChain

`func (o *PokemonSpecies) SetEvolutionChain(v EvolutionChain)`

SetEvolutionChain sets EvolutionChain field to given value.

### HasEvolutionChain

`func (o *PokemonSpecies) HasEvolutionChain() bool`

HasEvolutionChain returns a boolean if a field has been set.

### GetHabitat

`func (o *PokemonSpecies) GetHabitat() PokemonHabitat`

GetHabitat returns the Habitat field if non-nil, zero value otherwise.

### GetHabitatOk

`func (o *PokemonSpecies) GetHabitatOk() (*PokemonHabitat, bool)`

GetHabitatOk returns a tuple with the Habitat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHabitat

`func (o *PokemonSpecies) SetHabitat(v PokemonHabitat)`

SetHabitat sets Habitat field to given value.

### HasHabitat

`func (o *PokemonSpecies) HasHabitat() bool`

HasHabitat returns a boolean if a field has been set.

### GetGeneration

`func (o *PokemonSpecies) GetGeneration() Generation`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *PokemonSpecies) GetGenerationOk() (*Generation, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *PokemonSpecies) SetGeneration(v Generation)`

SetGeneration sets Generation field to given value.

### HasGeneration

`func (o *PokemonSpecies) HasGeneration() bool`

HasGeneration returns a boolean if a field has been set.

### GetNames

`func (o *PokemonSpecies) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokemonSpecies) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokemonSpecies) SetNames(v []Name)`

SetNames sets Names field to given value.

### HasNames

`func (o *PokemonSpecies) HasNames() bool`

HasNames returns a boolean if a field has been set.

### GetPalParkEncounters

`func (o *PokemonSpecies) GetPalParkEncounters() []PalParkEncounterArea`

GetPalParkEncounters returns the PalParkEncounters field if non-nil, zero value otherwise.

### GetPalParkEncountersOk

`func (o *PokemonSpecies) GetPalParkEncountersOk() (*[]PalParkEncounterArea, bool)`

GetPalParkEncountersOk returns a tuple with the PalParkEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPalParkEncounters

`func (o *PokemonSpecies) SetPalParkEncounters(v []PalParkEncounterArea)`

SetPalParkEncounters sets PalParkEncounters field to given value.

### HasPalParkEncounters

`func (o *PokemonSpecies) HasPalParkEncounters() bool`

HasPalParkEncounters returns a boolean if a field has been set.

### GetFlavorTextEntries

`func (o *PokemonSpecies) GetFlavorTextEntries() []FlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *PokemonSpecies) GetFlavorTextEntriesOk() (*[]FlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *PokemonSpecies) SetFlavorTextEntries(v []FlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.

### HasFlavorTextEntries

`func (o *PokemonSpecies) HasFlavorTextEntries() bool`

HasFlavorTextEntries returns a boolean if a field has been set.

### GetFormDescriptions

`func (o *PokemonSpecies) GetFormDescriptions() []Description`

GetFormDescriptions returns the FormDescriptions field if non-nil, zero value otherwise.

### GetFormDescriptionsOk

`func (o *PokemonSpecies) GetFormDescriptionsOk() (*[]Description, bool)`

GetFormDescriptionsOk returns a tuple with the FormDescriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormDescriptions

`func (o *PokemonSpecies) SetFormDescriptions(v []Description)`

SetFormDescriptions sets FormDescriptions field to given value.

### HasFormDescriptions

`func (o *PokemonSpecies) HasFormDescriptions() bool`

HasFormDescriptions returns a boolean if a field has been set.

### GetGenera

`func (o *PokemonSpecies) GetGenera() []Genus`

GetGenera returns the Genera field if non-nil, zero value otherwise.

### GetGeneraOk

`func (o *PokemonSpecies) GetGeneraOk() (*[]Genus, bool)`

GetGeneraOk returns a tuple with the Genera field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenera

`func (o *PokemonSpecies) SetGenera(v []Genus)`

SetGenera sets Genera field to given value.

### HasGenera

`func (o *PokemonSpecies) HasGenera() bool`

HasGenera returns a boolean if a field has been set.

### GetVarieties

`func (o *PokemonSpecies) GetVarieties() []PokemonSpeciesVariety`

GetVarieties returns the Varieties field if non-nil, zero value otherwise.

### GetVarietiesOk

`func (o *PokemonSpecies) GetVarietiesOk() (*[]PokemonSpeciesVariety, bool)`

GetVarietiesOk returns a tuple with the Varieties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVarieties

`func (o *PokemonSpecies) SetVarieties(v []PokemonSpeciesVariety)`

SetVarieties sets Varieties field to given value.

### HasVarieties

`func (o *PokemonSpecies) HasVarieties() bool`

HasVarieties returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


