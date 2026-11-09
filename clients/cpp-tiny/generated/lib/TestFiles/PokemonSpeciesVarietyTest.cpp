
#include "PokemonSpeciesVariety.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonSpeciesVariety_is_default_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_default", true
    };

    PokemonSpeciesVariety obj(input.dump());

    TEST_ASSERT(true == obj.isIsDefault());




}




void test_PokemonSpeciesVariety_is_default_is_converted_to_json()
{


    bourne::json input =
    {
        "is_default", true
    };

    PokemonSpeciesVariety obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_default"] == output["is_default"]);


}



