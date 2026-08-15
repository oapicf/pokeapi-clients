
#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


