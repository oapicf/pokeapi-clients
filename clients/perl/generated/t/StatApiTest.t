=begin comment



No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 20220523
Contact: blah+oapicf@cliffano.com
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

use_ok('WWW::OpenAPIClient::StatApi');

my $api = WWW::OpenAPIClient::StatApi->new();
isa_ok($api, 'WWW::OpenAPIClient::StatApi');

#
# stat_list test
#
# uncomment below and update the test
#my $stat_list_limit = undef; # replace NULL with a proper value
#my $stat_list_offset = undef; # replace NULL with a proper value
#my $stat_list_result = $api->stat_list(limit => $stat_list_limit, offset => $stat_list_offset);

#
# stat_read test
#
# uncomment below and update the test
#my $stat_read_id = undef; # replace NULL with a proper value
#my $stat_read_result = $api->stat_read(id => $stat_read_id);

