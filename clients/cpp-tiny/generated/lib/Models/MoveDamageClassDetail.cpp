

#include "MoveDamageClassDetail.h"

using namespace Tiny;

MoveDamageClassDetail::MoveDamageClassDetail()
{
	id = int(0);
	name = std::string();
	descriptions = std::list<MoveDamageClassDescription>();
	moves = std::list<MoveSummary>();
	names = std::list<MoveDamageClassName>();
}

MoveDamageClassDetail::MoveDamageClassDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDamageClassDetail::~MoveDamageClassDetail()
{

}

void
MoveDamageClassDetail::fromJson(std::string jsonObj)
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


        std::list<MoveDamageClassDescription> descriptions_list;
        MoveDamageClassDescription element;
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


        std::list<MoveSummary> moves_list;
        MoveSummary element;
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


        std::list<MoveDamageClassName> names_list;
        MoveDamageClassName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
MoveDamageClassDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<MoveDamageClassDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        MoveDamageClassDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;






    std::list<MoveSummary> moves_list = getMoves();
    bourne::json moves_arr = bourne::json::array();

    for(auto& var : moves_list)
    {
        MoveSummary obj = var;
        moves_arr.append(obj.toJson());
    }
    object["moves"] = moves_arr;






    std::list<MoveDamageClassName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        MoveDamageClassName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
MoveDamageClassDetail::getId()
{
	return id;
}

void
MoveDamageClassDetail::setId(int id)
{
	this->id = id;
}

std::string
MoveDamageClassDetail::getName()
{
	return name;
}

void
MoveDamageClassDetail::setName(std::string name)
{
	this->name = name;
}

std::list<MoveDamageClassDescription>
MoveDamageClassDetail::getDescriptions()
{
	return descriptions;
}

void
MoveDamageClassDetail::setDescriptions(std::list<MoveDamageClassDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<MoveSummary>
MoveDamageClassDetail::getMoves()
{
	return moves;
}

void
MoveDamageClassDetail::setMoves(std::list<MoveSummary> moves)
{
	this->moves = moves;
}

std::list<MoveDamageClassName>
MoveDamageClassDetail::getNames()
{
	return names;
}

void
MoveDamageClassDetail::setNames(std::list<MoveDamageClassName> names)
{
	this->names = names;
}



