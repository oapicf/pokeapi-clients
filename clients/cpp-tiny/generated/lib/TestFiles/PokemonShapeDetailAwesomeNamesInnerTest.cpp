
#include "PokemonShapeDetail_awesome_names_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonShapeDetail_awesome_names_inner_awesome_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "awesome_name", "hello"
    };

    PokemonShapeDetail_awesome_names_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAwesomeName().c_str());






}




void test_PokemonShapeDetail_awesome_names_inner_awesome_name_is_converted_to_json()
{

    bourne::json input =
    {
        "awesome_name", "hello"
    };

    PokemonShapeDetail_awesome_names_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["awesome_name"] == output["awesome_name"]);



}



