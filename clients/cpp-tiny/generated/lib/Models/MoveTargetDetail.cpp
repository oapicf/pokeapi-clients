

#include "MoveTargetDetail.h"

using namespace Tiny;

MoveTargetDetail::MoveTargetDetail()
{
	id = int(0);
	name = std::string();
	descriptions = std::list<MoveTargetDescription>();
	moves = std::list<MoveSummary>();
	names = std::list<MoveTargetName>();
}

MoveTargetDetail::MoveTargetDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveTargetDetail::~MoveTargetDetail()
{

}

void
MoveTargetDetail::fromJson(std::string jsonObj)
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


        std::list<MoveTargetDescription> descriptions_list;
        MoveTargetDescription element;
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


        std::list<MoveTargetName> names_list;
        MoveTargetName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
MoveTargetDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<MoveTargetDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        MoveTargetDescription obj = var;
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






    std::list<MoveTargetName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        MoveTargetName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
MoveTargetDetail::getId()
{
	return id;
}

void
MoveTargetDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveTargetDetail::getName()
{
	return name;
}

void
MoveTargetDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveTargetDescription>
MoveTargetDetail::getDescriptions()
{
	return descriptions;
}

void
MoveTargetDetail::setDescriptions(std::list <MoveTargetDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<MoveSummary>
MoveTargetDetail::getMoves()
{
	return moves;
}

void
MoveTargetDetail::setMoves(std::list <MoveSummary> moves)
{
	this->moves = moves;
}

std::list<MoveTargetName>
MoveTargetDetail::getNames()
{
	return names;
}

void
MoveTargetDetail::setNames(std::list <MoveTargetName> names)
{
	this->names = names;
}



