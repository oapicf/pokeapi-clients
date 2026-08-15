

#include "ItemDetail_held_by_pokemon_inner.h"

using namespace Tiny;

ItemDetail_held_by_pokemon_inner::ItemDetail_held_by_pokemon_inner()
{
	pokemon = AbilityDetail_pokemon_inner_pokemon();
	versiondetails = std::list<ItemDetail_held_by_pokemon_inner_version_details_inner>();
}

ItemDetail_held_by_pokemon_inner::ItemDetail_held_by_pokemon_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDetail_held_by_pokemon_inner::~ItemDetail_held_by_pokemon_inner()
{

}

void
ItemDetail_held_by_pokemon_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pokemonKey = "pokemon";

    if(object.has_key(pokemonKey))
    {
        bourne::json value = object[pokemonKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &pokemon;
		obj->fromJson(value.dump());

    }

    const char *versiondetailsKey = "version-details";

    if(object.has_key(versiondetailsKey))
    {
        bourne::json value = object[versiondetailsKey];


        std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> versiondetails_list;
        ItemDetail_held_by_pokemon_inner_version_details_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            versiondetails_list.push_back(element);
        }
        versiondetails = versiondetails_list;


    }


}

bourne::json
ItemDetail_held_by_pokemon_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["pokemon"] = getPokemon().toJson();




    std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> versiondetails_list = getVersiondetails();
    bourne::json versiondetails_arr = bourne::json::array();

    for(auto& var : versiondetails_list)
    {
        ItemDetail_held_by_pokemon_inner_version_details_inner obj = var;
        versiondetails_arr.append(obj.toJson());
    }
    object["versiondetails"] = versiondetails_arr;




    return object;

}

AbilityDetail_pokemon_inner_pokemon
ItemDetail_held_by_pokemon_inner::getPokemon()
{
	return pokemon;
}

void
ItemDetail_held_by_pokemon_inner::setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon)
{
	this->pokemon = pokemon;
}

std::list<ItemDetail_held_by_pokemon_inner_version_details_inner>
ItemDetail_held_by_pokemon_inner::getVersiondetails()
{
	return versiondetails;
}

void
ItemDetail_held_by_pokemon_inner::setVersiondetails(std::list <ItemDetail_held_by_pokemon_inner_version_details_inner> versiondetails)
{
	this->versiondetails = versiondetails;
}



