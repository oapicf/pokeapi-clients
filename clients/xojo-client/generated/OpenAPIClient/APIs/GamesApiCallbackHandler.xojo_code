#tag Interface
Protected Interface GamesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GenerationListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedGenerationSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerationRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerationDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PokedexListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedPokedexSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PokedexRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PokedexDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub VersionGroupListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedVersionGroupSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub VersionGroupRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VersionGroupDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub VersionListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedVersionSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub VersionRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VersionDetail)
		  
		End Sub
	#tag EndMethod




	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
	#tag EndViewBehavior
End Interface
#tag EndInterface
