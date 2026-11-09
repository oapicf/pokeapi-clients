

#include "PokemonHeldItemSummary.h"

using namespace Tiny;

PokemonHeldItemSummary::PokemonHeldItemSummary()
{
	item = null;
	version_details = std::list<PokemonHeldItemVersion>();
}

PokemonHeldItemSummary::PokemonHeldItemSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonHeldItemSummary::~PokemonHeldItemSummary()
{

}

void
PokemonHeldItemSummary::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        ItemSummary* obj = &item;
		obj->fromJson(value.dump());

    }

    const char *version_detailsKey = "version_details";

    if(object.has_key(version_detailsKey))
    {
        bourne::json value = object[version_detailsKey];


        std::list<PokemonHeldItemVersion> version_details_list;
        PokemonHeldItemVersion element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
PokemonHeldItemSummary::toJson()
{
    bourne::json object = bourne::json::object();






	object["item"] = getItem().toJson();




    std::list<PokemonHeldItemVersion> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        PokemonHeldItemVersion obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

ItemSummary
PokemonHeldItemSummary::getItem()
{
	return item;
}

void
PokemonHeldItemSummary::setItem(ItemSummary item)
{
	this->item = item;
}

std::list<PokemonHeldItemVersion>
PokemonHeldItemSummary::getVersionDetails()
{
	return version_details;
}

void
PokemonHeldItemSummary::setVersionDetails(std::list<PokemonHeldItemVersion> version_details)
{
	this->version_details = version_details;
}



