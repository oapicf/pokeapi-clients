
#include "EncounterPokemonDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EncounterPokemonDetail_min_perfect_ivs_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_perfect_ivs", 1
    };

    EncounterPokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinPerfectIvs());








}


void test_EncounterPokemonDetail_always_shiny_is_assigned_from_json()
{




    bourne::json input =
    {
        "always_shiny", true
    };

    EncounterPokemonDetail obj(input.dump());

    TEST_ASSERT(true == obj.isAlwaysShiny());




}


void test_EncounterPokemonDetail_never_shiny_is_assigned_from_json()
{




    bourne::json input =
    {
        "never_shiny", true
    };

    EncounterPokemonDetail obj(input.dump());

    TEST_ASSERT(true == obj.isNeverShiny());




}


void test_EncounterPokemonDetail_is_alpha_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_alpha", true
    };

    EncounterPokemonDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsAlpha());




}



void test_EncounterPokemonDetail_min_perfect_ivs_is_converted_to_json()
{
    bourne::json input =
    {
        "min_perfect_ivs", 1
    };

    EncounterPokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_perfect_ivs"] == output["min_perfect_ivs"]);




}


void test_EncounterPokemonDetail_always_shiny_is_converted_to_json()
{


    bourne::json input =
    {
        "always_shiny", true
    };

    EncounterPokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["always_shiny"] == output["always_shiny"]);


}


void test_EncounterPokemonDetail_never_shiny_is_converted_to_json()
{


    bourne::json input =
    {
        "never_shiny", true
    };

    EncounterPokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["never_shiny"] == output["never_shiny"]);


}


void test_EncounterPokemonDetail_is_alpha_is_converted_to_json()
{


    bourne::json input =
    {
        "is_alpha", true
    };

    EncounterPokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_alpha"] == output["is_alpha"]);


}


