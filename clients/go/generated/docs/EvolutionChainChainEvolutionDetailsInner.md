# EvolutionChainChainEvolutionDetailsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerItem**](EvolutionChainChainEvolutionDetailsInnerItem.md) |  | [optional] 
**Trigger** | Pointer to [**EvolutionTrigger**](EvolutionTrigger.md) |  | [optional] 
**Gender** | Pointer to **NullableInt32** | The required female gender of the evolving Pokémon species. Must be either 1 or 2, or null if the Pokémon species has no gender or the gender is fixed. | [optional] 
**HeldItem** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerItem**](EvolutionChainChainEvolutionDetailsInnerItem.md) |  | [optional] 
**KnownMove** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerKnownMove**](EvolutionChainChainEvolutionDetailsInnerKnownMove.md) |  | [optional] 
**KnownMoveType** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerKnownMoveType**](EvolutionChainChainEvolutionDetailsInnerKnownMoveType.md) |  | [optional] 
**Location** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerLocation**](EvolutionChainChainEvolutionDetailsInnerLocation.md) |  | [optional] 
**MinLevel** | Pointer to **NullableInt32** | The minimum required level of the evolving Pokémon species | [optional] 
**MinHappiness** | Pointer to **NullableInt32** | The minimum required happiness of the evolving Pokémon species | [optional] 
**MinBeauty** | Pointer to **NullableInt32** | The minimum required beauty of the evolving Pokémon species | [optional] 
**MinAffection** | Pointer to **NullableInt32** | The minimum required affection of the evolving Pokémon species | [optional] 
**NeedsOverworldRain** | Pointer to **bool** | Whether or not it must be raining in the overworld to evolve into this Pokémon species | [optional] 
**PartySpecies** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerPartySpecies**](EvolutionChainChainEvolutionDetailsInnerPartySpecies.md) |  | [optional] 
**PartyType** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerKnownMoveType**](EvolutionChainChainEvolutionDetailsInnerKnownMoveType.md) |  | [optional] 
**RelativePhysicalStats** | Pointer to **NullableInt32** | The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense, 0 means Attack &#x3D; Defense, and -1 means Attack &lt; Defense. | [optional] 
**TimeOfDay** | Pointer to **string** | The required time of day. Day or night. | [optional] 
**TradeSpecies** | Pointer to [**EvolutionChainChainEvolutionDetailsInnerPartySpecies**](EvolutionChainChainEvolutionDetailsInnerPartySpecies.md) |  | [optional] 
**TurnUpsideDown** | Pointer to **bool** | Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. | [optional] 

## Methods

### NewEvolutionChainChainEvolutionDetailsInner

`func NewEvolutionChainChainEvolutionDetailsInner() *EvolutionChainChainEvolutionDetailsInner`

NewEvolutionChainChainEvolutionDetailsInner instantiates a new EvolutionChainChainEvolutionDetailsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionChainChainEvolutionDetailsInnerWithDefaults

`func NewEvolutionChainChainEvolutionDetailsInnerWithDefaults() *EvolutionChainChainEvolutionDetailsInner`

NewEvolutionChainChainEvolutionDetailsInnerWithDefaults instantiates a new EvolutionChainChainEvolutionDetailsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItem

`func (o *EvolutionChainChainEvolutionDetailsInner) GetItem() EvolutionChainChainEvolutionDetailsInnerItem`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetItemOk() (*EvolutionChainChainEvolutionDetailsInnerItem, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *EvolutionChainChainEvolutionDetailsInner) SetItem(v EvolutionChainChainEvolutionDetailsInnerItem)`

SetItem sets Item field to given value.

### HasItem

`func (o *EvolutionChainChainEvolutionDetailsInner) HasItem() bool`

HasItem returns a boolean if a field has been set.

### GetTrigger

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTrigger() EvolutionTrigger`

GetTrigger returns the Trigger field if non-nil, zero value otherwise.

### GetTriggerOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTriggerOk() (*EvolutionTrigger, bool)`

GetTriggerOk returns a tuple with the Trigger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrigger

`func (o *EvolutionChainChainEvolutionDetailsInner) SetTrigger(v EvolutionTrigger)`

SetTrigger sets Trigger field to given value.

### HasTrigger

`func (o *EvolutionChainChainEvolutionDetailsInner) HasTrigger() bool`

HasTrigger returns a boolean if a field has been set.

### GetGender

