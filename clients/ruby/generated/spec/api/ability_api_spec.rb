=begin
#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::AbilityApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'AbilityApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::AbilityApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AbilityApi' do
    it 'should create an instance of AbilityApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::AbilityApi)
    end
  end

  # unit tests for ability_list
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit 
  # @option opts [Integer] :offset 
  # @return [String]
  describe 'ability_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for ability_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'ability_read test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
