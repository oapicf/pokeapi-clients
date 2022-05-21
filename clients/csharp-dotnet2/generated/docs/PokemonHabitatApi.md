# Org.OpenAPITools.Api.PokemonHabitatApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonHabitatList**](PokemonHabitatApi.md#pokemonhabitatlist) | **GET** /api/v2/pokemon-habitat/ | 
[**PokemonHabitatRead**](PokemonHabitatApi.md#pokemonhabitatread) | **GET** /api/v2/pokemon-habitat/{id}/ | 


<a name="pokemonhabitatlist"></a>
# **PokemonHabitatList**
> string PokemonHabitatList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokemonHabitatListExample
    {
        public void main()
        {
            var apiInstance = new PokemonHabitatApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.PokemonHabitatList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PokemonHabitatApi.PokemonHabitatList: " + e.Message );
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

<a name="pokemonhabitatread"></a>
# **PokemonHabitatRead**
> string PokemonHabitatRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokemonHabitatReadExample
    {
        public void main()
        {
            var apiInstance = new PokemonHabitatApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.PokemonHabitatRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PokemonHabitatApi.PokemonHabitatRead: " + e.Message );
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

