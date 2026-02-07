/*
 * EggGroupDetail_pokemon_species_inner.h
 *
 * 
 */

#ifndef _EggGroupDetail_pokemon_species_inner_H_
#define _EggGroupDetail_pokemon_species_inner_H_


#include <string>
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

class EggGroupDetail_pokemon_species_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	EggGroupDetail_pokemon_species_inner();
	EggGroupDetail_pokemon_species_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EggGroupDetail_pokemon_species_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pokemon species name.
	 */
	std::string getName();

	/*! \brief Set Pokemon species name.
	 */
	void setName(std::string  name);
	/*! \brief Get The URL to get more information about the species
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the species
	 */
	void setUrl(std::string  url);

private:
	std::string name;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EggGroupDetail_pokemon_species_inner_H_ */
