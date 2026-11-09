# PokemonEvolution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these evolution requirements apply. | 
**IsDefault** | Pointer to **bool** | Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. | [optional] 
**Item** | [**NullableItemSummary**](ItemSummary.md) | The item required to cause evolution this into Pokémon species. | 
**Trigger** | [**EvolutionTriggerSummary**](EvolutionTriggerSummary.md) | The type of event that triggers evolution into this Pokémon species. | 
**Gender** | Pointer to **NullableInt32** | The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. | [optional] 
**HeldItem** | [**NullableItemSummary**](ItemSummary.md) | The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. | 
**KnownMove** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  | 
**KnownMoveType** | [**PokemonEvolutionKnownMove**](PokemonEvolutionKnownMove.md) |  | 
**Location** | [**NullableLocationSummary**](LocationSummary.md) | The location the evolution must be triggered at. | 
**MinLevel** | Pointer to **NullableInt32** | The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**MinHappiness** | Pointer to **NullableInt32** | The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**MinBeauty** | Pointer to **NullableInt32** | The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**MinAffection** | Pointer to **NullableInt32** | The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. | [optional] 
**NearSpecialRock** | Pointer to **bool** | Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. | [optional] 
**NeedsMultiplayer** | Pointer to **bool** | Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). | [optional] 
**NeedsOverworldRain** | Pointer to **bool** | Whether or not it must be raining in the overworld to cause evolution this Pokémon species. | [optional] 
**PartySpecies** | [**NullablePokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**PartyType** | [**NullableTypeSummary**](TypeSummary.md) | The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. | 
**RelativePhysicalStats** | Pointer to **NullableInt32** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. | [optional] 
**TimeOfDay** | Pointer to **string** | The required time of day. Day or night. | [optional] 
**TradeSpecies** | [**NullablePokemonSpeciesSummary**](PokemonSpeciesSummary.md) | Pokémon species for which this one must be traded. | 
**TurnUpsideDown** | Pointer to **bool** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] 
**Region** | [**NullableRegionSummary**](RegionSummary.md) | The required region in which this evolution can occur. | 
**RequiredPokemonForm** | [**NullablePokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form required before evolving, or null if unrestricted. | 
**EvolvedPokemonForm** | [**NullablePokemonFormSummary**](PokemonFormSummary.md) | The Pokémon form produced by this evolution, or null if unspecified. | 
**UsedMove** | [**NullableMoveSummary**](MoveSummary.md) | The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. | 
**MinMoveCount** | Pointer to **NullableInt32** | The minimum number of times a move must be used in order to evolve into this Pokémon species. | [optional] 
**MinSteps** | Pointer to **NullableInt32** | The minimum number of steps that must be taken in order to evolve into this Pokémon species. | [optional] 
**MinDamageTaken** | Pointer to **NullableInt32** | The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. | [optional] 
**AllowedNatures** | [**[]NatureSummary**](NatureSummary.md) | The natures that allow this evolution, or null if unrestricted. | [readonly] 
**ConditionExpression** | [**NullableEvolutionConditionExpression**](EvolutionConditionExpression.md) | An additional evolution condition expressed in reverse Polish notation, or null if none. | [readonly] 

## Methods

### NewPokemonEvolution

`func NewPokemonEvolution(versionGroup VersionGroupSummary, item NullableItemSummary, trigger EvolutionTriggerSummary, heldItem NullableItemSummary, knownMove PokemonEvolutionKnownMove, knownMoveType PokemonEvolutionKnownMove, location NullableLocationSummary, partySpecies NullablePokemonSpeciesSummary, partyType NullableTypeSummary, tradeSpecies NullablePokemonSpeciesSummary, region NullableRegionSummary, requiredPokemonForm NullablePokemonFormSummary, evolvedPokemonForm NullablePokemonFormSummary, usedMove NullableMoveSummary, allowedNatures []NatureSummary, conditionExpression NullableEvolutionConditionExpression, ) *PokemonEvolution`

NewPokemonEvolution instantiates a new PokemonEvolution object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonEvolutionWithDefaults

`func NewPokemonEvolutionWithDefaults() *PokemonEvolution`

NewPokemonEvolutionWithDefaults instantiates a new PokemonEvolution object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersionGroup

`func (o *PokemonEvolution) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *PokemonEvolution) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *PokemonEvolution) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.


### GetIsDefault

`func (o *PokemonEvolution) GetIsDefault() bool`

GetIsDefault returns the IsDefault field if non-nil, zero value otherwise.

### GetIsDefaultOk

`func (o *PokemonEvolution) GetIsDefaultOk() (*bool, bool)`

GetIsDefaultOk returns a tuple with the IsDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDefault

`func (o *PokemonEvolution) SetIsDefault(v bool)`

SetIsDefault sets IsDefault field to given value.

### HasIsDefault

`func (o *PokemonEvolution) HasIsDefault() bool`

HasIsDefault returns a boolean if a field has been set.

### GetItem

`func (o *PokemonEvolution) GetItem() ItemSummary`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *PokemonEvolution) GetItemOk() (*ItemSummary, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *PokemonEvolution) SetItem(v ItemSummary)`

SetItem sets Item field to given value.


### SetItemNil

`func (o *PokemonEvolution) SetItemNil(b bool)`

 SetItemNil sets the value for Item to be an explicit nil

### UnsetItem
`func (o *PokemonEvolution) UnsetItem()`

UnsetItem ensures that no value is present for Item, not even an explicit nil
### GetTrigger

`func (o *PokemonEvolution) GetTrigger() EvolutionTriggerSummary`

GetTrigger returns the Trigger field if non-nil, zero value otherwise.

### GetTriggerOk

`func (o *PokemonEvolution) GetTriggerOk() (*EvolutionTriggerSummary, bool)`

GetTriggerOk returns a tuple with the Trigger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrigger

`func (o *PokemonEvolution) SetTrigger(v EvolutionTriggerSummary)`

SetTrigger sets Trigger field to given value.


### GetGender

`func (o *PokemonEvolution) GetGender() int32`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *PokemonEvolution) GetGenderOk() (*int32, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *PokemonEvolution) SetGender(v int32)`

SetGender sets Gender field to given value.

### HasGender

`func (o *PokemonEvolution) HasGender() bool`

HasGender returns a boolean if a field has been set.

### SetGenderNil

`func (o *PokemonEvolution) SetGenderNil(b bool)`

 SetGenderNil sets the value for Gender to be an explicit nil

### UnsetGender
`func (o *PokemonEvolution) UnsetGender()`

UnsetGender ensures that no value is present for Gender, not even an explicit nil
### GetHeldItem

`func (o *PokemonEvolution) GetHeldItem() ItemSummary`

GetHeldItem returns the HeldItem field if non-nil, zero value otherwise.

### GetHeldItemOk

`func (o *PokemonEvolution) GetHeldItemOk() (*ItemSummary, bool)`

GetHeldItemOk returns a tuple with the HeldItem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeldItem

`func (o *PokemonEvolution) SetHeldItem(v ItemSummary)`

SetHeldItem sets HeldItem field to given value.


### SetHeldItemNil

`func (o *PokemonEvolution) SetHeldItemNil(b bool)`

 SetHeldItemNil sets the value for HeldItem to be an explicit nil

### UnsetHeldItem
`func (o *PokemonEvolution) UnsetHeldItem()`

UnsetHeldItem ensures that no value is present for HeldItem, not even an explicit nil
### GetKnownMove

`func (o *PokemonEvolution) GetKnownMove() PokemonEvolutionKnownMove`

GetKnownMove returns the KnownMove field if non-nil, zero value otherwise.

### GetKnownMoveOk

`func (o *PokemonEvolution) GetKnownMoveOk() (*PokemonEvolutionKnownMove, bool)`

GetKnownMoveOk returns a tuple with the KnownMove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKnownMove

`func (o *PokemonEvolution) SetKnownMove(v PokemonEvolutionKnownMove)`

SetKnownMove sets KnownMove field to given value.


### GetKnownMoveType

`func (o *PokemonEvolution) GetKnownMoveType() PokemonEvolutionKnownMove`

GetKnownMoveType returns the KnownMoveType field if non-nil, zero value otherwise.

### GetKnownMoveTypeOk

`func (o *PokemonEvolution) GetKnownMoveTypeOk() (*PokemonEvolutionKnownMove, bool)`

GetKnownMoveTypeOk returns a tuple with the KnownMoveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKnownMoveType

`func (o *PokemonEvolution) SetKnownMoveType(v PokemonEvolutionKnownMove)`

SetKnownMoveType sets KnownMoveType field to given value.


### GetLocation

`func (o *PokemonEvolution) GetLocation() LocationSummary`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *PokemonEvolution) GetLocationOk() (*LocationSummary, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *PokemonEvolution) SetLocation(v LocationSummary)`

