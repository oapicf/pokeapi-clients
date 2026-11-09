# WWW::OpenAPIClient::MachinesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MachinesApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machine_list**](MachinesApi.md#machine_list) | **GET** /api/v2/machine/ | List machines
[**machine_retrieve**](MachinesApi.md#machine_retrieve) | **GET** /api/v2/machine/{id}/ | Get machine


# **machine_list**
> PaginatedMachineSummaryList machine_list(limit => $limit, offset => $offset)

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MachinesApi;
my $api_instance = WWW::OpenAPIClient::MachinesApi->new(
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.

eval {
    my $result = $api_instance->machine_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MachinesApi->machine_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 

### Return type

[**PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **machine_retrieve**
> MachineDetail machine_retrieve(id => $id)

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MachinesApi;
my $api_instance = WWW::OpenAPIClient::MachinesApi->new(
);

my $id = 1; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->machine_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MachinesApi->machine_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**MachineDetail**](MachineDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

