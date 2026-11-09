

#include "PokemonMoveVersionGroup.h"

using namespace Tiny;

PokemonMoveVersionGroup::PokemonMoveVersionGroup()
{
	level_learned_at = int(0);
	move_learn_method = null;
	version_group = null;
	order = int(0);
}

PokemonMoveVersionGroup::PokemonMoveVersionGroup(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonMoveVersionGroup::~PokemonMoveVersionGroup()
{

}

void
PokemonMoveVersionGroup::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *level_learned_atKey = "level_learned_at";

    if(object.has_key(level_learned_atKey))
    {
        bourne::json value = object[level_learned_atKey];



        jsonToValue(&level_learned_at, value, "int");


    }

    const char *move_learn_methodKey = "move_learn_method";

    if(object.has_key(move_learn_methodKey))
    {
        bourne::json value = object[move_learn_methodKey];




        MoveLearnMethodSummary* obj = &move_learn_method;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];



        jsonToValue(&order, value, "int");


    }


}

bourne::json
PokemonMoveVersionGroup::toJson()
{
    bourne::json object = bourne::json::object();





    object["level_learned_at"] = getLevelLearnedAt();







	object["move_learn_method"] = getMoveLearnMethod().toJson();






	object["version_group"] = getVersionGroup().toJson();





    object["order"] = getOrder();



    return object;

}

int
PokemonMoveVersionGroup::getLevelLearnedAt()
{
	return level_learned_at;
}

void
PokemonMoveVersionGroup::setLevelLearnedAt(int level_learned_at)
{
	this->level_learned_at = level_learned_at;
}

MoveLearnMethodSummary
PokemonMoveVersionGroup::getMoveLearnMethod()
{
	return move_learn_method;
}

void
PokemonMoveVersionGroup::setMoveLearnMethod(MoveLearnMethodSummary move_learn_method)
{
	this->move_learn_method = move_learn_method;
}

VersionGroupSummary
PokemonMoveVersionGroup::getVersionGroup()
{
	return version_group;
}

void
PokemonMoveVersionGroup::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}

int
PokemonMoveVersionGroup::getOrder()
{
	return order;
}

void
PokemonMoveVersionGroup::setOrder(int order)
{
	this->order = order;
}



