# PSOpenAPITools.PSOpenAPITools\Api.MachinesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-MachineList**](MachinesApi.md#Invoke-MachineList) | **GET** /api/v2/machine/ | List machines
[**Invoke-MachineRetrieve**](MachinesApi.md#Invoke-MachineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine


<a id="Invoke-MachineList"></a>
# **Invoke-MachineList**
> PaginatedMachineSummaryList Invoke-MachineList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```powershell
$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)

# List machines
try {
    $Result = Invoke-MachineList -Limit $Limit -Offset $Offset
} catch {
    Write-Host ("Exception occurred when calling Invoke-MachineList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 

### Return type

[**PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-MachineRetrieve"></a>
# **Invoke-MachineRetrieve**
> MachineDetail Invoke-MachineRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```powershell
$Id = "1" # String | This parameter can be a string or an integer.

# Get machine
try {
    $Result = Invoke-MachineRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-MachineRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**MachineDetail**](MachineDetail.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

