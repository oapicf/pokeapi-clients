

#include "PokemonDetail_held_items.h"

using namespace Tiny;

PokemonDetail_held_items::PokemonDetail_held_items()
{
	item = AbilityDetail_pokemon_inner_pokemon();
	version_details = std::list<ItemDetail_held_by_pokemon_inner_version_details_inner>();
}

PokemonDetail_held_items::PokemonDetail_held_items(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_held_items::~PokemonDetail_held_items()
{

}

void
PokemonDetail_held_items::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &item;
		obj->fromJson(value.dump());

    }

    const char *version_detailsKey = "version_details";

    if(object.has_key(version_detailsKey))
    {
        bourne::json value = object[version_detailsKey];


        std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> version_details_list;
        ItemDetail_held_by_pokemon_inner_version_details_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
PokemonDetail_held_items::toJson()
{
    bourne::json object = bourne::json::object();






	object["item"] = getItem().toJson();




    std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        ItemDetail_held_by_pokemon_inner_version_details_inner obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_held_items::getItem()
{
	return item;
}

void
PokemonDetail_held_items::setItem(AbilityDetail_pokemon_inner_pokemon  item)
{
	this->item = item;
}

std::list<ItemDetail_held_by_pokemon_inner_version_details_inner>
PokemonDetail_held_items::getVersionDetails()
{
	return version_details;
}

void
PokemonDetail_held_items::setVersionDetails(std::list <ItemDetail_held_by_pokemon_inner_version_details_inner> version_details)
{
	this->version_details = version_details;
}