SetLocation sets Location field to given value.


### SetLocationNil

`func (o *PokemonEvolution) SetLocationNil(b bool)`

 SetLocationNil sets the value for Location to be an explicit nil

### UnsetLocation
`func (o *PokemonEvolution) UnsetLocation()`

UnsetLocation ensures that no value is present for Location, not even an explicit nil
### GetMinLevel

`func (o *PokemonEvolution) GetMinLevel() int32`

GetMinLevel returns the MinLevel field if non-nil, zero value otherwise.

### GetMinLevelOk

`func (o *PokemonEvolution) GetMinLevelOk() (*int32, bool)`

GetMinLevelOk returns a tuple with the MinLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinLevel

`func (o *PokemonEvolution) SetMinLevel(v int32)`

SetMinLevel sets MinLevel field to given value.

### HasMinLevel

`func (o *PokemonEvolution) HasMinLevel() bool`

HasMinLevel returns a boolean if a field has been set.

### SetMinLevelNil

`func (o *PokemonEvolution) SetMinLevelNil(b bool)`

 SetMinLevelNil sets the value for MinLevel to be an explicit nil

### UnsetMinLevel
`func (o *PokemonEvolution) UnsetMinLevel()`

UnsetMinLevel ensures that no value is present for MinLevel, not even an explicit nil
### GetMinHappiness

