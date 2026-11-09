# BerryFlavorBerryMap
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Potency** | **Int32** | How powerful the referenced flavor is for this berry. | 
**Berry** | [**BerrySummary**](BerrySummary.md) | The berry with the referenced flavor. | 

## Examples

- Prepare the resource
```powershell
$BerryFlavorBerryMap = Initialize-PSOpenAPIToolsBerryFlavorBerryMap  -Potency null `
 -Berry null
```

- Convert the resource to JSON
```powershell
$BerryFlavorBerryMap | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

