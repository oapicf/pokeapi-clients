<a name="__pageTop"></a>
# MachinesApi   { #MachinesApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machine_list**](#machine_list) | **GET** `/api/v2/machine/` | List machines
[**machine_retrieve**](#machine_retrieve) | **GET** `/api/v2/machine/{id}/` | Get machine

# **machine_list**   { #machine_list }
<a name="machine_list"></a>

> `machine_list(limit = null,offset = null, on_success: Callable, on_failure: Callable)`

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MachinesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MachinesApi.new(config, client)


# Invoke an endpoint
api.machine_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "machine_list", response)
		assert(response.data is PaginatedMachineSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **machine_retrieve**   { #machine_retrieve }
<a name="machine_retrieve"></a>

> `machine_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MachinesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MachinesApi.new(config, client)


# Invoke an endpoint
api.machine_retrieve(
	# id: String   Eg: 1
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "machine_retrieve", response)
		assert(response.data is MachineDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

