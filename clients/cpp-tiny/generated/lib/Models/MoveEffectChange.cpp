

#include "MoveEffectChange.h"

using namespace Tiny;

MoveEffectChange::MoveEffectChange()
{
	version_group = null;
	effect_entries = std::list<MoveEffectChangeEffectText>();
}

MoveEffectChange::MoveEffectChange(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveEffectChange::~MoveEffectChange()
{

}

void
MoveEffectChange::fromJson(std::string jsonObj)
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


        std::list<MoveEffectChangeEffectText> effect_entries_list;
        MoveEffectChangeEffectText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }


}

bourne::json
MoveEffectChange::toJson()
{
    bourne::json object = bourne::json::object();






	object["version_group"] = getVersionGroup().toJson();




    std::list<MoveEffectChangeEffectText> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        MoveEffectChangeEffectText obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;




    return object;

}

VersionGroupSummary
MoveEffectChange::getVersionGroup()
{
	return version_group;
}

void
MoveEffectChange::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}

std::list<MoveEffectChangeEffectText>
MoveEffectChange::getEffectEntries()
{
	return effect_entries;
}

void
MoveEffectChange::setEffectEntries(std::list<MoveEffectChangeEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}



