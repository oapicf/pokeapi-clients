

#include "EvolutionChainDetail.h"

using namespace Tiny;

EvolutionChainDetail::EvolutionChainDetail()
{
	id = int(0);
	baby_trigger_item = ItemSummary();
	chain = EvolutionChainDetail_chain();
}

EvolutionChainDetail::EvolutionChainDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionChainDetail::~EvolutionChainDetail()
{

}

void
EvolutionChainDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *baby_trigger_itemKey = "baby_trigger_item";

    if(object.has_key(baby_trigger_itemKey))
    {
        bourne::json value = object[baby_trigger_itemKey];




        ItemSummary* obj = &baby_trigger_item;
		obj->fromJson(value.dump());

    }

    const char *chainKey = "chain";

    if(object.has_key(chainKey))
    {
        bourne::json value = object[chainKey];




        EvolutionChainDetail_chain* obj = &chain;
		obj->fromJson(value.dump());

    }


}

bourne::json
EvolutionChainDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["baby_trigger_item"] = getBabyTriggerItem().toJson();






	object["chain"] = getChain().toJson();


    return object;

}

int
EvolutionChainDetail::getId()
{
	return id;
}

void
EvolutionChainDetail::setId(int  id)
{
	this->id = id;
}

ItemSummary
EvolutionChainDetail::getBabyTriggerItem()
{
	return baby_trigger_item;
}

void
EvolutionChainDetail::setBabyTriggerItem(ItemSummary  baby_trigger_item)
{
	this->baby_trigger_item = baby_trigger_item;
}

EvolutionChainDetail_chain
EvolutionChainDetail::getChain()
{
	return chain;
}

void
EvolutionChainDetail::setChain(EvolutionChainDetail_chain  chain)
{
	this->chain = chain;
}



