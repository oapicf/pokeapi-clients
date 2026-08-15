

#include "PaginatedItemPocketSummaryList.h"

using namespace Tiny;

PaginatedItemPocketSummaryList::PaginatedItemPocketSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<ItemPocketSummary>();
}

PaginatedItemPocketSummaryList::PaginatedItemPocketSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedItemPocketSummaryList::~PaginatedItemPocketSummaryList()
{

}

void
PaginatedItemPocketSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<ItemPocketSummary> results_list;
        ItemPocketSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedItemPocketSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<ItemPocketSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        ItemPocketSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedItemPocketSummaryList::getCount()
{
	return count;
}

void
PaginatedItemPocketSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedItemPocketSummaryList::getNext()
{
	return next;
}

void
PaginatedItemPocketSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedItemPocketSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedItemPocketSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<ItemPocketSummary>
PaginatedItemPocketSummaryList::getResults()
{
	return results;
}

void
PaginatedItemPocketSummaryList::setResults(std::list <ItemPocketSummary> results)
{
	this->results = results;
}



