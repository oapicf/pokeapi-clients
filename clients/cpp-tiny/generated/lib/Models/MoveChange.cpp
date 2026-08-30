

#include "MoveChange.h"

using namespace Tiny;

MoveChange::MoveChange()
{
	accuracy = int(0);
	power = int(0);
	pp = int(0);
	effect_chance = int(0);
	effect_entries = std::list<MoveChange_effect_entries_inner>();
	type = TypeSummary();
	version_group = VersionGroupSummary();
}

MoveChange::MoveChange(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveChange::~MoveChange()
{

}

void
MoveChange::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accuracyKey = "accuracy";

    if(object.has_key(accuracyKey))
    {
        bourne::json value = object[accuracyKey];



        jsonToValue(&accuracy, value, "int");


    }

    const char *powerKey = "power";

    if(object.has_key(powerKey))
    {
        bourne::json value = object[powerKey];



        jsonToValue(&power, value, "int");


    }

    const char *ppKey = "pp";

    if(object.has_key(ppKey))
    {
        bourne::json value = object[ppKey];



        jsonToValue(&pp, value, "int");


    }

    const char *effect_chanceKey = "effect_chance";

    if(object.has_key(effect_chanceKey))
    {
        bourne::json value = object[effect_chanceKey];



        jsonToValue(&effect_chance, value, "int");


    }

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<MoveChange_effect_entries_inner> effect_entries_list;
        MoveChange_effect_entries_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        TypeSummary* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveChange::toJson()
{
    bourne::json object = bourne::json::object();





    object["accuracy"] = getAccuracy();






    object["power"] = getPower();






    object["pp"] = getPp();






    object["effect_chance"] = getEffectChance();





    std::list<MoveChange_effect_entries_inner> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        MoveChange_effect_entries_inner obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;








	object["type"] = getType().toJson();






	object["version_group"] = getVersionGroup().toJson();


    return object;

}

int
MoveChange::getAccuracy()
{
	return accuracy;
}

void
MoveChange::setAccuracy(int accuracy)
{
	this->accuracy = accuracy;
}

int
MoveChange::getPower()
{
	return power;
}

void
MoveChange::setPower(int power)
{
	this->power = power;
}

int
MoveChange::getPp()
{
	return pp;
}

void
MoveChange::setPp(int pp)
{
	this->pp = pp;
}

int
MoveChange::getEffectChance()
{
	return effect_chance;
}

void
MoveChange::setEffectChance(int effect_chance)
{
	this->effect_chance = effect_chance;
}

std::list<MoveChange_effect_entries_inner>
MoveChange::getEffectEntries()
{
	return effect_entries;
}

void
MoveChange::setEffectEntries(std::list<MoveChange_effect_entries_inner> effect_entries)
{
	this->effect_entries = effect_entries;
}

TypeSummary
MoveChange::getType()
{
	return type;
}

void
MoveChange::setType(TypeSummary type)
{
	this->type = type;
}

VersionGroupSummary
MoveChange::getVersionGroup()
{
	return version_group;
}

void
MoveChange::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}



