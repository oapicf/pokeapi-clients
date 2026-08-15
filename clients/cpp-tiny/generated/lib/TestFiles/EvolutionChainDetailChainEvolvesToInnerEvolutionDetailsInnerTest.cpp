
#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"









void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_affection_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_affection", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinAffection());








}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_beauty_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_beauty", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinBeauty());








}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_happiness_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_happiness", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinHappiness());








}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_level_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_level", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinLevel());








}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_needs_overworld_rain_is_assigned_from_json()
{




    bourne::json input =
    {
        "needs_overworld_rain", true
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT(true == obj.isNeedsOverworldRain());




}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_party_species_is_assigned_from_json()
{


    bourne::json input =
    {
        "party_species", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartySpecies().c_str());






}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_party_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "party_type", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartyType().c_str());






}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_relative_physical_stats_is_assigned_from_json()
{


    bourne::json input =
    {
        "relative_physical_stats", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRelativePhysicalStats().c_str());






}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_time_of_day_is_assigned_from_json()
{


    bourne::json input =
    {
        "time_of_day", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTimeOfDay().c_str());






}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_trade_species_is_assigned_from_json()
{


    bourne::json input =
    {
        "trade_species", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTradeSpecies().c_str());






}



void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_turn_upside_down_is_assigned_from_json()
{




    bourne::json input =
    {
        "turn_upside_down", true
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    TEST_ASSERT(true == obj.isTurnUpsideDown());




}









void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_affection_is_converted_to_json()
{
    bourne::json input =
    {
        "min_affection", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_affection"] == output["min_affection"]);




}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_beauty_is_converted_to_json()
{
    bourne::json input =
    {
        "min_beauty", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_beauty"] == output["min_beauty"]);




}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_happiness_is_converted_to_json()
{
    bourne::json input =
    {
        "min_happiness", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_happiness"] == output["min_happiness"]);




}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_min_level_is_converted_to_json()
{
    bourne::json input =
    {
        "min_level", 1
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_level"] == output["min_level"]);




}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_needs_overworld_rain_is_converted_to_json()
{


    bourne::json input =
    {
        "needs_overworld_rain", true
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["needs_overworld_rain"] == output["needs_overworld_rain"]);


}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_party_species_is_converted_to_json()
{

    bourne::json input =
    {
        "party_species", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["party_species"] == output["party_species"]);



}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_party_type_is_converted_to_json()
{

    bourne::json input =
    {
        "party_type", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["party_type"] == output["party_type"]);



}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_relative_physical_stats_is_converted_to_json()
{

    bourne::json input =
    {
        "relative_physical_stats", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["relative_physical_stats"] == output["relative_physical_stats"]);



}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_time_of_day_is_converted_to_json()
{

    bourne::json input =
    {
        "time_of_day", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["time_of_day"] == output["time_of_day"]);



}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_trade_species_is_converted_to_json()
{

    bourne::json input =
    {
        "trade_species", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["trade_species"] == output["trade_species"]);



}



void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_turn_upside_down_is_converted_to_json()
{


    bourne::json input =
    {
        "turn_upside_down", true
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["turn_upside_down"] == output["turn_upside_down"]);


}


