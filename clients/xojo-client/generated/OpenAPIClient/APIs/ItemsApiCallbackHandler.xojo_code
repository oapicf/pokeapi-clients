#tag Interface
Protected Interface ItemsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub ItemAttributeListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedItemAttributeSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemAttributeRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ItemAttributeDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemCategoryListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedItemCategorySummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemCategoryRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ItemCategoryDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemFlingEffectListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedItemFlingEffectSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemFlingEffectRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ItemFlingEffectDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedItemSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemPocketListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedItemPocketSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemPocketRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ItemPocketDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ItemDetail)
		  
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
