
#include "PokeapiMetaResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokeapiMetaResponse_deploy_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "deploy_date", "hello"
    };

    PokeapiMetaResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeployDate().c_str());






}


void test_PokeapiMetaResponse_hash_is_assigned_from_json()
{


    bourne::json input =
    {
        "hash", "hello"
    };

    PokeapiMetaResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHash().c_str());






}


void test_PokeapiMetaResponse_tag_is_assigned_from_json()
{


    bourne::json input =
    {
        "tag", "hello"
    };

    PokeapiMetaResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTag().c_str());






}



void test_PokeapiMetaResponse_deploy_date_is_converted_to_json()
{

    bourne::json input =
    {
        "deploy_date", "hello"
    };

    PokeapiMetaResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deploy_date"] == output["deploy_date"]);



}


void test_PokeapiMetaResponse_hash_is_converted_to_json()
{

    bourne::json input =
    {
        "hash", "hello"
    };

    PokeapiMetaResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hash"] == output["hash"]);



}


void test_PokeapiMetaResponse_tag_is_converted_to_json()
{

    bourne::json input =
    {
        "tag", "hello"
    };

    PokeapiMetaResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tag"] == output["tag"]);



}


