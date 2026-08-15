

#include "PokemonDetail_moves_inner_version_group_details_inner.h"

using namespace Tiny;

PokemonDetail_moves_inner_version_group_details_inner::PokemonDetail_moves_inner_version_group_details_inner()
{
	level_learned_at = int(0);
	move_learn_method = AbilityDetail_pokemon_inner_pokemon();
	version_group = AbilityDetail_pokemon_inner_pokemon();
}

PokemonDetail_moves_inner_version_group_details_inner::PokemonDetail_moves_inner_version_group_details_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_moves_inner_version_group_details_inner::~PokemonDetail_moves_inner_version_group_details_inner()
{

}

void
PokemonDetail_moves_inner_version_group_details_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &move_learn_method;
		obj->fromJson(value.dump());

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
PokemonDetail_moves_inner_version_group_details_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["level_learned_at"] = getLevelLearnedAt();







	object["move_learn_method"] = getMoveLearnMethod().toJson();






	object["version_group"] = getVersionGroup().toJson();


    return object;

}

int
PokemonDetail_moves_inner_version_group_details_inner::getLevelLearnedAt()
{
	return level_learned_at;
}

void
PokemonDetail_moves_inner_version_group_details_inner::setLevelLearnedAt(int  level_learned_at)
{
	this->level_learned_at = level_learned_at;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_moves_inner_version_group_details_inner::getMoveLearnMethod()
{
	return move_learn_method;
}

void
PokemonDetail_moves_inner_version_group_details_inner::setMoveLearnMethod(AbilityDetail_pokemon_inner_pokemon  move_learn_method)
{
	this->move_learn_method = move_learn_method;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_moves_inner_version_group_details_inner::getVersionGroup()
{
	return version_group;
}

void
PokemonDetail_moves_inner_version_group_details_inner::setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group)
{
	this->version_group = version_group;
}



