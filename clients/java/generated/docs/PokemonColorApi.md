# PokemonColorApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonColorList**](PokemonColorApi.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**pokemonColorRead**](PokemonColorApi.md#pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 


<a name="pokemonColorList"></a>
# **pokemonColorList**
> String pokemonColorList(limit, offset)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PokemonColorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co/api/v2");

    PokemonColorApi apiInstance = new PokemonColorApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.pokemonColorList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PokemonColorApi#pokemonColorList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **offset** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="pokemonColorRead"></a>
# **pokemonColorRead**
> String pokemonColorRead(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PokemonColorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co/api/v2");

    PokemonColorApi apiInstance = new PokemonColorApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.pokemonColorRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PokemonColorApi#pokemonColorRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

