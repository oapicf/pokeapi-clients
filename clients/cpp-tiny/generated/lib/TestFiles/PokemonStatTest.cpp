
#include "PokemonStat.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonStat_base_stat_is_assigned_from_json()
{
    bourne::json input =
    {
        "base_stat", 1
    };

    PokemonStat obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBaseStat());








}


void test_PokemonStat_effort_is_assigned_from_json()
{
    bourne::json input =
    {
        "effort", 1
    };

    PokemonStat obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEffort());








}




void test_PokemonStat_base_stat_is_converted_to_json()
{
    bourne::json input =
    {
        "base_stat", 1
    };

    PokemonStat obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["base_stat"] == output["base_stat"]);




}


void test_PokemonStat_effort_is_converted_to_json()
{
    bourne::json input =
    {
        "effort", 1
    };

    PokemonStat obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["effort"] == output["effort"]);




}



