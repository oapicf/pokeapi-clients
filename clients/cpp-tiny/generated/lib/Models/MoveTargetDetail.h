
/*
 * MoveTargetDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveTargetDetail_H_
#define TINY_CPP_CLIENT_MoveTargetDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveSummary.h"
#include "MoveTargetDescription.h"
#include "MoveTargetName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveTargetDetail{
public:

    /*! \brief Constructor.
	 */
    MoveTargetDetail();
    MoveTargetDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveTargetDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	std::list<MoveTargetDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <MoveTargetDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get 
	 */
	std::list<MoveTargetName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveTargetName> names);


    private:
    int id{};
    std::string name{};
    std::list<MoveTargetDescription> descriptions;
    std::list<MoveSummary> moves;
    std::list<MoveTargetName> names;
};
}

#endif /* TINY_CPP_CLIENT_MoveTargetDetail_H_ */
