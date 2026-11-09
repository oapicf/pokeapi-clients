# BerryDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**GrowthTime** | Pointer to **NullableInt32** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] 
**MaxHarvest** | Pointer to **NullableInt32** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] 
**NaturalGiftPower** | Pointer to **NullableInt32** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] 
**Size** | Pointer to **NullableInt32** | The size of this Berry, in millimeters. | [optional] 
**Smoothness** | Pointer to **NullableInt32** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] 
**SoilDryness** | Pointer to **NullableInt32** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] 
**Firmness** | [**NullableBerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**Flavors** | [**[]BerryFlavorMap**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] 
**Item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**NaturalGiftType** | [**NullableTypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | 

## Methods

### NewBerryDetail

`func NewBerryDetail(id int32, name string, firmness NullableBerryFirmnessSummary, flavors []BerryFlavorMap, item ItemSummary, naturalGiftType NullableTypeSummary, ) *BerryDetail`

NewBerryDetail instantiates a new BerryDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryDetailWithDefaults

`func NewBerryDetailWithDefaults() *BerryDetail`

NewBerryDetailWithDefaults instantiates a new BerryDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BerryDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BerryDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BerryDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *BerryDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BerryDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BerryDetail) SetName(v string)`

SetName sets Name field to given value.


### GetGrowthTime

`func (o *BerryDetail) GetGrowthTime() int32`

GetGrowthTime returns the GrowthTime field if non-nil, zero value otherwise.

### GetGrowthTimeOk

`func (o *BerryDetail) GetGrowthTimeOk() (*int32, bool)`

GetGrowthTimeOk returns a tuple with the GrowthTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthTime

`func (o *BerryDetail) SetGrowthTime(v int32)`

SetGrowthTime sets GrowthTime field to given value.

### HasGrowthTime

`func (o *BerryDetail) HasGrowthTime() bool`

HasGrowthTime returns a boolean if a field has been set.

### SetGrowthTimeNil

`func (o *BerryDetail) SetGrowthTimeNil(b bool)`

 SetGrowthTimeNil sets the value for GrowthTime to be an explicit nil

### UnsetGrowthTime
`func (o *BerryDetail) UnsetGrowthTime()`

UnsetGrowthTime ensures that no value is present for GrowthTime, not even an explicit nil
### GetMaxHarvest

`func (o *BerryDetail) GetMaxHarvest() int32`

GetMaxHarvest returns the MaxHarvest field if non-nil, zero value otherwise.

### GetMaxHarvestOk

`func (o *BerryDetail) GetMaxHarvestOk() (*int32, bool)`

GetMaxHarvestOk returns a tuple with the MaxHarvest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxHarvest

`func (o *BerryDetail) SetMaxHarvest(v int32)`

SetMaxHarvest sets MaxHarvest field to given value.

### HasMaxHarvest

`func (o *BerryDetail) HasMaxHarvest() bool`

HasMaxHarvest returns a boolean if a field has been set.

### SetMaxHarvestNil

`func (o *BerryDetail) SetMaxHarvestNil(b bool)`

 SetMaxHarvestNil sets the value for MaxHarvest to be an explicit nil

### UnsetMaxHarvest
`func (o *BerryDetail) UnsetMaxHarvest()`

UnsetMaxHarvest ensures that no value is present for MaxHarvest, not even an explicit nil
### GetNaturalGiftPower

`func (o *BerryDetail) GetNaturalGiftPower() int32`

GetNaturalGiftPower returns the NaturalGiftPower field if non-nil, zero value otherwise.

### GetNaturalGiftPowerOk

`func (o *BerryDetail) GetNaturalGiftPowerOk() (*int32, bool)`

GetNaturalGiftPowerOk returns a tuple with the NaturalGiftPower field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNaturalGiftPower

`func (o *BerryDetail) SetNaturalGiftPower(v int32)`

SetNaturalGiftPower sets NaturalGiftPower field to given value.

### HasNaturalGiftPower

`func (o *BerryDetail) HasNaturalGiftPower() bool`

HasNaturalGiftPower returns a boolean if a field has been set.

### SetNaturalGiftPowerNil

`func (o *BerryDetail) SetNaturalGiftPowerNil(b bool)`

 SetNaturalGiftPowerNil sets the value for NaturalGiftPower to be an explicit nil

### UnsetNaturalGiftPower
`func (o *BerryDetail) UnsetNaturalGiftPower()`

UnsetNaturalGiftPower ensures that no value is present for NaturalGiftPower, not even an explicit nil
### GetSize

`func (o *BerryDetail) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *BerryDetail) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *BerryDetail) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *BerryDetail) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *BerryDetail) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *BerryDetail) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil
### GetSmoothness

