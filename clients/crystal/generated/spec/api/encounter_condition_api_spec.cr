# #No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for ::EncounterConditionApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "EncounterConditionApi" do
  describe "test an instance of EncounterConditionApi" do
    it "should create an instance of EncounterConditionApi" do
      api_instance = ::EncounterConditionApi.new
      # TODO expect(api_instance).to be_instance_of(::EncounterConditionApi)
    end
  end

  # unit tests for encounter_condition_list
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit 
  # @option opts [Int32] :offset 
  # @return [String]
  describe "encounter_condition_list test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for encounter_condition_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "encounter_condition_read test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
