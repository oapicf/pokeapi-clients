

#include "StatDetail.h"

using namespace Tiny;

StatDetail::StatDetail()
{
	id = int(0);
	name = std::string();
	game_index = int(0);
	is_battle_only = bool(false);
	affecting_moves = StatDetail_affecting_moves();
	affecting_natures = StatDetail_affecting_natures();
	characteristics = std::list<CharacteristicSummary>();
	move_damage_class = MoveDamageClassSummary();
	names = std::list<StatName>();
}

StatDetail::StatDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatDetail::~StatDetail()
{

}

void
StatDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *game_indexKey = "game_index";

    if(object.has_key(game_indexKey))
    {
        bourne::json value = object[game_indexKey];



        jsonToValue(&game_index, value, "int");


    }

    const char *is_battle_onlyKey = "is_battle_only";

    if(object.has_key(is_battle_onlyKey))
    {
        bourne::json value = object[is_battle_onlyKey];



        jsonToValue(&is_battle_only, value, "bool");


    }

    const char *affecting_movesKey = "affecting_moves";

    if(object.has_key(affecting_movesKey))
    {
        bourne::json value = object[affecting_movesKey];




        StatDetail_affecting_moves* obj = &affecting_moves;
		obj->fromJson(value.dump());

    }

    const char *affecting_naturesKey = "affecting_natures";

    if(object.has_key(affecting_naturesKey))
    {
        bourne::json value = object[affecting_naturesKey];




        StatDetail_affecting_natures* obj = &affecting_natures;
		obj->fromJson(value.dump());

    }

    const char *characteristicsKey = "characteristics";

    if(object.has_key(characteristicsKey))
    {
        bourne::json value = object[characteristicsKey];


        std::list<CharacteristicSummary> characteristics_list;
        CharacteristicSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            characteristics_list.push_back(element);
        }
        characteristics = characteristics_list;


    }

    const char *move_damage_classKey = "move_damage_class";

    if(object.has_key(move_damage_classKey))
    {
        bourne::json value = object[move_damage_classKey];




        MoveDamageClassSummary* obj = &move_damage_class;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<StatName> names_list;
        StatName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
StatDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["game_index"] = getGameIndex();






    object["is_battle_only"] = isIsBattleOnly();







	object["affecting_moves"] = getAffectingMoves().toJson();






	object["affecting_natures"] = getAffectingNatures().toJson();




    std::list<CharacteristicSummary> characteristics_list = getCharacteristics();
    bourne::json characteristics_arr = bourne::json::array();

    for(auto& var : characteristics_list)
    {
        CharacteristicSummary obj = var;
        characteristics_arr.append(obj.toJson());
    }
    object["characteristics"] = characteristics_arr;








	object["move_damage_class"] = getMoveDamageClass().toJson();




    std::list<StatName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        StatName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
StatDetail::getId()
{
	return id;
}

void
StatDetail::setId(int id)
{
	this->id = id;
}

std::string
StatDetail::getName()
{
	return name;
}

void
StatDetail::setName(std::string name)
{
	this->name = name;
}

int
StatDetail::getGameIndex()
{
	return game_index;
}

void
StatDetail::setGameIndex(int game_index)
{
	this->game_index = game_index;
}

bool
StatDetail::isIsBattleOnly()
{
	return is_battle_only;
}

void
StatDetail::setIsBattleOnly(bool is_battle_only)
{
	this->is_battle_only = is_battle_only;
}

StatDetail_affecting_moves
StatDetail::getAffectingMoves()
{
	return affecting_moves;
}

void
StatDetail::setAffectingMoves(StatDetail_affecting_moves affecting_moves)
{
	this->affecting_moves = affecting_moves;
}

StatDetail_affecting_natures
StatDetail::getAffectingNatures()
{
	return affecting_natures;
}

void
StatDetail::setAffectingNatures(StatDetail_affecting_natures affecting_natures)
{
	this->affecting_natures = affecting_natures;
}

std::list<CharacteristicSummary>
StatDetail::getCharacteristics()
{
	return characteristics;
}

void
StatDetail::setCharacteristics(std::list<CharacteristicSummary> characteristics)
{
	this->characteristics = characteristics;
}

MoveDamageClassSummary
StatDetail::getMoveDamageClass()
{
	return move_damage_class;
}

void
StatDetail::setMoveDamageClass(MoveDamageClassSummary move_damage_class)
{
	this->move_damage_class = move_damage_class;
}

std::list<StatName>
StatDetail::getNames()
{
	return names;
}

void
StatDetail::setNames(std::list<StatName> names)
{
	this->names = names;
}



