#tag Class
Protected Class ItemCategoryDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of items that are a part of this category.
		#tag EndNote
		items() As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this item category listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.ItemCategoryName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The pocket items in this category would be put in.
		#tag EndNote
		pocket As OpenAPIClient.Models.ItemPocketSummary
	#tag EndProperty





	#tag ViewBehavior
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemCategoryName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pocket"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemPocketSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


