=begin
#

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 20220523
Contact: blah@cliffano.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for PokeApiClient::LocationAreaApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'LocationAreaApi' do
  before do
    # run before each test
    @api_instance = PokeApiClient::LocationAreaApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LocationAreaApi' do
    it 'should create an instance of LocationAreaApi' do
      expect(@api_instance).to be_instance_of(PokeApiClient::LocationAreaApi)
    end
  end

  # unit tests for location_area_list
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit 
  # @option opts [Integer] :offset 
  # @return [String]
  describe 'location_area_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for location_area_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'location_area_read test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end