# BerryFlavorMap
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Potency** | **Int32** | How powerful the referenced flavor is for this berry. | 
**Flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The referenced berry flavor. | 

## Examples

- Prepare the resource
```powershell
$BerryFlavorMap = Initialize-PSOpenAPIToolsBerryFlavorMap  -Potency null `
 -Flavor null
```

- Convert the resource to JSON
```powershell
$BerryFlavorMap | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

