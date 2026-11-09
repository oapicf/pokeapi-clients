# WWW::OpenAPIClient::EvolutionApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EvolutionApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolution_chain_list**](EvolutionApi.md#evolution_chain_list) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolution_chain_retrieve**](EvolutionApi.md#evolution_chain_retrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolution_trigger_list**](EvolutionApi.md#evolution_trigger_list) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolution_trigger_retrieve**](EvolutionApi.md#evolution_trigger_retrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
[**evolution_variable_list**](EvolutionApi.md#evolution_variable_list) | **GET** /api/v2/evolution-variable/ | List evolution variables
[**evolution_variable_retrieve**](EvolutionApi.md#evolution_variable_retrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable


# **evolution_chain_list**
> PaginatedEvolutionChainSummaryList evolution_chain_list(limit => $limit, offset => $offset)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionApi;
my $api_instance = WWW::OpenAPIClient::EvolutionApi->new(
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.

eval {
    my $result = $api_instance->evolution_chain_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionApi->evolution_chain_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_chain_retrieve**
> EvolutionChainDetail evolution_chain_retrieve(id => $id)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionApi;
my $api_instance = WWW::OpenAPIClient::EvolutionApi->new(
);

my $id = 1; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->evolution_chain_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionApi->evolution_chain_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_list**
> PaginatedEvolutionTriggerSummaryList evolution_trigger_list(limit => $limit, offset => $offset, q => $q)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionApi;
my $api_instance = WWW::OpenAPIClient::EvolutionApi->new(
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->evolution_trigger_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionApi->evolution_trigger_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_trigger_retrieve**
> EvolutionTriggerDetail evolution_trigger_retrieve(id => $id)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionApi;
my $api_instance = WWW::OpenAPIClient::EvolutionApi->new(
);

my $id = 1; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->evolution_trigger_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionApi->evolution_trigger_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_variable_list**
> PaginatedEvolutionVariableSummaryList evolution_variable_list(limit => $limit, offset => $offset, q => $q)

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionApi;
my $api_instance = WWW::OpenAPIClient::EvolutionApi->new(
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->evolution_variable_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionApi->evolution_variable_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionVariableSummaryList**](PaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **evolution_variable_retrieve**
> EvolutionVariableDetail evolution_variable_retrieve(id => $id)

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EvolutionApi;
my $api_instance = WWW::OpenAPIClient::EvolutionApi->new(
);

my $id = 1; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->evolution_variable_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EvolutionApi->evolution_variable_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionVariableDetail**](EvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

