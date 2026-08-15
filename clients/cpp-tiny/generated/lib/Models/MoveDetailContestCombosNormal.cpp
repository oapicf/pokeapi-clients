

#include "MoveDetail_contest_combos_normal.h"

using namespace Tiny;

MoveDetail_contest_combos_normal::MoveDetail_contest_combos_normal()
{
	use_before = std::list<AbilityDetail_pokemon_inner_pokemon>();
	use_after = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

MoveDetail_contest_combos_normal::MoveDetail_contest_combos_normal(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail_contest_combos_normal::~MoveDetail_contest_combos_normal()
{

}

void
MoveDetail_contest_combos_normal::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *use_beforeKey = "use_before";

    if(object.has_key(use_beforeKey))
    {
        bourne::json value = object[use_beforeKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> use_before_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            use_before_list.push_back(element);
        }
        use_before = use_before_list;


    }

    const char *use_afterKey = "use_after";

    if(object.has_key(use_afterKey))
    {
        bourne::json value = object[use_afterKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> use_after_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            use_after_list.push_back(element);
        }
        use_after = use_after_list;


    }


}

bourne::json
MoveDetail_contest_combos_normal::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AbilityDetail_pokemon_inner_pokemon> use_before_list = getUseBefore();
    bourne::json use_before_arr = bourne::json::array();

    for(auto& var : use_before_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        use_before_arr.append(obj.toJson());
    }
    object["use_before"] = use_before_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> use_after_list = getUseAfter();
    bourne::json use_after_arr = bourne::json::array();

    for(auto& var : use_after_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        use_after_arr.append(obj.toJson());
    }
    object["use_after"] = use_after_arr;




    return object;

}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveDetail_contest_combos_normal::getUseBefore()
{
	return use_before;
}

void
MoveDetail_contest_combos_normal::setUseBefore(std::list <AbilityDetail_pokemon_inner_pokemon> use_before)
{
	this->use_before = use_before;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveDetail_contest_combos_normal::getUseAfter()
{
	return use_after;
}

void
MoveDetail_contest_combos_normal::setUseAfter(std::list <AbilityDetail_pokemon_inner_pokemon> use_after)
{
	this->use_after = use_after;
}



