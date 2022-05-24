=begin comment

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 20220523

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

use_ok('WWW::OpenAPIClient::ItemCategoryApi');

my $api = WWW::OpenAPIClient::ItemCategoryApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ItemCategoryApi');

#
# item_category_list test
#
# uncomment below and update the test
#my $item_category_list_limit = undef; # replace NULL with a proper value
#my $item_category_list_offset = undef; # replace NULL with a proper value
#my $item_category_list_result = $api->item_category_list(limit => $item_category_list_limit, offset => $item_category_list_offset);

#
# item_category_read test
#
# uncomment below and update the test
#my $item_category_read_id = undef; # replace NULL with a proper value
#my $item_category_read_result = $api->item_category_read(id => $item_category_read_id);

