

#include "MoveMetaCategoryDetail.h"

using namespace Tiny;

MoveMetaCategoryDetail::MoveMetaCategoryDetail()
{
	id = int(0);
	name = std::string();
	descriptions = std::list<MoveMetaCategoryDescription>();
	moves = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

MoveMetaCategoryDetail::MoveMetaCategoryDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMetaCategoryDetail::~MoveMetaCategoryDetail()
{

}

void
MoveMetaCategoryDetail::fromJson(std::string jsonObj)
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

    const char *descriptionsKey = "descriptions";

    if(object.has_key(descriptionsKey))
    {
        bourne::json value = object[descriptionsKey];


        std::list<MoveMetaCategoryDescription> descriptions_list;
        MoveMetaCategoryDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            descriptions_list.push_back(element);
        }
        descriptions = descriptions_list;


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


}

bourne::json
MoveMetaCategoryDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<MoveMetaCategoryDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        MoveMetaCategoryDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> moves_list = getMoves();
    bourne::json moves_arr = bourne::json::array();

    for(auto& var : moves_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        moves_arr.append(obj.toJson());
    }
    object["moves"] = moves_arr;




    return object;

}

int
MoveMetaCategoryDetail::getId()
{
	return id;
}

void
MoveMetaCategoryDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveMetaCategoryDetail::getName()
{
	return name;
}

void
MoveMetaCategoryDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveMetaCategoryDescription>
MoveMetaCategoryDetail::getDescriptions()
{
	return descriptions;
}

void
MoveMetaCategoryDetail::setDescriptions(std::list <MoveMetaCategoryDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveMetaCategoryDetail::getMoves()
{
	return moves;
}

void
MoveMetaCategoryDetail::setMoves(std::list <AbilityDetail_pokemon_inner_pokemon> moves)
{
	this->moves = moves;
}



