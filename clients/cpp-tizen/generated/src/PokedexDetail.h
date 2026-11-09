/*
 * PokedexDetail.h
 *
 * 
 */

#ifndef _PokedexDetail_H_
#define _PokedexDetail_H_


#include <string>
#include "PokedexDescription.h"
#include "PokedexName.h"
#include "PokemonDexNumber.h"
#include "RegionSummary.h"
#include "VersionGroupSummary.h"
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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get Whether or not this Pokédex originated in the main series of the video games.
	 */
	bool getIsMainSeries();

	/*! \brief Set Whether or not this Pokédex originated in the main series of the video games.
	 */
	void setIsMainSeries(bool  is_main_series);
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<PokedexDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list <PokedexDescription> descriptions);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokedexName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <PokedexName> names);
	/*! \brief Get A list of Pokémon catalogued in this Pokédex and their indexes.
	 */
	std::list<PokemonDexNumber> getPokemonEntries();

	/*! \brief Set A list of Pokémon catalogued in this Pokédex and their indexes.
	 */
	void setPokemonEntries(std::list <PokemonDexNumber> pokemon_entries);
	/*! \brief Get The region this Pokédex catalogues Pokémon for.
	 */
	RegionSummary getRegion();

	/*! \brief Set The region this Pokédex catalogues Pokémon for.
	 */
	void setRegion(RegionSummary  region);
	/*! \brief Get A list of version groups this Pokédex is relevant to.
	 */
	std::list<VersionGroupSummary> getVersionGroups();

	/*! \brief Set A list of version groups this Pokédex is relevant to.
	 */
	void setVersionGroups(std::list <VersionGroupSummary> version_groups);

private:
	int id;
	std::string name;
	bool is_main_series;
	std::list <PokedexDescription>descriptions;
	std::list <PokedexName>names;
	std::list <PokemonDexNumber>pokemon_entries;
	RegionSummary region;
	std::list <VersionGroupSummary>version_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokedexDetail_H_ */
