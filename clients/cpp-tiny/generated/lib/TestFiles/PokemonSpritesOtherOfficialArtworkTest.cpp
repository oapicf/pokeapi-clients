
#include "PokemonSpritesOtherOfficialArtwork.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonSpritesOtherOfficialArtwork_front_default_is_assigned_from_json()
{


    bourne::json input =
    {
        "front_default", "hello"
    };

    PokemonSpritesOtherOfficialArtwork obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFrontDefault().c_str());






}


void test_PokemonSpritesOtherOfficialArtwork_front_shiny_is_assigned_from_json()
{


    bourne::json input =
    {
        "front_shiny", "hello"
    };

    PokemonSpritesOtherOfficialArtwork obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFrontShiny().c_str());






}




void test_PokemonSpritesOtherOfficialArtwork_front_default_is_converted_to_json()
{

    bourne::json input =
    {
        "front_default", "hello"
    };

    PokemonSpritesOtherOfficialArtwork obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["front_default"] == output["front_default"]);



}


void test_PokemonSpritesOtherOfficialArtwork_front_shiny_is_converted_to_json()
{

    bourne::json input =
    {
        "front_shiny", "hello"
    };

    PokemonSpritesOtherOfficialArtwork obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["front_shiny"] == output["front_shiny"]);



}