`func (o *PokemonEvolution) GetMinHappiness() int32`

GetMinHappiness returns the MinHappiness field if non-nil, zero value otherwise.

### GetMinHappinessOk

`func (o *PokemonEvolution) GetMinHappinessOk() (*int32, bool)`

GetMinHappinessOk returns a tuple with the MinHappiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinHappiness

`func (o *PokemonEvolution) SetMinHappiness(v int32)`

SetMinHappiness sets MinHappiness field to given value.

### HasMinHappiness

`func (o *PokemonEvolution) HasMinHappiness() bool`

HasMinHappiness returns a boolean if a field has been set.

### SetMinHappinessNil

`func (o *PokemonEvolution) SetMinHappinessNil(b bool)`

 SetMinHappinessNil sets the value for MinHappiness to be an explicit nil

### UnsetMinHappiness
`func (o *PokemonEvolution) UnsetMinHappiness()`

UnsetMinHappiness ensures that no value is present for MinHappiness, not even an explicit nil
### GetMinBeauty

`func (o *PokemonEvolution) GetMinBeauty() int32`

GetMinBeauty returns the MinBeauty field if non-nil, zero value otherwise.

### GetMinBeautyOk

`func (o *PokemonEvolution) GetMinBeautyOk() (*int32, bool)`

GetMinBeautyOk returns a tuple with the MinBeauty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinBeauty

`func (o *PokemonEvolution) SetMinBeauty(v int32)`

SetMinBeauty sets MinBeauty field to given value.

### HasMinBeauty

`func (o *PokemonEvolution) HasMinBeauty() bool`

HasMinBeauty returns a boolean if a field has been set.

### SetMinBeautyNil

`func (o *PokemonEvolution) SetMinBeautyNil(b bool)`

 SetMinBeautyNil sets the value for MinBeauty to be an explicit nil

### UnsetMinBeauty
`func (o *PokemonEvolution) UnsetMinBeauty()`

UnsetMinBeauty ensures that no value is present for MinBeauty, not even an explicit nil
### GetMinAffection

`func (o *PokemonEvolution) GetMinAffection() int32`

GetMinAffection returns the MinAffection field if non-nil, zero value otherwise.

### GetMinAffectionOk

`func (o *PokemonEvolution) GetMinAffectionOk() (*int32, bool)`

GetMinAffectionOk returns a tuple with the MinAffection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinAffection

`func (o *PokemonEvolution) SetMinAffection(v int32)`

SetMinAffection sets MinAffection field to given value.

### HasMinAffection

`func (o *PokemonEvolution) HasMinAffection() bool`