`func (o *EvolutionChainChainEvolutionDetailsInner) GetGender() int32`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetGenderOk() (*int32, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *EvolutionChainChainEvolutionDetailsInner) SetGender(v int32)`

SetGender sets Gender field to given value.

### HasGender

`func (o *EvolutionChainChainEvolutionDetailsInner) HasGender() bool`

HasGender returns a boolean if a field has been set.

### SetGenderNil

`func (o *EvolutionChainChainEvolutionDetailsInner) SetGenderNil(b bool)`

 SetGenderNil sets the value for Gender to be an explicit nil

### UnsetGender
`func (o *EvolutionChainChainEvolutionDetailsInner) UnsetGender()`

UnsetGender ensures that no value is present for Gender, not even an explicit nil
### GetHeldItem

`func (o *EvolutionChainChainEvolutionDetailsInner) GetHeldItem() EvolutionChainChainEvolutionDetailsInnerItem`

GetHeldItem returns the HeldItem field if non-nil, zero value otherwise.

### GetHeldItemOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetHeldItemOk() (*EvolutionChainChainEvolutionDetailsInnerItem, bool)`

GetHeldItemOk returns a tuple with the HeldItem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeldItem

`func (o *EvolutionChainChainEvolutionDetailsInner) SetHeldItem(v EvolutionChainChainEvolutionDetailsInnerItem)`

SetHeldItem sets HeldItem field to given value.

### HasHeldItem

`func (o *EvolutionChainChainEvolutionDetailsInner) HasHeldItem() bool`

HasHeldItem returns a boolean if a field has been set.

### GetKnownMove

`func (o *EvolutionChainChainEvolutionDetailsInner) GetKnownMove() EvolutionChainChainEvolutionDetailsInnerKnownMove`

GetKnownMove returns the KnownMove field if non-nil, zero value otherwise.

### GetKnownMoveOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetKnownMoveOk() (*EvolutionChainChainEvolutionDetailsInnerKnownMove, bool)`

GetKnownMoveOk returns a tuple with the KnownMove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKnownMove

`func (o *EvolutionChainChainEvolutionDetailsInner) SetKnownMove(v EvolutionChainChainEvolutionDetailsInnerKnownMove)`

SetKnownMove sets KnownMove field to given value.

### HasKnownMove

`func (o *EvolutionChainChainEvolutionDetailsInner) HasKnownMove() bool`

HasKnownMove returns a boolean if a field has been set.

### GetKnownMoveType

`func (o *EvolutionChainChainEvolutionDetailsInner) GetKnownMoveType() EvolutionChainChainEvolutionDetailsInnerKnownMoveType`

GetKnownMoveType returns the KnownMoveType field if non-nil, zero value otherwise.

### GetKnownMoveTypeOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetKnownMoveTypeOk() (*EvolutionChainChainEvolutionDetailsInnerKnownMoveType, bool)`

GetKnownMoveTypeOk returns a tuple with the KnownMoveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKnownMoveType

`func (o *EvolutionChainChainEvolutionDetailsInner) SetKnownMoveType(v EvolutionChainChainEvolutionDetailsInnerKnownMoveType)`

SetKnownMoveType sets KnownMoveType field to given value.

### HasKnownMoveType

`func (o *EvolutionChainChainEvolutionDetailsInner) HasKnownMoveType() bool`

HasKnownMoveType returns a boolean if a field has been set.

### GetLocation

`func (o *EvolutionChainChainEvolutionDetailsInner) GetLocation() EvolutionChainChainEvolutionDetailsInnerLocation`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetLocationOk() (*EvolutionChainChainEvolutionDetailsInnerLocation, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *EvolutionChainChainEvolutionDetailsInner) SetLocation(v EvolutionChainChainEvolutionDetailsInnerLocation)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *EvolutionChainChainEvolutionDetailsInner) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetMinLevel

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinLevel() int32`

GetMinLevel returns the MinLevel field if non-nil, zero value otherwise.

### GetMinLevelOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinLevelOk() (*int32, bool)`

GetMinLevelOk returns a tuple with the MinLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinLevel

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinLevel(v int32)`

SetMinLevel sets MinLevel field to given value.

### HasMinLevel

`func (o *EvolutionChainChainEvolutionDetailsInner) HasMinLevel() bool`

HasMinLevel returns a boolean if a field has been set.

### SetMinLevelNil

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinLevelNil(b bool)`

 SetMinLevelNil sets the value for MinLevel to be an explicit nil

### UnsetMinLevel
`func (o *EvolutionChainChainEvolutionDetailsInner) UnsetMinLevel()`

