

#include "PokemonMove.h"

using namespace Tiny;

PokemonMove::PokemonMove()
{
	move = null;
	version_group_details = std::list<PokemonMoveVersionGroup>();
}

PokemonMove::PokemonMove(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonMove::~PokemonMove()
{

}

void
PokemonMove::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *moveKey = "move";

    if(object.has_key(moveKey))
    {
        bourne::json value = object[moveKey];




        MoveSummary* obj = &move;
		obj->fromJson(value.dump());

    }

    const char *version_group_detailsKey = "version_group_details";

    if(object.has_key(version_group_detailsKey))
    {
        bourne::json value = object[version_group_detailsKey];


        std::list<PokemonMoveVersionGroup> version_group_details_list;
        PokemonMoveVersionGroup element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_group_details_list.push_back(element);
        }
        version_group_details = version_group_details_list;


    }


}

bourne::json
PokemonMove::toJson()
{
    bourne::json object = bourne::json::object();






	object["move"] = getMove().toJson();




    std::list<PokemonMoveVersionGroup> version_group_details_list = getVersionGroupDetails();
    bourne::json version_group_details_arr = bourne::json::array();

    for(auto& var : version_group_details_list)
    {
        PokemonMoveVersionGroup obj = var;
        version_group_details_arr.append(obj.toJson());
    }
    object["version_group_details"] = version_group_details_arr;




    return object;

}

MoveSummary
PokemonMove::getMove()
{
	return move;
}

void
PokemonMove::setMove(MoveSummary move)
{
	this->move = move;
}

std::list<PokemonMoveVersionGroup>
PokemonMove::getVersionGroupDetails()
{
	return version_group_details;
}

void
PokemonMove::setVersionGroupDetails(std::list<PokemonMoveVersionGroup> version_group_details)
{
	this->version_group_details = version_group_details;
}