HasMinAffection returns a boolean if a field has been set.

### SetMinAffectionNil

`func (o *PokemonEvolution) SetMinAffectionNil(b bool)`

 SetMinAffectionNil sets the value for MinAffection to be an explicit nil

### UnsetMinAffection
`func (o *PokemonEvolution) UnsetMinAffection()`

UnsetMinAffection ensures that no value is present for MinAffection, not even an explicit nil
### GetNearSpecialRock

`func (o *PokemonEvolution) GetNearSpecialRock() bool`

GetNearSpecialRock returns the NearSpecialRock field if non-nil, zero value otherwise.

### GetNearSpecialRockOk

`func (o *PokemonEvolution) GetNearSpecialRockOk() (*bool, bool)`

GetNearSpecialRockOk returns a tuple with the NearSpecialRock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNearSpecialRock

`func (o *PokemonEvolution) SetNearSpecialRock(v bool)`

SetNearSpecialRock sets NearSpecialRock field to given value.

### HasNearSpecialRock

`func (o *PokemonEvolution) HasNearSpecialRock() bool`

HasNearSpecialRock returns a boolean if a field has been set.

### GetNeedsMultiplayer

`func (o *PokemonEvolution) GetNeedsMultiplayer() bool`

GetNeedsMultiplayer returns the NeedsMultiplayer field if non-nil, zero value otherwise.

### GetNeedsMultiplayerOk

`func (o *PokemonEvolution) GetNeedsMultiplayerOk() (*bool, bool)`

GetNeedsMultiplayerOk returns a tuple with the NeedsMultiplayer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeedsMultiplayer

`func (o *PokemonEvolution) SetNeedsMultiplayer(v bool)`

SetNeedsMultiplayer sets NeedsMultiplayer field to given value.

### HasNeedsMultiplayer

`func (o *PokemonEvolution) HasNeedsMultiplayer() bool`

HasNeedsMultiplayer returns a boolean if a field has been set.

### GetNeedsOverworldRain

`func (o *PokemonEvolution) GetNeedsOverworldRain() bool`

GetNeedsOverworldRain returns the NeedsOverworldRain field if non-nil, zero value otherwise.

### GetNeedsOverworldRainOk

`func (o *PokemonEvolution) GetNeedsOverworldRainOk() (*bool, bool)`

GetNeedsOverworldRainOk returns a tuple with the NeedsOverworldRain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeedsOverworldRain

`func (o *PokemonEvolution) SetNeedsOverworldRain(v bool)`

SetNeedsOverworldRain sets NeedsOverworldRain field to given value.

### HasNeedsOverworldRain

`func (o *PokemonEvolution) HasNeedsOverworldRain() bool`

HasNeedsOverworldRain returns a boolean if a field has been set.

### GetPartySpecies

`func (o *PokemonEvolution) GetPartySpecies() PokemonSpeciesSummary`

GetPartySpecies returns the PartySpecies field if non-nil, zero value otherwise.

### GetPartySpeciesOk

`func (o *PokemonEvolution) GetPartySpeciesOk() (*PokemonSpeciesSummary, bool)`

GetPartySpeciesOk returns a tuple with the PartySpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartySpecies

`func (o *PokemonEvolution) SetPartySpecies(v PokemonSpeciesSummary)`

SetPartySpecies sets PartySpecies field to given value.


### SetPartySpeciesNil

`func (o *PokemonEvolution) SetPartySpeciesNil(b bool)`

 SetPartySpeciesNil sets the value for PartySpecies to be an explicit nil

### UnsetPartySpecies
`func (o *PokemonEvolution) UnsetPartySpecies()`

UnsetPartySpecies ensures that no value is present for PartySpecies, not even an explicit nil
### GetPartyType

`func (o *PokemonEvolution) GetPartyType() TypeSummary`

GetPartyType returns the PartyType field if non-nil, zero value otherwise.

### GetPartyTypeOk

`func (o *PokemonEvolution) GetPartyTypeOk() (*TypeSummary, bool)`

GetPartyTypeOk returns a tuple with the PartyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartyType

`func (o *PokemonEvolution) SetPartyType(v TypeSummary)`

SetPartyType sets PartyType field to given value.


### SetPartyTypeNil

