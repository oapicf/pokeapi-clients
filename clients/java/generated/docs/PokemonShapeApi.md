# PokemonShapeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonShapeList**](PokemonShapeApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ |  |
| [**pokemonShapeRead**](PokemonShapeApi.md#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ |  |


<a id="pokemonShapeList"></a>
# **pokemonShapeList**
> String pokemonShapeList(limit, offset)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.PokemonShapeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    PokemonShapeApi apiInstance = new PokemonShapeApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.pokemonShapeList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PokemonShapeApi#pokemonShapeList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

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
| **0** | Default response |  -  |

<a id="pokemonShapeRead"></a>
# **pokemonShapeRead**
> String pokemonShapeRead(id)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.PokemonShapeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    PokemonShapeApi apiInstance = new PokemonShapeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.pokemonShapeRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PokemonShapeApi#pokemonShapeRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

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
| **0** | Default response |  -  |

