

#include "MoveDetail_effect_changes_inner.h"

using namespace Tiny;

MoveDetail_effect_changes_inner::MoveDetail_effect_changes_inner()
{
	effect_entries = std::list<MoveDetail_effect_changes_inner_effect_entries_inner>();
	version_group = AbilityDetail_pokemon_inner_pokemon();
}

MoveDetail_effect_changes_inner::MoveDetail_effect_changes_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail_effect_changes_inner::~MoveDetail_effect_changes_inner()
{

}

void
MoveDetail_effect_changes_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<MoveDetail_effect_changes_inner_effect_entries_inner> effect_entries_list;
        MoveDetail_effect_changes_inner_effect_entries_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &version_group;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveDetail_effect_changes_inner::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<MoveDetail_effect_changes_inner_effect_entries_inner> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        MoveDetail_effect_changes_inner_effect_entries_inner obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;








	object["version_group"] = getVersionGroup().toJson();


    return object;

}

std::list<MoveDetail_effect_changes_inner_effect_entries_inner>
MoveDetail_effect_changes_inner::getEffectEntries()
{
	return effect_entries;
}

void
MoveDetail_effect_changes_inner::setEffectEntries(std::list<MoveDetail_effect_changes_inner_effect_entries_inner> effect_entries)
{
	this->effect_entries = effect_entries;
}

AbilityDetail_pokemon_inner_pokemon
MoveDetail_effect_changes_inner::getVersionGroup()
{
	return version_group;
}

void
MoveDetail_effect_changes_inner::setVersionGroup(AbilityDetail_pokemon_inner_pokemon version_group)
{
	this->version_group = version_group;
}