UnsetMinLevel ensures that no value is present for MinLevel, not even an explicit nil
### GetMinHappiness

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinHappiness() int32`

GetMinHappiness returns the MinHappiness field if non-nil, zero value otherwise.

### GetMinHappinessOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinHappinessOk() (*int32, bool)`

GetMinHappinessOk returns a tuple with the MinHappiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinHappiness

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinHappiness(v int32)`

SetMinHappiness sets MinHappiness field to given value.

### HasMinHappiness

`func (o *EvolutionChainChainEvolutionDetailsInner) HasMinHappiness() bool`

HasMinHappiness returns a boolean if a field has been set.

### SetMinHappinessNil

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinHappinessNil(b bool)`

 SetMinHappinessNil sets the value for MinHappiness to be an explicit nil

### UnsetMinHappiness
`func (o *EvolutionChainChainEvolutionDetailsInner) UnsetMinHappiness()`

UnsetMinHappiness ensures that no value is present for MinHappiness, not even an explicit nil
### GetMinBeauty

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinBeauty() int32`

GetMinBeauty returns the MinBeauty field if non-nil, zero value otherwise.

### GetMinBeautyOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinBeautyOk() (*int32, bool)`

GetMinBeautyOk returns a tuple with the MinBeauty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinBeauty

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinBeauty(v int32)`

SetMinBeauty sets MinBeauty field to given value.

### HasMinBeauty

`func (o *EvolutionChainChainEvolutionDetailsInner) HasMinBeauty() bool`

HasMinBeauty returns a boolean if a field has been set.

### SetMinBeautyNil

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinBeautyNil(b bool)`

 SetMinBeautyNil sets the value for MinBeauty to be an explicit nil

### UnsetMinBeauty
`func (o *EvolutionChainChainEvolutionDetailsInner) UnsetMinBeauty()`

UnsetMinBeauty ensures that no value is present for MinBeauty, not even an explicit nil
### GetMinAffection

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinAffection() int32`

GetMinAffection returns the MinAffection field if non-nil, zero value otherwise.

### GetMinAffectionOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetMinAffectionOk() (*int32, bool)`

GetMinAffectionOk returns a tuple with the MinAffection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinAffection

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinAffection(v int32)`

SetMinAffection sets MinAffection field to given value.

### HasMinAffection

`func (o *EvolutionChainChainEvolutionDetailsInner) HasMinAffection() bool`

HasMinAffection returns a boolean if a field has been set.

### SetMinAffectionNil

`func (o *EvolutionChainChainEvolutionDetailsInner) SetMinAffectionNil(b bool)`

 SetMinAffectionNil sets the value for MinAffection to be an explicit nil

### UnsetMinAffection
`func (o *EvolutionChainChainEvolutionDetailsInner) UnsetMinAffection()`

UnsetMinAffection ensures that no value is present for MinAffection, not even an explicit nil
### GetNeedsOverworldRain

`func (o *EvolutionChainChainEvolutionDetailsInner) GetNeedsOverworldRain() bool`

GetNeedsOverworldRain returns the NeedsOverworldRain field if non-nil, zero value otherwise.

### GetNeedsOverworldRainOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetNeedsOverworldRainOk() (*bool, bool)`

GetNeedsOverworldRainOk returns a tuple with the NeedsOverworldRain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeedsOverworldRain

`func (o *EvolutionChainChainEvolutionDetailsInner) SetNeedsOverworldRain(v bool)`

SetNeedsOverworldRain sets NeedsOverworldRain field to given value.

### HasNeedsOverworldRain

`func (o *EvolutionChainChainEvolutionDetailsInner) HasNeedsOverworldRain() bool`

HasNeedsOverworldRain returns a boolean if a field has been set.

### GetPartySpecies

`func (o *EvolutionChainChainEvolutionDetailsInner) GetPartySpecies() EvolutionChainChainEvolutionDetailsInnerPartySpecies`

GetPartySpecies returns the PartySpecies field if non-nil, zero value otherwise.

### GetPartySpeciesOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetPartySpeciesOk() (*EvolutionChainChainEvolutionDetailsInnerPartySpecies, bool)`

GetPartySpeciesOk returns a tuple with the PartySpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartySpecies

`func (o *EvolutionChainChainEvolutionDetailsInner) SetPartySpecies(v EvolutionChainChainEvolutionDetailsInnerPartySpecies)`

SetPartySpecies sets PartySpecies field to given value.

### HasPartySpecies

`func (o *EvolutionChainChainEvolutionDetailsInner) HasPartySpecies() bool`

HasPartySpecies returns a boolean if a field has been set.

