
#include "PokemonFormDetail_sprites.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonFormDetail_sprites_r_default_is_assigned_from_json()
{


    bourne::json input =
    {
        "r_default", "hello"
    };

    PokemonFormDetail_sprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRDefault().c_str());






}



void test_PokemonFormDetail_sprites_r_default_is_converted_to_json()
{

    bourne::json input =
    {
        "r_default", "hello"
    };

    PokemonFormDetail_sprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["r_default"] == output["r_default"]);



}


