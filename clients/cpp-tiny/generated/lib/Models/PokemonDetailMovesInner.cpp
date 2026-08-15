

#include "PokemonDetail_moves_inner.h"

using namespace Tiny;

PokemonDetail_moves_inner::PokemonDetail_moves_inner()
{
	move = AbilityDetail_pokemon_inner_pokemon();
	version_group_details = std::list<PokemonDetail_moves_inner_version_group_details_inner>();
}

PokemonDetail_moves_inner::PokemonDetail_moves_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_moves_inner::~PokemonDetail_moves_inner()
{

}

void
PokemonDetail_moves_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *moveKey = "move";

    if(object.has_key(moveKey))
    {
        bourne::json value = object[moveKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &move;
		obj->fromJson(value.dump());

    }

    const char *version_group_detailsKey = "version_group_details";

    if(object.has_key(version_group_detailsKey))
    {
        bourne::json value = object[version_group_detailsKey];


        std::list<PokemonDetail_moves_inner_version_group_details_inner> version_group_details_list;
        PokemonDetail_moves_inner_version_group_details_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_group_details_list.push_back(element);
        }
        version_group_details = version_group_details_list;


    }


}

bourne::json
PokemonDetail_moves_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["move"] = getMove().toJson();




    std::list<PokemonDetail_moves_inner_version_group_details_inner> version_group_details_list = getVersionGroupDetails();
    bourne::json version_group_details_arr = bourne::json::array();

    for(auto& var : version_group_details_list)
    {
        PokemonDetail_moves_inner_version_group_details_inner obj = var;
        version_group_details_arr.append(obj.toJson());
    }
    object["version_group_details"] = version_group_details_arr;




    return object;

}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_moves_inner::getMove()
{
	return move;
}

void
PokemonDetail_moves_inner::setMove(AbilityDetail_pokemon_inner_pokemon  move)
{
	this->move = move;
}

std::list<PokemonDetail_moves_inner_version_group_details_inner>
PokemonDetail_moves_inner::getVersionGroupDetails()
{
	return version_group_details;
}

void
PokemonDetail_moves_inner::setVersionGroupDetails(std::list <PokemonDetail_moves_inner_version_group_details_inner> version_group_details)
{
	this->version_group_details = version_group_details;
}