### GetPartyType

`func (o *EvolutionChainChainEvolutionDetailsInner) GetPartyType() EvolutionChainChainEvolutionDetailsInnerKnownMoveType`

GetPartyType returns the PartyType field if non-nil, zero value otherwise.

### GetPartyTypeOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetPartyTypeOk() (*EvolutionChainChainEvolutionDetailsInnerKnownMoveType, bool)`

GetPartyTypeOk returns a tuple with the PartyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartyType

`func (o *EvolutionChainChainEvolutionDetailsInner) SetPartyType(v EvolutionChainChainEvolutionDetailsInnerKnownMoveType)`

SetPartyType sets PartyType field to given value.

### HasPartyType

`func (o *EvolutionChainChainEvolutionDetailsInner) HasPartyType() bool`

HasPartyType returns a boolean if a field has been set.

### GetRelativePhysicalStats

`func (o *EvolutionChainChainEvolutionDetailsInner) GetRelativePhysicalStats() int32`

GetRelativePhysicalStats returns the RelativePhysicalStats field if non-nil, zero value otherwise.

### GetRelativePhysicalStatsOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetRelativePhysicalStatsOk() (*int32, bool)`

GetRelativePhysicalStatsOk returns a tuple with the RelativePhysicalStats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelativePhysicalStats

`func (o *EvolutionChainChainEvolutionDetailsInner) SetRelativePhysicalStats(v int32)`

SetRelativePhysicalStats sets RelativePhysicalStats field to given value.

### HasRelativePhysicalStats

`func (o *EvolutionChainChainEvolutionDetailsInner) HasRelativePhysicalStats() bool`

HasRelativePhysicalStats returns a boolean if a field has been set.

### SetRelativePhysicalStatsNil

`func (o *EvolutionChainChainEvolutionDetailsInner) SetRelativePhysicalStatsNil(b bool)`

 SetRelativePhysicalStatsNil sets the value for RelativePhysicalStats to be an explicit nil

### UnsetRelativePhysicalStats
`func (o *EvolutionChainChainEvolutionDetailsInner) UnsetRelativePhysicalStats()`

UnsetRelativePhysicalStats ensures that no value is present for RelativePhysicalStats, not even an explicit nil
### GetTimeOfDay

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTimeOfDay() string`

GetTimeOfDay returns the TimeOfDay field if non-nil, zero value otherwise.

### GetTimeOfDayOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTimeOfDayOk() (*string, bool)`

GetTimeOfDayOk returns a tuple with the TimeOfDay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeOfDay

`func (o *EvolutionChainChainEvolutionDetailsInner) SetTimeOfDay(v string)`

SetTimeOfDay sets TimeOfDay field to given value.

### HasTimeOfDay

`func (o *EvolutionChainChainEvolutionDetailsInner) HasTimeOfDay() bool`

HasTimeOfDay returns a boolean if a field has been set.

### GetTradeSpecies

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTradeSpecies() EvolutionChainChainEvolutionDetailsInnerPartySpecies`

GetTradeSpecies returns the TradeSpecies field if non-nil, zero value otherwise.

### GetTradeSpeciesOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTradeSpeciesOk() (*EvolutionChainChainEvolutionDetailsInnerPartySpecies, bool)`

GetTradeSpeciesOk returns a tuple with the TradeSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTradeSpecies

`func (o *EvolutionChainChainEvolutionDetailsInner) SetTradeSpecies(v EvolutionChainChainEvolutionDetailsInnerPartySpecies)`

SetTradeSpecies sets TradeSpecies field to given value.

### HasTradeSpecies

`func (o *EvolutionChainChainEvolutionDetailsInner) HasTradeSpecies() bool`

HasTradeSpecies returns a boolean if a field has been set.

### GetTurnUpsideDown

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTurnUpsideDown() bool`

GetTurnUpsideDown returns the TurnUpsideDown field if non-nil, zero value otherwise.

### GetTurnUpsideDownOk

`func (o *EvolutionChainChainEvolutionDetailsInner) GetTurnUpsideDownOk() (*bool, bool)`

GetTurnUpsideDownOk returns a tuple with the TurnUpsideDown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnUpsideDown

`func (o *EvolutionChainChainEvolutionDetailsInner) SetTurnUpsideDown(v bool)`

SetTurnUpsideDown sets TurnUpsideDown field to given value.

### HasTurnUpsideDown

`func (o *EvolutionChainChainEvolutionDetailsInner) HasTurnUpsideDown() bool`

HasTurnUpsideDown returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


