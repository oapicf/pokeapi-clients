
#include "PokemonSpeciesDetail_genera_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonSpeciesDetail_genera_inner_genus_is_assigned_from_json()
{


    bourne::json input =
    {
        "genus", "hello"
    };

    PokemonSpeciesDetail_genera_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGenus().c_str());






}




void test_PokemonSpeciesDetail_genera_inner_genus_is_converted_to_json()
{

    bourne::json input =
    {
        "genus", "hello"
    };

    PokemonSpeciesDetail_genera_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["genus"] == output["genus"]);



}