`func (o *PokemonEvolution) SetPartyTypeNil(b bool)`

 SetPartyTypeNil sets the value for PartyType to be an explicit nil

### UnsetPartyType
`func (o *PokemonEvolution) UnsetPartyType()`

UnsetPartyType ensures that no value is present for PartyType, not even an explicit nil
### GetRelativePhysicalStats

`func (o *PokemonEvolution) GetRelativePhysicalStats() int32`

GetRelativePhysicalStats returns the RelativePhysicalStats field if non-nil, zero value otherwise.

### GetRelativePhysicalStatsOk

`func (o *PokemonEvolution) GetRelativePhysicalStatsOk() (*int32, bool)`

GetRelativePhysicalStatsOk returns a tuple with the RelativePhysicalStats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelativePhysicalStats

`func (o *PokemonEvolution) SetRelativePhysicalStats(v int32)`

SetRelativePhysicalStats sets RelativePhysicalStats field to given value.

### HasRelativePhysicalStats

`func (o *PokemonEvolution) HasRelativePhysicalStats() bool`

HasRelativePhysicalStats returns a boolean if a field has been set.

### SetRelativePhysicalStatsNil

`func (o *PokemonEvolution) SetRelativePhysicalStatsNil(b bool)`

 SetRelativePhysicalStatsNil sets the value for RelativePhysicalStats to be an explicit nil

### UnsetRelativePhysicalStats
`func (o *PokemonEvolution) UnsetRelativePhysicalStats()`

UnsetRelativePhysicalStats ensures that no value is present for RelativePhysicalStats, not even an explicit nil
### GetTimeOfDay

`func (o *PokemonEvolution) GetTimeOfDay() string`

GetTimeOfDay returns the TimeOfDay field if non-nil, zero value otherwise.

### GetTimeOfDayOk

`func (o *PokemonEvolution) GetTimeOfDayOk() (*string, bool)`

GetTimeOfDayOk returns a tuple with the TimeOfDay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeOfDay

`func (o *PokemonEvolution) SetTimeOfDay(v string)`

SetTimeOfDay sets TimeOfDay field to given value.

### HasTimeOfDay

`func (o *PokemonEvolution) HasTimeOfDay() bool`

HasTimeOfDay returns a boolean if a field has been set.

### GetTradeSpecies

`func (o *PokemonEvolution) GetTradeSpecies() PokemonSpeciesSummary`

GetTradeSpecies returns the TradeSpecies field if non-nil, zero value otherwise.

### GetTradeSpeciesOk

`func (o *PokemonEvolution) GetTradeSpeciesOk() (*PokemonSpeciesSummary, bool)`

GetTradeSpeciesOk returns a tuple with the TradeSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTradeSpecies

`func (o *PokemonEvolution) SetTradeSpecies(v PokemonSpeciesSummary)`

SetTradeSpecies sets TradeSpecies field to given value.


### SetTradeSpeciesNil

`func (o *PokemonEvolution) SetTradeSpeciesNil(b bool)`

 SetTradeSpeciesNil sets the value for TradeSpecies to be an explicit nil

### UnsetTradeSpecies
`func (o *PokemonEvolution) UnsetTradeSpecies()`

UnsetTradeSpecies ensures that no value is present for TradeSpecies, not even an explicit nil
### GetTurnUpsideDown

`func (o *PokemonEvolution) GetTurnUpsideDown() bool`

GetTurnUpsideDown returns the TurnUpsideDown field if non-nil, zero value otherwise.

### GetTurnUpsideDownOk

`func (o *PokemonEvolution) GetTurnUpsideDownOk() (*bool, bool)`

GetTurnUpsideDownOk returns a tuple with the TurnUpsideDown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnUpsideDown

`func (o *PokemonEvolution) SetTurnUpsideDown(v bool)`

SetTurnUpsideDown sets TurnUpsideDown field to given value.

### HasTurnUpsideDown

`func (o *PokemonEvolution) HasTurnUpsideDown() bool`

HasTurnUpsideDown returns a boolean if a field has been set.

### GetRegion