`func (o *BerryDetail) GetSmoothness() int32`

GetSmoothness returns the Smoothness field if non-nil, zero value otherwise.

### GetSmoothnessOk

`func (o *BerryDetail) GetSmoothnessOk() (*int32, bool)`

GetSmoothnessOk returns a tuple with the Smoothness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmoothness

`func (o *BerryDetail) SetSmoothness(v int32)`

SetSmoothness sets Smoothness field to given value.

### HasSmoothness

`func (o *BerryDetail) HasSmoothness() bool`

HasSmoothness returns a boolean if a field has been set.

### SetSmoothnessNil

`func (o *BerryDetail) SetSmoothnessNil(b bool)`

 SetSmoothnessNil sets the value for Smoothness to be an explicit nil

### UnsetSmoothness
`func (o *BerryDetail) UnsetSmoothness()`

UnsetSmoothness ensures that no value is present for Smoothness, not even an explicit nil
### GetSoilDryness

`func (o *BerryDetail) GetSoilDryness() int32`

GetSoilDryness returns the SoilDryness field if non-nil, zero value otherwise.

### GetSoilDrynessOk

`func (o *BerryDetail) GetSoilDrynessOk() (*int32, bool)`

GetSoilDrynessOk returns a tuple with the SoilDryness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSoilDryness

`func (o *BerryDetail) SetSoilDryness(v int32)`

SetSoilDryness sets SoilDryness field to given value.

### HasSoilDryness

`func (o *BerryDetail) HasSoilDryness() bool`

HasSoilDryness returns a boolean if a field has been set.

### SetSoilDrynessNil

`func (o *BerryDetail) SetSoilDrynessNil(b bool)`

 SetSoilDrynessNil sets the value for SoilDryness to be an explicit nil

### UnsetSoilDryness
`func (o *BerryDetail) UnsetSoilDryness()`

UnsetSoilDryness ensures that no value is present for SoilDryness, not even an explicit nil
### GetFirmness

`func (o *BerryDetail) GetFirmness() BerryFirmnessSummary`

GetFirmness returns the Firmness field if non-nil, zero value otherwise.

### GetFirmnessOk

`func (o *BerryDetail) GetFirmnessOk() (*BerryFirmnessSummary, bool)`

GetFirmnessOk returns a tuple with the Firmness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirmness

`func (o *BerryDetail) SetFirmness(v BerryFirmnessSummary)`

SetFirmness sets Firmness field to given value.


### SetFirmnessNil

`func (o *BerryDetail) SetFirmnessNil(b bool)`

 SetFirmnessNil sets the value for Firmness to be an explicit nil

### UnsetFirmness
`func (o *BerryDetail) UnsetFirmness()`

UnsetFirmness ensures that no value is present for Firmness, not even an explicit nil
### GetFlavors

`func (o *BerryDetail) GetFlavors() []BerryFlavorMap`

GetFlavors returns the Flavors field if non-nil, zero value otherwise.

### GetFlavorsOk

`func (o *BerryDetail) GetFlavorsOk() (*[]BerryFlavorMap, bool)`

GetFlavorsOk returns a tuple with the Flavors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavors

`func (o *BerryDetail) SetFlavors(v []BerryFlavorMap)`

SetFlavors sets Flavors field to given value.


### GetItem

`func (o *BerryDetail) GetItem() ItemSummary`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *BerryDetail) GetItemOk() (*ItemSummary, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *BerryDetail) SetItem(v ItemSummary)`

SetItem sets Item field to given value.


### GetNaturalGiftType

`func (o *BerryDetail) GetNaturalGiftType() TypeSummary`

GetNaturalGiftType returns the NaturalGiftType field if non-nil, zero value otherwise.

### GetNaturalGiftTypeOk

`func (o *BerryDetail) GetNaturalGiftTypeOk() (*TypeSummary, bool)`

GetNaturalGiftTypeOk returns a tuple with the NaturalGiftType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNaturalGiftType

`func (o *BerryDetail) SetNaturalGiftType(v TypeSummary)`

SetNaturalGiftType sets NaturalGiftType field to given value.


### SetNaturalGiftTypeNil

`func (o *BerryDetail) SetNaturalGiftTypeNil(b bool)`

 SetNaturalGiftTypeNil sets the value for NaturalGiftType to be an explicit nil

### UnsetNaturalGiftType
`func (o *BerryDetail) UnsetNaturalGiftType()`

UnsetNaturalGiftType ensures that no value is present for NaturalGiftType, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


