# #
#
##No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 20220523
#Contact: blah@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 6.2.1
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::AbilityApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "AbilityApi" do
  describe "test an instance of AbilityApi" do
    it "should create an instance of AbilityApi" do
      api_instance = OpenAPIClient::AbilityApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::AbilityApi)
    end
  end

  # unit tests for ability_list
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit 
  # @option opts [Int32] :offset 
  # @return [String]
  describe "ability_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for ability_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "ability_read test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
