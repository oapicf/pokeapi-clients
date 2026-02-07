/*
 * PokedexDetail.h
 *
 * 
 */

#ifndef _PokedexDetail_H_
#define _PokedexDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "PokedexDescription.h"
#include "PokedexDetail_pokemon_entries_inner.h"
#include "PokedexName.h"
#include "RegionSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokedexDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PokedexDetail();
	PokedexDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokedexDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	bool getIsMainSeries();

	/*! \brief Set 
	 */
	void setIsMainSeries(bool  is_main_series);
	/*! \brief Get 
	 */
	std::list<PokedexDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <PokedexDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<PokedexName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PokedexName> names);
	/*! \brief Get 
	 */
	std::list<PokedexDetail_pokemon_entries_inner> getPokemonEntries();

	/*! \brief Set 
	 */
	void setPokemonEntries(std::list <PokedexDetail_pokemon_entries_inner> pokemon_entries);
	/*! \brief Get 
	 */
	RegionSummary getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionSummary  region);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getVersionGroups();

	/*! \brief Set 
	 */
	void setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups);

private:
	int id;
	std::string name;
	bool is_main_series;
	std::list <PokedexDescription>descriptions;
	std::list <PokedexName>names;
	std::list <PokedexDetail_pokemon_entries_inner>pokemon_entries;
	RegionSummary region;
	std::list <AbilityDetail_pokemon_inner_pokemon>version_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokedexDetail_H_ */
