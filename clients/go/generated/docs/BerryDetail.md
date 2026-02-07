# BerryDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**GrowthTime** | **int32** |  | 
**MaxHarvest** | **int32** |  | 
**NaturalGiftPower** | **int32** |  | 
**Size** | **int32** |  | 
**Smoothness** | **int32** |  | 
**SoilDryness** | **int32** |  | 
**Firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) |  | 
**Flavors** | [**[]BerryDetailFlavorsInner**](BerryDetailFlavorsInner.md) |  | 
**Item** | [**ItemSummary**](ItemSummary.md) |  | 
**NaturalGiftType** | [**TypeSummary**](TypeSummary.md) |  | 

## Methods

### NewBerryDetail

`func NewBerryDetail(id int32, name string, growthTime int32, maxHarvest int32, naturalGiftPower int32, size int32, smoothness int32, soilDryness int32, firmness BerryFirmnessSummary, flavors []BerryDetailFlavorsInner, item ItemSummary, naturalGiftType TypeSummary, ) *BerryDetail`

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


### GetFlavors

`func (o *BerryDetail) GetFlavors() []BerryDetailFlavorsInner`

GetFlavors returns the Flavors field if non-nil, zero value otherwise.

### GetFlavorsOk

`func (o *BerryDetail) GetFlavorsOk() (*[]BerryDetailFlavorsInner, bool)`

GetFlavorsOk returns a tuple with the Flavors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavors

`func (o *BerryDetail) SetFlavors(v []BerryDetailFlavorsInner)`

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



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


