
#include "PokemonSprites.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonSprites_front_default_is_assigned_from_json()
{


    bourne::json input =
    {
        "front_default", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFrontDefault().c_str());






}


void test_PokemonSprites_front_shiny_is_assigned_from_json()
{


    bourne::json input =
    {
        "front_shiny", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFrontShiny().c_str());






}


void test_PokemonSprites_front_female_is_assigned_from_json()
{


    bourne::json input =
    {
        "front_female", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFrontFemale().c_str());






}


void test_PokemonSprites_front_shiny_female_is_assigned_from_json()
{


    bourne::json input =
    {
        "front_shiny_female", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFrontShinyFemale().c_str());






}


void test_PokemonSprites_back_default_is_assigned_from_json()
{


    bourne::json input =
    {
        "back_default", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBackDefault().c_str());






}


void test_PokemonSprites_back_shiny_is_assigned_from_json()
{


    bourne::json input =
    {
        "back_shiny", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBackShiny().c_str());






}


void test_PokemonSprites_back_female_is_assigned_from_json()
{


    bourne::json input =
    {
        "back_female", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBackFemale().c_str());






}


void test_PokemonSprites_back_shiny_female_is_assigned_from_json()
{


    bourne::json input =
    {
        "back_shiny_female", "hello"
    };

    PokemonSprites obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBackShinyFemale().c_str());






}





void test_PokemonSprites_front_default_is_converted_to_json()
{

    bourne::json input =
    {
        "front_default", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["front_default"] == output["front_default"]);



}


void test_PokemonSprites_front_shiny_is_converted_to_json()
{

    bourne::json input =
    {
        "front_shiny", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["front_shiny"] == output["front_shiny"]);



}


void test_PokemonSprites_front_female_is_converted_to_json()
{

    bourne::json input =
    {
        "front_female", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["front_female"] == output["front_female"]);



}


void test_PokemonSprites_front_shiny_female_is_converted_to_json()
{

    bourne::json input =
    {
        "front_shiny_female", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["front_shiny_female"] == output["front_shiny_female"]);



}


void test_PokemonSprites_back_default_is_converted_to_json()
{

    bourne::json input =
    {
        "back_default", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["back_default"] == output["back_default"]);



}


void test_PokemonSprites_back_shiny_is_converted_to_json()
{

    bourne::json input =
    {
        "back_shiny", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["back_shiny"] == output["back_shiny"]);



}


void test_PokemonSprites_back_female_is_converted_to_json()
{

    bourne::json input =
    {
        "back_female", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["back_female"] == output["back_female"]);



}


void test_PokemonSprites_back_shiny_female_is_converted_to_json()
{

    bourne::json input =
    {
        "back_shiny_female", "hello"
    };

    PokemonSprites obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["back_shiny_female"] == output["back_shiny_female"]);



}




