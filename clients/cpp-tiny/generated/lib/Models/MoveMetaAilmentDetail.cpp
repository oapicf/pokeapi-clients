

#include "MoveMetaAilmentDetail.h"

using namespace Tiny;

MoveMetaAilmentDetail::MoveMetaAilmentDetail()
{
	id = int(0);
	name = std::string();
	moves = std::list<AbilityDetail_pokemon_inner_pokemon>();
	names = std::list<MoveMetaAilmentName>();
}

MoveMetaAilmentDetail::MoveMetaAilmentDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMetaAilmentDetail::~MoveMetaAilmentDetail()
{

}

void
MoveMetaAilmentDetail::fromJson(std::string jsonObj)
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

    const char *movesKey = "moves";

    if(object.has_key(movesKey))
    {
        bourne::json value = object[movesKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> moves_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            moves_list.push_back(element);
        }
        moves = moves_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<MoveMetaAilmentName> names_list;
        MoveMetaAilmentName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
MoveMetaAilmentDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<AbilityDetail_pokemon_inner_pokemon> moves_list = getMoves();
    bourne::json moves_arr = bourne::json::array();

    for(auto& var : moves_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        moves_arr.append(obj.toJson());
    }
    object["moves"] = moves_arr;






    std::list<MoveMetaAilmentName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        MoveMetaAilmentName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
MoveMetaAilmentDetail::getId()
{
	return id;
}

void
MoveMetaAilmentDetail::setId(int id)
{
	this->id = id;
}

std::string
MoveMetaAilmentDetail::getName()
{
	return name;
}

void
MoveMetaAilmentDetail::setName(std::string name)
{
	this->name = name;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveMetaAilmentDetail::getMoves()
{
	return moves;
}

void
MoveMetaAilmentDetail::setMoves(std::list<AbilityDetail_pokemon_inner_pokemon> moves)
{
	this->moves = moves;
}

std::list<MoveMetaAilmentName>
MoveMetaAilmentDetail::getNames()
{
	return names;
}

void
MoveMetaAilmentDetail::setNames(std::list<MoveMetaAilmentName> names)
{
	this->names = names;
}



