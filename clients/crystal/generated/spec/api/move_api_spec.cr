# #
#
##No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 20220523
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 7.2.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::MoveApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "MoveApi" do
  describe "test an instance of MoveApi" do
    it "should create an instance of MoveApi" do
      api_instance = OpenAPIClient::MoveApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::MoveApi)
    end
  end

  # unit tests for move_list
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit
  # @option opts [Int32] :offset
  # @return [String]
  describe "move_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for move_read
  # @param id
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "move_read test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
