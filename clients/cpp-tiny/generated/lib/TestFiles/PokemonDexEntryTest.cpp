
#include "PokemonDexEntry.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonDexEntry_entry_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "entry_number", 1
    };

    PokemonDexEntry obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEntryNumber());








}




void test_PokemonDexEntry_entry_number_is_converted_to_json()
{
    bourne::json input =
    {
        "entry_number", 1
    };

    PokemonDexEntry obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["entry_number"] == output["entry_number"]);




}



