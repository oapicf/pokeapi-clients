# #No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

require "uri"

module 
  class EncounterConditionApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # @return [String]
    def encounter_condition_list(limit : Int32?, offset : Int32?)
      data, _status_code, _headers = encounter_condition_list_with_http_info(limit, offset)
      data
    end

    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def encounter_condition_list_with_http_info(limit : Int32?, offset : Int32?)
      if @api_client.config.debugging
        Log.debug {"Calling API: EncounterConditionApi.encounter_condition_list ..."}
      end
      # resource path
      local_var_path = "/api/v2/encounter-condition/"

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
                                                        :"EncounterConditionApi.encounter_condition_list",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: EncounterConditionApi#encounter_condition_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return String.from_json(data), status_code, headers
    end

    # @param id [Int32] 
    # @return [String]
    def encounter_condition_read(id : Int32)
      data, _status_code, _headers = encounter_condition_read_with_http_info(id)
      data
    end

    # @param id [Int32] 
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def encounter_condition_read_with_http_info(id : Int32)
      if @api_client.config.debugging
        Log.debug {"Calling API: EncounterConditionApi.encounter_condition_read ..."}
      end
      # verify the required parameter "id" is set
      if @api_client.config.client_side_validation && id.nil?
        raise ArgumentError.new("Missing the required parameter 'id' when calling EncounterConditionApi.encounter_condition_read")
      end
      # resource path
      local_var_path = "/api/v2/encounter-condition/{id}/".sub("{" + "id" + "}", URI.encode_path(id.to_s))

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
                                                        :"EncounterConditionApi.encounter_condition_read",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: EncounterConditionApi#encounter_condition_read\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return String.from_json(data), status_code, headers
    end
  end
end
