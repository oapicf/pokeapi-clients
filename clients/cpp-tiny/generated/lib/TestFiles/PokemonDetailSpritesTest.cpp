
#include "PokemonDetail_sprites.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonDetail_sprites_front_default_is_assigned_from_json()
{


    bourne::json input =
    {
        "front_default", "hello"
    };

    PokemonDetail_sprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFrontDefault().c_str());






}



void test_PokemonDetail_sprites_front_default_is_converted_to_json()
{

    bourne::json input =
    {
        "front_default", "hello"
    };

    PokemonDetail_sprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["front_default"] == output["front_default"]);



}


