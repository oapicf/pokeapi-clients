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

# Unit tests for OpenAPIClient::RegionApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "RegionApi" do
  describe "test an instance of RegionApi" do
    it "should create an instance of RegionApi" do
      api_instance = OpenAPIClient::RegionApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::RegionApi)
    end
  end

  # unit tests for region_list
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit 
  # @option opts [Int32] :offset 
  # @return [String]
  describe "region_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for region_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "region_read test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