`func (o *PokemonEvolution) GetRegion() RegionSummary`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *PokemonEvolution) GetRegionOk() (*RegionSummary, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *PokemonEvolution) SetRegion(v RegionSummary)`

SetRegion sets Region field to given value.


### SetRegionNil

`func (o *PokemonEvolution) SetRegionNil(b bool)`

 SetRegionNil sets the value for Region to be an explicit nil

### UnsetRegion
`func (o *PokemonEvolution) UnsetRegion()`

UnsetRegion ensures that no value is present for Region, not even an explicit nil
### GetRequiredPokemonForm

`func (o *PokemonEvolution) GetRequiredPokemonForm() PokemonFormSummary`

GetRequiredPokemonForm returns the RequiredPokemonForm field if non-nil, zero value otherwise.

### GetRequiredPokemonFormOk

`func (o *PokemonEvolution) GetRequiredPokemonFormOk() (*PokemonFormSummary, bool)`

GetRequiredPokemonFormOk returns a tuple with the RequiredPokemonForm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredPokemonForm

`func (o *PokemonEvolution) SetRequiredPokemonForm(v PokemonFormSummary)`

SetRequiredPokemonForm sets RequiredPokemonForm field to given value.


### SetRequiredPokemonFormNil

`func (o *PokemonEvolution) SetRequiredPokemonFormNil(b bool)`

 SetRequiredPokemonFormNil sets the value for RequiredPokemonForm to be an explicit nil

### UnsetRequiredPokemonForm
`func (o *PokemonEvolution) UnsetRequiredPokemonForm()`

UnsetRequiredPokemonForm ensures that no value is present for RequiredPokemonForm, not even an explicit nil
### GetEvolvedPokemonForm

`func (o *PokemonEvolution) GetEvolvedPokemonForm() PokemonFormSummary`

GetEvolvedPokemonForm returns the EvolvedPokemonForm field if non-nil, zero value otherwise.

### GetEvolvedPokemonFormOk

`func (o *PokemonEvolution) GetEvolvedPokemonFormOk() (*PokemonFormSummary, bool)`

GetEvolvedPokemonFormOk returns a tuple with the EvolvedPokemonForm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvolvedPokemonForm

`func (o *PokemonEvolution) SetEvolvedPokemonForm(v PokemonFormSummary)`

SetEvolvedPokemonForm sets EvolvedPokemonForm field to given value.


### SetEvolvedPokemonFormNil

`func (o *PokemonEvolution) SetEvolvedPokemonFormNil(b bool)`

 SetEvolvedPokemonFormNil sets the value for EvolvedPokemonForm to be an explicit nil

### UnsetEvolvedPokemonForm
`func (o *PokemonEvolution) UnsetEvolvedPokemonForm()`

UnsetEvolvedPokemonForm ensures that no value is present for EvolvedPokemonForm, not even an explicit nil
### GetUsedMove

`func (o *PokemonEvolution) GetUsedMove() MoveSummary`

GetUsedMove returns the UsedMove field if non-nil, zero value otherwise.

### GetUsedMoveOk

`func (o *PokemonEvolution) GetUsedMoveOk() (*MoveSummary, bool)`

GetUsedMoveOk returns a tuple with the UsedMove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedMove

`func (o *PokemonEvolution) SetUsedMove(v MoveSummary)`

SetUsedMove sets UsedMove field to given value.


### SetUsedMoveNil

`func (o *PokemonEvolution) SetUsedMoveNil(b bool)`

 SetUsedMoveNil sets the value for UsedMove to be an explicit nil

### UnsetUsedMove
`func (o *PokemonEvolution) UnsetUsedMove()`

UnsetUsedMove ensures that no value is present for UsedMove, not even an explicit nil
### GetMinMoveCount

`func (o *PokemonEvolution) GetMinMoveCount() int32`

GetMinMoveCount returns the MinMoveCount field if non-nil, zero value otherwise.

### GetMinMoveCountOk

`func (o *PokemonEvolution) GetMinMoveCountOk() (*int32, bool)`

GetMinMoveCountOk returns a tuple with the MinMoveCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinMoveCount

`func (o *PokemonEvolution) SetMinMoveCount(v int32)`

SetMinMoveCount sets MinMoveCount field to given value.

### HasMinMoveCount

`func (o *PokemonEvolution) HasMinMoveCount() bool`

HasMinMoveCount returns a boolean if a field has been set.

### SetMinMoveCountNil

`func (o *PokemonEvolution) SetMinMoveCountNil(b bool)`

 SetMinMoveCountNil sets the value for MinMoveCount to be an explicit nil

### UnsetMinMoveCount
`func (o *PokemonEvolution) UnsetMinMoveCount()`

UnsetMinMoveCount ensures that no value is present for MinMoveCount, not even an explicit nil
### GetMinSteps

`func (o *PokemonEvolution) GetMinSteps() int32`

GetMinSteps returns the MinSteps field if non-nil, zero value otherwise.

### GetMinStepsOk

`func (o *PokemonEvolution) GetMinStepsOk() (*int32, bool)`

GetMinStepsOk returns a tuple with the MinSteps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinSteps

`func (o *PokemonEvolution) SetMinSteps(v int32)`

SetMinSteps sets MinSteps field to given value.

### HasMinSteps

`func (o *PokemonEvolution) HasMinSteps() bool`

HasMinSteps returns a boolean if a field has been set.

### SetMinStepsNil

`func (o *PokemonEvolution) SetMinStepsNil(b bool)`

 SetMinStepsNil sets the value for MinSteps to be an explicit nil

### UnsetMinSteps
`func (o *PokemonEvolution) UnsetMinSteps()`

UnsetMinSteps ensures that no value is present for MinSteps, not even an explicit nil
### GetMinDamageTaken

`func (o *PokemonEvolution) GetMinDamageTaken() int32`

GetMinDamageTaken returns the MinDamageTaken field if non-nil, zero value otherwise.

### GetMinDamageTakenOk

`func (o *PokemonEvolution) GetMinDamageTakenOk() (*int32, bool)`

GetMinDamageTakenOk returns a tuple with the MinDamageTaken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinDamageTaken

`func (o *PokemonEvolution) SetMinDamageTaken(v int32)`

SetMinDamageTaken sets MinDamageTaken field to given value.

### HasMinDamageTaken

`func (o *PokemonEvolution) HasMinDamageTaken() bool`

HasMinDamageTaken returns a boolean if a field has been set.

### SetMinDamageTakenNil

`func (o *PokemonEvolution) SetMinDamageTakenNil(b bool)`

 SetMinDamageTakenNil sets the value for MinDamageTaken to be an explicit nil

### UnsetMinDamageTaken
`func (o *PokemonEvolution) UnsetMinDamageTaken()`

UnsetMinDamageTaken ensures that no value is present for MinDamageTaken, not even an explicit nil
### GetAllowedNatures

`func (o *PokemonEvolution) GetAllowedNatures() []NatureSummary`

GetAllowedNatures returns the AllowedNatures field if non-nil, zero value otherwise.

### GetAllowedNaturesOk

`func (o *PokemonEvolution) GetAllowedNaturesOk() (*[]NatureSummary, bool)`

GetAllowedNaturesOk returns a tuple with the AllowedNatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowedNatures

`func (o *PokemonEvolution) SetAllowedNatures(v []NatureSummary)`

SetAllowedNatures sets AllowedNatures field to given value.


### SetAllowedNaturesNil

`func (o *PokemonEvolution) SetAllowedNaturesNil(b bool)`

 SetAllowedNaturesNil sets the value for AllowedNatures to be an explicit nil

### UnsetAllowedNatures
`func (o *PokemonEvolution) UnsetAllowedNatures()`

UnsetAllowedNatures ensures that no value is present for AllowedNatures, not even an explicit nil
### GetConditionExpression

`func (o *PokemonEvolution) GetConditionExpression() EvolutionConditionExpression`

GetConditionExpression returns the ConditionExpression field if non-nil, zero value otherwise.

### GetConditionExpressionOk

`func (o *PokemonEvolution) GetConditionExpressionOk() (*EvolutionConditionExpression, bool)`

GetConditionExpressionOk returns a tuple with the ConditionExpression field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditionExpression

`func (o *PokemonEvolution) SetConditionExpression(v EvolutionConditionExpression)`

SetConditionExpression sets ConditionExpression field to given value.


### SetConditionExpressionNil

`func (o *PokemonEvolution) SetConditionExpressionNil(b bool)`

 SetConditionExpressionNil sets the value for ConditionExpression to be an explicit nil

### UnsetConditionExpression
`func (o *PokemonEvolution) UnsetConditionExpression()`

UnsetConditionExpression ensures that no value is present for ConditionExpression, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


