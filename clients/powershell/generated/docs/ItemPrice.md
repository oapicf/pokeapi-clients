# ItemPrice
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PurchasePrice** | **Int32** | The purchase price in this currency and version group, or null if unavailable. | [optional] 
**SellPrice** | **Int32** | The sell price in this currency and version group, or null if unavailable. | [optional] 
**Currency** | [**CurrencySummary**](CurrencySummary.md) | The currency used for this price. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group to which this price applies. | 

## Examples

- Prepare the resource
```powershell
$ItemPrice = Initialize-PSOpenAPIToolsItemPrice  -PurchasePrice null `
 -SellPrice null `
 -Currency null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$ItemPrice | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

