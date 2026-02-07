#tag Class
Protected Class BerriesApi
	#tag Method, Flags = &h0
		Sub BerryFirmnessList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation berry_firmness_list
		  // List berry firmness
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes BerriesApiCallbackHandler.BerryFirmnessListCallback(PaginatedBerryFirmnessSummaryList) on completion. 
		  //
		  // - GET /api/v2/berry-firmness/
		  // - Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `BerriesApi.ApiKeycookieAuth` before invoking `BerriesApi.BerryFirmnessList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/berry-firmness/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BerryFirmnessList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BerryFirmnessList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BerryFirmnessListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedBerryFirmnessSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedBerryFirmnessSummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFirmnessList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedBerryFirmnessSummaryList
		  CallbackHandler.BerryFirmnessListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFirmnessList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedBerryFirmnessSummaryList
		  Call BerryFirmnessListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BerryFirmnessListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BerryFirmnessRetrieve(, id As String)
		  // Operation berry_firmness_retrieve
		  // Get berry by firmness
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes BerriesApiCallbackHandler.BerryFirmnessRetrieveCallback(BerryFirmnessDetail) on completion. 
		  //
		  // - GET /api/v2/berry-firmness/{id}/
		  // - Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `BerriesApi.ApiKeycookieAuth` before invoking `BerriesApi.BerryFirmnessRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/berry-firmness/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BerryFirmnessRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BerryFirmnessRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BerryFirmnessRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BerryFirmnessDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BerryFirmnessDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFirmnessRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BerryFirmnessDetail
		  CallbackHandler.BerryFirmnessRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFirmnessRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BerryFirmnessDetail
		  Call BerryFirmnessRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BerryFirmnessRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BerryFlavorList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation berry_flavor_list
		  // List berry flavors
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes BerriesApiCallbackHandler.BerryFlavorListCallback(PaginatedBerryFlavorSummaryList) on completion. 
		  //
		  // - GET /api/v2/berry-flavor/
		  // - Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `BerriesApi.ApiKeycookieAuth` before invoking `BerriesApi.BerryFlavorList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/berry-flavor/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BerryFlavorList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BerryFlavorList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BerryFlavorListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedBerryFlavorSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedBerryFlavorSummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFlavorList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedBerryFlavorSummaryList
		  CallbackHandler.BerryFlavorListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFlavorList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedBerryFlavorSummaryList
		  Call BerryFlavorListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BerryFlavorListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BerryFlavorRetrieve(, id As String)
		  // Operation berry_flavor_retrieve
		  // Get berries by flavor
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes BerriesApiCallbackHandler.BerryFlavorRetrieveCallback(BerryFlavorDetail) on completion. 
		  //
		  // - GET /api/v2/berry-flavor/{id}/
		  // - Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `BerriesApi.ApiKeycookieAuth` before invoking `BerriesApi.BerryFlavorRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/berry-flavor/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BerryFlavorRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BerryFlavorRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BerryFlavorRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BerryFlavorDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BerryFlavorDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFlavorRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BerryFlavorDetail
		  CallbackHandler.BerryFlavorRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryFlavorRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BerryFlavorDetail
		  Call BerryFlavorRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BerryFlavorRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BerryList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation berry_list
		  // List berries
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes BerriesApiCallbackHandler.BerryListCallback(PaginatedBerrySummaryList) on completion. 
		  //
		  // - GET /api/v2/berry/
		  // - Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `BerriesApi.ApiKeycookieAuth` before invoking `BerriesApi.BerryList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/berry/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BerryList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BerryList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BerryListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedBerrySummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedBerrySummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedBerrySummaryList
		  CallbackHandler.BerryListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedBerrySummaryList
		  Call BerryListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BerryListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BerryRetrieve(, id As String)
		  // Operation berry_retrieve
		  // Get a berry
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes BerriesApiCallbackHandler.BerryRetrieveCallback(BerryDetail) on completion. 
		  //
		  // - GET /api/v2/berry/{id}/
		  // - Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `BerriesApi.ApiKeycookieAuth` before invoking `BerriesApi.BerryRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/berry/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BerryRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BerryRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BerryRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BerryDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BerryDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BerryDetail
		  CallbackHandler.BerryRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BerryRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BerryDetail
		  Call BerryRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BerryRetrieveCallback(error, data)
		End Sub
	#tag EndMethod






	#tag Method, Flags = &h21
		Private Function AuthenticationRequired(Realm As String, Headers As InternetHeaders, ByRef Name As String, ByRef Password As String) As Boolean
		  #Pragma Unused Realm
		  #Pragma Unused Headers
		  Name = Me.BasicAuthUser
		  Password = Me.BasicAuthPassword
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PrivateFuncPrepareSocket(socket As HTTPSecureSocket)
		  socket.Secure = Me.useHTTPS
		  socket.ConnectionType = SSLSocket.TLSv12
		  socket.Port = Me.Port
		  socket.RequestHeaders.Delete("Accept")
		  socket.RequestHeaders.AppendHeader("Accept", "text/plain")
		  socket.RequestHeaders.AppendHeader("Accept", "application/json")
		  socket.RequestHeaders.AppendHeader("Content-Type", "application/json")

		  If Me.AdditionalHeaders <> Nil Then
		    For Each HeaderName As Variant In Me.AdditionalHeaders.Keys
		      Dim headerValueS As Variant = additionalHeaders.Value(HeaderName)
		      If headerValueS.IsArray Then
		        If headerValueS.ArrayElementType = Variant.TypeString Then
		          Dim values() As String = headerValueS
		          For Each value As String In values
		            socket.RequestHeaders.AppendHeader(HeaderName, value)
		          Next
		        Else
		          Raise New OpenAPIClient.OpenAPIClientException(kErrorInternal, "AdditionalHeaders only support Strings and String arrays as values.")
		        End If
		      Else
		        socket.RequestHeaders.AppendHeader(HeaderName, headerValueS.StringValue)
		      End If
		    Next
		  End If
		End Sub
	#tag EndMethod



	#tag Property, Flags = &h0
		AdditionalHeaders As Dictionary
	#tag EndProperty

	#tag Property, Flags = &h0
		ApiKeycookieAuth As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasePath As String = "https://pokeapi.co"
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthPassword As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthUser As String
	#tag EndProperty

	#tag Property, Flags = &h0
		CallbackHandler As OpenAPIClient.APIs.BerriesApiCallbackHandler
	#tag EndProperty

	#tag Property, Flags = &h0
		Host As String = ""
	#tag EndProperty

	#tag Property, Flags = &h0
		Port As Integer
	#tag EndProperty

	#tag Property, Flags = &h0
		UseHTTPS As Boolean = true
	#tag EndProperty


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthUser"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthPassword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="UseHTTPS"
			Visible=false
			Group="Behavior"
			InitialValue="true"
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Port"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
