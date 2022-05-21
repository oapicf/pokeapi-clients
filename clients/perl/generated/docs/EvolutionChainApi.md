# WWW::OpenAPIClient::EvolutionChainApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EvolutionChainApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolution_chain_list**](EvolutionChainApi.md#evolution_chain_list) | **GET** /api/v2/evolution-chain/ | 
[**evolution_chain_read**](EvolutionChainApi.md#evolution_chain_read) | **GET** /api/v2/evolution-chain/{id}/ | 


# **evolution_chain_list**
> string evolution_chain_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionChainApi;
my $api_instance = WWW::OpenAPIClient::EvolutionChainApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->evolution_chain_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionChainApi->evolution_chain_list: $@\n";
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

# **evolution_chain_read**
> string evolution_chain_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionChainApi;
my $api_instance = WWW::OpenAPIClient::EvolutionChainApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->evolution_chain_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionChainApi->evolution_chain_read: $@\n";
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

