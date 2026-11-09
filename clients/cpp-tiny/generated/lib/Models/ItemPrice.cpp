

#include "ItemPrice.h"

using namespace Tiny;

ItemPrice::ItemPrice()
{
	purchase_price = int(0);
	sell_price = int(0);
	currency = null;
	version_group = null;
}

ItemPrice::ItemPrice(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemPrice::~ItemPrice()
{

}

void
ItemPrice::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *purchase_priceKey = "purchase_price";

    if(object.has_key(purchase_priceKey))
    {
        bourne::json value = object[purchase_priceKey];



        jsonToValue(&purchase_price, value, "int");


    }

    const char *sell_priceKey = "sell_price";

    if(object.has_key(sell_priceKey))
    {
        bourne::json value = object[sell_priceKey];



        jsonToValue(&sell_price, value, "int");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        CurrencySummary* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }


}

bourne::json
ItemPrice::toJson()
{
    bourne::json object = bourne::json::object();





    object["purchase_price"] = getPurchasePrice();






    object["sell_price"] = getSellPrice();







	object["currency"] = getCurrency().toJson();






	object["version_group"] = getVersionGroup().toJson();


    return object;

}

int
ItemPrice::getPurchasePrice()
{
	return purchase_price;
}

void
ItemPrice::setPurchasePrice(int purchase_price)
{
	this->purchase_price = purchase_price;
}

int
ItemPrice::getSellPrice()
{
	return sell_price;
}

void
ItemPrice::setSellPrice(int sell_price)
{
	this->sell_price = sell_price;
}

CurrencySummary
ItemPrice::getCurrency()
{
	return currency;
}

void
ItemPrice::setCurrency(CurrencySummary currency)
{
	this->currency = currency;
}

VersionGroupSummary
ItemPrice::getVersionGroup()
{
	return version_group;
}

void
ItemPrice::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}



