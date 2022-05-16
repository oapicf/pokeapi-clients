# Org.OpenAPITools.Api.PokemonShapeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonShapeList**](PokemonShapeApi.md#pokemonshapelist) | **GET** /api/v2/pokemon-shape/ | 
[**PokemonShapeRead**](PokemonShapeApi.md#pokemonshaperead) | **GET** /api/v2/pokemon-shape/{id}/ | 


<a name="pokemonshapelist"></a>
# **PokemonShapeList**
> string PokemonShapeList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokemonShapeListExample
    {
        public void main()
        {
            var apiInstance = new PokemonShapeApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.PokemonShapeList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PokemonShapeApi.PokemonShapeList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int?**|  | [optional] 
 **offset** | **int?**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pokemonshaperead"></a>
# **PokemonShapeRead**
> string PokemonShapeRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokemonShapeReadExample
    {
        public void main()
        {
            var apiInstance = new PokemonShapeApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.PokemonShapeRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PokemonShapeApi.PokemonShapeRead: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

