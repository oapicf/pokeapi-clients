
#include "PokemonColorSummary.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonColorSummary_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    PokemonColorSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_PokemonColorSummary_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    PokemonColorSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_PokemonColorSummary_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    PokemonColorSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_PokemonColorSummary_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    PokemonColorSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


