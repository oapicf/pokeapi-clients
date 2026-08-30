

#include "PokemonFormDetail.h"

using namespace Tiny;

PokemonFormDetail::PokemonFormDetail()
{
	id = int(0);
	name = std::string();
	order = int(0);
	form_order = int(0);
	is_default = bool(false);
	is_battle_only = bool(false);
	is_mega = bool(false);
	form_name = std::string();
	pokemon = PokemonSummary();
	sprites = PokemonFormDetail_sprites();
	version_group = VersionGroupSummary();
	form_names = std::list<PokemonFormDetail_form_names_inner>();
	names = std::list<PokemonFormDetail_form_names_inner>();
	types = std::list<PokemonDetail_types_inner>();
}

PokemonFormDetail::PokemonFormDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormDetail::~PokemonFormDetail()
{

}

void
PokemonFormDetail::fromJson(std::string jsonObj)
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

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];



        jsonToValue(&order, value, "int");


    }

    const char *form_orderKey = "form_order";

    if(object.has_key(form_orderKey))
    {
        bourne::json value = object[form_orderKey];



        jsonToValue(&form_order, value, "int");


    }

    const char *is_defaultKey = "is_default";

    if(object.has_key(is_defaultKey))
    {
        bourne::json value = object[is_defaultKey];



        jsonToValue(&is_default, value, "bool");


    }

    const char *is_battle_onlyKey = "is_battle_only";

    if(object.has_key(is_battle_onlyKey))
    {
        bourne::json value = object[is_battle_onlyKey];



        jsonToValue(&is_battle_only, value, "bool");


    }

    const char *is_megaKey = "is_mega";

    if(object.has_key(is_megaKey))
    {
        bourne::json value = object[is_megaKey];



        jsonToValue(&is_mega, value, "bool");


    }

    const char *form_nameKey = "form_name";

    if(object.has_key(form_nameKey))
    {
        bourne::json value = object[form_nameKey];



        jsonToValue(&form_name, value, "std::string");


    }

    const char *pokemonKey = "pokemon";

    if(object.has_key(pokemonKey))
    {
        bourne::json value = object[pokemonKey];




        PokemonSummary* obj = &pokemon;
		obj->fromJson(value.dump());

    }

    const char *spritesKey = "sprites";

    if(object.has_key(spritesKey))
    {
        bourne::json value = object[spritesKey];




        PokemonFormDetail_sprites* obj = &sprites;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }

    const char *form_namesKey = "form_names";

    if(object.has_key(form_namesKey))
    {
        bourne::json value = object[form_namesKey];


        std::list<PokemonFormDetail_form_names_inner> form_names_list;
        PokemonFormDetail_form_names_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            form_names_list.push_back(element);
        }
        form_names = form_names_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<PokemonFormDetail_form_names_inner> names_list;
        PokemonFormDetail_form_names_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *typesKey = "types";

    if(object.has_key(typesKey))
    {
        bourne::json value = object[typesKey];


        std::list<PokemonDetail_types_inner> types_list;
        PokemonDetail_types_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            types_list.push_back(element);
        }
        types = types_list;


    }


}

bourne::json
PokemonFormDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["order"] = getOrder();






    object["form_order"] = getFormOrder();






    object["is_default"] = isIsDefault();






    object["is_battle_only"] = isIsBattleOnly();






    object["is_mega"] = isIsMega();






    object["form_name"] = getFormName();







	object["pokemon"] = getPokemon().toJson();






	object["sprites"] = getSprites().toJson();






	object["version_group"] = getVersionGroup().toJson();




    std::list<PokemonFormDetail_form_names_inner> form_names_list = getFormNames();
    bourne::json form_names_arr = bourne::json::array();

    for(auto& var : form_names_list)
    {
        PokemonFormDetail_form_names_inner obj = var;
        form_names_arr.append(obj.toJson());
    }
    object["form_names"] = form_names_arr;






    std::list<PokemonFormDetail_form_names_inner> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        PokemonFormDetail_form_names_inner obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PokemonDetail_types_inner> types_list = getTypes();
    bourne::json types_arr = bourne::json::array();

    for(auto& var : types_list)
    {
        PokemonDetail_types_inner obj = var;
        types_arr.append(obj.toJson());
    }
    object["types"] = types_arr;




    return object;

}

int
PokemonFormDetail::getId()
{
	return id;
}

void
PokemonFormDetail::setId(int id)
{
	this->id = id;
}

std::string
PokemonFormDetail::getName()
{
	return name;
}

void
PokemonFormDetail::setName(std::string name)
{
	this->name = name;
}

int
PokemonFormDetail::getOrder()
{
	return order;
}

void
PokemonFormDetail::setOrder(int order)
{
	this->order = order;
}

int
PokemonFormDetail::getFormOrder()
{
	return form_order;
}

void
PokemonFormDetail::setFormOrder(int form_order)
{
	this->form_order = form_order;
}

bool
PokemonFormDetail::isIsDefault()
{
	return is_default;
}

void
PokemonFormDetail::setIsDefault(bool is_default)
{
	this->is_default = is_default;
}

bool
PokemonFormDetail::isIsBattleOnly()
{
	return is_battle_only;
}

void
PokemonFormDetail::setIsBattleOnly(bool is_battle_only)
{
	this->is_battle_only = is_battle_only;
}

bool
PokemonFormDetail::isIsMega()
{
	return is_mega;
}

void
PokemonFormDetail::setIsMega(bool is_mega)
{
	this->is_mega = is_mega;
}

std::string
PokemonFormDetail::getFormName()
{
	return form_name;
}

void
PokemonFormDetail::setFormName(std::string form_name)
{
	this->form_name = form_name;
}

PokemonSummary
PokemonFormDetail::getPokemon()
{
	return pokemon;
}

void
PokemonFormDetail::setPokemon(PokemonSummary pokemon)
{
	this->pokemon = pokemon;
}

PokemonFormDetail_sprites&lt;std::string, std::string&gt;
PokemonFormDetail::getSprites()
{
	return sprites;
}

void
PokemonFormDetail::setSprites(PokemonFormDetail_sprites&lt;std::string, std::string&gt; sprites)
{
	this->sprites = sprites;
}

VersionGroupSummary
PokemonFormDetail::getVersionGroup()
{
	return version_group;
}

void
PokemonFormDetail::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}

std::list<PokemonFormDetail_form_names_inner>
PokemonFormDetail::getFormNames()
{
	return form_names;
}

void
PokemonFormDetail::setFormNames(std::list<PokemonFormDetail_form_names_inner> form_names)
{
	this->form_names = form_names;
}

std::list<PokemonFormDetail_form_names_inner>
PokemonFormDetail::getNames()
{
	return names;
}

void
PokemonFormDetail::setNames(std::list<PokemonFormDetail_form_names_inner> names)
{
	this->names = names;
}

std::list<PokemonDetail_types_inner>
PokemonFormDetail::getTypes()
{
	return types;
}

void
PokemonFormDetail::setTypes(std::list<PokemonDetail_types_inner> types)
{
	this->types = types;
}



