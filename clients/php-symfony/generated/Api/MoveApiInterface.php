<?php
/**
 * MoveApiInterface
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;

/**
 * MoveApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface MoveApiInterface
{

    /**
     * Operation moveList
     *
     * @param  \int $limit   (optional)
     * @param  \int $offset   (optional)
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function moveList($limit = null, $offset = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation moveRead
     *
     * @param  \int $id   (required)
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function moveRead($id, &$responseCode, array &$responseHeaders);
}
