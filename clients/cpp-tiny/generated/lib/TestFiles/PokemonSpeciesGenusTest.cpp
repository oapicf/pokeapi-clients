
#include "PokemonSpeciesGenus.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonSpeciesGenus_genus_is_assigned_from_json()
{


    bourne::json input =
    {
        "genus", "hello"
    };

    PokemonSpeciesGenus obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGenus().c_str());






}




void test_PokemonSpeciesGenus_genus_is_converted_to_json()
{

    bourne::json input =
    {
        "genus", "hello"
    };

    PokemonSpeciesGenus obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["genus"] == output["genus"]);



}



