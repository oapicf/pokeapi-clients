
#include "PokemonSpeciesDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonSpeciesDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_PokemonSpeciesDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_PokemonSpeciesDetail_order_is_assigned_from_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrder());








}


void test_PokemonSpeciesDetail_gender_rate_is_assigned_from_json()
{
    bourne::json input =
    {
        "gender_rate", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGenderRate());








}


void test_PokemonSpeciesDetail_capture_rate_is_assigned_from_json()
{
    bourne::json input =
    {
        "capture_rate", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCaptureRate());








}


void test_PokemonSpeciesDetail_base_happiness_is_assigned_from_json()
{
    bourne::json input =
    {
        "base_happiness", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBaseHappiness());








}


void test_PokemonSpeciesDetail_is_baby_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_baby", true
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsBaby());




}


void test_PokemonSpeciesDetail_is_legendary_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_legendary", true
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsLegendary());




}


void test_PokemonSpeciesDetail_is_mythical_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_mythical", true
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsMythical());




}


void test_PokemonSpeciesDetail_hatch_counter_is_assigned_from_json()
{
    bourne::json input =
    {
        "hatch_counter", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHatchCounter());








}


void test_PokemonSpeciesDetail_has_gender_differences_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_gender_differences", true
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT(true == obj.isHasGenderDifferences());




}


void test_PokemonSpeciesDetail_forms_switchable_is_assigned_from_json()
{




    bourne::json input =
    {
        "forms_switchable", true
    };

    PokemonSpeciesDetail obj(input.dump());

    TEST_ASSERT(true == obj.isFormsSwitchable());




}


















void test_PokemonSpeciesDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_PokemonSpeciesDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_PokemonSpeciesDetail_order_is_converted_to_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order"] == output["order"]);




}


void test_PokemonSpeciesDetail_gender_rate_is_converted_to_json()
{
    bourne::json input =
    {
        "gender_rate", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gender_rate"] == output["gender_rate"]);




}


void test_PokemonSpeciesDetail_capture_rate_is_converted_to_json()
{
    bourne::json input =
    {
        "capture_rate", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["capture_rate"] == output["capture_rate"]);




}


void test_PokemonSpeciesDetail_base_happiness_is_converted_to_json()
{
    bourne::json input =
    {
        "base_happiness", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["base_happiness"] == output["base_happiness"]);




}


void test_PokemonSpeciesDetail_is_baby_is_converted_to_json()
{


    bourne::json input =
    {
        "is_baby", true
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_baby"] == output["is_baby"]);


}


void test_PokemonSpeciesDetail_is_legendary_is_converted_to_json()
{


    bourne::json input =
    {
        "is_legendary", true
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_legendary"] == output["is_legendary"]);


}


void test_PokemonSpeciesDetail_is_mythical_is_converted_to_json()
{


    bourne::json input =
    {
        "is_mythical", true
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_mythical"] == output["is_mythical"]);


}


void test_PokemonSpeciesDetail_hatch_counter_is_converted_to_json()
{
    bourne::json input =
    {
        "hatch_counter", 1
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hatch_counter"] == output["hatch_counter"]);




}


void test_PokemonSpeciesDetail_has_gender_differences_is_converted_to_json()
{


    bourne::json input =
    {
        "has_gender_differences", true
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_gender_differences"] == output["has_gender_differences"]);


}


void test_PokemonSpeciesDetail_forms_switchable_is_converted_to_json()
{


    bourne::json input =
    {
        "forms_switchable", true
    };

    PokemonSpeciesDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["forms_switchable"] == output["forms_switchable"]);


}

















