=begin comment

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::EncounterConditionValueApi');

my $api = WWW::OpenAPIClient::EncounterConditionValueApi->new();
isa_ok($api, 'WWW::OpenAPIClient::EncounterConditionValueApi');

#
# encounter_condition_value_list test
#
# uncomment below and update the test
#my $encounter_condition_value_list_limit = undef; # replace NULL with a proper value
#my $encounter_condition_value_list_offset = undef; # replace NULL with a proper value
#my $encounter_condition_value_list_result = $api->encounter_condition_value_list(limit => $encounter_condition_value_list_limit, offset => $encounter_condition_value_list_offset);

#
# encounter_condition_value_read test
#
# uncomment below and update the test
#my $encounter_condition_value_read_id = undef; # replace NULL with a proper value
#my $encounter_condition_value_read_result = $api->encounter_condition_value_read(id => $encounter_condition_value_read_id);

