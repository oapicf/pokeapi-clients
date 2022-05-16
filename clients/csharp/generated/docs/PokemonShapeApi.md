# Org.OpenAPITools.Api.PokemonShapeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonShapeList**](PokemonShapeApi.md#pokemonshapelist) | **GET** /api/v2/pokemon-shape/ | 
[**PokemonShapeRead**](PokemonShapeApi.md#pokemonshaperead) | **GET** /api/v2/pokemon-shape/{id}/ | 



## PokemonShapeList

> string PokemonShapeList (int? limit = null, int? offset = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokemonShapeListExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://pokeapi.co/api/v2";
            var apiInstance = new PokemonShapeApi(Configuration.Default);
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.PokemonShapeList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PokemonShapeApi.PokemonShapeList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PokemonShapeRead

> string PokemonShapeRead (int id)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokemonShapeReadExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://pokeapi.co/api/v2";
            var apiInstance = new PokemonShapeApi(Configuration.Default);
            var id = 56;  // int | 

            try
            {
                string result = apiInstance.PokemonShapeRead(id);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PokemonShapeApi.PokemonShapeRead: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

