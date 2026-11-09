# OAIMachinesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](OAIMachinesApi.md#machinelist) | **GET** /api/v2/machine/ | List machines
[**machineRetrieve**](OAIMachinesApi.md#machineretrieve) | **GET** /api/v2/machine/{id}/ | Get machine


# **machineList**
```objc
-(NSURLSessionTask*) machineListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(OAIPaginatedMachineSummaryList* output, NSError* error)) handler;
```

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)

OAIMachinesApi*apiInstance = [[OAIMachinesApi alloc] init];

// List machines
[apiInstance machineListWithLimit:limit
              offset:offset
          completionHandler: ^(OAIPaginatedMachineSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMachinesApi->machineList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 

### Return type

[**OAIPaginatedMachineSummaryList***](OAIPaginatedMachineSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **machineRetrieve**
```objc
-(NSURLSessionTask*) machineRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIMachineDetail* output, NSError* error)) handler;
```

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIMachinesApi*apiInstance = [[OAIMachinesApi alloc] init];

// Get machine
[apiInstance machineRetrieveWithId:_id
          completionHandler: ^(OAIMachineDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMachinesApi->machineRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIMachineDetail***](OAIMachineDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

