# PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonSpeciesList**](PokemonSpeciesApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ |  |
| [**pokemonSpeciesRead**](PokemonSpeciesApi.md#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ |  |


<a id="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
> String pokemonSpeciesList(limit, offset)



### Example
```java
// Import classes:
import com.cliffano.pokeapiclient.ApiClient;
import com.cliffano.pokeapiclient.ApiException;
import com.cliffano.pokeapiclient.Configuration;
import com.cliffano.pokeapiclient.models.*;
import com.cliffano.pokeapiclient.api.PokemonSpeciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    PokemonSpeciesApi apiInstance = new PokemonSpeciesApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.pokemonSpeciesList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PokemonSpeciesApi#pokemonSpeciesList");
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

<a id="pokemonSpeciesRead"></a>
# **pokemonSpeciesRead**
> String pokemonSpeciesRead(id)



### Example
```java
// Import classes:
import com.cliffano.pokeapiclient.ApiClient;
import com.cliffano.pokeapiclient.ApiException;
import com.cliffano.pokeapiclient.Configuration;
import com.cliffano.pokeapiclient.models.*;
import com.cliffano.pokeapiclient.api.PokemonSpeciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    PokemonSpeciesApi apiInstance = new PokemonSpeciesApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.pokemonSpeciesRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PokemonSpeciesApi#pokemonSpeciesRead");
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

