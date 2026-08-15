

#include "PaginatedMachineSummaryList.h"

using namespace Tiny;

PaginatedMachineSummaryList::PaginatedMachineSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MachineSummary>();
}

PaginatedMachineSummaryList::PaginatedMachineSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMachineSummaryList::~PaginatedMachineSummaryList()
{

}

void
PaginatedMachineSummaryList::fromJson(std::string jsonObj)
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


        std::list<MachineSummary> results_list;
        MachineSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMachineSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MachineSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MachineSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMachineSummaryList::getCount()
{
	return count;
}

void
PaginatedMachineSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedMachineSummaryList::getNext()
{
	return next;
}

void
PaginatedMachineSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedMachineSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMachineSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<MachineSummary>
PaginatedMachineSummaryList::getResults()
{
	return results;
}

void
PaginatedMachineSummaryList::setResults(std::list <MachineSummary> results)
{
	this->results = results;
}



