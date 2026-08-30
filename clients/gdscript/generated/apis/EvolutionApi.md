<a name="__pageTop"></a>
# EvolutionApi   { #EvolutionApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolution_chain_list**](#evolution_chain_list) | **GET** `/api/v2/evolution-chain/` | List evolution chains
[**evolution_chain_retrieve**](#evolution_chain_retrieve) | **GET** `/api/v2/evolution-chain/{id}/` | Get evolution chain
[**evolution_trigger_list**](#evolution_trigger_list) | **GET** `/api/v2/evolution-trigger/` | List evolution triggers
[**evolution_trigger_retrieve**](#evolution_trigger_retrieve) | **GET** `/api/v2/evolution-trigger/{id}/` | Get evolution trigger

# **evolution_chain_list**   { #evolution_chain_list }
<a name="evolution_chain_list"></a>

> `evolution_chain_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = EvolutionApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EvolutionApi.new(config, client)


# Invoke an endpoint
api.evolution_chain_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "evolution_chain_list", response)
		assert(response.data is PaginatedEvolutionChainSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **evolution_chain_retrieve**   { #evolution_chain_retrieve }
<a name="evolution_chain_retrieve"></a>

> `evolution_chain_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = EvolutionApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EvolutionApi.new(config, client)


# Invoke an endpoint
api.evolution_chain_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "evolution_chain_retrieve", response)
		assert(response.data is EvolutionChainDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **evolution_trigger_list**   { #evolution_trigger_list }
<a name="evolution_trigger_list"></a>

> `evolution_trigger_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = EvolutionApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EvolutionApi.new(config, client)


# Invoke an endpoint
api.evolution_trigger_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "evolution_trigger_list", response)
		assert(response.data is PaginatedEvolutionTriggerSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **evolution_trigger_retrieve**   { #evolution_trigger_retrieve }
<a name="evolution_trigger_retrieve"></a>

> `evolution_trigger_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = EvolutionApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EvolutionApi.new(config, client)


# Invoke an endpoint
api.evolution_trigger_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "evolution_trigger_retrieve", response)
		assert(response.data is EvolutionTriggerDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[basicAuth](../README.md#basicAuth), 
[cookieAuth](../README.md#cookieAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

