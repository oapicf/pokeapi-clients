<a name="__pageTop"></a>
# LocationApi   { #LocationApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**location_area_list**](#location_area_list) | **GET** `/api/v2/location-area/` | List location areas
[**location_area_retrieve**](#location_area_retrieve) | **GET** `/api/v2/location-area/{id}/` | Get location area
[**location_list**](#location_list) | **GET** `/api/v2/location/` | List locations
[**location_retrieve**](#location_retrieve) | **GET** `/api/v2/location/{id}/` | Get location
[**pal_park_area_list**](#pal_park_area_list) | **GET** `/api/v2/pal-park-area/` | List pal park areas
[**pal_park_area_retrieve**](#pal_park_area_retrieve) | **GET** `/api/v2/pal-park-area/{id}/` | Get pal park area
[**region_list**](#region_list) | **GET** `/api/v2/region/` | List regions
[**region_retrieve**](#region_retrieve) | **GET** `/api/v2/region/{id}/` | Get region

# **location_area_list**   { #location_area_list }
<a name="location_area_list"></a>

> `location_area_list(limit = null,offset = null, on_success: Callable, on_failure: Callable)`

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.location_area_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "location_area_list", response)
		assert(response.data is PaginatedLocationAreaSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **location_area_retrieve**   { #location_area_retrieve }
<a name="location_area_retrieve"></a>

> `location_area_retrieve(id: int, on_success: Callable, on_failure: Callable)`

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.location_area_retrieve(
	# id: int   Eg: 56
	# A unique integer value identifying this location area.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "location_area_retrieve", response)
		assert(response.data is LocationAreaDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **location_list**   { #location_list }
<a name="location_list"></a>

> `location_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.location_list(
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
		prints("Success!", "location_list", response)
		assert(response.data is PaginatedLocationSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **location_retrieve**   { #location_retrieve }
<a name="location_retrieve"></a>

> `location_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.location_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "location_retrieve", response)
		assert(response.data is LocationDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pal_park_area_list**   { #pal_park_area_list }
<a name="pal_park_area_list"></a>

> `pal_park_area_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.pal_park_area_list(
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
		prints("Success!", "pal_park_area_list", response)
		assert(response.data is PaginatedPalParkAreaSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pal_park_area_retrieve**   { #pal_park_area_retrieve }
<a name="pal_park_area_retrieve"></a>

> `pal_park_area_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.pal_park_area_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pal_park_area_retrieve", response)
		assert(response.data is PalParkAreaDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **region_list**   { #region_list }
<a name="region_list"></a>

> `region_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.region_list(
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
		prints("Success!", "region_list", response)
		assert(response.data is PaginatedRegionSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **region_retrieve**   { #region_retrieve }
<a name="region_retrieve"></a>

> `region_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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
var api = LocationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LocationApi.new(config, client)


# Invoke an endpoint
api.region_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "region_retrieve", response)
		assert(response.data is RegionDetail)
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

