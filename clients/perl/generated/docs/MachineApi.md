# WWW::OpenAPIClient::MachineApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MachineApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machine_list**](MachineApi.md#machine_list) | **GET** /api/v2/machine/ | 
[**machine_read**](MachineApi.md#machine_read) | **GET** /api/v2/machine/{id}/ | 


# **machine_list**
> string machine_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MachineApi;
my $api_instance = WWW::OpenAPIClient::MachineApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->machine_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MachineApi->machine_list: $@\n";
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

# **machine_read**
> string machine_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MachineApi;
my $api_instance = WWW::OpenAPIClient::MachineApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->machine_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MachineApi->machine_read: $@\n";
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

