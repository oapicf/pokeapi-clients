
#include "PokedexDetail_pokemon_entries_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokedexDetail_pokemon_entries_inner_entry_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "entry_number", 1
    };

    PokedexDetail_pokemon_entries_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEntryNumber());








}




void test_PokedexDetail_pokemon_entries_inner_entry_number_is_converted_to_json()
{
    bourne::json input =
    {
        "entry_number", 1
    };

    PokedexDetail_pokemon_entries_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["entry_number"] == output["entry_number"]);




}



