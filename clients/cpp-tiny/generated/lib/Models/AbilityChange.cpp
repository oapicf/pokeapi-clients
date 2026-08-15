

#include "AbilityChange.h"

using namespace Tiny;

AbilityChange::AbilityChange()
{
	version_group = VersionGroupSummary();
	effect_entries = std::list<AbilityChangeEffectText>();
}

AbilityChange::AbilityChange(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityChange::~AbilityChange()
{

}

void
AbilityChange::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<AbilityChangeEffectText> effect_entries_list;
        AbilityChangeEffectText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }


}

bourne::json
AbilityChange::toJson()
{
    bourne::json object = bourne::json::object();






	object["version_group"] = getVersionGroup().toJson();




    std::list<AbilityChangeEffectText> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        AbilityChangeEffectText obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;




    return object;

}

VersionGroupSummary
AbilityChange::getVersionGroup()
{
	return version_group;
}

void
AbilityChange::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

std::list<AbilityChangeEffectText>
AbilityChange::getEffectEntries()
{
	return effect_entries;
}

void
AbilityChange::setEffectEntries(std::list <AbilityChangeEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}



