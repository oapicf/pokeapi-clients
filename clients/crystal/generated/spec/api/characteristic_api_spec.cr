# #No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 20220523
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for ::CharacteristicApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "CharacteristicApi" do
  describe "test an instance of CharacteristicApi" do
    it "should create an instance of CharacteristicApi" do
      api_instance = ::CharacteristicApi.new
      # TODO expect(api_instance).to be_instance_of(::CharacteristicApi)
    end
  end

  # unit tests for characteristic_list
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit 
  # @option opts [Int32] :offset 
  # @return [String]
  describe "characteristic_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for characteristic_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "characteristic_read test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end