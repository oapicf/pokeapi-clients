# #
#
##No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 20220523
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 7.2.0
#

require "uri"

module OpenAPIClient
  class PokemonSpeciesApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # @return [String]
    def pokemon_species_list(limit : Int32?, offset : Int32?)
      data, _status_code, _headers = pokemon_species_list_with_http_info(limit, offset)
      data
    end

    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def pokemon_species_list_with_http_info(limit : Int32?, offset : Int32?)
      if @api_client.config.debugging
        Log.debug {"Calling API: PokemonSpeciesApi.pokemon_species_list ..."}
      end
      # resource path
      local_var_path = "/api/v2/pokemon-species/"

      # query parameters
      query_params = Hash(String, String).new
      query_params["limit"] = limit.to_s unless limit.nil?
      query_params["offset"] = offset.to_s unless offset.nil?

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["text/plain"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "String"

      # auth_names
      auth_names = [] of String

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"PokemonSpeciesApi.pokemon_species_list",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PokemonSpeciesApi#pokemon_species_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return String.from_json(data), status_code, headers
    end

    # @param id [Int32]
    # @return [String]
    def pokemon_species_read(id : Int32)
      data, _status_code, _headers = pokemon_species_read_with_http_info(id)
      data
    end

    # @param id [Int32]
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def pokemon_species_read_with_http_info(id : Int32)
      if @api_client.config.debugging
        Log.debug {"Calling API: PokemonSpeciesApi.pokemon_species_read ..."}
      end
      # verify the required parameter "id" is set
      if @api_client.config.client_side_validation && id.nil?
        raise ArgumentError.new("Missing the required parameter 'id' when calling PokemonSpeciesApi.pokemon_species_read")
      end
      # resource path
      local_var_path = "/api/v2/pokemon-species/{id}/".sub("{" + "id" + "}", URI.encode_path(id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["text/plain"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "String"

      # auth_names
      auth_names = [] of String

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"PokemonSpeciesApi.pokemon_species_read",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PokemonSpeciesApi#pokemon_species_read\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return String.from_json(data), status_code, headers
    end
  end
end
