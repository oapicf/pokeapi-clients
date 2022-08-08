# #No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 20220523
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

# Dependencies
require "crest"
require "log"

module 
  Log = ::Log.for("") # => Log for  source

  VERSION = {{ `shards version #{__DIR__}`.chomp.stringify }}

  # Return the default `Configuration` object.
  def self.configure
    Configuration.default
  end

  # Customize default settings for the SDK using block.
  #
  # ```
  # .configure do |config|
  #   config.username = "xxx"
  #   config.password = "xxx"
  # end
  # ```
  def self.configure
    yield Configuration.default
  end
end

require ".//**"