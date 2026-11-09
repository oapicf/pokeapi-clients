
#include "PokemonShapeAwesomeName.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonShapeAwesomeName_awesome_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "awesome_name", "hello"
    };

    PokemonShapeAwesomeName obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAwesomeName().c_str());






}




void test_PokemonShapeAwesomeName_awesome_name_is_converted_to_json()
{

    bourne::json input =
    {
        "awesome_name", "hello"
    };

    PokemonShapeAwesomeName obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["awesome_name"] == output["awesome_name"]);



}



