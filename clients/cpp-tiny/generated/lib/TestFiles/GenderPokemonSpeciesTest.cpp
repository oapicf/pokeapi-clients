
#include "GenderPokemonSpecies.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenderPokemonSpecies_rate_is_assigned_from_json()
{
    bourne::json input =
    {
        "rate", 1
    };

    GenderPokemonSpecies obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRate());








}




void test_GenderPokemonSpecies_rate_is_converted_to_json()
{
    bourne::json input =
    {
        "rate", 1
    };

    GenderPokemonSpecies obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rate"] == output["rate"]);




}



