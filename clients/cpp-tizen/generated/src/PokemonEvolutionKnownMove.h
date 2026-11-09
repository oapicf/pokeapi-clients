/*
 * PokemonEvolution_known_move.h
 *
 * 
 */

#ifndef _PokemonEvolution_known_move_H_
#define _PokemonEvolution_known_move_H_


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

class PokemonEvolution_known_move : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonEvolution_known_move();
	PokemonEvolution_known_move(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonEvolution_known_move();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
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

#endif /* _PokemonEvolution_known_move_H_ */
