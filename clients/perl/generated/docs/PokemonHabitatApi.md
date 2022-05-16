# WWW::OpenAPIClient::PokemonHabitatApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PokemonHabitatApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemon_habitat_list**](PokemonHabitatApi.md#pokemon_habitat_list) | **GET** /api/v2/pokemon-habitat/ | 
[**pokemon_habitat_read**](PokemonHabitatApi.md#pokemon_habitat_read) | **GET** /api/v2/pokemon-habitat/{id}/ | 


# **pokemon_habitat_list**
> string pokemon_habitat_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonHabitatApi;
my $api_instance = WWW::OpenAPIClient::PokemonHabitatApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->pokemon_habitat_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonHabitatApi->pokemon_habitat_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] 
 **offset** | **int**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_habitat_read**
> string pokemon_habitat_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonHabitatApi;
my $api_instance = WWW::OpenAPIClient::PokemonHabitatApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->pokemon_habitat_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonHabitatApi->pokemon_habitat_read: $@\n";
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

