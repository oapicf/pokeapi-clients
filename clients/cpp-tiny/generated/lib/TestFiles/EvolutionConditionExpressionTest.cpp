
#include "EvolutionConditionExpression.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EvolutionConditionExpression_expression_is_assigned_from_json()
{


    bourne::json input =
    {
        "expression", "hello"
    };

    EvolutionConditionExpression obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExpression().c_str());






}


void test_EvolutionConditionExpression_percentage_chance_is_assigned_from_json()
{








}




void test_EvolutionConditionExpression_expression_is_converted_to_json()
{

    bourne::json input =
    {
        "expression", "hello"
    };

    EvolutionConditionExpression obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expression"] == output["expression"]);



}


void test_EvolutionConditionExpression_percentage_chance_is_converted_to_json()
{




}



