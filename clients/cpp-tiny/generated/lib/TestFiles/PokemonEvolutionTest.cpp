
#include "PokemonEvolution.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PokemonEvolution_is_default_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_default", true
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT(true == obj.isIsDefault());




}




void test_PokemonEvolution_gender_is_assigned_from_json()
{
    bourne::json input =
    {
        "gender", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGender());








}






void test_PokemonEvolution_min_level_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_level", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinLevel());








}


void test_PokemonEvolution_min_happiness_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_happiness", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinHappiness());








}


void test_PokemonEvolution_min_beauty_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_beauty", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinBeauty());








}


void test_PokemonEvolution_min_affection_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_affection", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinAffection());








}


void test_PokemonEvolution_near_special_rock_is_assigned_from_json()
{




    bourne::json input =
    {
        "near_special_rock", true
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT(true == obj.isNearSpecialRock());




}


void test_PokemonEvolution_needs_multiplayer_is_assigned_from_json()
{




    bourne::json input =
    {
        "needs_multiplayer", true
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT(true == obj.isNeedsMultiplayer());




}


void test_PokemonEvolution_needs_overworld_rain_is_assigned_from_json()
{




    bourne::json input =
    {
        "needs_overworld_rain", true
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT(true == obj.isNeedsOverworldRain());




}




void test_PokemonEvolution_relative_physical_stats_is_assigned_from_json()
{
    bourne::json input =
    {
        "relative_physical_stats", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRelativePhysicalStats());








}


void test_PokemonEvolution_time_of_day_is_assigned_from_json()
{


    bourne::json input =
    {
        "time_of_day", "hello"
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTimeOfDay().c_str());






}



void test_PokemonEvolution_turn_upside_down_is_assigned_from_json()
{




    bourne::json input =
    {
        "turn_upside_down", true
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT(true == obj.isTurnUpsideDown());




}






void test_PokemonEvolution_min_move_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_move_count", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinMoveCount());








}


void test_PokemonEvolution_min_steps_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_steps", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinSteps());








}


void test_PokemonEvolution_min_damage_taken_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_damage_taken", 1
    };

    PokemonEvolution obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinDamageTaken());








}






void test_PokemonEvolution_is_default_is_converted_to_json()
{


    bourne::json input =
    {
        "is_default", true
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_default"] == output["is_default"]);


}




void test_PokemonEvolution_gender_is_converted_to_json()
{
    bourne::json input =
    {
        "gender", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gender"] == output["gender"]);




}






void test_PokemonEvolution_min_level_is_converted_to_json()
{
    bourne::json input =
    {
        "min_level", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_level"] == output["min_level"]);




}


void test_PokemonEvolution_min_happiness_is_converted_to_json()
{
    bourne::json input =
    {
        "min_happiness", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_happiness"] == output["min_happiness"]);




}


void test_PokemonEvolution_min_beauty_is_converted_to_json()
{
    bourne::json input =
    {
        "min_beauty", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_beauty"] == output["min_beauty"]);




}


void test_PokemonEvolution_min_affection_is_converted_to_json()
{
    bourne::json input =
    {
        "min_affection", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_affection"] == output["min_affection"]);




}


void test_PokemonEvolution_near_special_rock_is_converted_to_json()
{


    bourne::json input =
    {
        "near_special_rock", true
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["near_special_rock"] == output["near_special_rock"]);


}


void test_PokemonEvolution_needs_multiplayer_is_converted_to_json()
{


    bourne::json input =
    {
        "needs_multiplayer", true
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["needs_multiplayer"] == output["needs_multiplayer"]);


}


void test_PokemonEvolution_needs_overworld_rain_is_converted_to_json()
{


    bourne::json input =
    {
        "needs_overworld_rain", true
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["needs_overworld_rain"] == output["needs_overworld_rain"]);


}




void test_PokemonEvolution_relative_physical_stats_is_converted_to_json()
{
    bourne::json input =
    {
        "relative_physical_stats", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["relative_physical_stats"] == output["relative_physical_stats"]);




}


void test_PokemonEvolution_time_of_day_is_converted_to_json()
{

    bourne::json input =
    {
        "time_of_day", "hello"
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["time_of_day"] == output["time_of_day"]);



}



void test_PokemonEvolution_turn_upside_down_is_converted_to_json()
{


    bourne::json input =
    {
        "turn_upside_down", true
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["turn_upside_down"] == output["turn_upside_down"]);


}






void test_PokemonEvolution_min_move_count_is_converted_to_json()
{
    bourne::json input =
    {
        "min_move_count", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_move_count"] == output["min_move_count"]);




}


void test_PokemonEvolution_min_steps_is_converted_to_json()
{
    bourne::json input =
    {
        "min_steps", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_steps"] == output["min_steps"]);




}


void test_PokemonEvolution_min_damage_taken_is_converted_to_json()
{
    bourne::json input =
    {
        "min_damage_taken", 1
    };

    PokemonEvolution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_damage_taken"] == output["min_damage_taken"]);




}




