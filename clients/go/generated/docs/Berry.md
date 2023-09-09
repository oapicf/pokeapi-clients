# Berry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this berry resource | 
**Name** | **string** | The name for this berry resource | 
**GrowthTime** | **int32** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | 
**MaxHarvest** | **int32** | The maximum number of these berries that can grow on one tree in Generation IV | 
**NaturalGiftPower** | **int32** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry | 
**Size** | **int32** | The size of this Berry, in millimeters | 
**Smoothness** | **int32** | The smoothness of this Berry, used in making Pokéblocks or Poffins | 
**SoilDryness** | **int32** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | 
**Firmness** | [**BerryFirmness**](BerryFirmness.md) |  | 
**Flavors** | [**[]BerryFlavorMap**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | 

## Methods

### NewBerry

`func NewBerry(id int32, name string, growthTime int32, maxHarvest int32, naturalGiftPower int32, size int32, smoothness int32, soilDryness int32, firmness BerryFirmness, flavors []BerryFlavorMap, ) *Berry`

NewBerry instantiates a new Berry object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryWithDefaults

`func NewBerryWithDefaults() *Berry`

NewBerryWithDefaults instantiates a new Berry object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Berry) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Berry) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Berry) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *Berry) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Berry) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Berry) SetName(v string)`

SetName sets Name field to given value.


### GetGrowthTime

`func (o *Berry) GetGrowthTime() int32`

GetGrowthTime returns the GrowthTime field if non-nil, zero value otherwise.

### GetGrowthTimeOk

`func (o *Berry) GetGrowthTimeOk() (*int32, bool)`

GetGrowthTimeOk returns a tuple with the GrowthTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthTime

`func (o *Berry) SetGrowthTime(v int32)`

SetGrowthTime sets GrowthTime field to given value.


### GetMaxHarvest

`func (o *Berry) GetMaxHarvest() int32`

GetMaxHarvest returns the MaxHarvest field if non-nil, zero value otherwise.

### GetMaxHarvestOk

`func (o *Berry) GetMaxHarvestOk() (*int32, bool)`

GetMaxHarvestOk returns a tuple with the MaxHarvest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxHarvest

`func (o *Berry) SetMaxHarvest(v int32)`

SetMaxHarvest sets MaxHarvest field to given value.


### GetNaturalGiftPower

`func (o *Berry) GetNaturalGiftPower() int32`

GetNaturalGiftPower returns the NaturalGiftPower field if non-nil, zero value otherwise.

### GetNaturalGiftPowerOk

`func (o *Berry) GetNaturalGiftPowerOk() (*int32, bool)`

GetNaturalGiftPowerOk returns a tuple with the NaturalGiftPower field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNaturalGiftPower

`func (o *Berry) SetNaturalGiftPower(v int32)`

SetNaturalGiftPower sets NaturalGiftPower field to given value.


### GetSize

`func (o *Berry) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *Berry) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *Berry) SetSize(v int32)`

SetSize sets Size field to given value.


### GetSmoothness

`func (o *Berry) GetSmoothness() int32`

GetSmoothness returns the Smoothness field if non-nil, zero value otherwise.

### GetSmoothnessOk

`func (o *Berry) GetSmoothnessOk() (*int32, bool)`

GetSmoothnessOk returns a tuple with the Smoothness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmoothness

`func (o *Berry) SetSmoothness(v int32)`

SetSmoothness sets Smoothness field to given value.


### GetSoilDryness

`func (o *Berry) GetSoilDryness() int32`

GetSoilDryness returns the SoilDryness field if non-nil, zero value otherwise.

### GetSoilDrynessOk

`func (o *Berry) GetSoilDrynessOk() (*int32, bool)`

GetSoilDrynessOk returns a tuple with the SoilDryness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSoilDryness

`func (o *Berry) SetSoilDryness(v int32)`

SetSoilDryness sets SoilDryness field to given value.


### GetFirmness

`func (o *Berry) GetFirmness() BerryFirmness`

GetFirmness returns the Firmness field if non-nil, zero value otherwise.

### GetFirmnessOk

`func (o *Berry) GetFirmnessOk() (*BerryFirmness, bool)`

GetFirmnessOk returns a tuple with the Firmness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirmness

`func (o *Berry) SetFirmness(v BerryFirmness)`

SetFirmness sets Firmness field to given value.


### GetFlavors

`func (o *Berry) GetFlavors() []BerryFlavorMap`

GetFlavors returns the Flavors field if non-nil, zero value otherwise.

### GetFlavorsOk

`func (o *Berry) GetFlavorsOk() (*[]BerryFlavorMap, bool)`

GetFlavorsOk returns a tuple with the Flavors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavors

`func (o *Berry) SetFlavors(v []BerryFlavorMap)`

SetFlavors sets Flavors field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


